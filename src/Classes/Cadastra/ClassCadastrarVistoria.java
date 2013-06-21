package Classes.Cadastra;

import Util.AcessoBD;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ClassCadastrarVistoria {

    AcessoBD bd;

    private int id;
    private int idv;

    public ClassCadastrarVistoria() {
        bd = new AcessoBD();
    }

    public void setId(int i){
        id = i ;
    }

    public int getId(){
        return id;
    }

    public void cadastrarVistoria(String dt_denuncia, String num, String fiscal, String atendente, String atendimento, String assunto, String providencia, String dt_retorno) {
        String sql = "INSERT INTO vistoria (dt_denuncia, num_denuncia, fiscal, atendente, atendimento, assunto, providencias, dt_retorno) "
                + "VALUES ('" + dt_denuncia + "','" + num + "','" + fiscal + "','" + atendente + "','" + atendimento + "','" + assunto + "','"+providencia + "','" + dt_retorno + "')";
        bd.updateBase(sql);
        JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
    }


    //pesquisa id vistoria

    int pesquisaIdVistoria() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT MAX(id) AS maximo FROM vistoria");
            if (resultado != null && resultado.next()) {
                do {
                    idv = (resultado.getInt("maximo"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return idv;
    }
    
    int pesquisaIdV(int n) {
        int num = 0;
        try {
            ResultSet resultado = bd.consultaTable("SELECT id FROM vistoria WHERE num_denuncia ='"+n+"'");
            if (resultado != null && resultado.next()) {
                do {
                    num = (resultado.getInt("id"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num;
    }
    
    
}
