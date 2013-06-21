package Classes.Cadastra;

import Util.AcessoBD;

public class ClassCadastrarDenunciante {

    AcessoBD bd;
    private int id;

    public ClassCadastrarDenunciante() {
        bd = new AcessoBD();
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void cadastrarDenunciante(String nome, String endereco,String complemento, String num, String bairro, String quadra, String lote, String insc, String telefone, String loteamento) {
        String sql = "INSERT INTO denunciante (vistoria_id, nome, endereco, complemento, num, bairro, quadra, lote, insc_municipal, telefone, loteamento)"
                + "VALUES ('" + id + "','" + nome + "','" + endereco + "','" + complemento + "','" + num + "','" + bairro + "','" + quadra + "','" + lote + "','" + insc + "','" + telefone + "','" + loteamento + "' )";
        bd.updateBase(sql);

    }
}
