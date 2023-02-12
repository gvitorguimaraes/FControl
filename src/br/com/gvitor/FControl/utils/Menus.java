package br.com.gvitor.FControl.utils;

import java.util.Scanner;

import br.com.gvitor.FControl.models.Perfil;
import br.com.gvitor.FControl.models.Usuario;
import java.util.Date;

public class Menus {

    private Usuario usuario;

    public Menus(){}

    public void gerarMenuInicial(Scanner input){

        System.out.println("\n            -  Login/Cadastro  -   ");
        System.out.println("\n >> [1] Login");
        System.out.println(" >> [2] Cadastro\n");
        System.out.print(" >> ");
        int op = input.nextInt();

        if(op == 1){
            menuLogin(input);
        }
        else if(op == 2){
            menuCadastro(input);
        }
        else{
            System.out.println("\nERRO! - Escolha uma opção válida!");
            gerarMenuInicial(input);
        }

    }

    /*
     * Menu para inserir as credenciais de login
     */

    public void menuLogin(Scanner input){
        LoginCadastro loginService = new LoginCadastro();

        String email;
        String senha;
        
        input.nextLine();
        System.out.println("\n              -  LOGIN  -   ");
        System.out.print("\n >> E-mail: ");
        email = input.nextLine();
        System.out.print(" >> Senha: ");
        senha = input.nextLine();

        if(loginService.login(email, senha) != null){
            this.usuario = loginService.login(email, senha);
            menuSistema(input);
        }else{
            System.out.println(" - Não foi possivel fazer login, tente novamente! - ");
            menuLogin(input);
        }
    }

    /*
     * Menu para inserir os dados para cadastrar o usuário
     */

    public void menuCadastro(Scanner input){

        LoginCadastro cadastroService = new LoginCadastro();

        Usuario user = new Usuario();
        Perfil perfil = new Perfil();

        input.nextLine();
        System.out.println("\n              -  CADASTRO  -   ");
        System.out.print("\n >> E-mail: ");
        user.setEmail(input.nextLine());
        System.out.print(" >> Senha: ");
        user.setSenha(input.nextLine());
        System.out.print(" >> CPF: ");
        user.setCpf(input.nextLine());
        System.out.println("---------------------------");

        System.out.print(" >> Nome: ");
        perfil.setNome(input.nextLine());
        System.out.print(" >> Data de nascimento: ");
        perfil.setDataNascimento(new Date());               // Pensar em como converter string da data em Date
        System.out.print(" >> Telefone: ");
        perfil.setTelefone(input.nextLine());

        if(cadastroService.cadastrar(user, perfil) != null){
            System.out.println(" Perfil cadastrado com sucesso!");
            menuSistema(input);
        }else{
            System.out.println(" - Não foi possivel fazer o cadastro, tente novamente! - ");
            menuCadastro(input);
        }
    }

    public void menuNovaConta(Scanner input){}

    public void menuNovaOperacao(Scanner input){}

    public void menuNovoInvestimento(Scanner input){}

    public void menuSistema(Scanner input){
        System.out.println("\n            -  MENU  -   ");
        System.out.println("\n >> [1] Adicionar nova conta");
        System.out.println(" >> [2] Registrar nova operação");
        System.out.println(" >> [3] Registrar investimento");
        System.out.println(" >> [4] Gerar relatório");
        System.out.println(" >> [5] Sair\n");
        System.out.print(" >> ");
        int op = input.nextInt();

        switch(op)
        {
            case 1:
                menuNovaConta(input);
                break;
            case 2:
                menuNovaOperacao(input);
                break;
            case 3:
                menuNovoInvestimento(input);
                break;
            case 4:
                new Relatorio().gerarRelatorio();
        }

    }
    
}
