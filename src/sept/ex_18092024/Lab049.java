package sept.ex_18092024;

public class Lab049 {
    public static void main(String[] args) {
        // Type casting
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        // Widening
        byte b = 10;
        int a = b; // valid - Implicit casting -JVM
        int a1 = (int)b; // valid - Explicit casting - JVM

        // Narrowing
        int val = 300;
        // byte b1 = val; // invalid - Implicit casting - JVM
        byte b2 = (byte)val; //Invalid - Explicit casting - Loss of data
        System.out.println(b2);



    }
}
