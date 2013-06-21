/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Util.AcessoBD;
import Forms.FormCadastrarSenha;
import Forms.FormListarUser;
import Forms.FormMenu;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ClassVerificaSenha {

    AcessoBD bd;
    private Boolean teste = false, s = false, u = false;
    private String abcd;
    private String[] acesso_bd = new String[18];
    private String[] array;
    private boolean[] acesso_vtr = new boolean[18];
    public ClassVerificaSenha() {
        bd = new AcessoBD();
    }

    public void getUsuario(String user) {
        String a;
        a = user.toUpperCase();

        try {
            ResultSet resultado = bd.consultaTable("SELECT usuario FROM urbanismo.usuario WHERE usuario =  '" + a + "'");

            if (resultado != null && resultado.next()) {
                do {
                    u = true;
                } while (resultado.next());
            } else {
                JOptionPane.showMessageDialog(null, "Usuário incorreto");
                u = false;
            }
        } catch (java.sql.SQLException e) {
            System.err.println("erro de SQL:" + e.getMessage());
        }

        user = "";
    }

    public void getSenha(String senha, String user) {

        String b, a, c = null;

        a = user.toUpperCase();
        b = senha.toUpperCase();

        try {
            ResultSet resultado = bd.consultaTable("SELECT senha FROM urbanismo.usuario WHERE usuario =  '" + a + "'");

            if (resultado != null && resultado.next()) {
                do {
                    c = (resultado.getString("senha"));
                    if (c.equals("VKyerThrB56546546HP4Mhhz")) {
                        teste = true;
                        s = true;
                    } else {
                        if (c.equals(b)) {
                            s = true;
                        } else {
                            s = false;
                            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta");
                        }
                    }
                } while (resultado.next());
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta");
            }

        } catch (java.sql.SQLException e) {
            System.err.println("erro de SQL:" + e.getMessage());
        }

        user = "";
        senha = "";

    }
    
    public void getAcesso(String user) {
        String a;
        a = user.toUpperCase();
        try {
            ResultSet resultado = bd.consultaTable("SELECT acesso FROM urbanismo.usuario WHERE usuario =  '" + a + "'");

            if (resultado != null && resultado.next()) {
                do {
                    acesso_bd = resultado.getString("acesso").split(",");
                } while (resultado.next());
            } 
        } catch (java.sql.SQLException e) {
            System.err.println("erro de SQL:" + e.getMessage());
        }
    }
    
    public String[] pesquisaAcesso(String user){
        String a;
        a = user.toUpperCase();
        try{
            ResultSet resultado = bd.consultaTable("SELECT acesso FROM urbanismo.usuario WHERE  usuario =  '" + a + "'");
            if (resultado != null && resultado.next()) {
                do {
               
                    array = resultado.getString("acesso").split(",");
               } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL pesqdadosuser_pesqacesso: " + e.getMessage());
        }
        return array;
        }

    public boolean retornaLogin() {
        return s;
    }

    public boolean retornaTeste() {
        return teste;
    }

    //abre o sistema de acordo com o tipo de privilégio
    public void abreSistema(String user) {
        String usr;
        String tipo = new String();

        usr = user.toUpperCase();

        if (teste == true) {
            FormCadastrarSenha TP = new FormCadastrarSenha(this, true);
            TP.setVisible(true);
        } else {
            if (s == true) {
                try {
                    ResultSet resultado = bd.consultaTable("SELECT tipo FROM usuario WHERE usuario =  '" + usr + "'");

                    if (resultado != null && resultado.next()) {
                        do {
                            tipo = (resultado.getString("tipo"));
                        } while (resultado.next());
                    } else {
                    }

                } catch (java.sql.SQLException e) {
                    System.err.println("Erro de SQL: " + e.getMessage());
                }


                if (tipo.equals("99")) {
                    FormListarUser TP = new FormListarUser(this, true);
                    TP.setVisible(true);

                } else {
                    if (tipo.equals("1")) {
                        getAcesso(usr);
                        FormMenu TP = new FormMenu();
                        TP.setVisible(true);
                        TP.group = "1";
                        for (int i = 0; i < acesso_bd.length; i++) {
                            acesso_vtr[i] = Boolean.parseBoolean(acesso_bd[i]);
                        }
                        TP.acesso_user = acesso_vtr;

                    } else {
                        if (tipo.equals("2")) {
                            getAcesso(usr);
                            FormMenu TP = new FormMenu();
                            TP.setVisible(true);
                            TP.group = "2";
                            for (int i = 0; i < acesso_bd.length; i++) {
                                acesso_vtr[i] = Boolean.parseBoolean(acesso_bd[i]);
                            }
                            TP.acesso_user = acesso_vtr;

                        } else {
                            if (tipo.equals("3")) {
                                getAcesso(usr);
                                FormMenu TP = new FormMenu();
                                TP.setVisible(true);
                                TP.group = "3";
                                for (int i = 0; i < acesso_bd.length; i++) {
                                    acesso_vtr[i] = Boolean.parseBoolean(acesso_bd[i]);
                                }
                                TP.acesso_user = acesso_vtr;

                            } else {
                                if (tipo.equals("4")) {
                                    getAcesso(usr);
                                    FormMenu TP = new FormMenu();
                                    TP.setVisible(true);
                                    TP.group = "4";
                                    for (int i = 0; i < acesso_bd.length; i++) {
                                        acesso_vtr[i] = Boolean.parseBoolean(acesso_bd[i]);
                                    }
                                    TP.acesso_user = acesso_vtr;

                                } else {
                                    if (tipo.equals("0")) {
                                        getAcesso(usr);
                                        FormMenu TP = new FormMenu();
                                        
                                        TP.group = "0";
                                        TP.setVisible(true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void Pega(String a) {
        abcd = a;
    }

    public String Retorna() {
        return abcd;
    }
}
