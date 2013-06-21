//classe de acesso ao Banco de Dados urbanismo
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.Vector;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class AcessoBD {

    public static Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement;
    private String nomeBD;

    public AcessoBD() {
        //VOid
    }

    void Processo(String string) {
        AcessoBD bd;
    }

    public Connection getConnection(){
       return con;
   }
    //Configuração inicial do banco de dados

    public void ConfigBD() {
       //String user = "root", password = "";
        String user = "urbanismo", password = "urbanismo1!";
         
        this.nomeBD = "urbanismo";
        String driver = "com.mysql.jdbc.Driver",
             //URL = "jdbc:mysql://localhost:3306/" + nomeBD;
                URL = "jdbc:mysql://192.168.4.19:3306/" + nomeBD;

        //setar o driver
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(URL, user, password);
            System.out.println("Conexão com o banco de dados: " + nomeBD + " realizada com sucesso!");
            System.out.println(con);
        } catch (Exception e) {
            System.err.println(e.getMessage());

        }
    }
    //Consulta a Base de  Dados

    public ResultSet consultaTable(String ConsultaSQL) throws SQLException {
        ResultSet resultado = null;
        try {
            if (con != null) {
                if (statement != null) {
                    statement.close();
                }
                statement = con.createStatement();
                resultado = statement.executeQuery(ConsultaSQL);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Consulta ao Banco de Dados não realizada: SQLException!");
        }
        return resultado;
    }

    public int updateBase(String updateSQL) {
        int execucaoOk = 1;
        try {
            if (con != null) {
                if (statement != null) {
                    statement.close();  //Fechando a instrução
                }
                statement = con.createStatement();
                execucaoOk = statement.executeUpdate(updateSQL);
               // JOptionPane.showMessageDialog(null, "Atualização realizada com Sucesso!!");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
             JOptionPane.showMessageDialog(null, "Atualização do Banco de Dados não realizada: SQLException!");
        }
        return execucaoOk;
    }
    //Retorna todos os registros da tabela

    public javax.swing.JTable obtemTable(ResultSet resultado) {
        javax.swing.JTable tabela;
        Vector cabecalho = new Vector();
        Vector linhas = new Vector();

        try {
            ResultSetMetaData rsmd = resultado.getMetaData();
            //obtem os nomes das colunas da tabela
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                cabecalho.addElement(rsmd.getColumnName(i));
            }

            //obtem as linhas da tebela
            do {
                linhas.addElement(obtemRegistro(resultado, rsmd));
            } while (resultado.next());
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        //monta a tabela com cabeçalho e registros
        tabela = new javax.swing.JTable(linhas, cabecalho);
        return tabela;
    }
    //obtem os registros da tabela

    private Vector obtemRegistro(ResultSet resultado, ResultSetMetaData rsmd) {
        Vector registro = new Vector();
        java.text.SimpleDateFormat dataFormata = new java.text.SimpleDateFormat("dd/MM/yyyy");

        try {
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                switch (rsmd.getColumnType(i)) {
                    case Types.VARCHAR:
                        registro.addElement(resultado.getString(i));
                        break;
                    case Types.INTEGER:
                        registro.addElement(resultado.getInt(i));
                        break;
                    case Types.DECIMAL:
                        registro.addElement(resultado.getDouble(i));
                        break;
                    case Types.REAL:
                        registro.addElement(resultado.getDouble(i));
                        break;
                    case Types.TIMESTAMP:
                        registro.addElement(dataFormata.format(resultado.getDate(i)));
                        break;
                }
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return registro;
    }

    //Fecha a  Base de Dados
    void finalizaBD() {
        try {
            if (con != null) {
                con.close();
            }
            con.close();
            System.out.println("Banco de Dados: " + nomeBD + " fechado!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}



