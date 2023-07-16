package entidades;
import DAO.UsuarioDAO;

public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario();
        user.setNome("Fulano da Silva");
        user.setLogin("Fulano1234");
        user.setSenha("1234");
        user.setEmail("fulano@xxx.com");

        new UsuarioDAO().cadastrarUsuario(user);
    }
}
