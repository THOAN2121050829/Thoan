import java.util.Scanner;

public class Bai2 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.format("%d la so chan", n);
        } else {
            System.out.format("%d la so le", n);
        }
    }
}