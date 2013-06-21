package User;

import Util.AcessoBD;

public class ClassCadastrarSenha {

    AcessoBD bd;
    private String user;
    private String senha;
    private int id;
    private String user2;

    public ClassCadastrarSenha() {
        bd = new AcessoBD();
    }

    public void setUser(String u) {
        user = u; 

    }

    public String getUser() {
        return user;

    }

    public void cadastrarSenha(String senha2) {
        String sql = "UPDATE usuario SET senha ='" + senha2 + "'"
                + "WHERE usuario ='" + user + "'";
        bd.updateBase(sql);
    }
}
