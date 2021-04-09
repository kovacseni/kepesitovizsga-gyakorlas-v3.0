package hu.nive.ujratervezes.kepesitovizsga.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TreesTest {

    private Tree tree;

    @Test
    public void testAppleTree() {
        tree = new AppleTree(100);

        Assertions.assertEquals(Fruit.APPLE, tree.getFruit());
        Assertions.assertEquals(900, tree.growLeaves(80));

        tree.leaves = 100;
        tree.ripenFruit(80);

        Assertions.assertEquals(18, tree.weightOfFruit);
        Assertions.assertEquals(4, tree.hostBirdNest());
    }

    @Test
    public void testCherryTree() {
        tree = new CherryTree(200);

        Assertions.assertEquals(Fruit.CHERRY, tree.getFruit());
        Assertions.assertEquals(1800, tree.growLeaves(80));

        tree.leaves = 200;
        tree.ripenFruit(80);

        Assertions.assertEquals(60, tree.weightOfFruit);
        Assertions.assertEquals(9, tree.hostBirdNest());
    }

    @Test
    public void testWalnutTree() {
        tree = new WalnutTree(300);

        Assertions.assertEquals(Fruit.WALNUT, tree.getFruit());
        Assertions.assertEquals(2700, tree.growLeaves(80));

        tree.leaves = 300;
        tree.ripenFruit(80);

        Assertions.assertEquals(270, tree.weightOfFruit);
        Assertions.assertEquals(13, tree.hostBirdNest());
    }
}
