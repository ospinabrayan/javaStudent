import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        boolean combination1 = one > 0 && two <= 0 && three <= 0;
        boolean combination2 = two > 0 && one <= 0 && three <= 0;
        boolean combination3 = three > 0 && one <= 0 && two <= 0;

        boolean oneIsPositive = combination1 || combination2 || combination3;

        System.out.println(oneIsPositive);
    }
}