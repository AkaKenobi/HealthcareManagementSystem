public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        hospital.addPerson(new Patient(1, "Aruzhan", 20));
        hospital.addPerson(new Doctor(2, "Dr. Samat", "Therapist"));
        hospital.addPerson(new Patient(3, "Dias", 25));

        hospital.showAll();

        System.out.println("\nOnly patients:");
        hospital.showPatientsOnly();

        System.out.println("\nSorted by name:");
        hospital.sortByName();
        hospital.showAll();
    }
}
