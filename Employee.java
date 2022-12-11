import java.util.Scanner;

public class Employee {
    int empid;
    String name;
    float salary;

    public void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the empid :: ");
        empid = in.nextInt();
        System.out.print("Enter the name :: ");
        name = in.next();
        System.out.print("Enter the salary :: ");
        salary = in.nextFloat();
    }

    public void display() {
        System.out.println("Employee id = " + empid);
        System.out.println("Employee name = " + name);
        System.out.println("Employee salary = " + salary);
    }

    public static void main(String[] args) {
        Employee em = new Employee();
        em.accept();
        em.display();
    }
}