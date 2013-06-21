/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Pesquisa;

import Util.AcessoBD;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jenny
 */
public class ClassPesquisaVistoria {

    AcessoBD bd = new AcessoBD();
    private int id;
    private String num_denuncia;
    private String dt_denuncia, fiscal, atendente, atendimento, assunto, detalhes, providencias, dt_retorno;
    private String denunciante, endereco1, num1, bairro1, quadra1, lote1, loteamento1, inscrMunicipal1, telefone;
    private String denunciado, endereco2, num2, bairro2, quadra2, lote2,loteamento2, inscrMunicipal2, referencia, denuncia,complemento;

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void pesquisaIdVistoria() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT MAX(id) AS maximo FROM vistoria");
            if (resultado != null && resultado.next()) {
                do {
                    id = (resultado.getInt("maximo"));
                    id = id + 1;
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
    }
    
    
    public int pesquisaIdVistoria2(String num) {
        try {
            ResultSet resultado = bd.consultaTable("SELECT id AS id FROM vistoria where num_denuncia = '" + num + "'");
            if (resultado != null && resultado.next()) {
                do {
                    id = (resultado.getInt("id"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return id;
    }
    
    public String pesquisaNum_Denuncia() {
        try {
            ResultSet controle = bd.consultaTable("SELECT SUBSTRING(num_denuncia, 8 , 10) as ctr FROM vistoria WHERE id = (SELECT MAX(id) FROM vistoria)");
            String ctrl = "";
            if (controle != null && controle.next()) {
                do {
                    ctrl = controle.getString("ctr");
                } while (controle.next());
            }
            ResultSet resultado = bd.consultaTable("SELECT (SELECT CONCAT((SELECT SUBSTRING((SELECT SUBSTRING(num_denuncia, 1 , 6) as max "
                    + "FROM vistoria WHERE id = (SELECT MAX(id) FROM vistoria)),1,2) AS part_a),(SELECT "
                    + "SUBSTRING((SELECT SUBSTRING(num_denuncia, 1 , 6) as max FROM vistoria WHERE id = "
                    + "(SELECT MAX(id) FROM vistoria)),4,3) AS part_b)) ) AS num");
            
            if (resultado != null && resultado.next()) {
                do {
                    int num = Integer.parseInt(resultado.getString("num"));
                    
                    Date num_date = new Date();
                    SimpleDateFormat dateNow = new SimpleDateFormat("yy");
                    String ctrl2 = String.valueOf(dateNow.format(num_date));
                    System.err.println("controle="+ctrl+" atual="+ctrl2);
                    num = num + 1;
                    if (ctrl.equals(ctrl2)) {
                        
                     
                        if (num < 10) {
                            String part1 = String.valueOf(num);
                            String part2 = "00.00" + part1;
                            num_denuncia = part2 + "/" + dateNow.format(num_date);

                        } else {
                            if (num < 100) {
                                String part1 = String.valueOf(num);
                                String part2 = "00.0" + part1;
                                num_denuncia = part2 + "/" + dateNow.format(num_date);
                            } else {
                                if (num < 1000) {
                                    String part1 = String.valueOf(num);
                                    String part2 = "00." + part1;
                                    num_denuncia = part2 + "/" + dateNow.format(num_date);
                                } else {
                                    if (num < 10000) //
                                    {
                                        String part1 = String.valueOf(num);
                                        String part2 = "0" + part1;
                                        String part3 = part2.substring(0, 2);
                                        String part4 = part2.substring(2, 5);
                                        num_denuncia = part3 + "." + part4 + "/" + dateNow.format(num_date);
                                    } else {
                                        String part1 = String.valueOf(num);
                                        String part2 = part1.substring(0, 2);
                                        String part3 = part1.substring(2, 5);
                                        num_denuncia = part2 + "." + part3 + "/" + dateNow.format(num_date);
                                    }
                                }
                            }
                        }


                    } else {
                        num_denuncia = "00.001/" + dateNow.format(num_date);
                    }
                    
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num_denuncia;
    }

    //dados principais
    public String pesquisaDataDenuncia() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT dt_denuncia FROM vistoria WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    dt_denuncia = (resultado.getString("dt_denuncia"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return dt_denuncia;
    }

    public String pesquisaAtendente() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT atendente FROM vistoria WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    atendente = (resultado.getString("atendente"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return atendente;
    }

    public String pesquisaAtendimento() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT atendimento FROM vistoria WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    atendimento = (resultado.getString("atendimento"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return atendimento;
    }

    public String pesquisaFiscal() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT fiscal FROM vistoria WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    fiscal = (resultado.getString("fiscal"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return fiscal;
    }

    public String pesquisaAssunto() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT assunto FROM vistoria WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    assunto = (resultado.getString("assunto"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return assunto;
    }

    public String pesquisaDetalhes() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT detalhes FROM vistoria WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    detalhes = (resultado.getString("detalhes"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return detalhes;
    }

    public String pesquisaDataRetorno() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT dt_retorno FROM vistoria WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    dt_retorno = (resultado.getString("dt_retorno"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return dt_retorno;
    }

    //dados denunciante
    public String pesquisaDenunciante() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT a.nome FROM denunciante AS a WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    denunciante = (resultado.getString("a.nome"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return denunciante;
    }

    public String pesquisaDenuncianteEndereco() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT a.endereco FROM denunciante AS a WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    endereco1 = (resultado.getString("a.endereco"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return endereco1;
    }

    public String pesquisaDenuncianteComplemento() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT complemento FROM denunciante WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    complemento = (resultado.getString("complemento"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return complemento;
    }
    
    public String pesquisaDenuncianteBairro() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT a.bairro FROM denunciante AS a WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    bairro1 = (resultado.getString("a.bairro"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return bairro1;
    }

    public String pesquisaDenuncianteNum() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT a.num FROM denunciante AS a WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    num1 = (resultado.getString("a.num"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num1;
    }

    public String pesquisaDenuncianteQuadra() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT a.quadra FROM denunciante AS a WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    quadra1 = (resultado.getString("a.quadra"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return quadra1;
    }

    public String pesquisaDenuncianteLote() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT a.lote FROM denunciante AS a WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    lote1 = (resultado.getString("a.lote"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return lote1;
    }

    public String pesquisaDenuncianteLoteamento() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT a.loteamento FROM denunciante AS a WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    loteamento1 = (resultado.getString("a.loteamento"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return loteamento1;
    }

    public String pesquisaDenuncianteInscrMunicipal() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT a.insc_municipal FROM denunciante AS a WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    inscrMunicipal1 = (resultado.getString("a.insc_municipal"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return inscrMunicipal1;
    }

    public String pesquisaDenuncianteTelefone() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT a.telefone FROM denunciante AS a WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    telefone = (resultado.getString("a.telefone"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return telefone;
    }

    //dados denunciado
    public String pesquisaDenunciado() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT nome_denunciado FROM denunciado WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    denunciado = (resultado.getString("nome_denunciado"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return denunciado;
    }

    public String pesquisaDenunciadoEndereco() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT endereco_denunciado FROM denunciado WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    endereco2 = (resultado.getString("endereco_denunciado"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return endereco2;
    }
    
    
    

    public String pesquisaDenunciadoBairro() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT bairro_denunciado FROM denunciado WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    bairro2 = (resultado.getString("bairro_denunciado"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return bairro2;
    }

    public String pesquisaDenunciadoNum() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT num_denunciado FROM denunciado WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    num2 = (resultado.getString("num_denunciado"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num2;
    }

    public String pesquisaDenunciadoQuadra() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT quadra_denunciado FROM denunciado WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    quadra2 = (resultado.getString("quadra_denunciado"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return quadra2;
    }

    public String pesquisaDenunciadoLote() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT lote_denunciado FROM denunciado WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    lote2 = (resultado.getString("lote_denunciado"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return lote2;
    }
    
    public String pesquisaDenunciadoLoteamento() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT loteamento_denunciado FROM denunciado WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    loteamento2 = (resultado.getString("loteamento_denunciado"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return loteamento2;
    }

    public String pesquisaDenunciadoInscrMunicipal() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT insc_municipal_denunciado FROM denunciado WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    inscrMunicipal2 = (resultado.getString("insc_municipal_denunciado"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return inscrMunicipal2;
    }

    public String pesquisaDenunciadoReferencia() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT referencia FROM denunciado WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    referencia = (resultado.getString("referencia"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return referencia;
    }

    public String pesquisaDenunciadoDescricao() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT descricao FROM denunciado WHERE vistoria_id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    denuncia = (resultado.getString("descricao"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return denuncia;
    }
    //providencias

    public String pesquisaProvidencias() {
        try {
            ResultSet resultado = bd.consultaTable("SELECT providencias FROM vistoria WHERE id ='" + id + "'");
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

    //numero denuncia
    public String pesquisaNumDenuncia() {
        String num = "";
        try {
            ResultSet resultado = bd.consultaTable("SELECT num_denuncia FROM vistoria WHERE id ='" + id + "'");
            if (resultado != null && resultado.next()) {
                do {
                    num = (resultado.getString("num_denuncia"));
                } while (resultado.next());
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return num;
    }
}
