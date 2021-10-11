import java.util.Scanner;


public class militarygov {

    public static void main(String[] args) {
        int unit;
        String purpose;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the purpose of the plane");
        purpose = keyboard.nextLine();

        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Enter the unit that the plane belongs to");
        unit = keyboard2.nextInt();
    }
}
