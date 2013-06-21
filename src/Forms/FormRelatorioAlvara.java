/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormRelatorioAlvara.java
 *
 * Created on 01/08/2011, 11:47:37
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

public class FormRelatorioAlvara extends javax.swing.JFrame {

    public String emiAlv;
    ClassPesquisaDadosRequerente pes = new ClassPesquisaDadosRequerente();
    ClassSelecionarId sel = new ClassSelecionarId();
    AcessoBD bd = new AcessoBD();
    public boolean[] acesso_bkp;
    private int largura = 645;
    private int altura = 662;

    public FormRelatorioAlvara() {
        initComponents();

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
    }

    FormRelatorioAlvara(FormMenu aThis, boolean b) {
        initComponents();

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
    }
    
    
    
    FormRelatorioAlvara(FormAssinatura aThis, boolean b) {
        initComponents();

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtListar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnListar = new javax.swing.JButton();
        cbxPesquisa = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnVoltar = new javax.swing.JButton();
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
        javax.swing.text.MaskFormatter ident5 = null;
        try {
            ident5 = new javax.swing.text.MaskFormatter("##.###.###-*");
            ident5.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtIdentCadastral = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAssunto = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtProcesso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRequerente = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAndamento = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        txtInscMunicipal2 = new javax.swing.JTextField();
        txtCreasp2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtProfissional2 = new javax.swing.JTextField();
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
        javax.swing.text.MaskFormatter dt_ex = null;
        try {
            dt_ex = new javax.swing.text.MaskFormatter("##/##/####");
            dt_ex.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDataAlvara =  new javax.swing.JFormattedTextField(dt_ex);
        txtConstrucaoAlvara = new javax.swing.JTextField();
        txtSituacao = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtComplementoAlvara = new javax.swing.JTextArea();
        btnRelatorio = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblProcesso = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TRDoc - Tramitação de Documentos");
        setUndecorated(true);
        getContentPane().setLayout(null);

        txtListar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListarKeyPressed(evt);
            }
        });
        getContentPane().add(txtListar);
        txtListar.setBounds(150, 40, 380, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 180, 620, 20);

        btnListar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lista.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(540, 40, 90, 30);

        cbxPesquisa.setFont(new java.awt.Font("SansSerif", 1, 12));
        cbxPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nº Processo", "Requerente", "Assunto", "Endereço", "Ident. Cadastral", "Profissional", "Insc. Municipal" }));
        getContentPane().add(cbxPesquisa);
        cbxPesquisa.setBounds(10, 40, 130, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 33, 620, 10);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel1.setText("Emissão de Alvarás");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 112, 20);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 610, 620, 20);

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

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jPanel1.setLayout(null);

        jTabbedPane3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jPanel7.setLayout(null);

        txtData.setFocusable(false);
        jPanel7.add(txtData);
        txtData.setBounds(200, 20, 100, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel7.setText("Data de Entrada");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(200, 0, 110, 20);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel4.setText("Assunto");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(10, 100, 80, 20);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("Endereço");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(10, 170, 80, 20);

        txtEndereco.setFocusable(false);
        jPanel7.add(txtEndereco);
        txtEndereco.setBounds(10, 190, 560, 30);

        txtBairro.setFocusable(false);
        jPanel7.add(txtBairro);
        txtBairro.setBounds(10, 240, 340, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel6.setText("Bairro");
        jPanel7.add(jLabel6);
        jLabel6.setBounds(10, 220, 80, 20);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel8.setText("Loteamento");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(10, 270, 90, 20);

        txtLoteamento.setFocusable(false);
        jPanel7.add(txtLoteamento);
        txtLoteamento.setBounds(10, 290, 140, 30);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel9.setText("Lote");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(310, 270, 50, 20);

        txtLote.setFocusable(false);
        jPanel7.add(txtLote);
        txtLote.setBounds(310, 290, 70, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel10.setText("Quadra");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(170, 270, 60, 20);

        txtQuadra.setFocusable(false);
        jPanel7.add(txtQuadra);
        txtQuadra.setBounds(170, 290, 110, 30);

        txtIdentCadastral.setFocusable(false);
        jPanel7.add(txtIdentCadastral);
        txtIdentCadastral.setBounds(360, 240, 210, 30);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel11.setText("Identificação Cadastral");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(360, 220, 140, 20);

        txtAssunto.setColumns(20);
        txtAssunto.setRows(5);
        txtAssunto.setFocusable(false);
        jScrollPane1.setViewportView(txtAssunto);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel3);
        jPanel3.setBounds(10, 120, 560, 50);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("Nº Processo");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(10, 0, 80, 20);

        txtProcesso.setFocusable(false);
        jPanel7.add(txtProcesso);
        txtProcesso.setBounds(10, 20, 98, 30);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel12.setText("Ano");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(140, 0, 22, 20);
        jPanel7.add(txtAno);
        txtAno.setBounds(140, 20, 40, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel3.setText("Requerente");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(10, 50, 100, 20);

        txtRequerente.setFocusable(false);
        jPanel7.add(txtRequerente);
        txtRequerente.setBounds(10, 70, 560, 30);

        jTabbedPane3.addTab("Processo", jPanel7);

        jPanel8.setLayout(null);

        tblAndamento.setFont(new java.awt.Font("SansSerif", 1, 12));
        tblAndamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Entrada", "Andamento", "Saída", "Arquivado", "Expedição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAndamento.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tblAndamento);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9);
        jPanel9.setBounds(10, 10, 560, 310);

        jTabbedPane3.addTab("Andamento", jPanel8);

        jPanel1.add(jTabbedPane3);
        jTabbedPane3.setBounds(10, 10, 590, 360);

        jTabbedPane1.addTab("Principal", jPanel1);

        jPanel4.setLayout(null);

        jTabbedPane2.setFont(new java.awt.Font("Arial", 1, 12));

        jPanel6.setLayout(null);
        jPanel6.add(txtInscMunicipal2);
        txtInscMunicipal2.setBounds(270, 70, 310, 30);
        jPanel6.add(txtCreasp2);
        txtCreasp2.setBounds(10, 70, 240, 30);

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel31.setText("Inscrição Municipal");
        jPanel6.add(jLabel31);
        jLabel31.setBounds(270, 50, 270, 20);

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel32.setText("Creasp");
        jPanel6.add(jLabel32);
        jLabel32.setBounds(10, 50, 200, 20);

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel33.setText("Nome do Responsável Técnico");
        jPanel6.add(jLabel33);
        jLabel33.setBounds(10, 0, 200, 20);
        jPanel6.add(txtProfissional2);
        txtProfissional2.setBounds(10, 20, 570, 30);

        jTabbedPane2.addTab("Responsável Técnico", jPanel6);

        jPanel5.setLayout(null);

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel28.setText("Nome do Autor do Projeto");
        jPanel5.add(jLabel28);
        jLabel28.setBounds(10, 0, 220, 20);

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel29.setText("Creasp ");
        jPanel5.add(jLabel29);
        jLabel29.setBounds(10, 50, 160, 20);

        txtCreasp1.setFocusable(false);
        jPanel5.add(txtCreasp1);
        txtCreasp1.setBounds(10, 70, 240, 30);

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel30.setText("Inscrição Municipal");
        jPanel5.add(jLabel30);
        jLabel30.setBounds(270, 50, 240, 20);

        txtInscMunicipal1.setFocusable(false);
        jPanel5.add(txtInscMunicipal1);
        txtInscMunicipal1.setBounds(270, 70, 310, 30);

        txtProfissional1.setFocusable(false);
        jPanel5.add(txtProfissional1);
        txtProfissional1.setBounds(10, 20, 570, 30);

        jTabbedPane2.addTab("Autor do Projeto", jPanel5);

        jPanel4.add(jTabbedPane2);
        jTabbedPane2.setBounds(12, 12, 590, 140);

        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel34.setText("Tipo de Construção");
        jPanel4.add(jLabel34);
        jLabel34.setBounds(10, 160, 140, 20);

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel35.setText("Complemento");
        jPanel4.add(jLabel35);
        jLabel35.setBounds(10, 210, 90, 20);

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel36.setText("Ano");
        jPanel4.add(jLabel36);
        jLabel36.setBounds(160, 310, 60, 20);

        txtAnoAlvConstrucao.setFocusable(false);
        jPanel4.add(txtAnoAlvConstrucao);
        txtAnoAlvConstrucao.setBounds(160, 330, 40, 30);

        jLabel37.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel37.setText("Nº Alv. Construção");
        jPanel4.add(jLabel37);
        jLabel37.setBounds(10, 310, 120, 20);

        txtAlvConstrucao.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAlvConstrucao.setFocusable(false);
        jPanel4.add(txtAlvConstrucao);
        txtAlvConstrucao.setBounds(10, 330, 140, 30);

        jLabel38.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel38.setText("Área ( m² )");
        jPanel4.add(jLabel38);
        jLabel38.setBounds(280, 310, 70, 20);

        txtAreaAlv.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAreaAlv.setFocusable(false);
        jPanel4.add(txtAreaAlv);
        txtAreaAlv.setBounds(280, 330, 110, 30);

        jLabel39.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel39.setText("Situação");
        jPanel4.add(jLabel39);
        jLabel39.setBounds(410, 310, 70, 20);

        jLabel40.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel40.setText("Data de Expedição");
        jPanel4.add(jLabel40);
        jLabel40.setBounds(480, 160, 110, 20);

        txtDataAlvara.setFocusable(false);
        jPanel4.add(txtDataAlvara);
        txtDataAlvara.setBounds(480, 180, 100, 30);

        txtConstrucaoAlvara.setFocusable(false);
        jPanel4.add(txtConstrucaoAlvara);
        txtConstrucaoAlvara.setBounds(10, 180, 450, 30);

        txtSituacao.setFocusable(false);
        jPanel4.add(txtSituacao);
        txtSituacao.setBounds(410, 330, 190, 30);

        txtComplementoAlvara.setColumns(20);
        txtComplementoAlvara.setRows(5);
        txtComplementoAlvara.setFocusable(false);
        jScrollPane5.setViewportView(txtComplementoAlvara);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel10);
        jPanel10.setBounds(10, 230, 590, 80);

        jTabbedPane1.addTab("Alvarás", jPanel4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 190, 620, 410);

        btnRelatorio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/habite.png"))); // NOI18N
        btnRelatorio.setText("Relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(btnRelatorio);
        btnRelatorio.setBounds(520, 620, 110, 30);

        tblProcesso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
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
        tblProcesso.getColumnModel().getColumn(4).setMaxWidth(200);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 80, 620, 90);
    }// </editor-fold>//GEN-END:initComponents

    private void tblProcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcessoMouseClicked
        Object a = tblProcesso.getValueAt(tblProcesso.getSelectedRow(), 0);

        String idt = String.valueOf(a);
        int id = Integer.parseInt(idt);


        try {
            preenche_jtable2(id);
        } catch (SQLException ex) {
            Logger.getLogger(FormRelatorioAlvara.class.getName()).log(Level.SEVERE, null, ex);
        }


        pes.setID(id);

        int p = pes.pesquisanumProcesso();
        String processo = String.valueOf(p);
        txtProcesso.setText(processo);
        
        String ano = pes.pesquisaAnoProcesso();
        txtAno.setText(ano);

        String dt_e = pes.pesquisaDataEntrada();
        txtData.setText(dt_e);

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
        
        String data_alv = pes.pesquisaDataAlvaraConstrucao();
        txtDataAlvara.setText(data_alv);

        String situacao = pes.pesquisaSituacao();
        txtSituacao.setText(situacao);
}//GEN-LAST:event_tblProcessoMouseClicked

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormRelatorioAlvara.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_btnListarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (emiAlv.equals(emiAlv)) {
            FormMenu M = new FormMenu(this, true);
            M.setVisible(true);
            M.group = emiAlv;
            M.acesso_user = acesso_bkp;
            dispose();
        }
}//GEN-LAST:event_btnVoltarActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        int opt = 0;
        String txt1 = txtProfissional1.getText();
        String txt2 = txtProfissional2.getText();
        if(txt1.equals("")||txt1.equals(null)||txt1.equals(" ")){
            opt = 1;
        }else{
            if((txt1.equals(txt2))){
                opt = 2;
            }else{
                opt = 3;
            }
        }
        
        String num = txtProcesso.getText();
        String ano = txtAno.getText();
        int id = pes.pesquisaCodigoProcessos(Integer.valueOf(num),ano);
        FormAssinatura F = new FormAssinatura(id,opt);
        F.setVisible(true);
        F.acesso_bkp2 = acesso_bkp;
        F.emiAlvRes = emiAlv;
        dispose();
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void txtListarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListarKeyPressed
        if(evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
	   btnListar.doClick();
        }
    }//GEN-LAST:event_txtListarKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormRelatorioAlvara().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cbxPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextField txtAreaAlv;
    private javax.swing.JTextArea txtAssunto;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextArea txtComplementoAlvara;
    private javax.swing.JTextField txtConstrucaoAlvara;
    private javax.swing.JTextField txtCreasp1;
    private javax.swing.JTextField txtCreasp2;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDataAlvara;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdentCadastral;
    private javax.swing.JTextField txtInscMunicipal1;
    private javax.swing.JTextField txtInscMunicipal2;
    private javax.swing.JTextField txtListar;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtLoteamento;
    private javax.swing.JTextField txtProcesso;
    private javax.swing.JTextField txtProfissional1;
    private javax.swing.JTextField txtProfissional2;
    private javax.swing.JTextField txtQuadra;
    private javax.swing.JTextField txtRequerente;
    private javax.swing.JTextField txtSituacao;
    // End of variables declaration//GEN-END:variables

    public void preenche_jtable() throws SQLException {

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


        DefaultTableModel modelo = (DefaultTableModel) tblAndamento.getModel();
        modelo.setNumRows(0);

        try {
            ResultSet resultado = bd.consultaTable("SELECT entrada, andamentos, saida, arquivado, expedicoes  FROM andamentos "
                    + "WHERE codprocesso = '" + id + "'");
            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
            {
                modelo.addRow(new Object[]{resultado.getString("entrada"), resultado.getString("andamentos"), resultado.getString("saida"), resultado.getString("arquivado"), resultado.getString("expedicoes")});
            }

            resultado.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
        }

    }
}
