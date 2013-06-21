/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Cadastra;

import Util.AcessoBD;
import java.sql.ResultSet;

public class ClassCadastrarConstrucao {

    AcessoBD bd = new AcessoBD();
    private int id;
    private String con;

    public void setIdConstrucao(int i) {
        this.id = i;
    }

    public void cadastrarConstrucao(String construcao) {
        String sql = "INSERT INTO construcao (tipo) VALUES ('" + construcao + "')";
        bd.updateBase(sql);
    }

    public void atualizarConstrucao(String tipo) {
        String sql2 = "UPDATE construcao SET tipo ='" + tipo + "' WHERE id = '" + id + "'";
        bd.updateBase(sql2);
    }

    public void deletaConstrucao() {
        String sql3 = "DELETE FROM construcao WHERE id='" + id + "'";
        bd.updateBase(sql3);
    }

    public String pesquisaConstrucao() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT tipo FROM construcao WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    con = (resultado.getString("tipo"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return con;
    }
    
    
    
}
