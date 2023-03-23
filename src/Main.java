import java.util.Random;
public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        allInfo();
        printFullName();
    }

    public static void allInfo() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            System.out.println(EMPLOYEES[i]);
        }
    }

    public static int totalSalary() {
        int n = 0;
        for (Employee employee : EMPLOYEES) {
            n += employee.getSalary();
        }
        return n;
    }

    public static Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEES) {
            if (emp.getSalary() < min) {
                min = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    public static Employee maxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEES) {
            if (emp.getSalary() < max) {
                max = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }

    public static void printFullName() {
        for (Employee empName : EMPLOYEES) {
            System.out.println(empName.getFullName());
        }
    }

    public static double averageSalary() {
        double mv;
        mv = totalSalary() / (double) EMPLOYEES.length;
        return mv;
    }

}