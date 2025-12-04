import java.util.Scanner;
public class MiniProject3 {
    public static void main(String[] args){

        //TEMPERATURE CONVERTOR PROGRAM

        Scanner scanner = new Scanner(System.in);
        double Temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        Temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        scanner.nextLine();
        unit = scanner.nextLine().toUpperCase();

        newTemp = (unit.equals("F")) ? (Temp * 9/5 + 32) : ((Temp - 32) * 5/9);
        System.out.printf("%.1f°%s" , newTemp ,unit );
        scanner.close();
    }

}