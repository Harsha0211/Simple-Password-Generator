package PasswordAssist;

import java.util.Scanner;

public class Main
{    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();
        menu.showMenu();

        try{
            String myChoice="-1";
            while(!myChoice.equals("3"))
            {
                myChoice="-1";
                myChoice = sc.next();
                
                if(myChoice.equals("1"))
                {
                    PasswordGenerator generator = new PasswordGenerator(sc);
                    String print = generator.generate();
                    System.out.println(print);
                    menu.showMenu();
                }
                if(myChoice.equals("2"))
                {
                    PasswordTest tester = new PasswordTest(sc);
                    tester.test();
                    menu.showMenu();
                }
                if(!myChoice.equals("1") && !myChoice.equals("2") && !myChoice.equals("3"))
                {
                    System.out.println("Choose relevant option only");
                    menu.showMenu();
                }
                sc.nextLine();
            }
        }
        catch(Exception e)
        {
            System.out.println("You have entered irrelavent\n"+e);
        }
        sc.close();
    }    
}
