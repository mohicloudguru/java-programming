package day32_arrays_split;

public class ReverseSentence_07
{
    public static void main(String[] args)
    {
      String sentence="java is fun";
      String sentenceArray[]=sentence.split(" ");
      String result="";

      //Printing REVERSE SENTENCE
      for (int i=sentenceArray.length-1; i>=0 ;i--)
      {
          result +=sentenceArray[i]+" ";
      }

      System.out.println("sentence = "+sentence);
      System.out.println(result.trim());
      System.out.println("result = " + result);
    }
}
