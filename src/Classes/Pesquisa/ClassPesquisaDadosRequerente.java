package Classes.Pesquisa;

import Util.AcessoBD;
import java.sql.ResultSet;

public class ClassPesquisaDadosRequerente {

    AcessoBD bd;
    private int id, nump;
    private int id_p, id_c;
    private String req, ass, end, bairro, lote, lotea, qua, ident, data_entrada,ano;
    //comunique
    private String comunique, logradouro, num, bairro2, cidade, cep, uf, data;
    //habita
    private String complemento_habite, constru_habite, num_habite, ano_habite, num_aprovh, dt_exp, area_habite,area_aprovhabite, obs_habite,finalidadeHabite;
    //alvará
    private String nome1, creasp1, insc1, nome2, creasp2, insc2, construcao, complemento, ano_alvconstrucao, num_alvconstrucao, area_alvara, situacao, data_alvara;
    //Andamento
    private String dt_entrada_and, dt_saida_and, dt_arquivado, andamento, expedicao;
    //fiscal
    private int idf;
    private int idfiscal;
    

    public ClassPesquisaDadosRequerente() {
        bd = new AcessoBD();
    }

    public int getID() {
        return id;
    }

    public void setID(int i) {
        id = i;
    }

    public void setIdFiscal(int i) {
        idf = i;
    }

    public int getIdfiscal() {
        return idf;
    }

    public int getIdControle() {
        return id;
    }

    public void setIdControle(int c) {
        this.id_c = c;
    }

    public int pesquisaIdControle() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT MAX(id) AS maximo FROM numeracao");
            if (resultado != null && resultado.next()) {
                do {
                    id_c = (resultado.getInt("maximo"));
                    id_c = id_c + 1;
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return id_c;
    }

    public int pesquisaIdFiscal() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT id FROM fiscal WHERE id = '" + idf + "'");
            if (resultado != null && resultado.next()) {
                do {
                    idfiscal = (resultado.getInt("id"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return idfiscal;
    }

    public int pesquisaCodProcesso() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT codprocesso FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    id_p = (resultado.getInt("codprocesso"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return id_p;
    }
    
    public int pesquisaCodAndamento() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT codprocesso FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    id_p = (resultado.getInt("codprocesso"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return id_p;
    }
    
    

    public String pesquisaRequerente() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT requerente FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    req = (resultado.getString("requerente"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return req;

    }

    public String pesquisaDataEntrada() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT dataentrada FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    data_entrada = (resultado.getString("dataentrada"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return data_entrada;

    }
    
    public String pesquisaAnoProcesso() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT anoprocesso FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    ano = (resultado.getString("anoprocesso"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return ano;

    }

   public String pesquisaAssunto() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT assunto FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    ass = (resultado.getString("assunto"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return ass;

    }

    public String pesquisaEndereco() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT endereco FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    end = (resultado.getString("endereco"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return end;
    }

    public String pesquisaBairro() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT bairro FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    bairro = (resultado.getString("bairro"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return bairro;

    }

    public String pesquisaLote() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT lote FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    lote = (resultado.getString("lote"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return lote;
    }

    public String pesquisaLoteamento() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT loteamento FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    lotea = (resultado.getString("loteamento"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return lotea;
    }

    public String pesquisaQuadra() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT quadra FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    qua = (resultado.getString("quadra"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return qua;
    }

    public String pesquisaIdentificacao() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT identificacaocadastral FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    ident = (resultado.getString("identificacaocadastral"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return ident;
    }

    public int pesquisanumProcesso() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT numprocesso FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    nump = (resultado.getInt("numprocesso"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return nump;
    }

    //DADOS COMUNIQUE-SE
    public String pesquisaComunique() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT comunique FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    comunique = (resultado.getString("comunique"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return comunique;
    }

    public String pesquisaLogradouro() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT logradouro_coresp FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    logradouro = (resultado.getString("logradouro_coresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return logradouro;
    }

    public String pesquisaBairroComunique() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT bairro_coresp FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    bairro2 = (resultado.getString("bairro_coresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return bairro2;
    }

    public String pesquisaNumComunique() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT n_coresp FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    num = (resultado.getString("n_coresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num;
    }

    public String pesquisaCidadeComunique() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT cidade_coresp FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    cidade = (resultado.getString("cidade_coresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return cidade;
    }

    public String pesquisaCepComunique() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT cep_coresp FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    cep = (resultado.getString("cep_coresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return cep;
    }

    public String pesquisaEstadoComunique() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT estado_coresp FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    uf = (resultado.getString("estado_coresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return uf;
    }

    public String pesquisaDataComunique() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT data_coresp FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    data = (resultado.getString("data_coresp"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return data;
    }

    //HABITE - SE
    public String pesquisaComplementoHabite() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT complementohabite FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    complemento_habite = (resultado.getString("complementohabite"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return complemento_habite;
    }
    
    public String pesquisaConstruHabite() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT construHabite FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    constru_habite = (resultado.getString("construHabite"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return constru_habite;
    }

    public String pesquisaNumHabite() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT numhabhabite FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    num_habite = (resultado.getString("numhabhabite"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num_habite;
    }
    
    public String pesquisaAnoHabite() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT anohabite FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    ano_habite = (resultado.getString("anohabite"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return ano_habite;
    }

    public String pesquisaNumAprovacaoHabite() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT numprocaprovacaohabite FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    num_aprovh = (resultado.getString("numprocaprovacaohabite"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num_aprovh;
    }

    public String pesquisaDataHabite() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT dataexpedicaohabite FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    dt_exp = (resultado.getString("dataexpedicaohabite"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return dt_exp;
    }
    
    public String pesquisaFinalidadeHabite() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT finalidadeHabite FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    finalidadeHabite = (resultado.getString("finalidadeHabite"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return finalidadeHabite;
    }

    public String pesquisaAreaHabite() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT areahabite FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    area_habite = (resultado.getString("areahabite"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return area_habite;
    }
    
    public String pesquisaAreaAprovHabite() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT area_aprovHabite FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    area_aprovhabite = (resultado.getString("area_aprovHabite"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return area_aprovhabite;
    }

    public String pesquisaObservacaoHabite() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT observacaohabite FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    obs_habite = (resultado.getString("observacaohabite"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return obs_habite;
    }

    //Alvarás
    public String pesquisaNomeProfissionalAutor() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT autordoprojeto FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    nome1 = (resultado.getString("autordoprojeto"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return nome1;
    }

    public String pesquisaCreaspAutor() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT creaspautorprojeto FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    creasp1 = (resultado.getString("creaspautorprojeto"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return creasp1;
    }

    public String pesquisaInscMunicipalAutor() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT inscrmunicipalautorprojeto FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    insc1 = (resultado.getString("inscrmunicipalautorprojeto"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return insc1;
    }

    public String pesquisaNomeProfissionalTecnico() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT responsaveltecnico FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    nome2 = (resultado.getString("responsaveltecnico"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return nome2;
    }

    public String pesquisaCreaspTecnico() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT creaspresptecnico FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    creasp2 = (resultado.getString("creaspresptecnico"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return creasp2;
    }

    public String pesquisaInscMunicipalTecnico() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT inscrmunicipalresptecnico FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    insc2 = (resultado.getString("inscrmunicipalresptecnico"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return insc2;
    }

    public String pesquisaConstrucaoAlvara() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT tipodeconstrucao FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    construcao = (resultado.getString("tipodeconstrucao"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return construcao;
    }

    public String pesquisaComplementoAlvara() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT complementoconstrucao FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    complemento = (resultado.getString("complementoconstrucao"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return complemento;
    }
    
   

    public String  pesquisaAnoAlvaraConstrucao() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT anoalvaraconstrucao FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    ano_alvconstrucao = (resultado.getString("anoalvaraconstrucao"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return ano_alvconstrucao;
    }

    public String pesquisaNumAlvaraConstrucao() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT numalvaraconstrucao FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    num_alvconstrucao = (resultado.getString("numalvaraconstrucao"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num_alvconstrucao;
    }

    public String pesquisaAreaAlvara() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT area_alvconstrucao FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    area_alvara = (resultado.getString("area_alvconstrucao"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return area_alvara;
    }

    public String pesquisaDataAlvaraConstrucao() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT data_alvconstrucao FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    data_alvara = (resultado.getString("data_alvconstrucao"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return data_alvara;
    }

    public String pesquisaSituacao() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT situacao_alv FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    situacao = (resultado.getString("situacao_alv"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return situacao;
    }

    //andamento
    public String pesquisaDtEntradaAndamento() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT entrada FROM andamentos WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    dt_entrada_and = (resultado.getString("entrada"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return dt_entrada_and;
    }

    public String pesquisaDtSaidaAndamento() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT saida FROM andamentos WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    dt_saida_and = (resultado.getString("saida"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return dt_saida_and;
    }

    public String pesquisaDtArquivadoAndamento() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT arquivado FROM andamentos WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    dt_arquivado = (resultado.getString("arquivado"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return dt_arquivado;
    }

    public String pesquisaAndamento() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT andamentos FROM andamentos WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    andamento = (resultado.getString("andamentos"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return andamento;
    }

    public String pesquisaExpedicaoAndamento() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT expedicoes FROM andamentos WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    expedicao = (resultado.getString("expedicoes"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return expedicao;
    }

    public int pesquisaCodigoProcessos(int num, String ano) {
        int cod = 0;
        try {
            ResultSet resultado = bd.consultaTable("SELECT codprocesso FROM processo WHERE numprocesso = '" + num + "' and anoprocesso = '" + ano + "'");
            if (resultado != null && resultado.next()) {
                do {
                    cod = (resultado.getInt("codprocesso"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return cod;
    }
    
    public  boolean verificaCodigoProcessos(int num, int num2) {
        int cod = 0;
        try {
            ResultSet resultado = bd.consultaTable("SELECT codprocesso FROM processo WHERE numprocesso = '" + num + "'"
                    + " and anoprocesso = '"+num2+"'");
            if (resultado != null && resultado.next()) {
                do {
                    cod = 1;
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        if(cod==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    //--
      public int pesquisaProcesso(int num) {
          int pro = 0;
        try {
            ResultSet resultado = bd.consultaTable("SELECT numprocesso FROM processo WHERE numprocesso = '" + num + "'");
            if (resultado != null && resultado.next()) {
                do {
                    pro = (resultado.getInt("numprocesso"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return pro;
    }
      
     public  int verificaNumeracao() {
          int res =0;
        try {
            ResultSet resultado = bd.consultaTable("SELECT numeracao FROM numeracao where codprocesso = '"+id+"'");
            if (resultado != null && resultado.next()) {
                do {
                    res = (resultado.getInt("numeracao"));
                    
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return res;
    }
    
     public  String pesquisaArtAutor() {
          String art1 = "";
        try {
            ResultSet resultado = bd.consultaTable("SELECT artautorprojeto FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    art1 = (resultado.getString("artautorprojeto"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return art1;
    }
     
     public String pesquisaArtTecnico() {
         String art2 = "";
        try {
            ResultSet resultado = bd.consultaTable("SELECT artresptecnico FROM processo WHERE codprocesso = '" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    art2 = (resultado.getString("artresptecnico"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return art2;
    }
    
    
}
