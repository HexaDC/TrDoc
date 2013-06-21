
package Classes.Cadastra;

import Util.AcessoBD;

public class ClassCadastrarFiscal {

    AcessoBD bd;

    public ClassCadastrarFiscal() {
        bd = new AcessoBD();
    }

    public void cadastrarFiscal(String nome, String cargo, String formacao) {
        String sql = "INSERT INTO fiscal (nome, cargo, formacao) "
                + "VALUES ('" + nome + "','" + cargo + "','"+formacao+"')";
        bd.updateBase(sql);
    }
}
