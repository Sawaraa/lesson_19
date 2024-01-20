import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        File file = new File("Employee.txt");

        System.out.println("¬вед≥ть ≥м'€:");
        String name = scanner.next();
        System.out.println("¬вед≥ть id:");
        int id = scanner.nextInt();
        System.out.println("¬вед≥ть зарплату:");
        int salary = scanner.nextInt();
        Employee employee = new Employee(name, id, salary);
        Methods methods = new Methods();
        methods.serialize(file, employee);
        methods.deserealize(file);

    }
}