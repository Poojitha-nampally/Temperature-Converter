import java.util.*;
public class Tempconverter {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp=sc.nextDouble();

        System.out.print("Convert to Celcius to Fahreinheit? (0 or F): ");
        unit=sc.next().toUpperCase();

        // System.out.println(temp);
        // System.out.println(unit);
        newTemp=(unit.equals("C"))?(temp-32)*5/9:(temp*5/9)+32;
        System.out.printf("%.1fdegree%s",newTemp, unit);

    }
}
