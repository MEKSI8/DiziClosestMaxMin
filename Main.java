import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {15,12,788,1,-1,-778,2,0};
        int closeMin = numbers[0];
        int closeMax = numbers[0];

        System.out.println("Dizi : {15,12,788,1,-1,-778,2,0}");

        Scanner input = new Scanner(System.in);
        System.out.print("Girilen sayı:");
        int girilen = input.nextInt();


        for (int i:numbers){
            if (i>girilen){
                if (i<closeMax){
                    closeMax=i;
                }
                if (closeMax<girilen){
                    closeMax=i;
                }
            }
            else {
                if (i>closeMin && i!=girilen){
                    closeMin=i;
                }
                if (closeMin>girilen && i!=girilen){
                    closeMin=i;
                }
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+closeMin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+closeMax);


    }
}