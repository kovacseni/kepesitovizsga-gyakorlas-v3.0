package hu.nive.ujratervezes.kepesitovizsga.trees;

public abstract class Tree {

    protected int leaves;
    protected Fruit fruit;
    protected int weightOfFruit;

    public Tree(int leaves) {
        this.leaves = leaves;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public abstract int growLeaves(int numberOfSunnyDays);

    public abstract void ripenFruit(int numberOfSunnyDays);

    public int hostBirdNest() {
        return leaves / 200;
    }
}
