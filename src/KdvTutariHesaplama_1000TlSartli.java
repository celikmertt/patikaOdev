import java.util.Scanner;

public class KdvTutariHesaplama_1000TlSartli {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen Tutar Giriniz: ");
        double tutar=oku.nextDouble();

        if (tutar >0 && tutar<1000)
        {
            double kdvOrani=0.18;
            double kdvTutari=tutar*kdvOrani;
            double kdvliToplam=kdvTutari+tutar;

            System.out.println("Tutar = " + tutar);
            System.out.println("Kdv Oranı = " + kdvOrani);
            System.out.println("Kdv Tutarı = " + kdvTutari);
            System.out.println("Kdv'li Toplam Tutar = " + kdvliToplam);

        } else if (tutar>=1000) {
            double kdvOrani=0.08;
            double kdvTutari=tutar*kdvOrani;
            double kdvliToplam=kdvTutari+tutar;

            System.out.println("Tutar = " + tutar);
            System.out.println("Kdv Oranı = " + kdvOrani);
            System.out.println("Kdv Tutarı = " + kdvTutari);
            System.out.println("Kdv'li Toplam Tutar = " + kdvliToplam);
        }

    }
}
