//criado em 07/01/2011
package Classes.Atualiza;

import Util.AcessoBD;

public class ClassAtualizarComunique {

    AcessoBD bd;
    private int id;

    public ClassAtualizarComunique() {
        bd = new AcessoBD();
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void atualizarComunique(String comunique, String logra, String bairro, String num, String cidade, String uf, String cep, String data){
        String sql = "UPDATE processo SET  comunique ='"+ comunique +"',logradouro_coresp ='" + logra + "', n_coresp = '" + num + "', bairro_coresp = '" + bairro + "', cidade_coresp = '" + cidade + "',estado_coresp = '" + uf + "', cep_coresp = '" + cep + "', data_coresp = '" + data + "'"
                   + "WHERE codprocesso = '" + id + "'";
        bd.updateBase(sql);
    }
}
