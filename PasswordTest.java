package PasswordAssist;

import java.util.Scanner;

public class PasswordTest
{
    public static Scanner sc;
    public PasswordTest(Scanner scan)
    {
        sc = scan;
    }
    public void test()
    {
        System.out.println("Enter your Password");
        String inPass = sc.nextLine();

        boolean usedUpper=false;
        boolean usedLower=false;
        boolean usedNums=false;
        boolean usedSyms=false;
        
        for(int i=0;i<inPass.length();i++)
        {
            if(inPass.charAt(i)>=65 && inPass.charAt(i)<=90)
                usedUpper = true;
            if(inPass.charAt(i)>=97 && inPass.charAt(i)<=122)
                usedLower = true;
            if(inPass.charAt(i)>=48 && inPass.charAt(i)<=57)
                usedNums = true;
            else
                usedSyms = true;
        }
        int val = 0;
        if(usedLower) val += 1;
        if(usedUpper) val += 1;
        if(usedNums) val += 1;
        if(usedSyms) val += 1;

        if(val == 4)
            System.out.println("Your Password is Strong");
        if(val == 3)
            System.out.println("Your Password is Good");
        if(val == 2)
            System.out.println("Your Password is Weak");
        if(val == 1)
            System.out.println("Your Password is Bad, choose another one");
    }
}
