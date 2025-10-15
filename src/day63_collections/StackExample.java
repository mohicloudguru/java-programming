package day63_collections;

import java.util.Stack;

public class StackExample
{
    public static void main(String[] args)
    {
        Stack<String> bookStack = new Stack<>();
        bookStack.add("Harry Potter");
        bookStack.push("cucumber");
        bookStack.add("Leaders eat last");
        bookStack.add("Java intro");
        System.out.println(bookStack);
        System.out.println(bookStack.remove(0));

        bookStack.pop();
        System.out.println(bookStack.pop());

        System.out.println("Final versions "+bookStack);

    }
}
