import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi bat ky: ");
        String input = sc.nextLine();

        int countLowerCase = 0;
        int countUpperCase = 0;
        int countNumber = 0;

        for (int i = 0; i < input.length(); i++) {
            // tra ve ky tu thu i
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                countLowerCase++;
            } else if (Character.isUpperCase(c)) {
                countUpperCase++;
            } else if (Character.isDigit(c)) {
                countNumber++;
            }
        }

        System.out.println("tong ky tu thuong trong chuoi: " + countLowerCase);
        System.out.println("tong ky tu hoa trong chuoi: " + countUpperCase);
        System.out.println("tong cac so co trong chuoi: " + countNumber);
    }
}