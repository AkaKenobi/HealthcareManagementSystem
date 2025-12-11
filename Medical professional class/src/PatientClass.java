public class PatientClass {
    private int patientId;
    private String name;
    private int age;

    // Constructor
    public PatientClass(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // Method
    public void printInfo() {
        System.out.println("Patient: " + name + ", Age: " + age);
    }
}
