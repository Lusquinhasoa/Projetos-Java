import java.util.Scanner;

public class At10{

public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.println("Informe um número");

    double n1 = Integer.parseInt("0");


    for (int i = 0; i<4;i++){
        System.out.println("Informe o " + (i+1) + " ° número");
        n1 += in.nextDouble();
    }
    System.out.println("A soma é : " + (n1));

    in.close();
    }
}
