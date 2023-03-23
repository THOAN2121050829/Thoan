import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int n, temp = 1;
        long giaiThua = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao 1 so nguyen duong bat ky : ");
            n = sc.nextInt();
        } while ((n <= 0) || (n > 10));

        while (temp <= n) {
            giaiThua *= temp;
            temp++;
        }

        System.out.println(n + "! = " + giaiThua);
    }

}
