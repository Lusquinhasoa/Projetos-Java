import java.util.Scanner;

public class Ex1{

public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.println("Informe um valor: ");
    int n1 = in.nextInt();

    if(n1<0){
    System.out.println("O número é negativo"); 
    }
    else if(n1>0){
    System.out.println("O número é positivo");   
    }
    else{
        System.out.println("O número é zero");
    }
    in.close();
}
}