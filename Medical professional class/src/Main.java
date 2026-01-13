public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        PatientDao patientDao = new PatientDao();

        try {
            // WRITE → DB
            patientDao.insert(new Patient(1, "Aruzhan", 20));
            patientDao.insert(new Patient(3, "Dias", 25));

            // READ → DB → Java
            for (Patient p : patientDao.getAll()) {
                hospital.addPerson(p);
            }

            System.out.println("=== ALL PEOPLE ===");
            hospital.showAll();

            System.out.println("\nOnly patients:");
            hospital.showPatientsOnly();

            System.out.println("\nSorted by name:");
            hospital.sortByName();
            hospital.showAll();

            // UPDATE
            patientDao.updateAge(1, 21);

            // DELETE
            patientDao.delete(3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
