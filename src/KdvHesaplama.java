import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Kdv'siz Fiyat: ");
        double kdvMatrah= oku.nextDouble();
        double kdvOran=0.18;

        double kdvliTutar=kdvMatrah*kdvOran+kdvMatrah;
        System.out.println("Kdv Tutarı :"+kdvMatrah*kdvOran);
        System.out.println("kdvliTutar = " + kdvliTutar);
    }
}
