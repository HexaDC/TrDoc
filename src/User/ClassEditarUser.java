package User;

import Util.AcessoBD;

public class ClassEditarUser {

    AcessoBD bd;
    private String nome;
    private int id;

    public ClassEditarUser() {
        bd = new AcessoBD();
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setNome(String nm) {
        nome = nm;
    }

    public void editarUser(String acesso, int tp_acesso, String nome, String login) {
        String sql = "UPDATE usuario SET acesso = '" + acesso + "',tipo = '"+tp_acesso+"', nome ='" + nome + "', usuario='" + login + "'"
                + " WHERE id = '" + id + "'";
        bd.updateBase(sql);

    }
}
