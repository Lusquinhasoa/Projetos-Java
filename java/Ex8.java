import java.util.Scanner;

public class Ex8{

public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.println("Informe um valor: ");
    double n1 = in.nextInt();

    System.out.println("Informe um segundo valor: ");
    double n2 = in.nextInt();

    
        while(n2<=0){
            System.out.println("Informe outro número");
            n2 = in.nextInt();
        }
    System.out.println("A divisão de " + n1 + " e " + n2 + " = " + n1/n2);
    in.close();
}
}