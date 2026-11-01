
import java.util.*;
import java.lang.reflect.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    // Message passing
    static void showInformation(Displayable obj) {
        obj.display();
    }

    public static void main(String[] args) {

        // Department object
        Department dcst = new Department(
            "Computer Science and Technology",
            "Goa University",
            "Goa Business School"
        );

        // Students sharing the same Department reference
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(
            101, "Aarav", "aarav@gmail.com",
            "MCA", 2026, 85, dcst
        ));

        students.add(new Student(
            102, "Ananya", "ananya@gmail.com",
            "MCA", 2026, 90, dcst
        ));

        // Staff objects
        ArrayList<Staff> staffList = new ArrayList<>();

        staffList.add(new TeachingStaff(
            201, "Professor A", "prof@gmail.com",
            "Assistant Professor", 65000, "Java"
        ));

        staffList.add(new NonTeachingStaff(
            202, "Staff B", "staff@gmail.com",
            "Office Assistant", 30000, "Administration"
        ));

        // Collection Framework
        Set<String> activitySet = new HashSet<>();

        activitySet.add("InfoFest");
        activitySet.add("Plateaunia");
        activitySet.add("Play-on");
        activitySet.add("InfoFest");

        Map<Integer, String> courses = new HashMap<>();

        courses.put(1, "MCA");
        courses.put(2, "Ph.D. Computer Science");

        Queue<String> placementQueue = new LinkedList<>();

        placementQueue.add("Student 101");
        placementQueue.add("Student 102");

        // Activity objects
        ArrayList<Activity> activities = new ArrayList<>();

        activities.add(new Activity(
            "ISA", ActivityType.ACADEMIC, 2026));

        activities.add(new Activity(
            "Midpoint", ActivityType.ACADEMIC, 2026));

        activities.add(new Activity(
            "SEA", ActivityType.ACADEMIC, 2026));

        activities.add(new Activity(
            "Study Tour", ActivityType.ACADEMIC, 2026));

        activities.add(new Activity(
            "InfoFest", ActivityType.NON_ACADEMIC, 2026));

        activities.add(new Activity(
            "Plateaunia", ActivityType.NON_ACADEMIC, 2026));

        activities.add(new Activity(
            "Play-on", ActivityType.NON_ACADEMIC, 2026));

        // Course and Subjects
        Course mca = new Course("MCA", 2);

        mca.addSubject(new Subject(
            "MCA101", "Object Oriented Programming", 4));

        mca.addSubject(new Subject(
            "MCA102", "Data Structures", 4));

        mca.addSubject(new Subject(
            "MCA103", "Computer Networks", 3));

        int choice = -1;

        do {

            System.out.println("\n==================================");
            System.out.println(" DCST NIRF INFORMATION SYSTEM");
            System.out.println("          GOA UNIVERSITY");
            System.out.println("==================================");

            System.out.println("1. Student Details");
            System.out.println("2. Staff Details");
            System.out.println("3. Academic Activities");
            System.out.println("4. Non-Academic Activities");
            System.out.println("5. Courses and Subjects");
            System.out.println("6. Object Referencing and Cloning");
            System.out.println("7. Collections and Placements");
            System.out.println("8. Exception Handling");
            System.out.println("9. Reflection and Access Modifiers");
            System.out.println("10. Static Member Count");
            System.out.println("11. Save and Read NIRF Report");
            System.out.println("12. Generic Class and Method");
            System.out.println("13. OOP Demonstrations");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");

            try {

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:

                        System.out.println("\n===== STUDENT DETAILS =====");

                        for (Student s : students) {
                            showInformation(s);
                        }
                        break;

                    case 2:

                        System.out.println("\n===== STAFF DETAILS =====");

                        for (Staff s : staffList) {
                            showInformation(s);
                        }
                        break;

                    case 3:

                        System.out.println("\n===== ACADEMIC ACTIVITIES =====");

                        for (Activity a : activities) {

                            if (a.getType() == ActivityType.ACADEMIC) {
                                a.printDetails();
                                System.out.println("--------------------");
                            }
                        }

                        System.out.println(
                            "Other examples: Industrial Visit, Internship, " +
                            "Placement, Workshop, Seminar and Hackathon."
                        );
                        break;

                    case 4:

                        System.out.println("\n===== NON-ACADEMIC ACTIVITIES =====");

                        for (Activity a : activities) {

                            if (a.getType() == ActivityType.NON_ACADEMIC) {
                                a.printDetails();
                                System.out.println("--------------------");
                            }
                        }

                        System.out.println("\nUnique Activity Names:");

                        for (String activity : activitySet) {
                            System.out.println(activity);
                        }
                        break;

                    case 5:

                        System.out.println("\n===== PROGRAMS AND COURSES =====");

                        for (String course : courses.values()) {
                            System.out.println(course);
                        }

                        mca.displayCourse();
                        break;

                    case 6:

                        System.out.println(
                            "\n===== OBJECT REFERENCING AND CLONING ====="
                        );

                        System.out.println(
                            "Both students share the same Department object."
                        );

                        System.out.println(
                            "Same reference: " +
                            (students.get(0).getDepartment() ==
                             students.get(1).getDepartment())
                        );

                        // Side effect of referencing
                        students.get(0).getDepartment()
                                .setLocation("Updated DCST Building");

                        System.out.println(
                            "Location through Student 2: " +
                            students.get(1).getDepartment().getLocation()
                        );

                        try {

                            Department original = dcst;

                            Department shallow = original.clone();

                            Department deep = original.deepClone();

                            original.setLocation("New Campus Location");

                            System.out.println("\nOriginal Department:");
                            original.display();

                            System.out.println("\nShallow Clone:");
                            shallow.display();

                            System.out.println("\nDeep Clone:");
                            deep.display();

                        } catch (CloneNotSupportedException e) {

                            System.out.println(e.getMessage());
                        }

                        break;

                    case 7:

                        System.out.println("\n===== COLLECTIONS =====");

                        System.out.println("\nLIST - Students:");

                        for (Student s : students) {
                            System.out.println(s.getName());
                        }

                        System.out.println("\nSET - Unique Activities:");

                        for (String a : activitySet) {
                            System.out.println(a);
                        }

                        System.out.println("\nMAP - Courses:");

                        for (Map.Entry<Integer, String> entry :
                                courses.entrySet()) {

                            System.out.println(
                                entry.getKey() + " : " + entry.getValue()
                            );
                        }

                        System.out.println("\nQUEUE - Placement:");

                        for (String student : placementQueue) {
                            System.out.println(student);
                        }

                        System.out.println("\nProcessing Placement Queue:");

                        while (!placementQueue.isEmpty()) {
                            System.out.println(placementQueue.poll());
                        }

                        break;

                    case 8:

                        System.out.print("Enter student marks: ");

                        double marks = sc.nextDouble();
                        sc.nextLine();

                        try {

                            MarksValidator.validateMarks(marks);

                        } catch (InvalidMarksException e) {

                            System.out.println(
                                "Custom Exception: " + e.getMessage()
                            );

                        } finally {

                            System.out.println(
                                "Marks validation completed."
                            );
                        }

                        break;

                    case 9:

                        System.out.println(
                            "\n===== REFLECTION AND ACCESS MODIFIERS ====="
                        );

                        Class<?> cls = students.get(0).getClass();

                        System.out.println("Class Name: " + cls.getName());

                        System.out.println("\nAvailable Methods:");

                        for (Method method : cls.getDeclaredMethods()) {
                            System.out.println(method.getName());
                        }

                        System.out.println("\nAccess Modifiers:");

                        System.out.println(
                            "Public department: " + dcst.departmentName
                        );

                        System.out.println(
                            "Private university: " +
                            dcst.getUniversityName()
                        );

                        System.out.println(
                            "Protected location: " +
                            dcst.location.building
                        );

                        System.out.println(
                            "Private fields are accessed through public getters."
                        );

                        break;

                    case 10:

                        System.out.println("\n===== STATIC COUNTERS =====");

                        Person.displayMemberCount();

                        Activity.displayActivityCount();

                        break;

                    case 11:

                        System.out.println("\n===== FILE PERSISTENCE =====");

                        CollegeData.saveData(
                            "DCST NIRF Report - Goa University"
                        );

                        for (Student s : students) {

                            CollegeData.saveData(
                                "Student: " + s.getName()
                            );
                        }

                        CollegeData.readData();

                        break;

                    case 12:

                        System.out.println("\n===== GENERICS =====");

                        GenericBox<String> nameBox =
                            new GenericBox<>("DCST Goa University");

                        nameBox.display();

                        GenericBox<Integer> countBox =
                            new GenericBox<>(100);

                        countBox.display();

                        String[] names = {
                            "Aarav", "Ananya", "DCST"
                        };

                        System.out.println("\nGeneric Method:");

                        GenericUtility.displayList(names);

                        break;

                    case 13:

                        System.out.println("\n===== OOP DEMONSTRATIONS =====");

                        Activity sample = new Activity(
                            "Technical Workshop",
                            ActivityType.ACADEMIC,
                            2026
                        );

                        sample.printMessage();
                        sample.reportMessage();
                        sample.conductActivity();

                        // Method overloading
                        Student s = students.get(0);

                        s.updateMarks(90);

                        s.updateMarks(80, 90, 100);

                        // Method overriding
                        s.displayDetails();

                        // Message passing
                        showInformation(staffList.get(0));

                        break;

                    case 0:

                        System.out.println(
                            "Thank you for using DCST NIRF System!"
                        );
                        break;

                    default:

                        System.out.println(
                            "Invalid choice. Please try again."
                        );
                }

            } catch (InputMismatchException e) {

                System.out.println(
                    "Invalid input! Please enter a valid number."
                );

                sc.nextLine();
                choice = -1;
            }

        } while (choice != 0);

        sc.close();
    }
}
