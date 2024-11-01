import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class StudentReport {
    private List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        new StudentReport().generateReport();
    }

    public void generateReport() {
        loadStudents("src/Studinfo.csv");
        processFile("src/AddressInfo.csv", this::addAddress);
        processFile("src/ParentInfo.csv", this::addParent);

        students.forEach(Student::printReport);
    }

    private void loadStudents(String fileName) {
        readFile(fileName, line -> {
            String[] data = line.split(", ");
            Student student = new Student(data[0], data[1], data[2]);
            Degree degree = new Degree(data[3], getDegreeDescription(data[3]));
            student.setDegree(degree);
            students.add(student);
        });
    }

    private void processFile(String fileName, BiConsumer<Student, String[]> consumer) {
        readFile(fileName, line -> {
            String[] data = line.split(", ");
            for (Student student : students) {
                if (student.getId().equals(data[0])) {
                    consumer.accept(student, data);
                }
            }
        });
    }

    private void readFile(String fileName, Consumer<String> lineConsumer) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                lineConsumer.accept(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

    private String getDegreeDescription(String code) {
        return switch (code) {
            case "BSCS" -> "Bachelor of Science in Computer Science";
            case "BSIE" -> "Bachelor of Science in Industrial Engineering";
            case "BSCE" -> "Bachelor of Science in Civil Engineering";
            case "BSECE" -> "Bachelor of Science in Electronics Engineering";
            default -> "Unknown Degree";
        };
    }


    private void addAddress(Student student, String[] data) {
        Address address = new Address(data[1], data[2]);
        student.addAddress(address);
    }

    private void addParent(Student student, String[] data) {
        Parent parent = new Parent(data[1], data[2]);
        student.addParent(parent);
    }


}
