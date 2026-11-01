
abstract class Person {
    protected int id;
    protected String name;
    protected String email;

    private static int memberCount = 0;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        memberCount++;
    }

    public abstract void displayDetails();

    public static void displayMemberCount() {
        System.out.println("Total members created: " + memberCount);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
