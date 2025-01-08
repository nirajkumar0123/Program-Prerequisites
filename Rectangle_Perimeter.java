import java.util.Scanner;

public class Rectangle_Perimeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        
        double perimeter = 2 * (length + width);
        
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        
    }
}
