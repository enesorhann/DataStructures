import java.util.Scanner;

public class GelismisHesapMakinesi {

    public static int toplama(int a,int b){
        return (a+b);
    }
    public static int toplama(int a,int b,int c){
        return (a+b+c);
    }
    public static int cikarma(int a,int b){
        return (a-b);
    }
    public static double bolme(double a,double b){
        return (a/b);
    }
    public static int carpma(int a,int b){
    return (a*b);
    }
    public static int carpma(int a,int b,int c){
    return (a*b*c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String islemler =   "1.Toplama\n"+
                            "2.Cikarma\n"+
                            "3.Carpma\n"+
                            "4.Bolme\n"+
                            "Q'e Basip Cikabilirsiniz:)";
        System.out.println("**********************");
        System.out.println(islemler);
        System.out.println("**********************");
        System.out.print("Lutfen Yapmak istediginiz islemi seciniz: ");
        String islem = sc.nextLine();
        while (true){

        if (islem.equals("q")) {
            System.out.println("Hesap Makinesinden Guvenli Cikis Yapiliyor:) ");
            break;
        }
        else if(islem.equals("1")){
                System.out.print("Kac Sayiyi toplamak istersiniz: ");
                int kacSayi = sc.nextInt();
                if (kacSayi==2){
                    System.out.print("a: ");
                    int a = sc.nextInt();
                    System.out.print("b: ");
                    int b = sc.nextInt();
                    System.out.println("Toplama islemi Sonucu: "+toplama(a,b));
                    break;
                }
                else if (kacSayi==3){
                    System.out.print("a: ");
                    int a = sc.nextInt();
                    System.out.print("b: ");
                    int b = sc.nextInt();
                    System.out.print("c: ");
                    int c = sc.nextInt();
                    System.out.println("Toplama islemi Sonucu: "+toplama(a,b,c));
                    break;

                }
            }
        else if (islem.equals("2")) {
                System.out.print("a: ");
                int a = sc.nextInt();
                System.out.print("b: ");
                int b = sc.nextInt();
                System.out.println("Cikarma islemi sonucunuz: "+cikarma(a,b));
            }
        else if (islem.equals("3")) {
                System.out.print("a: ");
                double a = sc.nextInt();
                System.out.print("b: ");
                double b = sc.nextInt();
                System.out.println("Bolme islemi sonucunuz: "+bolme(a,b));
            }
        else if (islem.equals("4")) {
            System.out.print("Kac Sayiyi toplamak istersiniz: ");
            int kacSayi = sc.nextInt();
            if (kacSayi==2){
                System.out.print("a: ");
                int a = sc.nextInt();
                System.out.print("b: ");
                int b = sc.nextInt();
                System.out.println("Carpma islemi Sonucu: "+carpma(a,b));
            }
            else if (kacSayi==3){
                System.out.print("a: ");
                int a = sc.nextInt();
                System.out.print("b: ");
                int b = sc.nextInt();
                System.out.print("c: ");
                int c = sc.nextInt();
                System.out.println("Carpma islemi Sonucu: "+carpma(a,b,c));

            }
            }
        }
        }
    }
