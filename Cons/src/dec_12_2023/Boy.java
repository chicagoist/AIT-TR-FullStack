package dec_12_2023;

public class Boy extends Pupil {

    public String gender;

    public Boy(String name, String lastname, int age, int schoolNumber,
               String classRoom, String gender) {
        super(name, lastname, age, schoolNumber, classRoom);
        this.gender = gender;
    }


    public String work() {
        return this.name + " makes stools";
    }

    public String toString() {
        return "First name = " + this.name + ", Second name = " + this.lastname + ", age = " + this.age + ". He is a "
                + gender + " and " + this.work();
    }
}
