import java.util.Scanner;

public class TaxCalculator {
    public static void main(String [] args) {
        System.out.println("Enter amount : ");
        Scanner scan = new Scanner(System.in);
        Double a = scan.nextDouble();
        Double tax = 0d;
        if( a < 0 ) System.out.println("Invalid amount!!!");
        else if(a <= 250000) tax = 0d;
        else if( a <= 500000 ) tax = .05 * (a - 250000);
        else if( a <= 750000 ) tax = (.05 * 250000) + (.1 * (a - 500000));
        else if( a <= 1000000 ) tax = (.15 * 250000) + (.15 * (a - 750000));
        else if( a <= 1250000 ) tax = (.3 * 250000) + (.2 * (a - 1000000));
        else if( a <= 1500000 ) tax = (.5 * 250000) + (.25 * (a - 1250000));
        else tax =  (.75 * 250000) + (.3 * (a - 1500000));

        System.out.println("Tax : " + tax);

        scan.close();
    }
}
