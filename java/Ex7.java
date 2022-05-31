import java.util.Scanner;

public class Ex7{

public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.println("Informe um valor: ");
    int n1 = in.nextInt();

    System.out.println("Informe um segundo valor: ");
    int n2 = in.nextInt();

    System.out.println("Informe um terceiro valor: ");
    int n3 = in.nextInt();


    if(n1< n2 && n1 < n3){
        System.out.println("A soma de " + n2 + " e " + n3+ " é igual a " + (n2 + n3));
    }
    else if (n2 < n1 && n2 < n3){
        System.out.println("A soma  " + n1+ " e " + n3+ " é igual a " + (n1+n3));
    }
    else {
        System.out.println("A soma " + n2 + " e " + n3+ " é igual a  " + (n2+n3));
    }
    in.close();
}
}