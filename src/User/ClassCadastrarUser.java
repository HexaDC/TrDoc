package User;

import Util.AcessoBD;

public class ClassCadastrarUser {

    AcessoBD bd;

    public ClassCadastrarUser() {
        bd = new AcessoBD();
    }

    public void cadastrarUser(String acesso, int tp_acesso, String nome, String login) {
        String sql = "INSERT INTO usuario (acesso, tipo, nome, usuario, senha)"
                + "VALUES ('" + acesso + "','" + tp_acesso + "','" + nome + "','" + login + "','VKyerThrB56546546HP4Mhhz')";
        bd.updateBase(sql);
    }
}
