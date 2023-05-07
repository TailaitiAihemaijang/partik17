import java.util.Scanner;

public class ArtikYilBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yil giriniz: ");
        int yil = scanner.nextInt();

        if (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0)) {
            System.out.println(yil + " artik bir yildir.");
        } else {
            System.out.println(yil + " artik bir yil degildir.");
        }

        scanner.close();
    }
}
