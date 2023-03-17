
package projeto1503;

import java.util.Scanner;

public class IdadeDaPessoa {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int anos, meses, dias;
        
        System.out.println("Qual sua idade em anos: ");
        
        anos = sc.nextInt();
        
        System.out.println("E meses? ");
        
        meses = sc.nextInt();
        
        System.out.println("E dias? ");
        
        dias = sc.nextInt();
        
        System.out.println("Sua idade em dias é: " + ((anos * 365) + (meses * 30) + dias));
        
        
        
        
                
                
        
        
        
        
        
        
        
        
        
        sc.close();
    }
}
