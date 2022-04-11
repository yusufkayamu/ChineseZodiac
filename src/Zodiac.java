import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        int BirthDay;

        Scanner input = new Scanner(System.in);

        System.out.println("year of birth=");
        BirthDay = input.nextInt();

        if (BirthDay % 12 ==0){
            System.out.println("Chinese Zodiac= Monkey");
        }else if (BirthDay % 12 ==1){
            System.out.println("Chinese Zodiac= Cock");
        }else if (BirthDay % 12 ==2){
            System.out.println("Chinese Zodiac= Dog");
        }else if (BirthDay % 12 ==3){
            System.out.println("Chinese Zodiac= Pig");
        }else if (BirthDay % 12 ==4){
            System.out.println("Chinese Zodiac= Mouse");
        }else if (BirthDay % 12 ==5){
            System.out.println("Chinese Zodiac= Ox");
        }else if (BirthDay % 12 ==6){
            System.out.println("Chinese Zodiac= Tiger");
        }else if (BirthDay % 12 ==7){
            System.out.println("Chinese Zodiac= Rabbit");
        }else if (BirthDay % 12 ==8){
            System.out.println("Chinese Zodiac= Dragon");
        }else if (BirthDay % 12 ==9){
            System.out.println("Chinese Zodiac= Snake");
        }else if (BirthDay % 12 ==10){
            System.out.println("Chinese Zodiac= Horse");
        }else if (BirthDay % 12 ==11){
            System.out.println("Chinese Zodiac= Sheep");

        }
    }
}
