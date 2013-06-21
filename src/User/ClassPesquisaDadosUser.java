package User;

import Util.AcessoBD;
import java.sql.ResultSet;

public class ClassPesquisaDadosUser {

    AcessoBD bd;
    private int id;
    private String nome, login;
    private int id_pri;
    private String array[];

    public ClassPesquisaDadosUser() {
        bd = new AcessoBD();
    }

    public void setId(int i) {
        id = i;
    }

    public String pesquisaNomeUsuario() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT nome FROM urbanismo.usuario WHERE id = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    nome = (resultado.getString("nome"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return nome;
    }

    public String pesquisaLoginUsuario() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT usuario FROM urbanismo.usuario WHERE id = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    login = (resultado.getString("usuario"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return login;
    }

   public int pesquisaPrivilegio() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT tipo FROM urbanismo.usuario WHERE id = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    id_pri = (resultado.getInt("tipo"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return id_pri;
    }
    
    public String[] pesquisaAcesso(){
        array = new String[16];
        try{
            ResultSet resultado = bd.consultaTable("SELECT acesso FROM urbanismo.usuario WHERE id = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
               
                    array = resultado.getString("acesso").split(",");
               } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return array;
        }
    
   /* Array pesquisaAcesso(){
        try{
            ResultSet resultado = bd.consultaTable("SELECT acesso FROM urbanismo.usuario WHERE id = '" + id + "'");
            if (resultado != null ) {
              
                    ary = resultado.getArray("acesso");
            }
            System.out.print("Calss ="+ary);
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return ary;
        }*/
}
