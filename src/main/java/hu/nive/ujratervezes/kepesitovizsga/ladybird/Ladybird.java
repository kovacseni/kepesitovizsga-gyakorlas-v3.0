package hu.nive.ujratervezes.kepesitovizsga.ladybird;

import javax.sql.DataSource;
import java.sql.*;
import java.util.*;

public class Ladybird {

    private DataSource dataSource;

    public Ladybird(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getLadybirdsWithExactNumberOfPoints(int number) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select hungarian_name from ladybirds where number_of_points = ?;")) {
            stmt.setInt(1, number);

            return getNameOfLadybird(stmt);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not get data.", sqle);
        }
    }

    private List<String> getNameOfLadybird(PreparedStatement stmt) throws SQLException {
        List<String> ladybirds = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                ladybirds.add(rs.getString(1));
            }
        }
        return ladybirds;
    }

    public Map<Integer, Integer> getLadybirdsByNumberOfPoints() {
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from ladybirds;")) {

            return getLadybirds(rs);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not get data.", sqle);
        }
    }

    private Map<Integer, Integer> getLadybirds(ResultSet rs) throws SQLException {
        Map<Integer, Integer> numberOfLadybirdsByPoints = new TreeMap<>();
        while (rs.next()) {
            int points = rs.getInt("number_of_points");
            if (!numberOfLadybirdsByPoints.containsKey(points)) {
                numberOfLadybirdsByPoints.put(points, 1);
            } else {
                numberOfLadybirdsByPoints.put(points, numberOfLadybirdsByPoints.get(points) + 1);
            }
        }
        return numberOfLadybirdsByPoints;
    }

    public Set<Ladybug> getLadybirdByPartOfLatinNameAndNumberOfPoints(String partOfName, int numberOfPoints) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from ladybirds where latin_name like ? and number_of_points = ?;")) {
            stmt.setString(1, "%" + partOfName + "%");
            stmt.setInt(2, numberOfPoints);

            return getLadybirdsInSet(stmt);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not get data.", sqle);
        }
    }

    private Set<Ladybug> getLadybirdsInSet(PreparedStatement stmt) throws SQLException {
        Set<Ladybug> ladybirds = new HashSet<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String hungarianName = rs.getString("hungarian_name");
                String latinName = rs.getString("latin_name");
                String genus = rs.getString("genus");
                int points = rs.getInt("number_of_points");

                ladybirds.add(new Ladybug(hungarianName, latinName, genus, points));
            }
        }
        return ladybirds;
    }

    public Map<String, Integer> getLadybirdStatistics() {
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from ladybirds;")) {

            return getStatistics(rs);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not get data.", sqle);
        }
    }

    private Map<String, Integer> getStatistics(ResultSet rs) throws SQLException {
        Map<String, Integer> ladybirdStatistics = new HashMap<>();
        while (rs.next()) {
            String genus = rs.getString("genus");
            if (!ladybirdStatistics.containsKey(genus)) {
                ladybirdStatistics.put(genus, 1);
            } else {
                ladybirdStatistics.put(genus, ladybirdStatistics.get(genus) + 1);
            }
        }
        return ladybirdStatistics;
    }
}
