package br.com.gvitor.FControl.utils;

import br.com.gvitor.FControl.models.Perfil;
import br.com.gvitor.FControl.models.Usuario;

public class LoginCadastro {
    
    public Usuario login(String email, String senha){

        Usuario usuarioTemp = new Usuario();

        // Verificar se as credenciais estão presentes em um arquivo txt 

        return usuarioTemp;
    }

    public Usuario cadastrar(Usuario user, Perfil perfil){

        // Gerar uma id sequencial
        user.setId(17);

        // Gravar em um arquivo.txt
        new Arquivos().salvarUsuario(user, perfil);

        return user;
    }
}
