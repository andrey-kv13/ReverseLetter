package org.reverseletter;

public class Main {
    public static void main(String[] args) {
        String input = "J@va the be$t!123";
        System.out.println(TwoPointerReverse.reverse(input));
        System.out.println(BuilderReverse.reverse(input));
    }
}