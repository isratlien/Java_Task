
import java.util.Scanner;
public class Homework2 {
    public int add(int x,int y){
        int sum1=x +y;
        System.out.println("total value1:" +sum1);
        return sum1;
    }
    public int sub(int x,int y){
        int sum2= x-y;
        System.out.println("total value2:" +sum2);
        return sum2;
    }
    public int multi(int x,int y){
        int sum3=x*y;
        System.out.println("total value3:" +sum3);
        return sum3;
    }
    public double div(double x,double y){
        double sum4=x/y;
        System.out.println("total value4:" +sum4);
        return sum4;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1st value");
        int a=sc.nextInt();
        System.out.println("2nd value");
        int b=sc.nextInt();
        System.out.println("3rd value");
        int c=sc.nextInt();
        System.out.println("4th value");
        int d=sc.nextInt();
        System.out.println("5th value");
        int e=sc.nextInt();
        System.out.println("6th value");
        int f=sc.nextInt();
        System.out.println("7th value");
        int g=sc.nextInt();
        System.out.println("8th value");
        int h=sc.nextInt();
        Homework2 ho= new Homework2();
        int i=ho.add(a,b);
        int j=ho.sub(c,d);
        int k=ho.multi(e,f);
        double l=ho.div(g,h);
        System.out.println("Total sum:");
        System.out.println(i+j+k+l);





    }
}
