import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("GCD: " + gcd(a ,b));
    }
    public static int gcd (int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b); // GCD(a, b) = GCD(b, a mod b)
    }
}