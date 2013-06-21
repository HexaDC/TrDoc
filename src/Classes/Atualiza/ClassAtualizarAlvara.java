//Criado em 11/01/2011
package Classes.Atualiza;

import Util.AcessoBD;

public class ClassAtualizarAlvara {

    AcessoBD bd;
    private int id;

    public ClassAtualizarAlvara() {
        bd = new AcessoBD();
    }

    public void setId(int i) {
        id = i;
    }
    
    

    int getId() {
        return id;
    }

    public void atualizarAlvara(String prof1, String form1, String creasp1, String art1, String insc1, String prof2, String form2, String creasp2, 
            String art2, String insc2, String areac, String compc, String numc,String anoc, String data, String constr, String sit) {
        String sql = "UPDATE processo SET autordoprojeto='" + prof1 + "', "
                + "formacaoautorprojeto='" + form1 + "', "
                + "creaspautorprojeto='" + creasp1 + "', "
                + "artautorprojeto='" + art1 + "', "
                + "inscrmunicipalautorprojeto='" + insc1 + "', "
                + "responsaveltecnico='" + prof2 + "', "
                + "formacaoresptecnico='" + form2 + "', "
                + "creaspresptecnico='" + creasp2 + "', "
                + "artresptecnico='" + art2 + "', "
                + "inscrmunicipalresptecnico='" + insc2 + "', "
                + "area_alvconstrucao='" + areac + "', "
                + "complementoconstrucao='" + compc + "', "
                + "numalvaraconstrucao='" + numc + "', "
                + "anoalvaraconstrucao='" + anoc + "', "
                + "data_alvconstrucao='" + data + "', "
                + "tipodeconstrucao='" + constr + "', "
                + "situacao_alv ='" + sit + "'"
                + "WHERE codprocesso = '" + id + "'";
        bd.updateBase(sql);
    }
    
    public void atualizarAlvara2(String prof1,String creasp1, String insc1,String prof2,String creasp2,String insc2,String constralv,String compl,String nump,String numc,String area,String dataalv,String sit) {
        String sql = "UPDATE processo SET "
                + "autordoprojeto ='" + prof1 + "', "
                + "inscrmunicipalautorprojeto='" + insc1 + "', "
                + "area_alvprojeto='" + area + "', "
                + "complementoprojeto='" + compl + "', "
                + "numalvaraprojeto='" + nump + "', "
                + "data_alvproj='" + dataalv + "', "
                + "responsaveltecnico='" + prof2 + "', "
                + "creaspresptecnico='" + creasp2 + "', "
                + "inscrmunicipalresptecnico='" + insc2 + "', "
                + "area_alvconstrucao='" + area + "', "
                + "numalvaraconstrucao='" + numc + "', "
                + "tipodeconstrucao='" + constralv + "', "
                + "situacao_alv ='" + sit + "'"
                + "WHERE codprocesso = '" + id + "'";
        bd.updateBase(sql);
    }
   
    public void atualizaFlag(int id1){
        String sql = "UPDATE processo SET flag_emissao='1' "
                + "WHERE codprocesso = '" + id1 + "'";
        bd.updateBase(sql);
    }
    
    //excluir registro
    public void excluirRegistro() {
        String sql = "DELETE FROM processo WHERE codprocesso ='" + id + "'";
        bd.updateBase(sql);
    }
    
    
}
