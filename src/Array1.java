import java.util.Scanner;

public class Array1 {
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        int n,i,a=0,b=0;
        System.out.println("give a number");
        n = sc.nextInt();

        int arr[]= new int[n];
        for(i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        for(int k=0;k < arr.length;k++) {
            if (arr[k] % 2 == 0) {
                a++;
            } else{
                b++;
            }
        }
            System.out.println("total even number=" +a);
            System.out.println("total odd number=" +b);



    }

}




