package sept.ex_18092024;

public class Lab051 {
    public static void main(String[] args) {
        // GST = 18.45;
        int course = 100;
        float GST = 18.45f;
        // float total_price = course+GST; // Narrowing - Implicit -JVM - Invalid

        int total_price = course+(int)GST; // Narrowing - Explicit - Invalid - Loss
        System.out.println(total_price);
    }
}
