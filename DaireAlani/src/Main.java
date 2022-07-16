import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, pi=3.14, cevre, alan;
        System.out.print("Lutfen yaricapi giriniz: ");
        r = input.nextDouble();
        cevre= 2*pi*r;
        alan=pi*r*r;
        System.out.println("cevre:" + cevre);
        System.out.println("alan: " +alan);

    }
}