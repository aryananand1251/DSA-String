package Start_java;

import java.util.Scanner;

public class Bit_manipulation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of n");
        int n=sc.nextInt();
        System.out.println("Enter the Value of i");
        int i=sc.nextInt();
        System.out.println(getIthBit(n,i));
        // call each method accordingly to check the code;


    }

    //check odd even
    public static void oddOreven(int n){
        int bitMask=1;
        if((n & bitMask)==0)
        {
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }

    //getIthbit
    public static int getIthBit(int n ,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0)
        {
            return 0;
        }
        else {
            return 1;
        }
    }
    // SetIthBit
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }

    // Clear ithBit
    public static int clearIthBit(int n, int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }

    // Clear range of bits
    public static int clearRithBits(int n, int i, int j)
    {
        int a=((~0)<<j+1);
        int b=(1<<i)-1;
        int bitMask=a | b;
        return n & bitMask;
    }

    //check number is power of 2 or not

    public static boolean isPowerofTWo(int n)
    {
        return (n & (n-1))==0;
    }


}
