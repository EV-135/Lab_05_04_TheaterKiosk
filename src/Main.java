import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int age = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("What is your age?");
        age = in.nextInt();

        if (age >= 21){
            System.out.println("You get a wristband");
        }
    }
}