package Practice;

public class Reverse
{
    public static void main(String[] args)
    {
        String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String wordsReversed = "";

        for(int i = 0; i < words.length; i++){
            for (int j = words[i].length()-1; j>=0 ; j--) {
                wordsReversed+=  words[i].charAt(j);
            }
            wordsReversed += ", ";

        }
        String[] reversedArr = wordsReversed.split(", ");
        String palindromes = "";


        for(int i=0; i < words.length; i++){
            if(words[i].equals(reversedArr[i])){
                palindromes += words[i] + ", ";

            }
        }
        if(palindromes.equals("")){
            System.out.println("no palindromes");
        }

        String[] palindromesArr = palindromes.split(", ");
        String maxLengthOne = "";

        int max= palindromesArr[0].length();
        for (int i=0; i < palindromesArr.length; i++){
            if(palindromesArr[i].length() > max){
                max = palindromesArr[i].length();
                maxLengthOne = palindromesArr[i];
            }
        }
        System.out.println(maxLengthOne);


    }
}
