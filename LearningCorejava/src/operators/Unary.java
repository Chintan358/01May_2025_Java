package operators;

public class Unary {
    public static void main(String[] args) {

        // ++ , --

        int a = 10;
        int b = ++a + --a + ++a - a--;

        System.out.println(a); //11 12 13 11
        System.out.println(b); //10 22 36 21

    }
}
