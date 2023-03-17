package projeto1503;

import java.util.Scanner;

public class SucessorAntecessor {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num1, antecessor, sucessor; 
        
        System.out.println("Infome o número 1:");
        num1 = sc.nextInt();
        
        antecessor = num1 - 1;
                
        System.out.println("O antecessor de " + num1 + " = " + antecessor);
        
        sucessor = num1 + 1;
        
        System.out.println("O sucessor de " + num1 + " = " + sucessor);
        
        sc.close();
    }
}
