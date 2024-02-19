import java.util.Scanner;
public class AreaCircleSeg {
    public static void main(String[] args) {

        //Define 𝜋 value, radius and center angle value
         int r, a;
         double pi=3.14;

         // Define Scanner
         Scanner doa=new Scanner(System.in);

         //Get value from user
         System.out.print("Enter the Radius of the Circle : ");
         r=doa.nextInt();

         System.out.print("Enter the measure of the central angle : ");
         a=doa.nextInt();

         // Define the Formula [(𝜋 * (r*r) * 𝛼) / 360 ] to find the area of the circle segment
         double area=(pi * (r*r) * a) / 360;


         System.out.println("Area of Circle : " + area);

    }
}
