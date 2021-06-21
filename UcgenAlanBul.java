import java.util.Scanner;

public class UcgenAlanBul {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int kenar1, kenar2, kenar3;

        System.out.print("Birinci kenarı giriniz: ");
        kenar1 = inp.nextInt();

        System.out.print("İkinci kenarı giriniz: ");
        kenar2 = inp.nextInt();

        System.out.print("Üçüncü kenarı giriniz: ");
        kenar3 = inp.nextInt();

        int yariCevre = (kenar1 + kenar2 + kenar3)/2;

        double alanKare = yariCevre * (yariCevre - kenar1) * (yariCevre - kenar2) *(yariCevre - kenar3);

        double alan = Math.sqrt(alanKare);

        System.out.print("Üçgenin alanı: " + alan);
    }
}
