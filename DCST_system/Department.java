
class CampusLocation {

    String building;

    public CampusLocation(String building) {
        this.building = building;
    }
}

class Department implements Cloneable {

    public String departmentName;
    private String universityName;
    protected CampusLocation location;

    public Department(String departmentName,
                      String universityName,
                      String building) {

        this.departmentName = departmentName;
        this.universityName = universityName;
        this.location = new CampusLocation(building);
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getLocation() {
        return location.building;
    }

    public void setLocation(String building) {
        location.building = building;
    }

    // Shallow cloning
    @Override
    public Department clone() throws CloneNotSupportedException {
        return (Department) super.clone();
    }

    // Deep cloning
    public Department deepClone() {
        Department copy = new Department(
            departmentName,
            universityName,
            location.building
        );

        return copy;
    }

    public void display() {
        System.out.println("Department: " + departmentName);
        System.out.println("University: " + universityName);
        System.out.println("Location: " + location.building);
    }
}
