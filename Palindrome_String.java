package Start_java;

import java.util.Scanner;

public class Palindrome_String {


    public static void main(String arhs[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String a=sc.nextLine();
        System.out.println(ispaliondrome(a));


    }
    public static boolean ispaliondrome(String a){
        for(int i=0; i<a.length()/2; i++){
            int n=a.length();
            if(a.charAt(i)!=a.charAt(n-1-i)){
                return false;
            }


        }

        return true;
    }


}
