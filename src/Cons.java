import java.util.Scanner;

public class Cons {
    public int add(int x, int y){
        int sum =x+y;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st value");
        int num1 = sc. nextInt();
        System.out.println("Enter the 2nd value");
        int num2 = sc. nextInt();
        Cons sum=new Cons();
        sum.add(num1,num2);


    }
}
