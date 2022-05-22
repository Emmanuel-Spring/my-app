package com.talentyco.ocp.chapter03.reviewquestions;

import java.util.ArrayDeque;

public class Exercise04 {
    public static void main(String[] args) {

        ArrayDeque<String> greetings = new ArrayDeque<String>();
        greetings.push("Hello");
        greetings.push("hi");
        greetings.push("ola");
        greetings.pop();
        greetings.peek();

        while (greetings.peek() != null) {
            System.out.print(greetings.pop());

        }
    }
}


/**
 4. What is the result of the following statements?
 3: ArrayDeque<String> greetings = new ArrayDeque<String>();
 4: greetings.push("hello");
 5: greetings.push("hi");
 6: greetings.push("ola");
 7: greetings.pop();
 8: greetings.peek();
 9: while (greetings.peek() != null)
 10: System.out.print(greetings.pop());

 A. hello
 B. hellohi
 C. hellohiola
 D. hi
 E. hihello
 F. The code does not compile.
 G. An exception is thrown.


 */