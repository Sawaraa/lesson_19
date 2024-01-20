import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) throws Exception {

        File file = new File("ArrayEmployee.txt");

        Scanner scanner = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();

        while (true){
            int choise = scanner.nextInt();
            switch (choise){
                case 1:{
                    System.out.println("¬вед≥ть ≥м'€:");
                    String name = scanner.next();
                    System.out.println("¬вед≥ть id:");
                    int id = scanner.nextInt();
                    System.out.println("¬вед≥ть зарплату:");
                    int salary = scanner.nextInt();

                    Employee newEmployee = new Employee(name,id,salary);
                    employees.add(newEmployee);
                    Methods methods = new Methods();
                    methods.serialize(file, employees);
                    methods.deserealize(file);
                }
                break;
//                case 2:{
//                    for(Employee emp : employees){
//                        System.out.println(emp);
//                    }
//                }
//                break;
            }

        }

    }


}
