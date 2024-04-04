
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Switch Case Kullanarak 4 işlem yapan bir hesap makinesi tasarlamaya çalışın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String islemler = "1. Plus\n"
                          +"2. Minus\n"
                          +"3. Multiply\n"
                          +"4. Divide\n";
        System.out.println(islemler);
        System.out.println("************************************");
        System.out.println("Select process:");
        String islem = scanner.nextLine();
        int a;
        int b;
        //meaning (islem- process)
        switch(islem){
            case "1":
                System.out.print("First number: ");
                a = scanner.nextInt();
                System.out.print("Second number: ");
                b = scanner.nextInt();
                System.out.println("Total : " + (a+b));
                break;
            case "2":
                System.out.print("First number: ");
                a = scanner.nextInt();
                System.out.print("Second number: ");
                b = scanner.nextInt();
                System.out.println("Total : " + (a-b));
                break;
            case "3":
                System.out.print("First number: ");
                a = scanner.nextInt();
                System.out.print("Second number: ");
                b = scanner.nextInt();
                System.out.println("Total : " + (a * b));
                break;
            case "4":
                System.out.print("First number: ");
                a = scanner.nextInt();
                System.out.print("Second number: ");
                b = scanner.nextInt();
                System.out.println("Total : " + ((double)a / b));
                break;
            default:
                System.out.println("Wrong Process!!!");


            
            
            
        }

    }
}
