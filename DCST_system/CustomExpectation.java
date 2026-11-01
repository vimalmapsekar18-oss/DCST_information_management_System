
class InvalidMarksException extends Exception {

    public InvalidMarksException(String message) {
        super(message);
    }
}

class MarksValidator {

    public static void validateMarks(double marks)
            throws InvalidMarksException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException(
                "Marks must be between 0 and 100."
            );
        }

        System.out.println("Valid marks: " + marks);
    }
}
