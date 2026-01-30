package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList
{
    public static void main(String[] args)
    {
        //car list
        List<String> myCar= new ArrayList<>();
        myCar.add("Mercedes");
        myCar.add("BMW");
        myCar.add("Subaru");
        myCar.add("Tesla");
        myCar.add("Audi");
        myCar.add(0,"Jeep");
        myCar.add("Toyota");

        //prints all car
        System.out.println(myCar.toString());
        String allCarsIn1St= myCar.toString(); //saves all cars in 1 string variable
        System.out.println("allCarsIn1St = " + allCarsIn1St);

        //change index 0 to Lamborghini
        myCar.set(0,"Lamborghini");
        myCar.set(6,"Honda");
        myCar.set(3,"Range Rover");
        System.out.println("After set = " + myCar.toString());

        //change index 6 to Toyota
        myCar.set(6,"Toyota");
        myCar.set(4,"Honda");
        System.out.println(myCar);

        /*
        How would you do that if myCars was array:
        myCars[4]="Honda;
         */

        // find the index number of "ford"
        System.out.println("index of range = " + myCar.indexOf("Range Rover"));
        int mercedesIndex = myCar.indexOf("Mercedes");
        System.out.println("mercedesIndex = " + mercedesIndex);

        //change honda to jiguli
        myCar.set(mercedesIndex, "Jiguli");
        System.out.println(myCar);

        //replace Toyota with Trabant
        int toyotaIndex = myCar.indexOf("Toyota");
        myCar.set(toyotaIndex,"Trabant");
        System.out.println(myCar.toString());

        if (myCar.contains("Honda"))
        {
            int hondaIndx= myCar.indexOf("Honda");
            myCar.set(hondaIndx,"Bugatti");
            System.out.println(myCar.toString());
        }
        else
        {
            System.out.println("Honda is not found");
        }

        for (int i=0; i< myCar.size(); i++)
        {
            if (myCar.get(i).equals("Lamborghini"))
            {
                myCar.set(i,"Prius");
            }
            else if (myCar.get(i).equals("Trabant"))
            {
                myCar.set(i,"Lexus");
            }
            else if (myCar.get(i).equals("Jiguli"))
            {
                myCar.set(i,"Subaru");
            }
        }
        System.out.println("after loop = "+myCar);
    }
}
/**
what is the difference indexOf && get?
get method takes an index and returns the element at that index
indexOf method takes an element(object) and gives the index of it
It is similar to the
indexOf and charAt comparison with Strings
 */