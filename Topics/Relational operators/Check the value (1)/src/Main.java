import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
       int number = scanner.nextInt();
       int cero=0, ten=10;
       boolean condition = number > cero && number < ten;
       System.out.println(condition);
    }
}