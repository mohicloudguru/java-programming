package day23_string_manipulation_while_loop;

public class SMSMessage_01
{
    public static void main(String[] args)
    {
        String message = "Sender: [ Saim ] From Number <2023751774> Message:{Hello, lets code some java}";

        int indexOfSpecial = message.indexOf("[");
        int indexOfSpecials = message.indexOf("]");
        String sender = message.substring(indexOfSpecial + 1, indexOfSpecials);
        System.out.println("sender = " + sender);

        int special = message.indexOf("<") + 1;
        int special2 = message.indexOf(">");
        String number = message.substring(special, special2);
        System.out.println("number = " + number);

        int curlyBracet = message.indexOf("{") + 1;
        int curlyBracet1 = message.indexOf("}");
        String text = message.substring(curlyBracet, curlyBracet1);
        System.out.println("message1 = " + text);

        System.out.println("sender = " + sender);


        if (sender.equals("Saim")) {
            System.out.println("Message from Saim about quiz");
        } else {
            System.out.println("Someone else");
        }
    }
}
/*
    TRIM()

    trim() method- removes empty spaces from beginning and ending of the string value

    EX:
    String word=" java ";
    System.out.println(word.trim());

    word= " s q l "
    System.out.println(word.trim()); => "s q l"


 */