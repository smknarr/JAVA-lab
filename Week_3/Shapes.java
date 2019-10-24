import java.util.*;
abstract class Shape
{
    double Dim1,Dim2;
    abstract void calculateArea();
    abstract void displayDetails();
}

class Rectangle extends Shape
{
    double Area;
    Rectangle(double x,double y)
    {
        Dim1=x;
        Dim2=y;
    }
    void calculateArea()
    {
        Area=Dim1*Dim2;
    }
    void displayDetails()
    {
         System.out.println("Area of the rectangle is: "+Area);
    }
}
class Triangle extends Shape
{
    double Area;
    Triangle(double x,double y)
    {
        Dim1=x;
        Dim2=y;
    }
    void calculateArea()
    {
        Area=0.5*Dim1*Dim2;
    }
    void displayDetails()
    {
         System.out.println("Area of the triangle is: "+Area);
    }
}
class Square extends Shape
{
    double Area;
    Square(double x)
    {
        Dim1=x;
    }
    void calculateArea()
    {
        Area=Dim1*Dim1;
    }
    void displayDetails()
    {
         System.out.println("Area of the square is: "+Area);
    }
}
public class d1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double x,y;
        int c;
        System.out.println("Enter choice\n1.Rectangle\n2.Triangle\n3.Square\n");
        c=sc.nextInt();
        Shape ref;
        switch(c)
        {
        case 1: 
            {
                System.out.println("Enter length and breadth: ");
                x=sc.nextDouble();
                y=sc.nextDouble();
                Rectangle R = new Rectangle(x,y);
                ref = R;
                ref.calculateArea();
                ref.displayDetails();
            }
            break;
        case 2:
            {
                System.out.println("Enter base and height: ");
                x=sc.nextDouble();
                y=sc.nextDouble();
                Triangle T = new Triangle(x,y);
                ref = T;
                ref.calculateArea();
                ref.displayDetails();
            }
            break;
        case 3:
            {
                System.out.println("Enter side: ");
                x=sc.nextDouble();
                Square S = new Square(x);
                ref = S;
                ref.calculateArea();
                ref.displayDetails();
            }
            break;
        }
    }
}