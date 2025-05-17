import java.util.Scanner;

public class Q2 {

    public String name;
    public int acNumber;
    public String address;
    public int phonenumber;
    public int balance;

    public void main(String[] args) {

        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Enter name");
        acNumber = input.nextInt();
        System.out.println("Enter AC/Number");
        address = input.nextLine();
        System.out.println("Enter Address");
        phonenumber = input.nextInt();
        System.out.println("Enter Phone Number");
        balance = input.nextInt();
        System.out.println("Enter Balance");

    }

}

