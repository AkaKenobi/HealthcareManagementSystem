public class HospitalClass {
    private String name;
    private String location;

    // Constructor
    public HospitalClass(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    // Method
    public void printInfo() {
        System.out.println("Hospital: " + name + " | Location: " + location);
    }
}
