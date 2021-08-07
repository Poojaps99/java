import Graphics.*;
public class MainGraphics {
     public static void main(String []args){
        Graphics g = new Graphics();
        System.out.println("Area of Rectangle : "+g.recArea(1,2));
        System.out.println("Area of Circle : "+g.cirArea(10));
        System.out.println("Area of Square : "+g.squArea(10));
        System.out.println("Area of Triangle : "+g.triArea(10,2));
    }
}
