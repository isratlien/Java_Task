import java.util.Scanner;

public class Else {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("give a number");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("it is a even number= " +n);
        }
        else {
            System.out.println("it is a odd number= " +n);
        }

    }
}
