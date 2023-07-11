import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.nextLine();
        if(isPalindrome(str)){
            System.out.println( str+"it is a palindrome");
        }
        else{
            System.out.println(str+"it is not a palindrome");
        }

    }
    public static boolean isPalindrome(String str){
        int l=0 , r=str.length()-1;
        while (l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;

    }
}
