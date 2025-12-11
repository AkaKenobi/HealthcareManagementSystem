public class MainClass {
    public static void main(String[] args) {

        // Creating objects
        PatientClass p1 = new PatientClass(1, "Aruzhan", 20);
        PatientClass p2 = new PatientClass(2, "Dias", 25);

        MedicalProfessionalClass d1 = new MedicalProfessionalClass(101, "Dr. Samat", "Therapist");
        MedicalProfessionalClass d2 = new MedicalProfessionalClass(102, "Dr. Aigerim", "Cardiologist");

        HospitalClass h1 = new HospitalClass("Astana City Hospital", "Astana");

        // Output to console
        p1.printInfo();
        p2.printInfo();

        d1.introduce();
        d2.introduce();

        h1.printInfo();

        // Comparing objects
        System.out.println("Are patients equal? " + (p1.getPatientId() == p2.getPatientId()));
        System.out.println("Do doctors have same specialization? "
                + d1.getSpecialization().equals(d2.getSpecialization()));
    }
}
