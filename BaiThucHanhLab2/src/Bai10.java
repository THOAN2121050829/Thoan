import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi khong qua 80 ky tu: ");
        String input = sc.nextLine();

        System.out.print("Nhap vao mot ky tu bat ky: ");
        // nhap va tra ve phan tu ky tu char trong chuoi
        char c = sc.nextLine().charAt(0);
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            // kiem tra trong chuoi co bang ky tu nhap
            if (input.charAt(i) == c) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua ky tu " + c + " trong chuoi la : " + count);
    }
}