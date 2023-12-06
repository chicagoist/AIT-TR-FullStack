package dec_06_2023;

//имя,возраст,
//        адрес
public class Voter {
    private String name;
    private int age;
    private String address;

    public Voter(String name, int age, String address) {
        this.name = name;
        setAge(age);
        this.address = address;
    }

    @Override
    public String toString() {
        return "Voter name=" + getName() + ", age=" + getAge() + ", address=" + getAddress();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        if(age >= 16) {
            this.age = age;
        } else {
            System.out.println("Too young for vote" + this.toString());
        }
    }


}
