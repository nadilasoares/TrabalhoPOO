import entidades.Usuario;

import java.util.ArrayList;


public class ServicoAutenticacao {
     private ArrayList<Usuario> usuariosCadastrados;

    public ServicoAutenticacao()
    {
        usuariosCadastrados = new ArrayList<>();
    }

    public void cadastrarUsuario(Usuario usuario)
    {
        usuariosCadastrados.add(usuario);
    }

    public Usuario login(String email, String senha)
    {
        for(Usuario usuario : usuariosCadastrados)
        {
            if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha))
            {
                return usuario;
            }
        }
        return null; // Login falhou
    }
}
