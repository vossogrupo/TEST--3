package atividade21;

import java.util.Scanner;

public class atividade21 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        String nome;
        Integer idd; 
        char sexoo;

        System.out.println("Digite o nome:");
        nome=valor.nextLine();
        System.out.println("Digite o sexo M ou F:");
        sexoo=valor.nextLine().charAt(0);
        System.out.println("Digite a idade:");
        idd=valor.nextInt();
        

        if  (idd >=18 && sexoo =='M'){
            System.out.println(nome+"     Apto para servir");
        }
        else { 
            System.out.println(nome+"     Não apto para servir");
        }

    }
}
