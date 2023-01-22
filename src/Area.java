import java.util.Scanner;


/**
 * Area
 */
public class Area {

    public static float calcAreaOfRectangle(float l, float b) {

        float area = l * b;
        return area;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        float len = sc.nextFloat();
        System.out.print("Enter breadth: ");
        float bd = sc.nextFloat();

        System.out.println("\nArea of rectangle: " + calcAreaOfRectangle(len, bd));
        sc.close();

    }
}

/* 
 * 
 * output
Enter length: 3
Enter breadth: 4
Area of rectangle: 12.0

 */