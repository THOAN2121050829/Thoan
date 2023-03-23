import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tong = 0;
        String str = "";

        do {
            System.out.println("Nhap vao cac so nguyen :");
            n = sc.nextInt();
            tong += n;
            str = n + "+" + str;
        } while (tong <= 100);
        System.out.println("Tong cac so bang: " + str.substring(0, str.length() - 1) + "= " + tong);
    }
}
