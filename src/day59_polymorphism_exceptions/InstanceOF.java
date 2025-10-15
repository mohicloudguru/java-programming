package day59_polymorphism_exceptions;

import OfficeHours.Practice_06_08.Circle;
import OfficeHours.Practice_06_08.Shape;
import OfficeHours.Practice_06_08.Square;

public class InstanceOF
{
    // There is operator 'instance of ' which can help to find out the type of the object
    public static void main(String[] args) {
        //instance of operator
        Shape shape = new Square();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);

        if (shape instanceof Circle) {
            System.out.println("It is a Circle object");
        } else if (shape instanceof Square) {
            System.out.println("It is a Square object");
        }

        /**
         * java reflection API : https://docs.oracle.com/javase/tutorial/reflect/index.html
         */
        System.out.println(shape.getClass().getSimpleName()); //just class name of object
        System.out.println(shape.getClass().getName());// class name of object and package name
        if (shape.getClass().getSimpleName().equals("Square")) {
            System.out.println("It is a square object");
        }
        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println("object class name of el variable = " + el.getClass().getSimpleName());
        //System.out.println(el.getClass().getDeclaredFields());
    }
}