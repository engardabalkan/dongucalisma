import java.util.Scanner;
public class Dongucalismasi{
    public static void main(String[] args) {
        int n,total=0;
        Scanner inp=new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz:");
            n = inp.nextInt();
            if (n%2==0 && n%4==0){
                total=total+n;
            }
        }while (n % 2 !=1);

        System.out.println("Toplam:"+total);

    }
}
