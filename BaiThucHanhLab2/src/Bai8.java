import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrA[], kichhthuocmang;
        double nTBC = 1, nA = 0;

        System.out.print("Nhap kich thuoc mang: ");
        kichhthuocmang = sc.nextInt();
        arrA = new int[kichhthuocmang];
        for (int i = 0; i < kichhthuocmang; i++) {
            System.out.print("Nhap so nguyen ma ban muon: ");
            arrA[i] = sc.nextInt();
            nA += (arrA[i]);
            nTBC = nA / kichhthuocmang;
        }
        System.out.print("Trung binh cong cua cac so nguyen vua nhap la: " + nTBC);
    }
}