package lesson_29_classwork_garden;

class Tree extends Plant {

    private final int GROWSPEED_TREE = 220;

    public Tree(String nameOfPlant, int height) {
        super(nameOfPlant, height);
    }

    public int getAge() {
        return super.getAge();
    }

    @Override
    public void doSpring() {
        height += GROWSPEED_TREE; // Идёт рост
    }

    @Override
    public void doSummer() {
        height += GROWSPEED_TREE; // Идёт рост
    }

}