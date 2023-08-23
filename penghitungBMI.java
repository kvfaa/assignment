import java.util.Scanner;
public class penghitungBMII {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int berat;
        double tinggi;
        double bmi;
        System. out.println ("Masukkan berat :");
        berat = input.nextInt();
        System. out.println ("Masukkan Tinggi ");
        tinggi = input.nextDouble();
        tinggi/=100;
        bmi= berat/(tinggi*tinggi);
        System. out.println ("Bmi mu adalah "+ bmi);

        if (bmi<18.5){
            System. out.println("kurang berat badan");
        }
        else if (bmi<24.9){
             System. out.println("normal");
        }
        else if (bmi<28.9){
        System. out.println("gemuk");
        }
         else {
         System. out.println("obesitas");
        }
    }   

}