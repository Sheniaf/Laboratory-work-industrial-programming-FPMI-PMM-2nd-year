import java.util.Scanner;
class Arcsin{
    double x, e;
    Arcsin(double temp_x, double k){
        x = temp_x;
        e = 1 / Math.pow(10,k);
    }
    double factorial(double temp) {
        if(temp==0) return 1;
        else {
            return temp*factorial(temp-1);
        }
    }

    double arcsin(){
        double sum = x, summand = 2;
        double temp=1;
        while (Math.abs(summand) >= e ){
            summand = ((factorial(2 * temp)) / (Math.pow(4,temp) * Math.pow(factorial(temp), 2) * (2 * temp + 1))) * (Math.pow(x,(2 * temp + 1)));
            if(summand >= e)
                sum += summand;
            temp++;
        }
        return sum;
    }

}
public class MyProgramm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the x value (-1,+1) : ");
        double x = scan.nextDouble();
        if(x >= 1 || x<=-1) {
            scan.close();
            System.out.println("Error!!!");
        }
        else {
            System.out.println("Enter the k value (natural number) : ");
            double k = scan.nextDouble();
            scan.close();
            if(k < 0)
                System.out.println("Error!!!");
            else {
                Arcsin object = new Arcsin(x, k);
                System.out.print("My value: arcsin " + x + " = ");
                System.out.printf("%.3f %n", object.arcsin());
                System.out.println();
                System.out.print("Standard value: arcsin " + x + " = ");
                System.out.printf("%.3f %n", Math.asin(x));
            }
        }
    }
}