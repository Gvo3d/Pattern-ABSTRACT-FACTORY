package org.yakimovdenis.AbsFac;

import org.yakimovdenis.AbsFac.colors.Color;
import org.yakimovdenis.AbsFac.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}