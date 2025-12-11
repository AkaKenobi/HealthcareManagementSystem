public class MedicalProfessionalClass {
    private int doctorId;
    private String name;
    private String specialization;

    // Constructor
    public MedicalProfessionalClass(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    // Getters and Setters
    public int getDoctorId() { return doctorId; }
    public void setDoctorId(int doctorId) { this.doctorId = doctorId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    // Method
    public void introduce() {
        System.out.println("Doctor: " + name + " (" + specialization + ")");
    }
}
