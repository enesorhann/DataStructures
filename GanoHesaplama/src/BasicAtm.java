import java.util.Scanner;

public class BasicAtm {
    public static void main(String[] args){
        String islemler =
                "1. Bakiye Sorgulama \n"+
                "2. Para Cekme \n"+
                "3. Para Yatirma \n"+
                "q: Cikis Yapmak icin q'e basin ";
        System.out.println("**********************");
        System.out.println(islemler);
        System.out.println("**********************");
        int bakiye = 100;
        int tutar;
        Scanner sc = new Scanner(System.in);



        while(true){
            System.out.print("Yapmak Istediginiz islem: ");
            String islem = sc.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan Cikiliyor!!!! ");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiye Sorgulama: "+bakiye);
            }
            else if (islem.equals("2")) {
                System.out.print("Cekmek İstediginiz Tutar: ");
                tutar = sc.nextInt();
                sc.nextLine();
                if (tutar>bakiye){
                    System.out.println("Bakiye Yetersiz! ");
                }
                else {
                    bakiye-=tutar;
                }
                System.out.println("Mevcut Bakiye: "+bakiye);
            }
            else if (islem.equals("3")) {
                System.out.print("Yatirmak istediginiz tutar: ");
                tutar = sc.nextInt();
                sc.nextLine();
                bakiye += tutar;
                System.out.println("Mevcut Bakiye: "+bakiye);
            }
            else {
                System.out.println("Gecersiz Islem!!!! ");
            }
        }
    }
}
