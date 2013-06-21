package Classes.Atualiza;

import Util.AcessoBD;

public class ClassAtualizarProfissional {

    AcessoBD bd;
    private int id;

    public ClassAtualizarProfissional() {
        bd = new AcessoBD();
    }

    public void setID(int i) {
        id = i;
    }

    public void atualizarProfissional(String nome, String form, String creasp, String insc) {
        String sql = "UPDATE profissional SET profissional = '" + nome + "', formacao ='" + form + "', creasp ='" + creasp + "', inscrMunicipal='" + insc + "'"
                + "WHERE id ='" + id + "'";
        bd.updateBase(sql);

    }
    //exclui os registros

    public void excluirProfissional() {
        String sql = "DELETE FROM profissional WHERE id='" + id + "'";
        bd.updateBase(sql);
    }
}
