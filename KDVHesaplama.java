import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {

        double kdvOran, kdvTutari;
        int fiyatGirdisi;

        Scanner inp = new Scanner(System.in);

        System.out.print("KDV'siz fiyatı giriniz: ");
        fiyatGirdisi = inp.nextInt();

        kdvOran = (fiyatGirdisi > 1000) ? 0.08:0.18;

        System.out.println("KDV'li Fiyat: : " + (kdvOran*fiyatGirdisi + fiyatGirdisi));
        System.out.println("KDV Tutarı: : " + kdvOran*fiyatGirdisi);
    }
}
