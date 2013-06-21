//Criado em 11/01/2011
package Classes.Cadastra;

import Util.AcessoBD;

public class ClassCadastrarAssinatura {

    AcessoBD bd;

    public ClassCadastrarAssinatura() {
        bd = new AcessoBD();
    }

    public void cadastrarAssinatura(String nome, String reg, String cargo) {
        String sql = "INSERT INTO assinatura (nome, registro, cargo) "
                + "VALUES('" + nome + "','" + reg + "','" + cargo + "')";
        bd.updateBase(sql);
    }
}
