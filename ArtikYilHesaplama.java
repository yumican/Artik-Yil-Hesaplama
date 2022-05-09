import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Yil giriniz: ");
        int yil = keyboard.nextInt();

        if (yil%4==0) {
            if ((yil % 100 == 0) && (yil % 400 == 0)) {
                System.out.println(yil + " artik bir yildir !");
            }
            System.out.println(yil + " artik bir yildir !");
        }else
            System.out.println(yil + " artik bir yil degildir !");
    }
}
