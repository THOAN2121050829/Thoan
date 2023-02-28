import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n;
        n = sc.nextInt();
        int tmp = 0;
        while (n != 0) {
            tmp += n % 10;
            n /= 10;
        }
        System.out.println(tmp);
    }
}