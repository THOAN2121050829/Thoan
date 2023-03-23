import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int age, year;
        String name, ageGroup;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("nhap nam sinh: ");
        year = sc.nextInt();

        age = 2023 - year;
        if (age < 16) {
            ageGroup = "tuoi vi thanh vien.";
        } else if (age >= 16 || age < 18) {
            ageGroup = "tuoi truong thanh.";
        } else {
            ageGroup = "gia ";
        }

        System.out.println("ban " + name + " thuoc nhom " + ageGroup);
    }
}
