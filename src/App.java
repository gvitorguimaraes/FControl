import java.util.Scanner;

import br.com.gvitor.FControl.utils.Menus;

/* REQUISITOS
 *
 * Registrar usuário
 * Adicionar conta/banco
 * Registrar saidas
 *      -> Classificar por tipo
 * Registrar entradas
 * Investimentos
 *      -> Classificar
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Menus m = new Menus();
        
        System.out.println("********************************************");
        System.out.println("*                                          *");
        System.out.println("*  FINC CONTROL - GERENCIADOR DE FINANÇAS  *");
        System.out.println("*                                          *");
        System.out.println("********************************************");
        System.out.println("____________________________________________");
        
        m.gerarMenuInicial(input);
    }
}
