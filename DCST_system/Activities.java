
enum ActivityType {
    ACADEMIC,
    NON_ACADEMIC
}

enum AcademicActivityType {
    ISA,
    MIDPOINT,
    SEA,
    STUDY_TOUR,
    INDUSTRIAL_VISIT,
    INTERNSHIP,
    PLACEMENT,
    WORKSHOP,
    SEMINAR,
    HACKATHON
}

enum NonAcademicActivityType {
    INFOFEST,
    PLATEAUNIA,
    PLAY_ON,
    SPORTS,
    CULTURAL_PROGRAM,
    FRESHERS,
    FAREWELL,
    SOCIAL_OUTREACH
}

class Activity implements DepartmentActivity {

    private static int activityCount = 0;

    private String activityName;
    private ActivityType type;
    private int year;

    public Activity(String activityName,
                    ActivityType type, int year) {

        this.activityName = activityName;
        this.type = type;
        this.year = year;

        activityCount++;
    }

    // Getter for activity type
    public ActivityType getType() {
        return type;
    }

    // Getter for activity name
    public String getActivityName() {
        return activityName;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    @Override
    public void printDetails() {
        System.out.println("Activity: " + activityName);
        System.out.println("Type: " + type);
        System.out.println("Year: " + year);
    }

    @Override
    public void generateReport() {
        System.out.println("Activity report: " + activityName);
    }

    @Override
    public void conductActivity() {
        System.out.println(activityName + " conducted by DCST.");
    }

    public static void displayActivityCount() {
        System.out.println("Total activities: " + activityCount);
    }
}
