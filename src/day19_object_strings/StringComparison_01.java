package day19_object_strings;

public class StringComparison_01
{
    public static void main(String[] args)
    {
        String city = "New York";

        //EQUALS() method- CASE SENSITIVE COMPARISON

        System.out.println(city.equals("New York"));//true
        System.out.println(city.equals("new york"));//false
        System.out.println(city.equals("New YORK"));//false
        System.out.println(city.equals("N ew York"));//false


        // EQUALS IGNORE CASE()
        System.out.println(city.equalsIgnoreCase("New york"));//true
        System.out.println(city.equalsIgnoreCase("New YORK"));//true

        if (city.equalsIgnoreCase("New york")) {
            System.out.println("equalsIgnoreCase() true");
        } else {
            System.out.println("equalsIgnoreCase () False");
        }

    }
}

/*
CLASS VS OBJECT

Objects are real things

They all come from some sort of template or a class
Object have some attributes/ data and behavior

    HORSE:
        ATTRIBUTE/DATA/VARIABLES
            =>color
            =?weight
            =>gender
            =>age
            =>sleep

        BEHAVIOUR:
            =>run
            =>ate
            =>sleep

   The above is general template, blueprint that any car will have.It is a CLASS.

 ==================================================

 CLASS in jav, is like template or blueprint. It will have 2 MAIN THINGS.
 MAIN THINGS:

      -> DATA/ ATTRIBUTES
      -> BEHAVIOR

 From Class we create OBJECT

 OBJECT is real things that is created from certain class in concrete.

 Now lets create CAR OBJECT from CAR class. (specific)

 FOR EX:
    NadirsCar:
        ->model -> Mercedes E class
        ->year  -> 2018
        ->color -> black
        ->horse power -> 350

   NadirCar.start();
   NadirCar.drive();            These are real data
   NadirCar.break();
   NadirCar.stop();

   CLASS -> OBJECT1
         -> OBJECT2
         -> OBJECT3

   Class is a blueprint/ template for OBJECTS
   From CLASS we can create MULTIPLE OBJECTS.
   Class is general descriptions with ATTRIBUTES/DATA and BEHAVIOR/ACTIONS.
   OBJECT will have real DATA values, and can do ACTIONS, that are described in CLASS.

   FROM A CLASS, WE can create OBJECTS.
   CLASS is a general TEMPLATE.
   OBJECT is a real things that create things from CLASS

   ================================

   String -> is a class/ template / blueprint that can be create objects.
   From String class we create STRING objects.

   String city="Baku";
         ATTRIBUTE/DATA/VARIABLES
         -> value(in double quotes)

           ACTIONS/ BEHAVIOUR/ METHODS:
                ->length
                ->equals
                ->charAt
                ->UpperCase
                ->lowerCase
                ->indexOf
 */