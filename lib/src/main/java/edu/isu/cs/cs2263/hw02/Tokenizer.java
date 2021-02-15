package edu.isu.cs.cs2263.hw02;
import java.util.Stack;
import java.util.StringTokenizer;

public class Tokenizer implements PushbackTokenizer{
  //  private String data;
    public Stack<String> stack1;
    public Stack<String> stack2;

    public Tokenizer(String data) {
        StringTokenizer tokenizer = new StringTokenizer(data);
        //stacks
        stack1 = new Stack<String>();
        stack2 = new Stack<String>();
        // pushing in stack 2
        while (tokenizer.hasMoreTokens()) {
            stack2.push(tokenizer.nextToken());
        }
        //pushing into stack 1 to maintain original order
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());

        }
    }


    @Override
    public String nextToken() {
        //removing top element
        String data = stack1.pop();

        return data;

    }

    @Override
    public boolean hasMoreTokens() {
        return !stack1.isEmpty();

    }

    @Override
    public void pushback() {
        if (!stack2.isEmpty()) {

            stack1.push(stack2.pop());

        }
    }
}
