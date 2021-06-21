import java.util.Scanner;

public class OrtalamaHesabi {
    public static void main(String[] args) {

        int mat, fiz, kim, tur, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fiz = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kim = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        tur = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        double sonuc = (mat + fiz + kim + tur + tarih + muzik)/6;


        System.out.println("Ortalamanız: " + sonuc);

        String gecme = (sonuc > 60) ? "Geçtiniz":"Kaldınız";

        System.out.println("Geçme durumunuz: " + gecme);
    }
}
