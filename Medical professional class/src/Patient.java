public class Patient extends Person {

    private int age;

    public Patient(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    public int getAge() { return age; }

    @Override
    public void printInfo() {
        System.out.println("Patient → " + name + ", Age: " + age);
    }
}
