import java.util.Scanner;

public class Ex5{

public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.println("Informe um valor: ");
    int n1 = in.nextInt();

    System.out.println("Informe um segundo valor: ");
    int n2 = in.nextInt();

    if(n1 == n2){
    System.out.println("Os números são iguais"); 
    }
    else if(n1 > n2){
    System.out.println("O primeiro número é maior");   
    }
    else{
        System.out.println("O segundo número é o maior");
    }
    in.close();
}
}