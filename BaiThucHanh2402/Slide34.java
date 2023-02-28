import java.util.Scanner;

//Giai Phuong Trinh Bac 2
//ax^2 + bx + c = 0
public class Slide34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, delta;
        System.out.println("Nhap a = : ");
        a = sc.nextDouble();
        System.out.println("Nhap b = : ");
        b = sc.nextDouble();
        System.out.println("Nhap c = : ");
        c = sc.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phuong trinh vo so ngiem");
                } else {
                    System.out.println("phuong trinh vo nghiem");
                }
            } else {
                x1 = -c / b;
                System.out.println("phuong trinh co nghiem :" + x1);
            }
        } else {
            if (delta < 0) {
                System.out.println("phuong trinh vo nghiem");
            } else if (delta == 0) {
                x1 = -b / 2 * a;
                System.out.println("phuong trinh co nghiem kep: " + x1);
            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("phuong trinh co hai nghiem");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}