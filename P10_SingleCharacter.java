
package javatutorial;

import java.util.Scanner;


public class P10SingleCharacter
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch;
             
        System.out.println("Enter a character:");
        ch=sc.next().charAt(0);
        System.out.println("Character is:");
        System.out.println("ch="+ch);
            
           

    }
    
}
