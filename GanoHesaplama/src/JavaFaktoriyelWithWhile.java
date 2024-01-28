import java.util.Scanner;

public class JavaFaktoriyelWithWhile {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Faktoriyelini Almak Istediginiz Sayiyi Giriniz: ");
        int sayi = sc.nextInt();
        int fakt = 1;
        while(sayi>0){
            fakt *= sayi;
            sayi--;
        }
        System.out.println("Faktoriyel: "+fakt);



    }
}
