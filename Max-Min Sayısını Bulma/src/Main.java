import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
                // enkucuk ile enbuyuk değişkenlerine
                // en uç sayıları verdim ki
                // ilk sayıyı aktarırken sorun olmasın
                int N ,sayi, enkucuk = 999999999, enbuyuk =-999999999;

                System.out.print("N sayısını Giriniz :");
                 N= klavye.nextInt();
                for (int i = 1; i <= N; i++) {
                // Girilen sayıyı sayi değişkenine aktarıyoruz
                System.out.print(i + ".Sayıyı Giriniz :" );
                sayi = klavye.nextInt();
                // her girilen her sayı enbuyuk ten büyük mü
                // diye kontrol eder
                if (sayi >= enbuyuk) {
                // büyükse enbuyuk e aktarır
                enbuyuk = sayi;
                }
                // aynı şekilde girilen sayının enkucuk ten
                // küçük mü oldugunu kontrol eder
                if (sayi <= enkucuk) {
                // küçükse enkucuk e aktarır
                enkucuk = sayi;
                }
                }

                  System.out.println();

                // en büyük ve en küçüğü ekrana yazdırır.
                System.out.println("En Büyük  :" + enbuyuk);
                System.out.println("En Küçük :" + enkucuk);
    }
}

