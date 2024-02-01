package dec_12_2023;

public class Girl extends Pupil {

    public String gender;

    public Girl(String name, String lastname, int age, int schoolNumber,
                String classRoom, String gender) {
        super(name, lastname, age, schoolNumber, classRoom);
        this.gender = gender;
    }

    public String work() {
        return this.name + " cooks soup";
    }

    public String toString() {
        return "First name = " + this.name + ", Second name = " + this.lastname + ", age = " + this.age + ". She is a "
                + gender + " and " + this.work();
    }
}
