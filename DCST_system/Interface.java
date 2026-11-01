
interface Printable {
    void printDetails();

    default void printMessage() {
        System.out.println("Printing DCST information...");
    }
}

interface Reportable {
    void generateReport();

    default void reportMessage() {
        System.out.println("Generating NIRF report...");
    }
}

// Multiple interface inheritance
interface DepartmentActivity extends Printable, Reportable {
    void conductActivity();
}

// Another interface for message passing
interface Displayable {
    void display();
}
