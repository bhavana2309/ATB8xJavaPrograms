package sept.ex_18092024;

public class Lab050 {
    public static void main(String[] args) {
        long phone_no = 9563248975l;
        // short s = phone_no; // Narrowing - Implicit - JVM // Invalid
        short s1 = (short)phone_no; // Narrowing - Explicit - Loss // Invalid
        System.out.println(s1);

    }
}
