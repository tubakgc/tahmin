import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand =new Random();
        int number = (int) (Math.random() * 100);

        Scanner inp = new Scanner(System.in);
        int right=0;
        int selected;
        int[] wrong = new int[5];
        while (right < 5){
            System.out.print("Lütfen tahmin ettiğiniz sayıyı giriniz:");
            selected=inp.nextInt();
            if (selected < 0 || selected > 100){
                System.out.println("Lütfen 0 - 100 arasında sayı giriniz.");
            }
            if (selected==number){
                System.out.println("Tebrikler! doğru tahminde bulundunuz! Tahmin ettiğiniz sayı:"+number);
                break;
            }else {
                System.out.println("Hatalı sayı girdiniz!Kalan hakkınız:" + (5 - right));

            }
             if(selected > number){
                System.out.println( selected + "  sayısı, tahmin edilecek sayıdan büyüktür!");
            } else {
                System.out.println( selected + "  sayısı,tahmin edilecek sayıdan küçüktür!");
            }
             wrong[right++]=selected;


        }
        System.out.println(number + " istenen sayı:\n" +"Tahminleriniz:"+ Arrays.toString(wrong));

    }
}