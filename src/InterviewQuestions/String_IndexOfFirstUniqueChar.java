package InterviewQuestions;

public class String_IndexOfFirstUniqueChar
{
    public static int indexOfFirstUniqueChar(String str)
    {
        for (int i=0; i<str.length(); i++)
        {
            int count =0;
            for (char each : str.toCharArray())
            {
                if (each == str.charAt(i))
                {
                    count++;
                }
            }
            if (count ==1)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String name ="gokay";
        System.out.println(indexOfFirstUniqueChar(name));
    }
}
