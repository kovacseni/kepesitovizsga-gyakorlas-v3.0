package hu.nive.ujratervezes.kepesitovizsga.trees;

public class WalnutTree extends Tree {

    public WalnutTree(int leaves) {
        super(leaves);
        this.fruit = Fruit.WALNUT;
    }

    @Override
    public int growLeaves(int numberOfSunnyDays) {
        super.leaves = super.leaves + numberOfSunnyDays * 30;
        return leaves;
    }

    @Override
    public void ripenFruit(int numberOfSunnyDays) {
        super.weightOfFruit = growLeaves(numberOfSunnyDays) / 10;
    }
}
