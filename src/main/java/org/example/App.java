package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner scan = new Scanner (System.in);
        System.out.print( "What is your name?: " );
        String name = scan.nextLine();
    }
}
