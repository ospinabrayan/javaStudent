import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean firstPair = a + b == 20;
        boolean secondPair = b + c == 20;
        boolean thirdPair = c + a == 20;

        boolean pair = firstPair || secondPair || thirdPair;

        System.out.println(pair);
    }
}