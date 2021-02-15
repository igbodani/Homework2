package edu.isu.cs.cs2263.hw02;
import java.util.StringTokenizer;

public class Driver {
    public static void main(String[] args) {
        PushbackTokenizer tokenizer = new Tokenizer("55 77 hello world daniel is cool ");


        while (tokenizer.hasMoreTokens()) {

            System.out.println(tokenizer.nextToken());
        }



    }
}
