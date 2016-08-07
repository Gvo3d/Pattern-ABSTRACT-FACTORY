package org.yakimovdenis.AbsFac;

import org.yakimovdenis.AbsFac.colors.Color;
import org.yakimovdenis.AbsFac.shapes.Circle;
import org.yakimovdenis.AbsFac.shapes.Rectangle;
import org.yakimovdenis.AbsFac.shapes.Shape;
import org.yakimovdenis.AbsFac.shapes.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}