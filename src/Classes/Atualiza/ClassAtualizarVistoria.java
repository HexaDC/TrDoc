package Classes.Atualiza;

import Util.AcessoBD;

public class ClassAtualizarVistoria {

    AcessoBD bd = new AcessoBD();
    private int id;

    public void setId(int i) {
        this.id = i;
    }

    //dados principais
    public void atualizarVistoria(String fiscal, String atendente, String atendimento, String assunto, String prov, String dt_retorno, String dt_denuncia) {
        String sql = "UPDATE vistoria SET fiscal ='" + fiscal + "',atendente ='" + atendente + "',atendimento='" + atendimento + "',assunto ='" + assunto + "', providencias='" + prov + "',dt_retorno='" + dt_retorno + "', dt_denuncia ='" + dt_denuncia + "'"
                + "WHERE id ='" + id + "'";
        bd.updateBase(sql);
    }

    //dados denunciante
    public void atualizarDenunciante(String nome, String end, String compl, String bairro, String num, String quadra, String lote, String lotea, String insc, String telefone) {
        String sql2 = "UPDATE denunciante SET nome ='" + nome + "', endereco='" + end + "', complemento='" + compl + "',bairro='" + bairro + "', num='" + num + "', quadra='" + quadra + "',lote='" + lote + "',loteamento='" + lotea + "',insc_municipal='" + insc + "',telefone='" + telefone + "'"
                + "WHERE vistoria_id ='" + id + "'";
        bd.updateBase(sql2);
    }
    //dados denuciado

    public void atualizarDenunciado(String nome2, String end2, String bairro2, String num2, String quadra2, String lote2, String loteamento2, String insc2, String referencia, String descricao) {
        String sql3 = "UPDATE denunciado SET nome_denunciado ='" + nome2 + "', endereco_denunciado='" + end2 + "',bairro_denunciado='" + bairro2 + "', num_denunciado='" + num2 + "', quadra_denunciado='" + quadra2 + "',lote_denunciado='" + lote2 + "',loteamento_denunciado='" + loteamento2 + "',insc_municipal_denunciado='" + insc2 + "',referencia='" + referencia + "', descricao ='" + descricao + "'"
                + "WHERE vistoria_id ='" + id + "'";
        bd.updateBase(sql3);
    }
}
