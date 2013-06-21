package User;

import Util.AcessoBD;
import java.sql.ResultSet;

public class ClassVerificaUsuario {

    AcessoBD bd;
    private String nome;
    private String usuario;
    private String nome2, usuario2;

    public ClassVerificaUsuario() {
        bd = new AcessoBD();
    }

    public void setNomeUsuario(String nm) {
        nome = nm;
    }

    public void setUser(String u) {
        usuario = u;
    }

    public boolean verificaUsuario() {
        boolean verifica = false;

        try {
            ResultSet resultado = bd.consultaTable("SELECT nome,usuario FROM urbanismo.usuario WHERE nome = '" + nome + "' AND usuario = '" + usuario + "'");
            if (resultado != null && resultado.next()) {
                verifica = true;
            } else {
                verifica = false;
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return verifica;
    }
}
