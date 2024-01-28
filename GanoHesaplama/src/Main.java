import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Vize Notunuz: ");
      int vize = sc.nextInt();
      System.out.print("Final Notunuz: ");
      int finalNot = sc.nextInt();
      System.out.print("Gano Giriniz: ");
      double gano = sc.nextDouble();
      double toplamNot = ((vize*4/10.0) + (finalNot*6/10.0));

      if (toplamNot >=90){
          System.out.println("Ders Notunuz AA:) ");
      }
      else if (toplamNot>=85) {
          System.out.println("Ders Notunuz BA:) ");
      }
      else if (toplamNot>=80) {
          System.out.println("Ders Notunuz BB:) ");
      }
      else if (toplamNot>=75) {
          System.out.println("Ders Notunuz CB ");
      }
      else if (toplamNot>=70) {
          System.out.println("Ders Notunuz CC ");
      }
      else if(toplamNot>=65){
          System.out.println("Ders Notunuz DC ");
      }
      else if(toplamNot>=60){
          System.out.println("Ders Notunuz DD ");
          if (gano<2.50){
              System.out.println("Ortalamanizi yukseltmek icin bu dersi tekrar almayi dusunebilirsiniz:) ");
          }
    }
      else if(toplamNot>=55){
          System.out.println("Ders Notunuz FD ve Kaldiniz! ) ");
      }
      else {
          System.out.println("Ders Notunuz FF ve Kaldiniz! ) ");
      }
}
}