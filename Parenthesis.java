public class Parenthesis {
public static void main(String[] args) {
    float i = 842;

    System.out.println((i + i % 3 / 7 - 2 + Math.pow(7, 3)));
    System.out.println("");
    System.out.println((((i + i % 3) / 7 - 2 + Math.pow(7, 3))));
}
}

