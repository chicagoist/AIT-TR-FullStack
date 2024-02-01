package lesson_29_homework_garden;

class Flower extends Plant {

    private final int GROWSPEED_FLOWER = 20;

    public Flower(String pulip,int height) {
        super(pulip,height);
    }

    public int getAge() {
        return super.getAge();
    }

    @Override
    public void doSpring() {
        height += GROWSPEED_FLOWER; // Идёт рост
    }

    public void doAutumn() { // Осенью срезают цветы обнуляют высоту
        height = 0;
    }

    public void setAge(int years) {
        age = years;
    }
}