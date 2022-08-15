import java.util.Scanner;

public class notOrtalamasiOdevi {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        int matematik=oku.nextInt();

        System.out.print("Fizik Notunuz:");
        int fizik=oku.nextInt();

        System.out.print("Kimya Notunuz:");
        int kimya=oku.nextInt();

        System.out.print("Türkçe Notunuz:");
        int turkce=oku.nextInt();

        System.out.print("Tarih Notunuz:");
        int tarih=oku.nextInt();

        System.out.print("Müzik Notunuz:");
        int muzik=oku.nextInt();

        int toplamNot=matematik+fizik+kimya+turkce+tarih+muzik;
        double ortalamaNot=(toplamNot/6.0);
        System.out.println("Not Ortalamanız = " + ortalamaNot);
        String snc=ortalamaNot>=60 ? "Sınıfı Geçti": "Sınıfta Kaldı";
        System.out.println(snc);

    }
}
