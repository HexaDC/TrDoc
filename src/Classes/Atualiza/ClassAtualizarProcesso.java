package Classes.Atualiza;

import Util.AcessoBD;

public class ClassAtualizarProcesso {

    AcessoBD bd;
    private int id;

    public ClassAtualizarProcesso() {
        bd = new AcessoBD();
    }

    public void setId(int i) {
        id = i;
    }

    public void atualizarProcesso(String data, String assunto, String requerente, String endereco, String bairro, String loteamento, String lote, String quadra, String ident) {
        String sql = "UPDATE processo SET dataentrada = '" + data + "', assunto = '" + assunto + "', requerente = '" + requerente + "', endereco ='" + endereco + "', bairro='" + bairro + "', loteamento = '" + loteamento + "', lote = '" + lote + "',quadra ='" + quadra + "', identificacaocadastral ='" + ident + "'"
                + "WHERE codprocesso ='" + id + "'";
        bd.updateBase(sql);
    }
}
