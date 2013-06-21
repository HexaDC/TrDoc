//criado em 07/01/2011
package Classes.Pesquisa;

import Util.AcessoBD;
import java.sql.ResultSet;

public class ClassSelecionarId {

    AcessoBD bd;
    private int id;
    private int idp;
    private int ida;
    private int idv;
    private int idd;
    private int idde;
    //---------------
    private int id_denun;
    private int id_vist;
    private int id_denunc;
    private int idf;

    public ClassSelecionarId() {
        bd = new AcessoBD();
    }
    

    public int selecionarIdProcesso() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT codprocesso FROM processo");
            if (resultado != null && resultado.next()) {
                do {
                    id = (resultado.getInt("codprocesso"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return id;

    }

    public int selecionarIdFiscal() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT id FROM fiscal");
            if (resultado != null && resultado.next()) {
                do {
                    idf = (resultado.getInt("id"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return idf;
    }

    public void setId(int i) {
        idp = i;

    }

    public int selecionarIdAndamento() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT codandamentos FROM andamentos");
            if (resultado != null && resultado.next()) {
                do {
                    ida = (resultado.getInt("codandamentos"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return ida;

    }

    public int selecionarIdVistoria() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT id FROM vistoria");
            if (resultado != null && resultado.next()) {
                do {
                    idv = (resultado.getInt("id"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return idv;
    }

    public int selecionarIdDenunciado() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT id FROM denunciado");
            if (resultado != null && resultado.next()) {
                do {
                    idd = (resultado.getInt("id"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return idd;

    }

    public int selecionarIdDenunciante() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT id FROM denunciante");
            if (resultado != null && resultado.next()) {
                do {
                    idde = (resultado.getInt("id"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return idde;

    }

    public void setIdVistoria(int i) {
        id_vist = i;
    }

    //--
    public int selecionarIdPro(int num, String ano) {
        int cod = 0;
        try {
            ResultSet resultado = bd.consultaTable("SELECT codprocesso FROM processo WHERE numprocesso ='" + num + "' and anoprocesso = '" + ano + "'");
            if (resultado != null && resultado.next()) {
                do {
                    cod = (resultado.getInt("codprocesso"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return cod;

    }

    public int selecionarIdFis(String nome) {
        int cod2 = 0;
        try {
            ResultSet resultado = bd.consultaTable("SELECT id FROM fiscal WHERE nome ='" + nome + "'");
            if (resultado != null && resultado.next()) {
                do {
                    cod2 = (resultado.getInt("id"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return cod2;
    }
}
