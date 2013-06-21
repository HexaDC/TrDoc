//criado em 07/01/2011
package Classes.Cadastra;

import Util.AcessoBD;

public class ClassCadastrarProcesso {

    AcessoBD bd;

    public ClassCadastrarProcesso() {
        bd = new AcessoBD();
    }

    public void cadastrarProcesso(int processo, String ano, String data, String requerente, String assunto, String endereco, String bairro, String loteamento, String lote, String quadra, String ident) {
        String sql = "INSERT INTO processo (numprocesso, anoprocesso, dataentrada, requerente, assunto, endereco, bairro, loteamento, lote, quadra, identificacaocadastral)"
                + "VALUES ('"+processo+"','"+ano+"','"+data+"','"+requerente+"','"+assunto+"','"+endereco+"','"+bairro+"','"+loteamento+"','"+lote+"','"+quadra+"','"+ident+"')";
        bd.updateBase(sql);

    }
}
