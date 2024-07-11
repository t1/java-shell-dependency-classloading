package lib;

import java.util.Arrays;

import static org.apache.commons.math3.util.CombinatoricsUtils.factorial;

@SuppressWarnings("unused")
public class Lib {
    public static void main(String[] args) {
        System.out.println("Hello, " + factorial(5) + "! " + Arrays.toString(args));
    }
}
