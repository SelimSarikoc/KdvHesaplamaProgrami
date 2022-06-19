import java.util.Scanner;

public class kdvtutari {
    public static void main(String[] args) {
        double tutar, kdvOran1 = 0.18, kdvOran2 = 0.08;

        Scanner inp =  new Scanner(System.in);
        System.out.print("Tutarı Giriniz: ");
        tutar = inp.nextDouble();

        double hesapkdv1 = ( tutar * kdvOran1);
        double hesapkdv2 = ( tutar * kdvOran2);

        boolean kdvdusuk = tutar < 1000;

        double str = kdvdusuk ? ( hesapkdv1) : (hesapkdv2);
        double str2 = kdvdusuk ? (kdvOran1) : (kdvOran2);

        double kdvliSonuc = (str + tutar);

        System.out.println("Kdv'siz Tutar: "+ tutar);
        System.out.println("Kdv Oranı: "+ str2);
        System.out.println("Eklenecek Kdv: "+ str);
        System.out.println("Kdv'li Tutar: "+ kdvliSonuc);


    }
}

