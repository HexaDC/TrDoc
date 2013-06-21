package Classes.Atualiza;

import Util.AcessoBD;

public class ClassAtualizarHabite {

    AcessoBD bd;
    private int id;

    public ClassAtualizarHabite() {
        bd = new AcessoBD();
    }

    public void setId(int i) {
        id = i;
    }

    public void atualizarHabite(String obs,String comp, String constru, String ah, String n_aprov, String n_hab, String ano_habite, String dt_h, String area_aprov, String finalidade) {
        String sql = "UPDATE processo SET observacaohabite='" + obs + "',complementohabite = '" + comp + "',construHabite = '" + constru + "', areahabite = '" + ah + "', numprocaprovacaohabite = '" + n_aprov + "', numhabhabite = '" + n_hab + "', anohabite = '" + ano_habite + "', dataexpedicaohabite ='" + dt_h + "',area_aprovHabite = '"+area_aprov+"',finalidadeHabite = '"+finalidade+"'"
                + "WHERE codprocesso = '" + id + "'";
        bd.updateBase(sql);
    }
}
