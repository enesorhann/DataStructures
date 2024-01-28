import java.util.Scanner;
public class HesapMakinesi {

        public static void main(String[] args) {
            int a;
            int b;

            boolean control = true;
            while (control){
                Scanner sc = new Scanner(System.in);
                System.out.println("********************");
                String islemler =   "0. Cikis: \n"+
                        "1. Toplama: \n"+
                        "2. Cikarma: \n" +
                        "3. Carpma: \n" +
                        "4. Bolme: ";
                System.out.println(islemler);
                System.out.println("********************");

                System.out.print("Islemi Seciniz: ");
                String islem = sc.nextLine();

                switch (islem){
                    case "0":
                        control = false;
                        break;
                    case "1":
                        System.out.print("A: ");
                        a = sc.nextInt();
                        System.out.print("B: ");
                        b = sc.nextInt();
                        System.out.println("Girilen Sayilarin Toplami: "+ (a+b));
                        control = true;
                        break;
                    case "2":
                        System.out.print("A: ");
                        a = sc.nextInt();
                        System.out.print("B: ");
                        b = sc.nextInt();
                        System.out.println("Girilen Sayilarin Farki: "+ (a-b));
                        control = true;
                        break;
                    case "3":
                        System.out.print("A: ");
                        a = sc.nextInt();
                        System.out.print("B: ");
                        b = sc.nextInt();
                        System.out.println("Girilen Sayilarin Carpimi: "+ (a*b));
                        control = true;
                        break;
                    case "4":
                        System.out.print("A: ");
                        a = sc.nextInt();
                        System.out.print("B: ");
                        b = sc.nextInt();
                        System.out.println("Girilen Sayilarin Bolumu: "+ ((double)a/b));
                        control = true;
                        break;
                    default:
                        System.out.println("Islem Secenegi Bulunamadi!!");
                        control = true;
                }
                if (control==false){
                    System.exit(0);
                }
            }
        }
    }
