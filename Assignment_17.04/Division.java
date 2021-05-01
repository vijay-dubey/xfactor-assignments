import java.util.Scanner;

public class Division {
    private static Integer divide(Integer numerator, Integer denominator) {
        Integer div = 0;

        if( denominator == 0 ) throw new ArithmeticException("denominator can not be 0.");

        while(numerator >= denominator) {
            numerator -= denominator;
            div++;
        }
        return div;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer num = scan.nextInt();
        Integer den = scan.nextInt();
        Integer ans = Division.divide(num, den);
        System.out.println(ans);
        scan.close();
    }
}
