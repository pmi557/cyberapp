/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
import java.util.Scanner;


class CyberStart {
    public static void main(String[] args) {
        String thename;
        
        System.out.println("Hello World!\n\n");
        System.out.print("What's Your name:") ; 
        Scanner odczyt = new Scanner (System.in);
        thename = odczyt.nextLine();
        System.out.println("Fuck the " +thename);
        System.out.print("Yea'h :)\n");

        int numer = 0;
        while (numer<10) {
            System.out.println("Numer"+numer);
            numer++;
        };
        System.out.println("Done.\n");
    }
}