import java.util.Scanner;

public class DortVeBesinKuvvetleri {

    public static void main(String[] args) {

        int n ;
        Scanner imp = new Scanner(System.in);

        System.out.print("Sınır Sayısını Giriniz : ");
        n = imp.nextInt();

        for (int i = 1; i <= n; i *= 4){
            System.out.println("4 Ün Kuvveti : " + i);
        }
        for (int s = 1; s <= n; s *= 5){
            System.out.println("5 İn Kuvveti : " + s);
        }
    }
}
