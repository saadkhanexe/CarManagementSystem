import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Showroom implements utility{
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_noOfCars=0;
    String manager_name;

    @Override
    public void get_details() {
        System.out.println("Showroom Name: "+ showroom_name);
        System.out.println("Showroom Address: "+ showroom_address);
        System.out.println("Manager Name: "+ manager_name);
        System.out.println("Total Employees: "+ total_employees);
        System.out.println("Total Cars: "+ total_noOfCars);

    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        System.out.println("==================== *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.println("Showroom Name: ");
        showroom_name = sc.nextLine();
        System.out.println("Showroom Address: ");
        showroom_address =sc.nextLine();
        System.out.println("Manager Name: ");
        manager_name = sc.nextLine();
        System.out.println("Total number of employees: ");
        total_employees =sc.nextInt();
        System.out.println("Total number of cars: ");
        total_noOfCars =sc.nextInt();
    }
}
