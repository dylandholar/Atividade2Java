package projeto1503;

import java.util.Scanner;

public class OperadoresAritimeticos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        float num3, num4;
        
        
        System.out.println("Informe o valor para o num1:");
        num1 = sc.nextInt();
        
        System.out.println("Informe o valor para o num2:");
        num2 = sc.nextInt();
        
        System.out.println("A soma do " + num1 + " + " + num2 + " = " + (num1+num2));
        
        System.out.println("Informe o valor para o num1:");
        num1 = sc.nextInt();
        
        System.out.println("Informe o valor para o num2:");
        num2 = sc.nextInt();
        
        System.out.println("A subtração do " + num1 + " - " + num2 + " = " + (num1-num2));
        
        System.out.println("Informe o valor para o num1:");
        num1 = sc.nextInt();
        
        System.out.println("Informe o valor para o num2:");
        num2 = sc.nextInt();
        
        System.out.println("A multiplicação do " + num1 + " * " + num2 + " = " + (num1*num2));
        
        System.out.println("Informe o valor para o num1:");
        num3 = sc.nextInt();
        
        System.out.println("Informe o valor para o num2:");
        num4 = sc.nextInt();
        
        System.out.println("A divisão do " + num3 + " / " + num4 + " = " + (num3/num4));
        
        sc.close();
    }
    
}
