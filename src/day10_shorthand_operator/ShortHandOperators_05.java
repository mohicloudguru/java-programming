package day10_shorthand_operator;

public class ShortHandOperators_05
{
    public static void main(String[] args)
    {
        int cars = 10;
        System.out.println("Cars in parking Lot= " + cars);

        // this is longer way
        cars = cars + 2;
        System.out.println("Cars in parking lot = " + cars);

        cars += 5;
        System.out.println("Cars in parking lot = " + cars);

        //6 cars left the parking lots
        //cars=cars-6; // this is longer way

        // shorter way
        cars -= 6;
        System.out.println("Cars in parking lot  = " + cars);

        //cars=cars-1;
        cars -= 1;
        System.out.println("Cars in parking lot = " + cars);

        int electricCars = 13;
        //cars=cars+electricCars;
        cars += electricCars;
        System.out.println("Cars in parking lot = " + cars);

        String word = "Java";
        System.out.println("word = " + word);
        word += "programming";
        System.out.println("word =" + word);

        // add is " is fun "
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but \"selenium \" is more fun.";
        word += selenium;
        System.out.println("word = " + word);

        word += 12345;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        // add 'J' to letter
        letter += 6;
        System.out.println("letter = " + letter);
        // add 1;
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("parkingFee =$" + parkingFee);
        // early bird fee is 50% off
        parkingFee /= 2;
        System.out.println("ParkingFee for earlybird =$" + parkingFee);
        // WEEKEND IS FREE
        parkingFee -= parkingFee;
        System.out.println("ParkingFee for Weekend =$" + parkingFee);


    }
}

