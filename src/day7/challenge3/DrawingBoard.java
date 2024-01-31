package day7.challenge3;

import java.util.List;
import java.util.ArrayList;

public class DrawingBoard {
    List<shape> shapes= new ArrayList<>();

    void addShape(shape add_shape)
    {
        shapes.add(add_shape);
    }
    void Board(){
        for (shape items:shapes)
        {
            items.Drawshape();
            items.displayType();
            System.out.println("_________________________________");
        }
    }
}
