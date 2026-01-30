package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces_02
{
    public static void main(String[] args)
    {
        String todayClass = "pyton";

        if (todayClass.equals("java"))
            System.out.println("java is fun");
        else
            System.out.println("it is not java " + todayClass);

        int score = 1;
        if (score == 1)
            System.out.println("Lowest score 1");
        else if (score == 2)
            System.out.println("score is 2");
        else if (score == 3)
            System.out.println("score is 3");
        else
            System.out.println(" invalid score");
    }
}

/*
    Sometimes, we can skip using curly {} braces with conditions.
    WHEN:
        when we have ONLY 1 statement in IF block or ELSE block
        If we have more than 1 statement(;) then we MUST use {} to work

    ADVICE:
        always use curly braces, does not matter 1 or more statement
 */