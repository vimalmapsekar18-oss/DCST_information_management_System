
class Student extends Person implements Displayable, Printable, Reportable, Cloneable {

    private String course;
    private int year;
    private double marks;

    // Shared Department reference
    private Department department;

    public Student(int id, String name, String email,
                   String course, int year, double marks,
                   Department department) {

        super(id, name, email);
        this.course = course;
        this.year = year;
        this.marks = marks;
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nStudent ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Academic Year: " + year);
        System.out.println("Marks: " + marks);
        System.out.println("Department: " + department.departmentName);
    }

    @Override
    public void display() {
        displayDetails();
    }

    @Override
    public void printDetails() {
        displayDetails();
    }

    @Override
    public void generateReport() {
        System.out.println("Student report generated for " + name);
    }

    // Method overloading
    public void updateMarks(double marks) {
        this.marks = marks;
    }

    public void updateMarks(double subject1,
                            double subject2,
                            double subject3) {
        this.marks = (subject1 + subject2 + subject3) / 3;
    }

    public Department getDepartment() {
        return department;
    }

    // Shallow clone
    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    // Deep clone
    public Student deepClone() {
        return new Student(
            id, name, email, course, year, marks,
            department.deepClone()
        );
    }
}
