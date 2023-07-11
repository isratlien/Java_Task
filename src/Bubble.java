import java.util.Scanner;
public class Bubble {
    public static void bubbleSort(int arr2[],int n){
        int temp=0,i,j;
        for(i=0;i<n;i++){
            for(j=1;j<n-i;j++){
                if(arr2[j-1]>arr2[j]){
                    temp=arr2[j-1];
                    arr2[j-1]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }

    }
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int n,i,j;
        System.out.println("number of elements");

        n=sc.nextInt();
        int arr2[]= new int[n];

         for(i=0;i<n;i++){

          arr2[i] = sc.nextInt();
         }
         for(j=0;j<n;j++){
             System.out.println("elements are:"+arr2[j]);
         }
         int arr3[];
         arr3 =new int[n];
         bubbleSort(arr2,n);

         for(i=0;i<n;i++){
             for(j=0;j<n;j++) {
                 if(arr2[i] != arr2[i+1]) {
                     arr3[j] = arr2[i];
                 }
                 else {
                     break;
                 }
             }

        }
         System.out.println("bubble sort is:");

         for(j=0; j< arr3.length;j++){
            System.out.println(+ arr3[j]);
        }

    }
}
