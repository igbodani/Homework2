package edu.isu.cs.cs2263.hw02;
import java.util.StringTokenizer;

public interface PushbackTokenizer {
    // return the next token
    public String nextToken();

    // returns true if and only if there are more tokens
    boolean hasMoreTokens();

    // the token read is pushed back, so it can be read again using nextToken.
    void pushback();
}
