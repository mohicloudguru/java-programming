package day18_conditions_practice_strings_intro;

import java.util.Scanner;

public class CarLeaseingTest_07
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Car ");
        String car = scan.next();
        System.out.println("Enter Model");
        String carModel = scan.next();
        double leasePrice = 400;
/*
      if (car.equals("Mercedes") && car.equals("E"))
      {
        leasePrice=500.0;
      }
      else if (car.equals("Mercedes") && carModel.equals("A"))
      {
          leasePrice=400.0;
      }

 */

        if (car.equals("Mercedes")) {
            if (carModel.equals("E")) {
                leasePrice = 500.0;
            } else if (carModel.equals("A")) {
                leasePrice = 400;
            }
        } else if (car.equals("Audi")) {
            if (carModel.equals("SQ5")) {
                leasePrice = 552.4;
            } else if (carModel.equals("A3")) {
                leasePrice = 493.2;
            }
        } else {
            System.out.println("Invalid model");
            return; // exit program/ exit main method
        }

        System.out.println("car = " + car);
        System.out.println("carModel = " + carModel);
        System.out.println("leasePrice = " + leasePrice);
    }
}
