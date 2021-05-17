package hu.nive.ujratervezes.kepesitovizsga.trees;

public class AppleTree extends Tree {

    public AppleTree(int leaves) {
        super(leaves);
        this.fruit = Fruit.APPLE;
    }

    @Override
    public int growLeaves(int numberOfSunnyDays) {
        super.leaves = super.leaves + numberOfSunnyDays * 10;
        return leaves;
    }

    @Override
    public void ripenFruit(int numberOfSunnyDays) {
        super.weightOfFruit = growLeaves(numberOfSunnyDays) / 50;
    }
}
