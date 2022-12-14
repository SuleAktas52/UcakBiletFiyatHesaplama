import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {
    public static void main(String[] args) {

        int yas,km,yolculukTipi;

        Scanner input= new Scanner(System.in);

        System.out.print("Mesafeyi KM turunden giriniz: ");
        km=input.nextInt();

        System.out.print("Yasinizi(age) giriniz: ");
        yas=input.nextInt();

        System.out.print("Yolculuk tipini giriniz(1 =>Tek Yon , 2 =>Gidis Donus ): ");
        yolculukTipi=input.nextInt();

        double toplam= km*0.10;

        if (km <= 0 || yas<0 || (yolculukTipi !=1 && yolculukTipi !=2)) {
            System.out.println("Hatali Veri Girdiniz !");
        }
        else if (yas<12) {
            if (yolculukTipi == 2) {
                double toplam2 = toplam - (toplam * 50 / 100);
                toplam2 -=  (toplam2 * 20 / 100);
                System.out.print("Toplam Tutariniz: " + toplam2*2);
            } else {
                toplam = toplam - (toplam * 50 / 100);
                System.out.print("Toplam Tutariniz: " + toplam);
            }
        }
        else if (12<= yas && yas<24) {
            if (yolculukTipi == 2) {
                double toplam2 = toplam - (toplam * 10 / 100);
                toplam2 -= (toplam2 * 20 / 100);
                System.out.print("Toplam Tutariniz: " + toplam2*2);
            } else {
                toplam = toplam - (toplam * 10 / 100);
                System.out.print("Toplam Tutariniz: " + toplam);
            }
        }
        else if (yas>65) {
            if (yolculukTipi == 2) {
                double toplam2 = toplam - (toplam * 30 / 100);
                toplam2 -= (toplam2 * 20 / 100);
                System.out.print("Toplam Tutariniz: " + toplam2*2);
            } else {
                toplam = toplam - (toplam * 30 / 100);
                System.out.print("Toplam Tutariniz: " + toplam);
            }
        }
        else if (yolculukTipi == 2) {
            toplam= toplam- (toplam*20/100);
            System.out.print("Toplam Tutariniz: " + toplam*2);
        }
        else {
            System.out.print("Toplam Tutariniz: " + toplam);
        }

    }
}

/*
Kullan??c??dan al??nan de??erler ge??erli (mesafe ve ya?? de??erleri pozitif say??, yolculuk tipi ise 1 veya 2) olmal??d??r. Aksi takdirde kullan??c??ya "Hatal?? Veri Girdiniz !" ??eklinde bir uyar?? verilmelidir.
Ki??i 12 ya????ndan k??????kse bilet fiyat?? ??zerinden %50 indirim uygulan??r.
Ki??i 12-24 ya??lar?? aras??nda ise bilet fiyat?? ??zerinden %10 indirim uygulan??r.
Ki??i 65 ya????ndan b??y??k ise bilet fiyat?? ??zerinden %30 indirim uygulan??r.
Ki??i "Yolculuk Tipini" gidi?? d??n???? se??mi?? ise bilet fiyat?? ??zerinden %20 indirim uygulan??r.
 */