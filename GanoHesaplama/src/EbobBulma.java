import java.util.Scanner;

public class EbobBulma {


    public static int ebobMu(int sayi1,int sayi2){
        int ebob =1;
        for (int i =1;i<=sayi1 && i<=sayi2;i++){
            if( (sayi1 % i==0) && (sayi2 % i==0) ){
                ebob = i;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci Sayi: ");
        int birinci_sayi = sc.nextInt();
        System.out.print("Ikinci Sayi: ");
        int ikinci_sayi =sc.nextInt();
        System.out.println();
        System.out.println("Iki Sayinin Ebobu: "+ebobMu(birinci_sayi,ikinci_sayi));
    }

}
