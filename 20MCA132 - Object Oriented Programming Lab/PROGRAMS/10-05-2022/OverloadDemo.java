import java.util.*; 
class OverloadDemo
{
     public static void main(String args[]) 
    {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter side of square : ");
        float s = Integer.parseInt(sc.nextLine());
        System.out.print("Enter sides of rectangle : ");
        float l = Integer.parseInt(sc.nextLine());
        float b = Integer.parseInt(sc.nextLine());
        System.out.println("Enter radius of circle : ");
        double  r = Integer.parseInt(sc.nextLine());
       overload ob = new overload();
       ob.area(s);
       ob.area(l,b);
       ob.area(r);
        }
}
class overload
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}