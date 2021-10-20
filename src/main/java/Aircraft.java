import java.util.Scanner;

public class Aircraft {


    public static void main(String []args){

        String make;
        String model;
        String plant;
        String ownername;
        String ownercountry;
        String operatorname;
        String operatorcountry;
        String registrationcountry;
        int year;
        int registrationum;
        int maintenancedate;
        int airframehrs;

        String enginetype;
        String modification;
        boolean speciallivery;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the make of the plane");
        make= keyboard.nextLine();

        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Enter the model of the plane");
        model= keyboard2.nextLine();

        Scanner keyboard3 = new Scanner(System.in);
        System.out.println("Enter the plant where the plane was made");
        plant= keyboard3.nextLine();

        Scanner keyboard4 = new Scanner(System.in);
        System.out.println("Enter the name of the owner entity of the plane");
        ownername= keyboard4.nextLine();

        Scanner keyboard5 = new Scanner(System.in);
        System.out.println("Enter the country of the said entity");
        ownercountry= keyboard5.nextLine();

        Scanner keyboard6 = new Scanner(System.in);
        System.out.println("Enter the operator of the plane");
        operatorname= keyboard6.nextLine();

        Scanner keyboard7 = new Scanner(System.in);
        System.out.println("Enter the country of the said entity");
        operatorcountry= keyboard7.nextLine();

        Scanner keyboard8 = new Scanner(System.in);
        System.out.println("Enter the registration country of the plane");
        registrationcountry= keyboard8.nextLine();

        Scanner keyboard9 = new Scanner(System.in);
        System.out.println("Enter the year the plane was produced");
        year = 2021- keyboard9.nextInt();

        Scanner keyboard10 = new Scanner(System.in);
        System.out.println("Enter the registration number of the plane");
        registrationum = keyboard10.nextInt();

        Scanner keyboard11 = new Scanner(System.in);
        System.out.println("Enter the last maintenance date of the plane");
        maintenancedate = keyboard11.nextInt();

        Scanner keyboard12 = new Scanner(System.in);
        System.out.println("Enter the airframe hours");
        airframehrs = keyboard12.nextInt();

    }
}