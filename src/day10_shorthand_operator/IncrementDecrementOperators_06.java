package day10_shorthand_operator;

public class IncrementDecrementOperators_06
{
    public static void main(String[] args)
    {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);

        int linesOfCode = 15;
        /*
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode++;
        System.out.println("linesOfCode = " + linesOfCode);
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
       System.out.println("linesOfCode = " + linesOfCode);
        */

        // increase linesofcode by 1, 3 different ways
        linesOfCode = linesOfCode + 1;
        linesOfCode += 1;
        linesOfCode++;
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

        // type of 4 different ways of decreasing by 1
        linesOfCode = linesOfCode - 1;
        linesOfCode -= 1;
        linesOfCode--;
        --linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
        letter--;
        letter--;
        letter--;
        System.out.println("letter = " + letter);


    }
}
/*
    +=  -=  *=  /=  %=
   INCREMENT/ DECREMENT OPERATORS:
   ++   --
   ++   -- ONLY increase or decrease value of variable by1

   count++  =>each time adds 1 to the variable value
   count--  =>each time decreases 1 to variable value

 */