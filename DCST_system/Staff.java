
abstract class Staff extends Person implements Displayable {

    protected String designation;
    protected double salary;

    public Staff(int id, String name, String email,
                 String designation, double salary) {

        super(id, name, email);
        this.designation = designation;
        this.salary = salary;
    }
}

class TeachingStaff extends Staff {

    private String subject;

    public TeachingStaff(int id, String name, String email,
                         String designation, double salary,
                         String subject) {

        super(id, name, email, designation, salary);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nTeaching Staff");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }

    @Override
    public void display() {
        displayDetails();
    }
}

class NonTeachingStaff extends Staff {

    private String department;

    public NonTeachingStaff(int id, String name, String email,
                            String designation, double salary,
                            String department) {

        super(id, name, email, designation, salary);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nNon-Teaching Staff");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    @Override
    public void display() {
        displayDetails();
    }
}
