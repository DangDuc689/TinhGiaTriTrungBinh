import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        int number1, number2, number3, number4, number5;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vui long nhap so thu nhat: ");
        number1 = sc.nextInt();

        System.out.println("Vui long nhap so thu hai: ");
        number2 = sc.nextInt();

        System.out.println("Vui long nhap so thu ba: ");
        number3 = sc.nextInt();

        System.out.println("Vui long nhap so thu tu: ");
        number4 = sc.nextInt();

        System.out.println("Vui long nhap so thu nam: ");
        number5 = sc.nextInt();
        
        float Average = (float)(number1 + number2 + number3 + number4 + number5) / 5;
        System.out.println("Trung binh cua nam so la: " + Average);
    }
}
