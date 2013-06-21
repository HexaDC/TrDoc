package Classes.Fiscais;

import Util.AcessoBD;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ClassLancamentoFiscais {

    AcessoBD bd = new AcessoBD();
    
    
    private String nome_corresp, enderc_corresp, num_corresp, comple_corresp, bairro_corresp, cidade_corresp, estado_corresp, cep_corresp;
    private String ender_infrac, num_infrac, loteame_infrac, lote_infrac, quadra_infrac, inscmun_infrac, denunc_infrac, providencias, data_retorno;
    private String num_notif, data_notif, num_auto, data_auto, num_processo, num_denuncia,data_denuncia;
    private String lei, artigo, prazo, fiscais;
    private int id;

    public String getNumDenuncia() {
        return num_denuncia;
    }

    public void setNumDenuncia(String num1) {
        this.num_denuncia = num1;
    }

    public String getNumProcesso() {
        return num_processo;
    }

    public void setNumProcesso(String num2) {
        this.num_processo = num2;
    }

    public int getIdLancamento() {
        return id;
    }

    public void setIdLancamento(int i) {
        this.id = i;
    }

    //Efetua novo cadastro 
    public void cadastrarLancamento(
            String lei, 
            String artigo, 
            String prazo, 
            String fiscais, 
            String num_notif, 
            String data_notif, 
            String num_auto, 
            String data_auto, 
            String num_processo, 
            String num_denuncia, 
            String data_denuncia,
            String ender_infrac, 
            String num_infrac, 
            String loteame_infrac, 
            String lote_infrac, 
            String quadra_infrac, 
            String inscmun_infrac, 
            String denunc_infrac, 
            String nome_corresp, 
            String enderc_corresp, 
            String num_corresp, 
            String comple_corresp, 
            String bairro_corresp, 
            String cidade_corresp, 
            String estado_corresp, 
            String cep_corresp,
            String providencias,
            String data_retorno
            ) {
        
        
        String sql = "INSERT INTO lancamento_fiscais ("
                + "lei, "
                + "artigo, "
                + "prazo, "
                + "fiscais, "
                + "num_notif, "
                + "data_notif, "
                + "num_auto, "
                + "data_auto, "
                + "num_processo, "
                + "num_denuncia, "
                + "data_denuncia, "
                + "ender_infrac, "
                + "num_infrac, "
                + "loteame_infrac, "
                + "lote_infrac, "
                + "quadra_infrac, "
                + "inscmun_infrac, "
                + "denunc_infrac, "
                + "nome_corresp, "
                + "enderc_corresp, "
                + "num_corresp, "
                + "comple_corresp, "
                + "bairro_corresp, "
                + "cidade_corresp, "
                + "estado_corresp, "
                + "cep_corresp, "
                + "providencias, "
                + "data_retorno"
                + ") VALUES ("
                + "'" + lei + "',"
                + "'" + artigo + "',"
                + "'" + prazo + "',"
                + "'" + fiscais + "',"
                + "'" + num_notif + "',"
                + "'" + data_notif + "',"
                + "'" + num_auto + "',"
                + "'" + data_auto + "',"
                + "'" + num_processo + "',"
                + "'" + num_denuncia + "',"
                + "'" + data_denuncia + "',"
                + "'" + ender_infrac + "',"
                + "'" + num_infrac + "',"
                + "'" + loteame_infrac + "',"
                + "'" + lote_infrac + "',"
                + "'" + quadra_infrac + "',"
                + "'" + inscmun_infrac + "',"
                + "'" + denunc_infrac + "',"
                + "'" + nome_corresp + "',"
                + "'" + enderc_corresp + "',"
                + "'" + num_corresp + "',"
                + "'" + comple_corresp + "',"
                + "'" + bairro_corresp + "',"
                + "'" + cidade_corresp + "',"
                + "'" + estado_corresp + "',"
                + "'" + cep_corresp + "',"
                + "'" + providencias + "',"
                + "'" + data_retorno + "'"
                + ")";
        bd.updateBase(sql);
        
        if(!num_denuncia.equals("")){
            String sql2 = " UPDATE vistoria SET "         
                + "providencias = '" + providencias + "', "
                + "dt_retorno = '" + data_retorno + "'"
                + " WHERE num_denuncia ='" + num_denuncia + "'";
            bd.updateBase(sql2);
        }
                
        System.err.println(sql);
        JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
    }
    
   

    //atualização parcial dos registros de lançamento
    public void atualizarRegistrosParcial(
            String num_denuncia, 
            String num_processo, 
            String data_denuncia, 
            String providencias, 
            String data_retorno
            ) {
        String sql = " UPDATE lancamento_fiscais SET "
                + "num_denuncia ='" + num_denuncia + "', "
                + "num_processo ='" + num_processo + "', "
                + "data_denuncia ='" + data_denuncia + "', "
                + "providencias = '" + providencias + "', "
                + "data_retorno = '" + data_retorno + "'"
                + " WHERE id = '" + id + "'";
        bd.updateBase(sql);
        JOptionPane.showMessageDialog(null, "Atualização efetuada com sucesso!");

    }

    //atualização geral dos registros de lançamento
    public void atualizarRegistrosGeral(
            String lei, 
            String artigo, 
            String prazo, 
            String fiscais, 
            String num_notif, 
            String data_notif, 
            String num_auto, 
            String data_auto, 
            String num_processo, 
            String num_denuncia,
            String data_denuncia,
            String ender_infrac, 
            String num_infrac, 
            String loteame_infrac, 
            String lote_infrac, 
            String quadra_infrac, 
            String inscmun_infrac, 
            String denunc_infrac, 
            String nome_corresp, 
            String enderc_corresp, 
            String num_corresp, 
            String comple_corresp, 
            String bairro_corresp, 
            String cidade_corresp, 
            String estado_corresp, 
            String cep_corresp,
            String providencias, 
            String data_retorno
            ) {
        String sql = "UPDATE lancamento_fiscais SET "
                + "lei = '" + lei + "', "
                + "artigo = '" + artigo + "', "
                + "prazo = '" + prazo + "', "
                + "fiscais = '" + fiscais + "', "
                + "num_notif = '" + num_notif + "', "
                + "data_notif = '" + data_notif + "', "
                + "num_auto = '" + num_auto + "', "
                + "data_auto = '" + data_auto + "', "
                + "num_processo = '" + num_processo + "', "
                + "num_denuncia = '" + num_denuncia + "', "
                + "data_denuncia = '" + data_denuncia + "', "
                + "ender_infrac = '" + ender_infrac + "', "
                + "num_infrac = '" + num_infrac + "', "
                + "loteame_infrac = '" + loteame_infrac + "', "
                + "lote_infrac = '" + lote_infrac + "', "
                + "quadra_infrac = '" + quadra_infrac + "', "
                + "inscmun_infrac = '" + inscmun_infrac + "', "
                + "denunc_infrac = '" + denunc_infrac + "', "
                + "nome_corresp = '" + nome_corresp + "', "
                + "enderc_corresp = '" + enderc_corresp + "', "
                + "num_corresp = '" + num_corresp + "', "
                + "comple_corresp = '" + comple_corresp + "', "
                + "bairro_corresp = '" + bairro_corresp + "', "
                + "cidade_corresp = '" + cidade_corresp + "', "
                + "estado_corresp = '" + estado_corresp + "', "
                + "cep_corresp = '" + cep_corresp + "', "
                + "providencias = '" + providencias +"', "
                + "data_retorno = '" + data_retorno +"'"
                + " WHERE id = '" + id + "'";
              
        bd.updateBase(sql);
        
         if(!num_denuncia.equals("")){
            String sql2 = " UPDATE vistoria SET "         
                + "providencias = '" + providencias + "', "
                + "dt_retorno = '" + data_retorno + "'"
                + " WHERE num_denuncia ='" + num_denuncia + "'";
            bd.updateBase(sql2);
        }
        JOptionPane.showMessageDialog(null, "Atualização efetuada com sucesso!");
    }
    
    

    //exclui o registro
    public void excluirRegistrosLancamento() {
        String sql = "DELETE FROM lancamento_fiscais WHERE id = '" + id + "'";
        bd.updateBase(sql);
    }

    //===PESQUISA OS REGISTROS DA TBL LANÇAMENTO DE FISCAIS================================================================================
    //nome do denunciado
    public String pesquisaNomeCorresp(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT nome_corresp FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    nome_corresp = (resultado.getString("nome_corresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return nome_corresp;
    }

    //pesquisa inscrição  municipal
    public String pesquisaInscMunicipal(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT inscmun_infrac FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    inscmun_infrac = (resultado.getString("inscmun_infrac"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return inscmun_infrac;
    }

    //pesquisa endereço do denunciado
    public String pesquisaEnderecoCorresp(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT enderc_corresp FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    enderc_corresp = (resultado.getString("enderc_corresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return enderc_corresp;
    }
    
    //pesquisa endereço do denunciado
    public String pesquisaCompleCorresp(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT comple_corresp FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    comple_corresp = (resultado.getString("comple_corresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return comple_corresp;
    }
    
    //pesquisa endereço do denunciado
    public String pesquisaEnderecoInfrac(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT ender_infrac FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    ender_infrac = (resultado.getString("ender_infrac"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return ender_infrac;
    }

    //pesquisa número da residencia do denunciado
    public String pesquisaNumeroCorresp(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT num_corresp FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    num_corresp = (resultado.getString("num_corresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num_corresp;
    }
    
    //pesquisa número da residencia do denunciado
    public String pesquisaNumeroInfrac(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT num_infrac FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    num_infrac = (resultado.getString("num_infrac"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num_infrac;
    }


    //bairro do denunciado
    public String pesquisaBairroCorresp(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT bairro_corresp FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    bairro_corresp = (resultado.getString("bairro_corresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return bairro_corresp;
    }
    
    //bairro do denunciado
    public String pesquisaCidadeCorresp(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT cidade_corresp FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    cidade_corresp = (resultado.getString("cidade_corresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return cidade_corresp;
    }
    
    //bairro do denunciado
    public String pesquisaEstadoCorresp(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT estado_corresp FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    estado_corresp = (resultado.getString("estado_corresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return estado_corresp;
    }

    //bairro do denunciado
    public String pesquisaCEPCorresp(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT cep_corresp FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    cep_corresp = (resultado.getString("cep_corresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return cep_corresp;
    }
    
    //loteamento denunciado
    public String pesquisaLoteamentoInfrac(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT loteame_infrac FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    loteame_infrac = (resultado.getString("loteame_infrac"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return loteame_infrac;
    }

    //lote denunciado
    public String pesquisaLoteInfrac(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT lote_infrac FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    lote_infrac = (resultado.getString("lote_infrac"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return lote_infrac;
    }

    //quadra denunciado
    public String pesquisaQuadraInfrac(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT quadra_infrac FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    quadra_infrac = (resultado.getString("quadra_infrac"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return quadra_infrac;
    }

    

    //descrição da denúncia
    public String pesquisaDescricaoInfrac(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT denunc_infrac FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    denunc_infrac = (resultado.getString("denunc_infrac"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return denunc_infrac;
    }

    //==========================================================
    //nome do fiscal
    public String pesquisaNomeFiscal(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT fiscais FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    fiscais = (resultado.getString("fiscais"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return fiscais;
    }

    //lei
    public String pesquisaLei(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT lei FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    lei = (resultado.getString("lei"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return lei;
    }

    //artigo    
    public String pesquisaArtigo(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT artigo FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    artigo = (resultado.getString("artigo"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return artigo;
    }

    //prazo da notificação
    public String pesquisaPrazoNotificacao(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT prazo FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    prazo = (resultado.getString("prazo"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return prazo;
    }

    //número da notificação
    public String pesquisaNumNotificacao(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT num_notif FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    num_notif = (resultado.getString("num_notif"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num_notif;
    }

    //data da notificação
    public String pesquisaDataNotificacao(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT data_notif FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    data_notif = (resultado.getString("data_notif"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return data_notif;
    }

    //número auto infração
    public String pesquisaAutoInfracao(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT num_auto FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    num_auto = (resultado.getString("num_auto"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num_auto;
    }

    //data auto de infração
    public String pesquisaDataInfracao(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT data_auto FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    data_auto = (resultado.getString("data_auto"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return data_auto;
    }

    //providências
    public String pesquisaProvidencias(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT providencias FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    providencias = (resultado.getString("providencias"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return providencias;
    }
    
    //providências
    public String pesquisaDataRetorno(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT data_retorno FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    data_retorno = (resultado.getString("data_retorno"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return data_retorno;
    }

    //número de denuncia
    public String pesquisaNumDenuncia(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT num_denuncia FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    num_denuncia = (resultado.getString("num_denuncia"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num_denuncia;
    }

    //data da denuncia
    public String pesquisaDataDenuncia(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT data_denuncia FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    data_denuncia = (resultado.getString("data_denuncia"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return data_denuncia;
    }

    //número de denuncia
    public String pesquisaNumProcesso(int id) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT num_processo FROM lancamento_fiscais WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    num_processo = (resultado.getString("num_processo"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num_processo;
    }

}
