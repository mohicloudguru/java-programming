package day0_FastTrack.methods;

public class RecursiveMethods
{
    public static void recursive(int number)
    {
        if (number == 100)
        {
            return;
        }
        System.out.println(number++);
        recursive(number);
    }

    public static void main(String[] args) {
        recursive(90);
    }
}

/**
 *  Recursive method is
 *      When we call a method from the same method, it's called recursive method
 *  We have to put the condition in order to exit from the method using the return
 */