import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements utility {
    String emp_ID;
    String emp_name;
    int emp_age;
    String emp_dept;

    @Override
    public void get_details() {
        System.out.println("Employee ID: "+emp_ID);
        System.out.println("Employee Name: "+emp_name);
        System.out.println("Employee Age: "+emp_age);
        System.out.println("Employee Department: "+emp_dept);
    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        UUID uuid=UUID.randomUUID();
        emp_ID=String.valueOf(uuid);
        System.out.println("====================== *** ENTER EMPLOYEE DETAILS *** ======================");
        System.out.println();
        System.out.println("Employee Name: ");
        emp_name=sc.nextLine();
        System.out.println("Employee Age: ");
        emp_age = sc.nextInt();
        sc.nextLine();
        System.out.println("Employee Department: ");
        emp_dept=sc.nextLine();
        System.out.println("Showroom Name: ");
        showroom_name=sc.nextLine();
    }
}
