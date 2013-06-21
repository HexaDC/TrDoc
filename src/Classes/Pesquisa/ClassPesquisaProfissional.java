package Classes.Pesquisa;

import Util.AcessoBD;
import java.sql.ResultSet;

public class ClassPesquisaProfissional {

    AcessoBD bd;
    private int id, idp;
    private String profissional, formacao, creasp, art, insc, nome;

    public ClassPesquisaProfissional() {
        bd = new AcessoBD();
    }

    public void setIdProfissional(int i) {
        id = i;
    }

    public int getIdProfissional() {
        return id;
    }

    public void setNomeProfissional(String nm) {
        nome = nm;

    }
    

    public int pesquisaIdProfissional2(String n) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT id FROM profissional WHERE profissional = '" + n + "'");
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

    public int pesquisaIdProfissional() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT id FROM  profissional WHERE id = '" + id + "'");
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

    public String pesquisaNomeProfissional() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT profissional FROM  profissional WHERE id = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    profissional = (resultado.getString("profissional"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return profissional;
    }

    public String pesquisaFormacao() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT formacao FROM profissional WHERE id = '" + id+ "'");
            if (resultado != null && resultado.next()) {
                do {
                    formacao = (resultado.getString("formacao"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return formacao;
    }

    public String pesquisaCreasp() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT creasp FROM profissional WHERE id = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    creasp = (resultado.getString("creasp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return creasp;
    }

    public String pesquisaInscrMunicipal() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT inscrmunicipal FROM profissional WHERE id = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    insc = (resultado.getString("inscrmunicipal"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return insc;
    }
    
     public String pesquisaArt() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT art FROM profissional WHERE id = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    art = (resultado.getString("art"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return art;
    }
     
     
}
