package ss1_introduction_to_java;

import java.util.Stack;
public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
            integers.push(10);
            integers.push(20);
            integers.push(30);
            integers.push(40);
        for (int i = 0; i < integers.size() ; i++) {
            System.out.println("Element "+ i + ":" + integers.pop());
        }
    }
}
