/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Pesquisa;

import Util.AcessoBD;
import java.sql.ResultSet;
import java.util.Vector;

public class ClassCarregarCombo {

    AcessoBD bd;

    public ClassCarregarCombo() {
        bd = new AcessoBD();
    }

    public Vector Profissional() {
        Vector p = new Vector();
        try {
            ResultSet resultado = bd.consultaTable("SELECT profissional FROM profissional ORDER BY profissional ASC");
            if (resultado != null && resultado.next()) {
                do {
                    p.addElement(resultado.getString("profissional"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL:" + e.getMessage());
        }
        return p;
    }

    public Vector Fiscal() {
        Vector f = new Vector();
        try {
            ResultSet resultado = bd.consultaTable("SELECT nome FROM fiscal ORDER BY nome ASC");
            if (resultado != null && resultado.next()) {
                do {
                    f.addElement(resultado.getString("nome"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL:" + e.getMessage());
        }
        return f;
    }
    public Vector Construcao() {
        Vector c = new Vector();
        try {
            ResultSet resultado = bd.consultaTable("SELECT tipo FROM construcao ORDER BY tipo ASC");
            if (resultado != null && resultado.next()) {
                do {
                    c.addElement(resultado.getString("tipo"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL:" + e.getMessage());
        }
        return c;
    }
}
