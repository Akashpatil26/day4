import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String reverse ="";
        String name =sc.nextLine();
        int length =name.length();
        for(int i=(length-1);i>=0;--i){
            reverse=reverse + name.charAt(i);
        }

        if (name.equals(reverse))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
