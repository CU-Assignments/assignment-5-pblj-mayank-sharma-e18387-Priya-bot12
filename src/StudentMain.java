import java.io.*;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student(101, "John Doe", 3.8);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(s);
            System.out.println("Student details saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving student: " + e.getMessage());
        }

        // Deserialization
        System.out.println("\nReading from file...");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student student = (Student) ois.readObject();
            student.display();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading student: " + e.getMessage());
        }
    }
}
