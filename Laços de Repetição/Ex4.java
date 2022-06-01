import java.util.Scanner;

public class Ex4{

public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.println("Informe 10 números ");
    double n1 = Integer.parseInt("0");

    for (int i = 0; i<10;i++){
        System.out.println("Informe o " + (i+1) + " ° número");
        n1 += in.nextDouble();
    }
    System.out.println("A média é : " + (n1/10));
    in.close();
}
}