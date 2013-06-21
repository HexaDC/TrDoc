/*
 * Created on 13/01/2011, 10:37:33
 */
package Forms;

import Classes.Pesquisa.ClassPesquisaDadosRequerente;
import Classes.Pesquisa.ClassSelecionarId;
import Util.AcessoBD;
import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class FormVisualizarRegistros extends javax.swing.JFrame {
    
    ClassPesquisaDadosRequerente pes = new ClassPesquisaDadosRequerente();
    ClassSelecionarId sel;
    public String proPes;
    public boolean[] acesso_bkp;
    private int largura = 710;
    private int altura = 660;

    public FormVisualizarRegistros() {
        initComponents();
        sel = new ClassSelecionarId();

        /////////////////////// Formato - Localização - Ícone ///////////////////
        try {

            URL url_th = this.getClass().getResource("/Util/trdoc.theme");
            NimRODTheme nt = new NimRODTheme(url_th);
            NimRODLookAndFeel nf = new NimRODLookAndFeel();
            nf.setCurrentTheme(nt);
            UIManager.setLookAndFeel(nf);

            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Get the size of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        this.setSize(largura, altura);
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        // Move the window
        this.setLocation(x, y);
        this.setBounds(x, y, w, h);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);


        URL url = this.getClass().getResource("/Icons/vistoria.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        ////////////////////////////////////////////////////////////////////////////


        //Bloqueia os campos tag Processo
        txtProcesso.setEditable(false);
        txtData.setEditable(false);
        txtRequerente.setEditable(false);
        txtAssunto.setEditable(false);
        txtEndereco.setEditable(false);
        txtBairro.setEditable(false);
        txtLoteamento.setEditable(false);
        txtLote.setEditable(false);
        txtQuadra.setEditable(false);
        txtLote.setEditable(false);
        txtIdentCadastral.setEditable(false);
        //tag Comunique
        txtComunique.setEditable(false);
        txtLogradouro.setEditable(false);
        txtNum.setEditable(false);
        txtBairroComunique.setEditable(false);
        txtCidade.setEditable(false);
        txtUf.setEditable(false);
        txtCep.setEditable(false);
        txtDataComunique.setEditable(false);
        //tag Habite
        txtComplemento.setEditable(false);
        txtAreaHabite.setEditable(false);
        txtAreaAprovada.setEditable(false);
        txtNumAprovacao.setEditable(false);
        txtNumHabite.setEditable(false);
        txtDataHabite.setEditable(false);
        txtObservacao.setEditable(false);
        //tag Alvara
        txtProfissional1.setEditable(false);
        txtCreasp1.setEditable(false);
        txtInscMunicipal1.setEditable(false);
        txtProfissional2.setEditable(false);
        txtCreasp2.setEditable(false);
        txtInscMunicipal2.setEditable(false);
        txtConstrucaoAlvara.setEditable(false);
        txtComplementoAlvara.setEditable(false);
        txtAnoAlvConstrucao.setEditable(false);
        txtAlvConstrucao.setEditable(false);
        txtAreaAlv.setEditable(false);
        txtSituacao.setEditable(false);
        txtDataAlvara.setEditable(false);

    }

    FormVisualizarRegistros(FormMenu aThis, boolean b) {
        initComponents();

        sel = new ClassSelecionarId();

         /////////////////////// Formato - Localização - Ícone ///////////////////
        try {

            URL url_th = this.getClass().getResource("/Util/trdoc.theme");
            NimRODTheme nt = new NimRODTheme(url_th);
            NimRODLookAndFeel nf = new NimRODLookAndFeel();
            nf.setCurrentTheme(nt);
            UIManager.setLookAndFeel(nf);

            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Get the size of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        this.setSize(largura, altura);
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        // Move the window
        this.setLocation(x, y);
        this.setBounds(x, y, w, h);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);


        URL url = this.getClass().getResource("/Icons/vistoria.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        ////////////////////////////////////////////////////////////////////////////


        //Bloqueia os campos tag Processo
        txtProcesso.setEditable(false);
        txtData.setEditable(false);
        txtRequerente.setEditable(false);
        txtAssunto.setEditable(false);
        txtEndereco.setEditable(false);
        txtBairro.setEditable(false);
        txtLoteamento.setEditable(false);
        txtLote.setEditable(false);
        txtQuadra.setEditable(false);
        txtLote.setEditable(false);
        txtIdentCadastral.setEditable(false);
        //tag Comunique
        txtComunique.setEditable(false);
        txtLogradouro.setEditable(false);
        txtNum.setEditable(false);
        txtBairroComunique.setEditable(false);
        txtCidade.setEditable(false);
        txtUf.setEditable(false);
        txtCep.setEditable(false);
        txtDataComunique.setEditable(false);
        //tag Habite
        txtComplemento.setEditable(false);
        txtAreaHabite.setEditable(false);
        txtAreaAprovada.setEditable(false);
        txtNumAprovacao.setEditable(false);
        txtNumHabite.setEditable(false);
        txtDataHabite.setEditable(false);
        txtObservacao.setEditable(false);
        //tag Alvara
        txtProfissional1.setEditable(false);
        txtCreasp1.setEditable(false);
        txtInscMunicipal1.setEditable(false);
        txtProfissional2.setEditable(false);
        txtCreasp2.setEditable(false);
        txtInscMunicipal2.setEditable(false);
        txtConstrucaoAlvara.setEditable(false);
        txtComplementoAlvara.setEditable(false);
        txtAnoAlvConstrucao.setEditable(false);
        txtAlvConstrucao.setEditable(false);
        txtAreaAlv.setEditable(false);
        txtSituacao.setEditable(false);
        txtDataAlvara.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtListar = new javax.swing.JTextField();
        cbxPesquisa = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        txtData = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtLoteamento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQuadra = new javax.swing.JTextField();
        txtIdentCadastral = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProcesso = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRequerente = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAssunto = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAndamento = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        txtCreasp2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtProfissional2 = new javax.swing.JTextField();
        txtInscMunicipal2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtCreasp1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtInscMunicipal1 = new javax.swing.JTextField();
        txtProfissional1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtAnoAlvConstrucao = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtAlvConstrucao = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtAreaAlv = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtDataAlvara = new javax.swing.JTextField();
        txtConstrucaoAlvara = new javax.swing.JTextField();
        txtSituacao = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtComplementoAlvara = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtAreaHabite = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtAreaAprovada = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtNumAprovacao = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtNumHabite = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtDataHabite = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComplemento = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        txtAnoHabite = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtBairroComunique = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtDataComunique = new javax.swing.JTextField();
        txtUf = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComunique = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        btnListar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblProcesso = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TRDoc - Tramitação de Documentos");
        setResizable(false);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        txtListar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListarKeyPressed(evt);
            }
        });
        getContentPane().add(txtListar);
        txtListar.setBounds(150, 40, 440, 30);

        cbxPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nº Processo", "Requerente", "Assunto", "Endereço", "Ident. Cadastral", "Profissional", "Insc. Municipal" }));
        getContentPane().add(cbxPesquisa);
        cbxPesquisa.setBounds(10, 40, 128, 30);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel1.setText("Visualização de registro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 137, 16);

        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(10, 620, 90, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 33, 685, 10);

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jPanel1.setLayout(null);

        jTabbedPane3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jPanel7.setLayout(null);
        jPanel7.add(txtData);
        txtData.setBounds(190, 20, 100, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel7.setText("Data de Entrada");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(190, 0, 100, 20);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel4.setText("Assunto");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(10, 100, 47, 20);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("Endereço");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(10, 170, 60, 20);
        jPanel7.add(txtEndereco);
        txtEndereco.setBounds(10, 190, 630, 30);
        jPanel7.add(txtBairro);
        txtBairro.setBounds(10, 240, 380, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel6.setText("Bairro");
        jPanel7.add(jLabel6);
        jLabel6.setBounds(10, 220, 50, 20);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel8.setText("Loteamento");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(10, 270, 80, 20);
        jPanel7.add(txtLoteamento);
        txtLoteamento.setBounds(10, 290, 120, 30);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel9.setText("Lote");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(260, 270, 50, 20);
        jPanel7.add(txtLote);
        txtLote.setBounds(260, 290, 70, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel10.setText("Quadra");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(140, 270, 50, 20);
        jPanel7.add(txtQuadra);
        txtQuadra.setBounds(140, 290, 110, 30);
        jPanel7.add(txtIdentCadastral);
        txtIdentCadastral.setBounds(410, 240, 230, 30);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel11.setText("Identificação Cadastral");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(410, 220, 150, 20);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("Nº Processo");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(10, 0, 80, 20);

        txtProcesso.setEditable(false);
        jPanel7.add(txtProcesso);
        txtProcesso.setBounds(10, 20, 92, 30);

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel20.setText("Ano");
        jPanel7.add(jLabel20);
        jLabel20.setBounds(130, 0, 40, 20);

        txtAno.setEditable(false);
        jPanel7.add(txtAno);
        txtAno.setBounds(130, 20, 40, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel3.setText("Requerente");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(10, 50, 66, 20);
        jPanel7.add(txtRequerente);
        txtRequerente.setBounds(10, 70, 630, 30);

        txtAssunto.setColumns(20);
        txtAssunto.setRows(5);
        jScrollPane1.setViewportView(txtAssunto);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9);
        jPanel9.setBounds(10, 120, 630, 50);

        jTabbedPane3.addTab("Processo", jPanel7);

        jPanel8.setLayout(null);

        tblAndamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Entrada", "Andamento", "Saída", "Arquivado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tblAndamento);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel10);
        jPanel10.setBounds(10, 10, 630, 310);

        jTabbedPane3.addTab("Andamento", jPanel8);

        jPanel1.add(jTabbedPane3);
        jTabbedPane3.setBounds(12, 13, 660, 360);

        jTabbedPane1.addTab("Principal", jPanel1);

        jPanel4.setLayout(null);

        jTabbedPane2.setFont(new java.awt.Font("SansSerif", 1, 12));

        jPanel6.setLayout(null);
        jPanel6.add(txtCreasp2);
        txtCreasp2.setBounds(10, 70, 340, 30);

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel31.setText("Inscrição Municipal");
        jPanel6.add(jLabel31);
        jLabel31.setBounds(370, 50, 120, 20);

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel32.setText("Creasp");
        jPanel6.add(jLabel32);
        jLabel32.setBounds(10, 50, 70, 20);

        jLabel33.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel33.setText("Nome do Responsável Técnico");
        jPanel6.add(jLabel33);
        jLabel33.setBounds(10, 0, 180, 20);
        jPanel6.add(txtProfissional2);
        txtProfissional2.setBounds(10, 20, 630, 30);
        jPanel6.add(txtInscMunicipal2);
        txtInscMunicipal2.setBounds(370, 70, 270, 30);

        jTabbedPane2.addTab("Responsável Técnico", jPanel6);

        jPanel5.setLayout(null);

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel28.setText("Nome do Autor do Projeto");
        jPanel5.add(jLabel28);
        jLabel28.setBounds(10, 0, 160, 20);

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel29.setText("Creasp");
        jPanel5.add(jLabel29);
        jLabel29.setBounds(10, 50, 50, 20);
        jPanel5.add(txtCreasp1);
        txtCreasp1.setBounds(10, 70, 340, 30);

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel30.setText("Inscrição Municipal");
        jPanel5.add(jLabel30);
        jLabel30.setBounds(370, 50, 150, 20);
        jPanel5.add(txtInscMunicipal1);
        txtInscMunicipal1.setBounds(370, 70, 270, 30);
        jPanel5.add(txtProfissional1);
        txtProfissional1.setBounds(10, 20, 630, 30);

        jTabbedPane2.addTab("Autor do Projeto", jPanel5);

        jPanel4.add(jTabbedPane2);
        jTabbedPane2.setBounds(12, 12, 660, 140);

        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel34.setText("Tipo de Construção");
        jPanel4.add(jLabel34);
        jLabel34.setBounds(10, 160, 130, 20);

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel35.setText("Complemento");
        jPanel4.add(jLabel35);
        jLabel35.setBounds(10, 210, 100, 20);

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel36.setText("Ano");
        jPanel4.add(jLabel36);
        jLabel36.setBounds(170, 320, 50, 20);
        jPanel4.add(txtAnoAlvConstrucao);
        txtAnoAlvConstrucao.setBounds(170, 340, 40, 30);

        jLabel37.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel37.setText("Nº Alv. Construção");
        jPanel4.add(jLabel37);
        jLabel37.setBounds(10, 320, 120, 20);

        txtAlvConstrucao.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(txtAlvConstrucao);
        txtAlvConstrucao.setBounds(10, 340, 150, 30);

        jLabel38.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel38.setText("Área ( m² )");
        jPanel4.add(jLabel38);
        jLabel38.setBounds(350, 320, 70, 20);
        jPanel4.add(txtAreaAlv);
        txtAreaAlv.setBounds(350, 340, 100, 30);

        jLabel39.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel39.setText("Situação");
        jPanel4.add(jLabel39);
        jLabel39.setBounds(470, 320, 90, 20);

        jLabel40.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel40.setText("Data de Expedição");
        jPanel4.add(jLabel40);
        jLabel40.setBounds(500, 160, 110, 20);
        jPanel4.add(txtDataAlvara);
        txtDataAlvara.setBounds(500, 180, 170, 30);
        jPanel4.add(txtConstrucaoAlvara);
        txtConstrucaoAlvara.setBounds(10, 180, 470, 30);
        jPanel4.add(txtSituacao);
        txtSituacao.setBounds(470, 340, 200, 30);

        txtComplementoAlvara.setColumns(20);
        txtComplementoAlvara.setRows(5);
        jScrollPane5.setViewportView(txtComplementoAlvara);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel13);
        jPanel13.setBounds(10, 230, 660, 80);

        jTabbedPane1.addTab("Alvarás", jPanel4);

        jPanel3.setLayout(null);

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel21.setText("Complemento");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(10, 10, 79, 20);

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel22.setText("Área Habite-se");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(10, 130, 100, 20);
        jPanel3.add(txtAreaHabite);
        txtAreaHabite.setBounds(10, 150, 140, 30);

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel23.setText("Área Aprovada");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(240, 130, 100, 20);
        jPanel3.add(txtAreaAprovada);
        txtAreaAprovada.setBounds(240, 150, 120, 30);

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel24.setText("Nº de Aprovação");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(240, 180, 100, 20);
        jPanel3.add(txtNumAprovacao);
        txtNumAprovacao.setBounds(240, 200, 120, 30);

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel25.setText("Nº Habite-se");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(10, 180, 80, 20);
        jPanel3.add(txtNumHabite);
        txtNumHabite.setBounds(10, 200, 140, 30);

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel26.setText("Data de Expedição");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(10, 230, 120, 20);
        jPanel3.add(txtDataHabite);
        txtDataHabite.setBounds(10, 250, 110, 30);

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel27.setText("Observação");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(10, 280, 70, 20);

        txtComplemento.setColumns(20);
        txtComplemento.setRows(5);
        jScrollPane3.setViewportView(txtComplemento);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel14);
        jPanel14.setBounds(10, 30, 660, 90);

        txtObservacao.setColumns(20);
        txtObservacao.setRows(5);
        jScrollPane4.setViewportView(txtObservacao);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel15);
        jPanel15.setBounds(10, 300, 660, 70);
        jPanel3.add(txtAnoHabite);
        txtAnoHabite.setBounds(160, 200, 40, 30);

        jLabel41.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel41.setText("Ano");
        jPanel3.add(jLabel41);
        jLabel41.setBounds(160, 180, 22, 20);

        jTabbedPane1.addTab("Habite-se", jPanel3);

        jPanel2.setLayout(null);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel12.setText("Comunique-se");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 0, 82, 20);

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel13.setText("Logradouro");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 220, 66, 20);
        jPanel2.add(txtLogradouro);
        txtLogradouro.setBounds(10, 240, 560, 30);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel14.setText("Bairro");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 270, 50, 20);
        jPanel2.add(txtBairroComunique);
        txtBairroComunique.setBounds(10, 290, 210, 30);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel15.setText("Nº");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(590, 220, 30, 20);
        jPanel2.add(txtNum);
        txtNum.setBounds(590, 240, 80, 30);

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel16.setText("Cidade");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(240, 270, 60, 20);
        jPanel2.add(txtCidade);
        txtCidade.setBounds(240, 290, 360, 30);

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel17.setText("UF");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(620, 270, 20, 20);

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel18.setText("CEP");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(10, 320, 30, 20);
        jPanel2.add(txtCep);
        txtCep.setBounds(10, 340, 180, 30);

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel19.setText("Data de Expedição");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(220, 320, 120, 20);
        jPanel2.add(txtDataComunique);
        txtDataComunique.setBounds(220, 340, 120, 30);
        jPanel2.add(txtUf);
        txtUf.setBounds(620, 290, 50, 30);

        txtComunique.setColumns(20);
        txtComunique.setRows(5);
        jScrollPane2.setViewportView(txtComunique);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel11);
        jPanel11.setBounds(10, 20, 660, 200);

        jTabbedPane1.addTab("Comunique-se", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 190, 685, 410);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 180, 685, 10);

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lista.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(599, 40, 90, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 610, 685, 10);

        tblProcesso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, "", null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "NºProc.", "Ano", "Requerente", "Assunto", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProcesso.getTableHeader().setReorderingAllowed(false);
        tblProcesso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProcessoMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblProcesso);
        tblProcesso.getColumnModel().getColumn(0).setMinWidth(0);
        tblProcesso.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblProcesso.getColumnModel().getColumn(0).setMaxWidth(0);
        tblProcesso.getColumnModel().getColumn(1).setMinWidth(80);
        tblProcesso.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblProcesso.getColumnModel().getColumn(1).setMaxWidth(80);
        tblProcesso.getColumnModel().getColumn(2).setMinWidth(40);
        tblProcesso.getColumnModel().getColumn(2).setPreferredWidth(40);
        tblProcesso.getColumnModel().getColumn(2).setMaxWidth(40);
        tblProcesso.getColumnModel().getColumn(3).setMinWidth(50);
        tblProcesso.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblProcesso.getColumnModel().getColumn(3).setMaxWidth(400);
        tblProcesso.getColumnModel().getColumn(4).setMinWidth(50);
        tblProcesso.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblProcesso.getColumnModel().getColumn(4).setMaxWidth(300);
        tblProcesso.getColumnModel().getColumn(5).setMinWidth(50);
        tblProcesso.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblProcesso.getColumnModel().getColumn(5).setMaxWidth(200);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel12);
        jPanel12.setBounds(10, 80, 680, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Carrega os campos com os dados do requerente
        int p = pes.pesquisanumProcesso();
        String processo = String.valueOf(p);
        txtProcesso.setText(processo);

        String requerente = pes.pesquisaRequerente();
        txtRequerente.setText(requerente);

        String assunto = pes.pesquisaAssunto();
        txtAssunto.setText(assunto);

        String endereco1 = pes.pesquisaEndereco();
        txtEndereco.setText(endereco1);

        String bairro1 = pes.pesquisaBairro();
        txtBairro.setText(bairro1);

        String loteamento = pes.pesquisaLoteamento();
        txtLoteamento.setText(loteamento);

        String lote = pes.pesquisaLote();
        txtLote.setText(lote);

        String quadra = pes.pesquisaQuadra();
        txtQuadra.setText(quadra);

        String ident = pes.pesquisaIdentificacao();
        txtIdentCadastral.setText(ident);

        //DADOS DO COMUNIQUE
        String comunique = pes.pesquisaComunique();
        txtComunique.setText(comunique);

        String logradouro = pes.pesquisaLogradouro();
        txtLogradouro.setText(logradouro);

        String bairro2 = pes.pesquisaBairroComunique();
        txtBairroComunique.setText(bairro2);

        String num_c = pes.pesquisaNumComunique();
        txtNum.setText(num_c);

        String cidade = pes.pesquisaCidadeComunique();
        txtCidade.setText(cidade);

        String uf = pes.pesquisaEstadoComunique();
        txtUf.setText(uf);

        String data_comunique = pes.pesquisaDataComunique();
        txtDataComunique.setText(data_comunique);

        //DADOS DO HABITE

        String comp_habite = pes.pesquisaComplementoHabite();
        txtComplemento.setText(comp_habite);

        String area_habite = pes.pesquisaAreaHabite();
        txtAreaHabite.setText(area_habite);

        String area_aprov = pes.pesquisaAreaHabite();
        txtAreaAprovada.setText(area_aprov);

        String num_habite = pes.pesquisaNumHabite();
        txtNumHabite.setText(num_habite);

        String num_aprovHabite = pes.pesquisaNumAprovacaoHabite();
        txtNumAprovacao.setText(num_aprovHabite);

        String dt_habite = pes.pesquisaDataHabite();
        txtDataHabite.setText(dt_habite);

        String obs = pes.pesquisaObservacaoHabite();
        txtObservacao.setText(obs);

        //DADOS DO ALVARÁ

        String nome1 = pes.pesquisaNomeProfissionalAutor();
        txtProfissional1.setText(nome1);

        String creasp1 = pes.pesquisaCreaspAutor();
        txtCreasp1.setText(creasp1);

        String insc1 = pes.pesquisaInscMunicipalAutor();
        txtInscMunicipal1.setText(insc1);

        String nome2 = pes.pesquisaNomeProfissionalTecnico();
        txtProfissional2.setText(nome2);

        String creasp2 = pes.pesquisaCreaspTecnico();
        txtCreasp2.setText(creasp2);

        String insc2 = pes.pesquisaInscMunicipalTecnico();
        txtInscMunicipal2.setText(insc2);

        String construcao = pes.pesquisaConstrucaoAlvara();
        txtConstrucaoAlvara.setText(construcao);

        String comp_alv = pes.pesquisaComplementoHabite();
        txtComplementoAlvara.setText(comp_alv);

        String ano_alvconstru = pes.pesquisaAnoAlvaraConstrucao();
        txtAnoAlvConstrucao.setText(ano_alvconstru);

        String num_alvc = pes.pesquisaNumAlvaraConstrucao();
        txtAlvConstrucao.setText(num_alvc);

        String area_alv = pes.pesquisaAreaAlvara();
        txtAreaAlv.setText(area_alv);

        String situacao = pes.pesquisaSituacao();
        txtSituacao.setText(situacao);
    }//GEN-LAST:event_formWindowOpened

    private void tblProcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcessoMouseClicked
        Object a = tblProcesso.getValueAt(tblProcesso.getSelectedRow(), 0);

        String idt = String.valueOf(a);
        int id = Integer.parseInt(idt);


        try {
            preenche_jtable2(id);
        } catch (SQLException ex) {
            Logger.getLogger(FormVisualizarRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }


        pes.setID(id);

        int p = pes.pesquisanumProcesso();
        String processo = String.valueOf(p);
        txtProcesso.setText(processo);

        String dt_e = pes.pesquisaDataEntrada();
        txtData.setText(dt_e);

        String ano = pes.pesquisaAnoProcesso();
        txtAno.setText(ano);

        String requerente = pes.pesquisaRequerente();
        txtRequerente.setText(requerente);

        String assunto = pes.pesquisaAssunto();
        txtAssunto.setText(assunto);

        String endereco1 = pes.pesquisaEndereco();
        txtEndereco.setText(endereco1);

        String bairro1 = pes.pesquisaBairro();
        txtBairro.setText(bairro1);

        String loteamento = pes.pesquisaLoteamento();
        txtLoteamento.setText(loteamento);

        String lote = pes.pesquisaLote();
        txtLote.setText(lote);

        String quadra = pes.pesquisaQuadra();
        txtQuadra.setText(quadra);

        String ident = pes.pesquisaIdentificacao();
        txtIdentCadastral.setText(ident);

        //DADOS DO COMUNIQUE
        String comunique = pes.pesquisaComunique();
        txtComunique.setText(comunique);

        String logradouro = pes.pesquisaLogradouro();
        txtLogradouro.setText(logradouro);

        String bairro2 = pes.pesquisaBairroComunique();
        txtBairroComunique.setText(bairro2);

        String num_c = pes.pesquisaNumComunique();
        txtNum.setText(num_c);

        String cidade = pes.pesquisaCidadeComunique();
        txtCidade.setText(cidade);

        String cep = pes.pesquisaCepComunique();
        txtCep.setText(cep);

        String uf = pes.pesquisaEstadoComunique();
        txtUf.setText(uf);

        String data_comunique = pes.pesquisaDataComunique();
        txtDataComunique.setText(data_comunique);

        //DADOS DO HABITE
        String comp_habite = pes.pesquisaComplementoHabite();
        txtComplemento.setText(comp_habite);

        String area_habite = pes.pesquisaAreaHabite();
        txtAreaHabite.setText(area_habite);

        String area_aprov = pes.pesquisaAreaAprovHabite();
        txtAreaAprovada.setText(area_aprov);
        
        String ano_habite = pes.pesquisaAnoHabite();
        txtAnoHabite.setText(ano_habite);

        String num_habite = pes.pesquisaNumHabite();
        txtNumHabite.setText(num_habite);

        String num_aprovHabite = pes.pesquisaNumAprovacaoHabite();
        txtNumAprovacao.setText(num_aprovHabite);

        String dt_habite = pes.pesquisaDataHabite();
        txtDataHabite.setText(dt_habite);

        String obs = pes.pesquisaObservacaoHabite();
        txtObservacao.setText(obs);

        //DADOS DO ALVARÁ

        String nome1 = pes.pesquisaNomeProfissionalAutor();
        txtProfissional1.setText(nome1);

        String creasp1 = pes.pesquisaCreaspAutor();
        txtCreasp1.setText(creasp1);

        String insc1 = pes.pesquisaInscMunicipalAutor();
        txtInscMunicipal1.setText(insc1);

        String nome2 = pes.pesquisaNomeProfissionalTecnico();
        txtProfissional2.setText(nome2);

        String creasp2 = pes.pesquisaCreaspTecnico();
        txtCreasp2.setText(creasp2);

        String insc2 = pes.pesquisaInscMunicipalTecnico();
        txtInscMunicipal2.setText(insc2);

        String construcao = pes.pesquisaConstrucaoAlvara();
        txtConstrucaoAlvara.setText(construcao);

        String comp_alv = pes.pesquisaComplementoAlvara();
        txtComplementoAlvara.setText(comp_alv);

        String ano_alvconstru = pes.pesquisaAnoAlvaraConstrucao();
        txtAnoAlvConstrucao.setText(ano_alvconstru);

        String num_alvc = pes.pesquisaNumAlvaraConstrucao();
        txtAlvConstrucao.setText(num_alvc);

        String area_alv = pes.pesquisaAreaAlvara();
        txtAreaAlv.setText(area_alv);

        String dt_alv = pes.pesquisaDataAlvaraConstrucao();
        txtDataAlvara.setText(dt_alv);

        String situacao = pes.pesquisaSituacao();
        txtSituacao.setText(situacao);
}//GEN-LAST:event_tblProcessoMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        if (proPes.equals(proPes)) {
            FormMenu M = new FormMenu();
            M.setVisible(true);
            M.group = proPes;
            M.acesso_user = acesso_bkp;
            dispose();
        }
}//GEN-LAST:event_btnVoltarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormVisualizarRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_btnListarActionPerformed

    private void txtListarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListarKeyPressed
        if(evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
	   btnListar.doClick();
        }
    }//GEN-LAST:event_txtListarKeyPressed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormVisualizarRegistros().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cbxPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable tblAndamento;
    private javax.swing.JTable tblProcesso;
    private javax.swing.JTextField txtAlvConstrucao;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAnoAlvConstrucao;
    private javax.swing.JTextField txtAnoHabite;
    private javax.swing.JTextField txtAreaAlv;
    private javax.swing.JTextField txtAreaAprovada;
    private javax.swing.JTextField txtAreaHabite;
    private javax.swing.JTextArea txtAssunto;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBairroComunique;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextArea txtComplemento;
    private javax.swing.JTextArea txtComplementoAlvara;
    private javax.swing.JTextArea txtComunique;
    private javax.swing.JTextField txtConstrucaoAlvara;
    private javax.swing.JTextField txtCreasp1;
    private javax.swing.JTextField txtCreasp2;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDataAlvara;
    private javax.swing.JTextField txtDataComunique;
    private javax.swing.JTextField txtDataHabite;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdentCadastral;
    private javax.swing.JTextField txtInscMunicipal1;
    private javax.swing.JTextField txtInscMunicipal2;
    private javax.swing.JTextField txtListar;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtLoteamento;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtNumAprovacao;
    private javax.swing.JTextField txtNumHabite;
    private javax.swing.JTextArea txtObservacao;
    private javax.swing.JTextField txtProcesso;
    private javax.swing.JTextField txtProfissional1;
    private javax.swing.JTextField txtProfissional2;
    private javax.swing.JTextField txtQuadra;
    private javax.swing.JTextField txtRequerente;
    private javax.swing.JTextField txtSituacao;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables

   public void preenche_jtable() throws SQLException {

        AcessoBD bd = new AcessoBD();
        DefaultTableModel modelo = (DefaultTableModel) tblProcesso.getModel();
        modelo.setNumRows(0);

        String d1, m1, a1;


        String pesquisa = txtListar.getText().toString();
        String combo = cbxPesquisa.getSelectedItem().toString();

        if (pesquisa.equals("")) {
            try {
                ResultSet resultado = bd.consultaTable("SELECT * FROM processo ORDER BY codprocesso DESC LIMIT 100");
                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                {
                    modelo.addRow(new Object[]{resultado.getInt("codprocesso"), resultado.getInt("numprocesso"), resultado.getString("anoprocesso"), resultado.getString("requerente"), resultado.getString("assunto"), resultado.getString("endereco")});
                }
                

                resultado.first();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
            }

        } else {
            if (combo.equals("Nº Processo")) {
                try {
                    ResultSet resultado = bd.consultaTable("SELECT codprocesso, numprocesso, anoprocesso, requerente, assunto, endereco FROM processo WHERE processo.numprocesso = '" + pesquisa + "' ORDER BY codprocesso DESC LIMIT 100");

                    while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                    {
                        modelo.addRow(new Object[]{resultado.getInt("codprocesso"), resultado.getInt("numprocesso"), resultado.getString("anoprocesso"), resultado.getString("requerente"), resultado.getString("processo.assunto"), resultado.getString("endereco")});
                    }

                    resultado.first();
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                }

            } else {
                if (combo.equals("Requerente")) {
                    try {
                        ResultSet resultado = bd.consultaTable("SELECT codprocesso, numprocesso, anoprocesso, requerente, assunto, endereco FROM processo "
                                + "WHERE requerente LIKE '%" + pesquisa + "%' ORDER BY codprocesso DESC LIMIT 100");

                        while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                        {
                            modelo.addRow(new Object[]{resultado.getInt("codprocesso"), resultado.getInt("numprocesso"), resultado.getString("anoprocesso"), resultado.getString("requerente"), resultado.getString("processo.assunto"), resultado.getString("endereco")});
                        }

                        resultado.first();
                    } catch (SQLException erro) {
                        JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                    }

                } else {
                    if (combo.equals("Assunto")) {
                        try {
                            ResultSet resultado = bd.consultaTable("SELECT codprocesso, numprocesso, anoprocesso, requerente, assunto, endereco  FROM processo "
                                    + "WHERE processo.assunto LIKE '%" + pesquisa + "%' ORDER BY codprocesso DESC LIMIT 100");

                            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                            {
                                modelo.addRow(new Object[]{resultado.getInt("codprocesso"), resultado.getInt("numprocesso"), resultado.getString("anoprocesso"), resultado.getString("requerente"), resultado.getString("processo.assunto"), resultado.getString("endereco")});
                            }

                            resultado.first();
                        } catch (SQLException erro) {
                            JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                        }

                    } else {
                        if (combo.equals("Endereço")) {
                            try {
                                ResultSet resultado = bd.consultaTable("SELECT codprocesso, numprocesso, anoprocesso, requerente, assunto, endereco  FROM processo "
                                        + "WHERE processo.endereco LIKE '%" + pesquisa + "%' ORDER BY codprocesso DESC LIMIT 100");

                                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                {
                                    modelo.addRow(new Object[]{resultado.getInt("codprocesso"), resultado.getInt("numprocesso"), resultado.getString("anoprocesso"), resultado.getString("requerente"), resultado.getString("processo.assunto"), resultado.getString("endereco")});
                                }

                                resultado.first();
                            } catch (SQLException erro) {
                                JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                            }

                        } else {
                            if (combo.equals("Ident. Cadastral")) {
                                try {
                                    ResultSet resultado = bd.consultaTable("SELECT codprocesso, numprocesso, anoprocesso, requerente, assunto, endereco  FROM processo "
                                            + "WHERE processo.identificacaocadastral LIKE '%" + pesquisa + "%' ORDER BY codprocesso DESC LIMIT 100");

                                    while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                    {
                                        modelo.addRow(new Object[]{resultado.getInt("codprocesso"), resultado.getInt("numprocesso"), resultado.getString("anoprocesso"), resultado.getString("requerente"), resultado.getString("processo.assunto"), resultado.getString("endereco")});
                                    }

                                    resultado.first();
                                } catch (SQLException erro) {
                                    JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                                }
                            }else {
                                if (combo.equals("Profissional")) {
                                    try {
                                        ResultSet resultado = bd.consultaTable("SELECT codprocesso, numprocesso, anoprocesso, requerente, assunto, endereco  FROM processo "
                                                + "WHERE processo.responsaveltecnico LIKE '%" + pesquisa + "%' OR processo.autordoprojeto LIKE '%" + pesquisa + "%' ORDER BY codprocesso DESC LIMIT 100");

                                        while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                        {
                                            modelo.addRow(new Object[]{resultado.getInt("codprocesso"), resultado.getInt("numprocesso"), resultado.getString("anoprocesso"), resultado.getString("requerente"), resultado.getString("processo.assunto"), resultado.getString("endereco")});
                                        }

                                        resultado.first();
                                    } catch (SQLException erro) {
                                        JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                                    }
                                } else {
                                    if (combo.equals("Insc. Municipal")) {
                                        try {
                                           ResultSet resultado = bd.consultaTable("SELECT codprocesso, numprocesso, anoprocesso, requerente, assunto, endereco "
                                                    + "FROM processo WHERE processo.inscrmunicipalresptecnico LIKE '%"+pesquisa+"%' AND processo.flag_emissao = '1' "
                                                    + "OR processo.inscrmunicipalautorprojeto LIKE '%"+pesquisa+"%' AND processo.flag_emissao = '1' ORDER BY codprocesso DESC LIMIT 100");

                                            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                            {
                                                modelo.addRow(new Object[]{resultado.getInt("codprocesso"), resultado.getInt("numprocesso"), resultado.getString("anoprocesso"), resultado.getString("requerente"), resultado.getString("processo.assunto"), resultado.getString("endereco")});
                                            }

                                            resultado.first();
                                        } catch (SQLException erro) {
                                            JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                                        }}}}
                        }
                    }
                }
            }
        }
    }

    //preenche tbl Andamento
    public void preenche_jtable2(int id) throws SQLException {
        AcessoBD bd = new AcessoBD();
        DefaultTableModel modelo = (DefaultTableModel) tblAndamento.getModel();
        modelo.setNumRows(0);

        try {
            ResultSet resultado = bd.consultaTable("SELECT entrada, andamentos, saida, arquivado, expedicoes  FROM andamentos "
                    + "WHERE codprocesso = '" + id + "'");
            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
            {
                modelo.addRow(new Object[]{resultado.getString("entrada"), resultado.getString("andamentos"), resultado.getString("saida"), resultado.getString("arquivado")});
            }

            resultado.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
        }

    }
}
