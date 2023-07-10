import java.util.Scanner;

public class ArithmaticSwitch {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int no1,no2,ch;

        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.print("Select Choice: ");
        ch = scanner.nextInt();

        switch(ch)
        {
            case 1:
                System.out.print("Enter Number 1 :");
                no1=scanner.nextInt();
                System.out.print("Enter Number 2 :");
                no2=scanner.nextInt();
                System.out.print("Add= " + (no1+no2));
                break;
            case 2:
                System.out.print("Enter Number 1 :");
                no1=scanner.nextInt();
                System.out.print("Enter Number 2 :");
                no2=scanner.nextInt();
                System.out.print("Sub= " + (no1-no2));
                break;
            case 3:
                System.out.print("Enter Number 1:");
                no1=scanner.nextInt();
                System.out.print("Enter Number 2:");
                no2=scanner.nextInt();
                System.out.print("Mul= " + (no1*no2));
                break;
            case 4:
                System.out.print("Enter Number 1:");
                no1=scanner.nextInt();
                System.out.print("Enter Number 2:");
                no2=scanner.nextInt();
                System.out.print("Division = " + (no1/no2));
                break;
            default:
                System.out.print("Invalid Choice");
        }
    }
}


