package Classes.Atualiza;

import Util.AcessoBD;

public class ClassAtualizarAssinatura {

    AcessoBD bd;
    private int id;

    public ClassAtualizarAssinatura() {
        bd = new AcessoBD();
    }

    public void setID(int i) {
        id = i;
    }

    public void atualizarAssinatura(String nome, String reg, String cargo) {
        String sql = "UPDATE assinatura SET nome = '" + nome + "', registro ='" + reg + "', cargo ='" + cargo + "'"
                + " WHERE id ='" + id + "'";
        bd.updateBase(sql);

    }
    //exclui os registros

    public void excluirAssinatura() {
        String sql = "DELETE FROM assinatura WHERE id='" + id + "'";
        bd.updateBase(sql);
    }
}
