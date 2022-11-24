import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter body kg : ");
        int kg = input.nextInt();
        System.out.print("Enter height : ");
        double height = input.nextDouble();

        double bmi = kg / (height * height);
        System.out.println("your body index is : "+bmi);
    }
}