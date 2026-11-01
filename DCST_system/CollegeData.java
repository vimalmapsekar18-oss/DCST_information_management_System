
import java.io.*;

class CollegeData {

    public static void saveData(String data) {

        try (FileWriter writer =
                     new FileWriter("DCST_NIRF_Report.txt", true)) {

            writer.write(data + "\n");
            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public static void readData() {

        try (BufferedReader reader =
                     new BufferedReader(
                         new FileReader("DCST_NIRF_Report.txt"))) {

            String line;

            System.out.println("\nSaved DCST Information:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
