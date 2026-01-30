package InterviewQuestions;

public class String_FrequencyOfChars
{
    public static String frequencyOfChars(String str)
    {
        String nonDuplicated = "";
        String expectedResult = "";

        for (int i=0; i<str.length(); i++)
        {
            if (!nonDuplicated.contains(""+str.charAt(i)))
            {
                nonDuplicated += "" + str.charAt(i);
            }
        }

        for (int j=0; j< nonDuplicated.length(); j++)
        {
            int count =0;

            for (int i=0; i< str.length(); i++)
            {
                if (str.charAt(j)==str.charAt(i))
                {
                    count++;
                }
            }
            expectedResult += nonDuplicated.charAt(j)+ "" +count;
        }
        return expectedResult;
    }


    public static void main(String[] args) {
        String name ="Gokay";
        System.out.println(frequencyOfChars(name));
    }
}
