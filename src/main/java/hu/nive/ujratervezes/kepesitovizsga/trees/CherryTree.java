package hu.nive.ujratervezes.kepesitovizsga.trees;

public class CherryTree extends Tree {

    public CherryTree(int leaves) {
        super(leaves);
        this.fruit = Fruit.CHERRY;
    }

    @Override
    public int growLeaves(int numberOfSunnyDays) {
        super.leaves = super.leaves + numberOfSunnyDays * 20;
        return leaves;
    }

    @Override
    public void ripenFruit(int numberOfSunnyDays) {
        super.weightOfFruit = growLeaves(numberOfSunnyDays) / 30;
    }
}
