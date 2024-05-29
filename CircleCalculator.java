import java.util.Scanner; //imports scanner

public class CircleCalculator
{
    public static void main (String [] args)
    {
        //Doubles scanner
        Scanner doublescan = new Scanner(System.in);
        
        //Directions
        System.out.println("Hey, I'm the Circle Calculator!");
        System.out.println("If you give me a radius value, I can:");
        System.out.println("1. Find the area of the circle.");
        System.out.println("2. Find the volume of the sphere.");
        System.out.println("3. Find the surface area of the sphere.");
        System.out.println("---------------------------------------------");
        
        
        //Scanning the radius value
        System.out.println("Type your wanted radius value here: ");
        double r = doublescan.nextDouble();
        System.out.println("Thanks! Finding results now...");
        System.out.println("---------------------------------------------");
        
        //Formulating circle area
        double area = 3.14 * r * r;
        System.out.println("1. Area of a circle: " + area);
        
        //Formulating sphere volume
        double volume = (4.0/3.0) * 3.14 * r * r * r;
        System.out.println("2. Volume of a sphere: " + volume);
        
        //Formulating sphere surface area
        double surfacearea = 4 * 3.14 * r * r;
        System.out.println("3. Surface area of a sphere: " + surfacearea);
        System.out.println("---------------------------------------------");
        
        //Farewell
        System.out.println("Thanks for coming by, see you next time!");
    }
}
