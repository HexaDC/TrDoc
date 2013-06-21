package Classes.Pesquisa;

import Util.AcessoBD;
import java.sql.ResultSet;

public class ClassPesquisaAssinatura {

    AcessoBD bd;
    private int id, idp;
    private String  nome, registro, cargo;

    public ClassPesquisaAssinatura() {
        bd = new AcessoBD();
    }

    public void setIdAssinatura(int i) {
        id = i;
    }

    public int getIdAssinatura() {
        return id;
    }

    public void setNomeAssinatura(String nm) {
        nome = nm;

    }
    

    int pesquisaIdAssinatura2(String n) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT id FROM assinatura WHERE nome = '" + n + "'");
            if (resultado != null && resultado.next()) {
                do {
                    idp = (resultado.getInt("id"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return idp;
    }

    public int pesquisaIdAssinatura() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT id FROM  assinatura WHERE id = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    id = (resultado.getInt("id"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return id;
    }

    public String pesquisaNomeAssinatura() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT nome FROM  assinatura WHERE id = '" + id + "'");
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

    public String pesquisaRegistro() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT registro FROM assinatura WHERE id = '" + id+ "'");
            if (resultado != null && resultado.next()) {
                do {
                    registro = (resultado.getString("registro"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return registro;
    }

    

    public String pesquisaCargo() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT cargo FROM assinatura WHERE id = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    cargo = (resultado.getString("cargo"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return cargo;
    }
    
     
     
     
}
