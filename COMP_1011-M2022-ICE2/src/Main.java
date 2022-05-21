import java.util.Scanner;
import java.util.Vector;

public class Main
{
    public static void main(String[] args)
    {
        float x1_value,y1_value;
        float x2_value,y2_value;
        //creating scanner object
        Scanner scan = new Scanner(System.in);
        System.out.println("Input value for vector2d point1: ");
        // taking user input for point 1
        System.out.println("x value: ");
        x1_value = scan.nextFloat();
        System.out.println("y value: ");
        y1_value = scan.nextFloat();
        Vector2D point1 = new Vector2D(x1_value, y1_value);
        System.out.println("Input value for vector2d point2: ");
        // taking user input for point 2
        System.out.println("x value: ");
        x2_value = scan.nextFloat();
        System.out.println("y value: ");
        y2_value = scan.nextFloat();
        Vector2D point2 = new Vector2D(x2_value, y2_value);
        scan.close();
        //printing point1 and point2 values
        System.out.println("Point 1: " + point1.toString());
        System.out.println("Point 2: " + point2.toString());
        // finding distance between point1 and point2 using Distance method defined in utility class.
        float distance = Utility.Distance(point1, point2);
        System.out.println("Distance between Point 1 and Point 2 is: " + distance);
        float distance2 = Utility.Distance(x1_value,y1_value,x2_value,y2_value);
        System.out.println("Distance between Point 1 and Point 2 using overloaded method is: " + distance);
    }
}