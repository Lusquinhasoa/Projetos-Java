import java.util.Scanner;

public class At12{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

    int array [];
    int soma = 0;
        for(int c = 0; c <4; c++ ){
        System.out.println("Digite 4 notas da avaliação de Matemática do semestre");
        int n1 = in.nextInt();

    if( n1 >=0 && n1 <= 10 ){
        array [c] = array[n1];
    }else{
        System.out.println("[ERRO] Número maior que 10 ou menor que 0 ");
    }
    }
        for(int c = 0; c <array.length;c++){
        soma +=array[c];
    }

    int media = soma/4;
    if(media >= 6){
        System.out.println("A média sua foi: ${media} Você foi aprovado "); 
    }
//segunda parte

    for(int c = 0; c <4; c++ ){
        System.out.println("Digite 4 notas da avaliação de Português do semestre");
    int n2 = in.nextInt();

    if( n2 >=0 && n2 <= 10 ){
        array [i] = array [n2];
    }else{
        System.out.println("[ERRO] Número maior que 10 ou menor que 0");
    }
    }
    for(int c = 0; c <array.length;c++){
    soma +=array[c];
    }

    if(media >= 6){
    System.out.println("A média sua foi: ${media} Você foi aprovado "); 
    }
    in.close();
    }
    }