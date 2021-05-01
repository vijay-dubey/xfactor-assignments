import java.util.Scanner;

public class ClockAngle {
    public Double findAngle(Integer hour, Integer minute) {
        Double angle = Double.valueOf(0);
        hour %= 12;
        Double h = Double.valueOf( (360/12)*hour + (30d/60)*minute );
        Double m = Double.valueOf( (360/60)*minute );
        angle = Math.abs(h-m);
        return Math.min(angle, 360-angle);
    }

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        Integer hour = scan.nextInt();
        Integer minute = scan.nextInt();
        ClockAngle obj = new ClockAngle();
        Double angle = obj.findAngle(hour, minute);
        System.out.println(angle);
        scan.close();
    }
}