import model.Employee;
import model.Programmer;
import model.Verifier;

import java.util.Objects;
import java.util.Scanner;

public class MainFunction {
    public static Programmer inputProgrammer() {
        Programmer programmer = new Programmer();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Employee code: ");
        programmer.setEmployeeCode(sc.next());
        sc.nextLine();
        System.out.print("\nInput Full name: ");
        programmer.setFullName(sc.nextLine());
        System.out.print("\nInput Age: ");
        programmer.setAge(sc.nextInt());
        System.out.print("\nInput phone number: ");
        programmer.setPhoneNumber(sc.next());
        System.out.print("\nInput email: ");
        programmer.setEmail(sc.next());
        sc.nextLine();
        System.out.print("\nInput Basic Salary: ");
        programmer.setBasicSalary(sc.nextInt());
        System.out.print("\nInput Overtime Hours: ");
        programmer.setOvertimeHours(sc.nextInt());
        return programmer;
    }

    public static Verifier inputVerifier() {
        Verifier verifier = new Verifier();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Employee code: ");
        verifier.setEmployeeCode(sc.next());
        sc.nextLine();
        System.out.print("\nInput Full name: ");
        verifier.setFullName(sc.nextLine());
        System.out.print("\nInput Age: ");
        verifier.setAge(sc.nextInt());
        System.out.print("\nInput phone number: ");
        verifier.setPhoneNumber(sc.next());
        sc.nextLine();
        System.out.print("\nInput email: ");
        verifier.setEmail(sc.next());
        sc.nextLine();
        System.out.print("\nInput Basic Salary: ");
        verifier.setBasicSalary(sc.nextInt());
        System.out.print("\nInput Error Number Detected: ");
        verifier.setErrorNumber(sc.nextInt());
        return verifier;
    }
    public static int salary(Employee i){
        if (i instanceof Programmer) {
            return (i.getBasicSalary() + ((Programmer) i).getOvertimeHours()*400000);
        }
        if (i instanceof Verifier){
            return (i.getBasicSalary() + ((Verifier) i).getErrorNumber()*150000);
        }
        else return 0;
    }
    public static void printEmployee(Employee a){
        System.out.println("Employee code: " + a.getEmployeeCode());
        System.out.println("Full name: "+ a.getFullName());
        System.out.println("Age: " + a.getAge());
        System.out.println("Phone number: " + a.getPhoneNumber());
        System.out.println("Email: " + a.getEmail());
        System.out.println("Base Salary: " + a.getBasicSalary());
        if (a instanceof Programmer) {
            System.out.println("Overtime hours: " + ((Programmer) a).getOvertimeHours());
            System.out.println("Salary: " + salary(a));
        }
        if (a instanceof Verifier) {
            System.out.println("Overtime hours: " + ((Verifier) a).getErrorNumber());
            System.out.println("Salary: " + salary(a));
        }
        System.out.println("\n");
    }
}
