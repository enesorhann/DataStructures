import java.util.Scanner;

public class FaizHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anapara,vade;
        double faiz_orani = 0.05;
        System.out.println("Bankama Hosgeldin:)");
        System.out.println("Faiz Oranim: 0.05");
        System.out.println();
        System.out.print("Anapara Miktarini Girin: ");
        anapara = sc.nextInt();
        System.out.print("Anaparani Kac Yil Vadeyle Bankamda Saklamak istersin: ");
        vade = sc.nextInt();

        double toplamPara = anapara;
        for (int i=1;i<=vade;i++){
            toplamPara += (toplamPara*faiz_orani);
            System.out.println(i+". yil sonunda toplam paran: "+toplamPara);
        }
    }
}
