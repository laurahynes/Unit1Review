
import java.util.Scanner;

public class TempConvert1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double far, cel;
        //input
        System.out.print("Enter degres Farenheit > ");
        far = s.nextDouble();
        //process
        cel = (far - 32.0) * 5.0 / 9.0;
        //output
        System.out.format("%.2f Farenheit = %.2f Celcius\n", far, cel);

    }

}
