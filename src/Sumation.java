import java.util.Scanner;

public class Sumation {

    public static void main (String args[] ) {

        Scanner sc = new Scanner(System.in);
        int n,i,sum1=0,sum2=0;
        System.out.println("Array of size:");
        n = sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        for(int k=0;k<n;k++) {
            if (arr[k] % 2 == 0) {
                sum1 = sum1 + arr[k];

            } else {
                sum2 = sum2 + arr[k];
            }
        }
        System.out.println("total summation of even =" +sum1);
        System.out.println("total summation of odd =" +sum2);

    }
}
