package PasswordAssist;
import java.util.Scanner;

public class PasswordGenerator
{
    public static Scanner sc;
    public PasswordGenerator(Scanner scan)
    {
        sc = scan;
    }
    public String generate()
    {
        boolean includeUpper = false;
        boolean includeLower = false;
        boolean includeNums = false;
        boolean includeSyms = false;

        //Scanner sc = new Scanner(System.in);

        System.out.println("Answer 'YES/NO' to the following to generate the password");

        String input;
        boolean wantLoop;

        do{
            wantLoop = false;

            do{
            System.out.println("Do you need Upper Case letters included");
            input = sc.next();
            inputCheck(input);
            if(input.equalsIgnoreCase("yes"))
                includeUpper = true;
            }while(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

            do{
            System.out.println("Do you need Lower Case letters included");
            input = sc.next();
            inputCheck(input);
            if(input.equalsIgnoreCase("yes"))
                includeLower = true;
            }while(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

            do{
            System.out.println("Do you need numbers included");
            input = sc.next();
            inputCheck(input);
            if(input.equalsIgnoreCase("yes"))
                includeNums = true;
            }while(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));

            do{
            System.out.println("Do you need Special symbols included");
            input = sc.next();
            inputCheck(input);
            if(input.equalsIgnoreCase("yes"))
                includeSyms = true;
            }while(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));
            
            if(!includeLower && !includeUpper && !includeNums && !includeSyms){
                System.out.println("You haven't included any characters, do choose the elements");
                wantLoop = true;
            }

        }while(wantLoop);

        Source sourcepool = new Source();
        StringBuilder stringpool = sourcepool.setPool(includeUpper, includeLower, includeNums, includeSyms);

        System.out.println("Great!");
        System.out.println("Now, Enter length of password needed in INTEGER");
        int length = sc.nextInt();

        String output = "";
        for(int i=0;i<length;i++)
        {
            int index = (int) (Math.random()*(stringpool.length()-1));
            output = output + stringpool.charAt(index);
        }

        return output;
        
    }  
    public void inputCheck(String str)
    {
        if(!str.equalsIgnoreCase("yes") && !str.equalsIgnoreCase("no"))
            System.out.println("Please enter YES or NO...");
    } 
}


