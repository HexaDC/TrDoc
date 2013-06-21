//Criado em 11/01/2011
package Classes.Cadastra;

import Util.AcessoBD;

public class ClassCadastrarProfissional {

    AcessoBD bd;

    public ClassCadastrarProfissional() {
        bd = new AcessoBD();
    }

    public void cadastrarProfissional(String prof, String form, String cre, String insc) {
        String sql = "INSERT INTO profissional (profissional, formacao, creasp, inscrmunicipal) "
                + "VALUES('" + prof + "','" + form + "','" + cre + "','" + insc + "')";
        bd.updateBase(sql);
    }
}
