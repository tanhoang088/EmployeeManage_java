import model.Employee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(MainFunction.inputProgrammer());
        employees.add(MainFunction.inputProgrammer());
        employees.add(MainFunction.inputVerifier());
        for (int i = 0; i< employees.size(); i++) MainFunction.printEmployee(employees.get(i));
    }
}