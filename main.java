import java.util.Scanner;

public class main {

    static boolean isPalindrom(int number) {

        int temp=number, reserveNumber=0,lastNumber;

        while(temp!=0) {

            lastNumber=temp%10;

            reserveNumber=(reserveNumber*10)+ lastNumber;

            temp=temp/10;

        }
        if(number==reserveNumber){
            System.out.print(number + " " + "Sayisi palindrom bir sayidir.");
        }else{
            System.out.print(number + " " + " Sayisi palindrom bir sayi degildir.");

        }
        return true;

    }

    public static void main(String[] args) {
        isPalindrom(3);

        }

}


