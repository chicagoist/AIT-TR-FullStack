package lesson_29_homework_garden;

public abstract class Plant {

    protected String name;
    protected int height;
    protected static int age;

    public Plant(String nameOfPlant, int height) {
        name = nameOfPlant;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
    }

    protected void doSummer() {
    }

    protected void doAutumn() {
    }

    protected abstract void doSpring();

    protected void doWinter() {
    }

    public int getHeight() {
        return height;
    }

}

