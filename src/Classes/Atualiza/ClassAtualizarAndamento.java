package Classes.Atualiza;

import Util.AcessoBD;

public class ClassAtualizarAndamento {

    AcessoBD bd;
    private int id;

    public ClassAtualizarAndamento() {
        bd = new AcessoBD();
    }

    void setId(int i) {
        id = i;
    }

    public void atualizarAndamento(String entrada, String saida, String arquivado, String andamento, String expedicao) {
        String sql = "UPDATE andamentos SET entrada ='" + entrada + "', saida ='" + saida + "', arquivado='" + arquivado + "',andamentos ='" + andamento + "', expedicoes='" + expedicao + "'"
                + "WHERE codprocesso ='" + id + "'";
        bd.updateBase(sql);

    }
}
