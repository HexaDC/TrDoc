/*criado em 08/01/2011 por Jennifer de M. Lima*/
package Classes.Cadastra;

import Util.AcessoBD;
import java.sql.ResultSet;

public class ClassCadastrarAndamento {

    AcessoBD bd;
    private int id, num;
    private String andamento, dt_entrada, dt_saida, dt_arquivado, expedicao;

    public ClassCadastrarAndamento() {
        bd = new AcessoBD();
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setCodAndamento(int anda) {
        this.num = anda;
    }

    public int getCodAndamento() {
        return num;
    }

    public void cadastrarAndamento(String andamento, String dt_entrada, String dt_saida, String dt_arquivado, String expedicao) {
        String sql = "INSERT INTO andamentos (codprocesso, andamentos, entrada, saida, arquivado, expedicoes)"
                + "VALUES ('" + id + "','" + andamento + "','" + dt_entrada + "','" + dt_saida + "','" + dt_arquivado + "','" + expedicao + "')";
        bd.updateBase(sql);

    }

    public void atualizarAndamento(String entrada, String saida, String arquivado, String andamento, String expedicao) {
        String sql = "UPDATE andamentos SET entrada ='" + entrada + "', saida ='" + saida + "', arquivado='" + arquivado + "',andamentos ='" + andamento + "', expedicoes='" + expedicao + "'"
                + "WHERE codandamentos ='" + num + "'";
        bd.updateBase(sql);
    }
    
    public void excluirAndamento() {
        String sql = "DELETE FROM andamentos WHERE codandamentos ='" + num + "'";
        bd.updateBase(sql);
    }

    public String pesquisaDtEntradaAndamento2() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT entrada FROM andamentos WHERE codandamentos = '" + num + "'");
            if (resultado != null && resultado.next()) {
                do {
                    dt_entrada = (resultado.getString("entrada"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return dt_entrada;
    }

    public String pesquisaDtSaidaAndamento2() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT saida FROM andamentos WHERE codandamentos = '" + num + "'");
            if (resultado != null && resultado.next()) {
                do {
                    dt_saida = (resultado.getString("saida"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return dt_saida;
    }

    public String pesquisaDtArquivadoAndamento2() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT arquivado FROM andamentos WHERE codandamentos = '" + num + "'");
            if (resultado != null && resultado.next()) {
                do {
                    dt_arquivado = (resultado.getString("arquivado"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return dt_arquivado;
    }

    public String pesquisaAndamento2() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT andamentos FROM andamentos WHERE codandamentos = '" + num + "'");
            if (resultado != null && resultado.next()) {
                do {
                    andamento = (resultado.getString("andamentos"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return andamento;
    }

    public String pesquisaExpedicaoAndamento2() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT expedicoes FROM andamentos WHERE codandamentos = '" + num + "'");
            if (resultado != null && resultado.next()) {
                do {
                    expedicao = (resultado.getString("expedicoes"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return expedicao;
    }
}
