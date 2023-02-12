package br.com.gvitor.FControl.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.gvitor.FControl.models.Operacao;
import br.com.gvitor.FControl.models.Perfil;
import br.com.gvitor.FControl.models.Usuario;

public class Arquivos {

    public Arquivos(){

    }

    public void salvarUsuario(Usuario usuario, Perfil perfil){
        
        String dados = usuario.getId()+","
                      +usuario.getEmail()+","
                      +usuario.getSenha()+","
                      +usuario.getCpf()+","
                      +perfil.getNome()+","
                      +perfil.getDataNascimento()+","
                      +perfil.getTelefone();
                    
        try{

            FileWriter arquivo = new FileWriter("C:/Users/Gabriel Vitor/Desktop/JAVA/FincControl/fincControl/data/users.txt");
            PrintWriter write = new PrintWriter(arquivo);
            write.println(dados);
            write.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }   
    }

    public void salvarOperacao(Operacao op){}

    public List<Operacao> buscarOperacoes(){
        List listaOperacoes = new ArrayList<Operacao>();
            
        return listaOperacoes;
    }

    public void validarLogin(String email, String senha){

    }
    
}
