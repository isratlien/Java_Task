import java.util.Scanner;

public class Homework1 {
    public int add(int x,int y){
        int sum = x+y;
        System.out.println(sum);
        return sum;
    }
    public void str1(int k,String name) {

        System.out.println( "(" + k + "," +name +")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int num2 = sc.nextInt();
        Homework1 h = new Homework1();
        int k = h.add(num1, num2);
        System.out.println("Enter the name");
        sc.nextLine();
        String name = sc.nextLine();
        h.str1(k,name);
    }
    }

