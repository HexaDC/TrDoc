package Classes.Cadastra;

import Util.AcessoBD;

public class ClassCadastrarNumeracao {

    AcessoBD bd;
    private int id;
    private int id_c;

    public ClassCadastrarNumeracao() {
        bd = new AcessoBD();
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public int getIdControle() {
        return id_c;
    }

    public void setIdControle(int c) {
        this.id_c = c;
    }

    public void cadastrarNumeracao(String num, String dt, String cont) {
        String sql = "INSERT INTO numeracao (codprocesso, numeracao, dt_emissao, controle)"
                + "VALUES ('" + id + "','" + num + "','" + dt + "','"+cont+"')";
        bd.updateBase(sql);
    }
}
