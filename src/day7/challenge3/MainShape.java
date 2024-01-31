package day7.challenge3;

public class MainShape {
    public static void main(String[] args)
    {


    shape shape1= new Triangle();
    shape shape2= new Square();
    shape shape3= new Triangle();

  /*  shape1.displayType();
    shape2.displayType();
    shape3.displayType();
    shape1.Drawshape();
    shape2.Drawshape();
    shape3.Drawshape();*/

    DrawingBoard list = new DrawingBoard();
    list.addShape(shape1);
    list.addShape(shape2);
    list.addShape(shape3);
    list.Board();

    }

}
