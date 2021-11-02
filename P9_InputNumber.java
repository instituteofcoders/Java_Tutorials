
package javatutorial;

import java.util.Scanner;


public class P9InputNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        System.out.println("Enter the numbers:");
        b=sc.nextByte();
        s=sc.nextShort();
        i=sc.nextInt();
        l=sc.nextLong();
        f=sc.nextFloat();
        d=sc.nextDouble();
        System.out.println("Numbers are:");
         
            System.out.println("b="+b);
            System.out.println("s="+s);
            System.out.println("i="+i);
            System.out.println("l="+l);
            System.out.println("f="+f);
            System.out.println("d="+d);
           

    }
    
}
