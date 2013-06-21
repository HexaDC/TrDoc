package Classes.Cadastra;

import Util.AcessoBD;

public class ClassCadastrarDenunciado {

    AcessoBD bd;
    private int id;

    public ClassCadastrarDenunciado() {
        bd = new AcessoBD();
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void cadastrarDenunciado(String nome, String endereco, String num, String bairro, String quadra, String lote, String loteamento, String insc, String referencia, String denuncia) {
        String sql = "INSERT INTO denunciado (vistoria_id, nome_denunciado, endereco_denunciado, num_denunciado, bairro_denunciado, quadra_denunciado, lote_denunciado, loteamento_denunciado, insc_municipal_denunciado, referencia, descricao)"
                + "VALUES ('" + id + "','" + nome + "','" + endereco + "','" + num + "','" + bairro + "','" + quadra + "','" + lote + "','" + loteamento + "','" + insc + "','" + referencia + "','" + denuncia + "')";
        bd.updateBase(sql);

    }
}
