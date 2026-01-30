package day0_FastTrack.methods;

public class FrequencyOfChar
{
    public static String frequencyOfChar(String word)
    {
        String result="";
        for (int i=0; i<word.length(); i++)
        {
            int count=0;
            for (int j=0; j<word.length(); j++)
            {
                if (word.charAt(i)== word.charAt(j))
                {
                    count++;
                }
            }
            if (!result.contains(""+word.charAt(i)))
            {
                result += ""+ word.charAt(i) + count;
            }
        }
    return result;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChar("Gokayy"));
    }
}
