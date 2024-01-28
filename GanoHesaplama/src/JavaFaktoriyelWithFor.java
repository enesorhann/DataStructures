import java.util.Scanner;
public class JavaFaktoriyelWithFor {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Faktoriyelini Almak Istediginiz Sayiyi Giriniz: ");
            int sayi = sc.nextInt();
            int fakt = 1;
            int i;
            for (i = 1; i <= sayi; i++) {
                fakt *= i;
            }
            System.out.println("Sayinin Faktoriyeli: " + fakt);

        }
    }
