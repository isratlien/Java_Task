import java.util.Scanner;

public class Div {
    public int add(int x, int y) {
        int sum = x + y;
        System.out.println(sum);
        return sum;

    }
    public void divided(int k,int num3) {
        int sum2 = k/num3;
        System.out.println(sum2);

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st value");
        int num1 = sc. nextInt();
        System.out.println("Enter the 2nd value");
        int num2 = sc. nextInt();
        Div d = new Div();

        int k = d.add(num1,num2);
        System.out.println("Enter the 3rd value");
        int num3= sc.nextInt();
        d.divided(k,num3);




    }
}

