import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("nhap a: ");
        a = sc.nextInt();
        System.out.println("nhap b:");
        b = sc.nextInt();
        // c1: int min = a < b ? a : b;
        // c2: int min = ((a + b) - (Math.abs(a - b))) / 2;
        int min;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        System.out.println(min);
    }
}