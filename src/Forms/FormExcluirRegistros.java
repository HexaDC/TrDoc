/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormAtualizarRegistros.java
 *
 * Created on 28/07/2011, 09:06:46
 */
package Forms;

import Classes.Atualiza.ClassAtualizarProcesso;
import Classes.Atualiza.ClassAtualizarAndamento;
import Classes.Cadastra.ClassCadastrarAndamento;
import Classes.Pesquisa.ClassPesquisaDadosRequerente;
import Classes.Pesquisa.ClassSelecionarId;
import Classes.Pesquisa.ClassCarregarCombo;
import Classes.Atualiza.ClassAtualizarAlvara;
import Classes.Atualiza.ClassAtualizarHabite;
import Classes.Atualiza.ClassAtualizarComunique;
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

/**
 *
 * @author Jenny
 */
public class FormExcluirRegistros extends javax.swing.JFrame {

    AcessoBD bd = new AcessoBD();
    ClassPesquisaDadosRequerente pes = new ClassPesquisaDadosRequerente();
    ClassSelecionarId sel = new ClassSelecionarId();
    ClassAtualizarProcesso atup = new ClassAtualizarProcesso();
    ClassAtualizarAndamento atua = new ClassAtualizarAndamento();
    ClassAtualizarComunique atuc = new ClassAtualizarComunique();
    ClassAtualizarHabite atuh = new ClassAtualizarHabite();
    ClassAtualizarAlvara atual = new ClassAtualizarAlvara();
    ClassAtualizarAlvara atualv = new ClassAtualizarAlvara();
    ClassCarregarCombo com = new ClassCarregarCombo();
    ClassCadastrarAndamento cad = new ClassCadastrarAndamento();
    public String proExc;
    public boolean[] acesso_bkp;
    private int largura = 682;
    private int altura = 662;

    public FormExcluirRegistros() {
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

    FormExcluirRegistros(FormMenu aThis, boolean b) {
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

        jScrollPane9 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnListar = new javax.swing.JButton();
        txtListar = new javax.swing.JTextField();
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
        jLabel45 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAssunto = new javax.swing.JTextArea();
        txtProcesso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRequerente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter entrada4 = null;
        try {
            entrada4 = new javax.swing.text.MaskFormatter("##/##/####");
            entrada4.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDtEntrada = new javax.swing.JFormattedTextField(entrada4);
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        cbxExpedicao = new javax.swing.JComboBox();
        jLabel46 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter saida = null;
        try {
            saida = new javax.swing.text.MaskFormatter("##/##/####");
            saida.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDtSaida = new javax.swing.JFormattedTextField(saida);
        javax.swing.text.MaskFormatter arquivado = null;
        try {
            arquivado = new javax.swing.text.MaskFormatter("##/##/####");
            arquivado.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDtArquivado = new javax.swing.JFormattedTextField(arquivado);
        jPanel10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAndamento = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAndamento = new javax.swing.JTextArea();
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
        txtDataAlvara = new javax.swing.JTextField();
        txtContrucao = new javax.swing.JTextField();
        txtSituacao = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
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
        jPanel15 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComplemento2 = new javax.swing.JTextArea();
        txtAnoHabite = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
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
        jPanel13 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComunique = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        cbxPesquisa = new javax.swing.JComboBox();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblProcesso = new javax.swing.JTable();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane9.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TRDoc - Tramitação de Documentos");
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel1.setText("Exclusão de Processos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 134, 16);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 33, 657, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 190, 660, 10);

        btnListar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lista.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(580, 40, 90, 30);

        txtListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtListarActionPerformed(evt);
            }
        });
        txtListar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListarKeyPressed(evt);
            }
        });
        getContentPane().add(txtListar);
        txtListar.setBounds(150, 40, 420, 30);

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jTabbedPane3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jPanel7.setLayout(null);
        jPanel7.add(txtData);
        txtData.setBounds(190, 20, 90, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel7.setText("Data de Entrada");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(190, 0, 90, 20);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel4.setText("Assunto");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(10, 100, 47, 20);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("Endereço");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(10, 190, 90, 20);
        jPanel7.add(txtEndereco);
        txtEndereco.setBounds(10, 210, 630, 30);
        jPanel7.add(txtBairro);
        txtBairro.setBounds(10, 260, 360, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel6.setText("Bairro");
        jPanel7.add(jLabel6);
        jLabel6.setBounds(10, 240, 60, 20);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel8.setText("Loteamento");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(10, 290, 80, 20);
        jPanel7.add(txtLoteamento);
        txtLoteamento.setBounds(10, 310, 120, 30);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel9.setText("Lote");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(270, 290, 50, 20);
        jPanel7.add(txtLote);
        txtLote.setBounds(270, 310, 70, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel10.setText("Quadra");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(150, 290, 50, 20);
        jPanel7.add(txtQuadra);
        txtQuadra.setBounds(150, 310, 90, 30);
        jPanel7.add(txtIdentCadastral);
        txtIdentCadastral.setBounds(390, 260, 250, 30);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel11.setText("Identificação Cadastral");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(390, 240, 150, 20);

        jLabel45.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel45.setText("Ano");
        jPanel7.add(jLabel45);
        jLabel45.setBounds(110, 0, 22, 20);
        jPanel7.add(txtAno);
        txtAno.setBounds(110, 20, 50, 30);

        txtAssunto.setColumns(20);
        txtAssunto.setRows(5);
        jScrollPane1.setViewportView(txtAssunto);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9);
        jPanel9.setBounds(10, 120, 630, 70);
        jPanel7.add(txtProcesso);
        txtProcesso.setBounds(10, 20, 80, 30);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("Nº Processo");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(10, 0, 80, 20);
        jPanel7.add(txtRequerente);
        txtRequerente.setBounds(10, 70, 630, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel3.setText("Requerente");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(10, 50, 110, 20);

        jTabbedPane3.addTab("Processo", jPanel7);

        jPanel8.setLayout(null);

        jLabel41.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel41.setText("Data de Entrada");
        jPanel8.add(jLabel41);
        jLabel41.setBounds(20, 120, 100, 20);
        jPanel8.add(txtDtEntrada);
        txtDtEntrada.setBounds(10, 140, 113, 30);

        jLabel42.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel42.setText("Data de Saída");
        jPanel8.add(jLabel42);
        jLabel42.setBounds(310, 120, 90, 20);

        jLabel43.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel43.setText("Andamento");
        jPanel8.add(jLabel43);
        jLabel43.setBounds(10, 180, 80, 20);

        jLabel44.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel44.setText("Expedição");
        jPanel8.add(jLabel44);
        jLabel44.setBounds(150, 120, 70, 20);

        cbxExpedicao.setFont(new java.awt.Font("SansSerif", 1, 12));
        cbxExpedicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALVARÁS", "COMUNIQUE-SE", "HABITE-SE", "OUTROS" }));
        jPanel8.add(cbxExpedicao);
        cbxExpedicao.setBounds(140, 140, 140, 30);

        jLabel46.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel46.setText("Data Aquivado");
        jPanel8.add(jLabel46);
        jLabel46.setBounds(450, 120, 90, 20);
        jPanel8.add(txtDtSaida);
        txtDtSaida.setBounds(310, 140, 110, 30);
        jPanel8.add(txtDtArquivado);
        txtDtArquivado.setBounds(440, 140, 110, 30);

        tblAndamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Entrada", "Andamento", "Saída", "Arquivado", "Expedição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAndamento.getTableHeader().setReorderingAllowed(false);
        tblAndamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAndamentoMouseClicked(evt);
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
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel10);
        jPanel10.setBounds(10, 10, 630, 100);

        txtAndamento.setColumns(20);
        txtAndamento.setRows(5);
        jScrollPane8.setViewportView(txtAndamento);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel11);
        jPanel11.setBounds(10, 200, 630, 140);

        jTabbedPane3.addTab("Andamento", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Principal", jPanel1);

        jPanel4.setLayout(null);

        jTabbedPane2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jPanel6.setLayout(null);
        jPanel6.add(txtInscMunicipal2);
        txtInscMunicipal2.setBounds(340, 70, 270, 30);
        jPanel6.add(txtCreasp2);
        txtCreasp2.setBounds(10, 70, 310, 30);

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel31.setText("Inscrição Municipal");
        jPanel6.add(jLabel31);
        jLabel31.setBounds(340, 50, 130, 20);

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel32.setText("Creasp:");
        jPanel6.add(jLabel32);
        jLabel32.setBounds(10, 50, 60, 20);

        jLabel33.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel33.setText("Nome do Resposável Técnico");
        jPanel6.add(jLabel33);
        jLabel33.setBounds(10, 0, 180, 20);
        jPanel6.add(txtProfissional2);
        txtProfissional2.setBounds(10, 20, 600, 30);

        jTabbedPane2.addTab("Resposável Técnico", jPanel6);

        jPanel5.setLayout(null);

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel28.setText("Nome do Autor do Projeto");
        jPanel5.add(jLabel28);
        jLabel28.setBounds(10, 0, 160, 20);

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel29.setText("Creasp");
        jPanel5.add(jLabel29);
        jLabel29.setBounds(10, 50, 60, 20);
        jPanel5.add(txtCreasp1);
        txtCreasp1.setBounds(10, 70, 310, 30);

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel30.setText("Inscrição Municipal");
        jPanel5.add(jLabel30);
        jLabel30.setBounds(340, 50, 110, 20);
        jPanel5.add(txtInscMunicipal1);
        txtInscMunicipal1.setBounds(340, 70, 270, 30);
        jPanel5.add(txtProfissional1);
        txtProfissional1.setBounds(10, 20, 600, 30);

        jTabbedPane2.addTab("Autor do Projeto", jPanel5);

        jPanel4.add(jTabbedPane2);
        jTabbedPane2.setBounds(10, 10, 630, 140);

        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel34.setText("Tipo de Construção");
        jPanel4.add(jLabel34);
        jLabel34.setBounds(10, 160, 120, 20);

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel35.setText("Complemento");
        jPanel4.add(jLabel35);
        jLabel35.setBounds(10, 210, 79, 20);

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel36.setText("Ano");
        jPanel4.add(jLabel36);
        jLabel36.setBounds(160, 320, 40, 20);
        jPanel4.add(txtAnoAlvConstrucao);
        txtAnoAlvConstrucao.setBounds(160, 340, 40, 30);

        jLabel37.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel37.setText("Nº Alv. Construção");
        jPanel4.add(jLabel37);
        jLabel37.setBounds(10, 320, 110, 20);
        jPanel4.add(txtAlvConstrucao);
        txtAlvConstrucao.setBounds(10, 340, 130, 30);

        jLabel38.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel38.setText("Área ( m² )");
        jPanel4.add(jLabel38);
        jLabel38.setBounds(270, 320, 70, 20);
        jPanel4.add(txtAreaAlv);
        txtAreaAlv.setBounds(270, 340, 110, 30);

        jLabel39.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel39.setText("Situação");
        jPanel4.add(jLabel39);
        jLabel39.setBounds(390, 320, 70, 20);

        jLabel40.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel40.setText("Data de Expedição");
        jPanel4.add(jLabel40);
        jLabel40.setBounds(520, 160, 110, 20);
        jPanel4.add(txtDataAlvara);
        txtDataAlvara.setBounds(520, 180, 120, 30);
        jPanel4.add(txtContrucao);
        txtContrucao.setBounds(10, 180, 500, 30);
        jPanel4.add(txtSituacao);
        txtSituacao.setBounds(390, 340, 250, 30);

        txtComplementoAlvara.setColumns(20);
        txtComplementoAlvara.setRows(5);
        jScrollPane5.setViewportView(txtComplementoAlvara);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel16);
        jPanel16.setBounds(10, 230, 630, 90);

        jTabbedPane1.addTab("Alvarás", jPanel4);

        jPanel3.setLayout(null);

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel21.setText("Complemento");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(10, 0, 100, 20);

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel22.setText("Área Habite-se");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(10, 90, 100, 20);
        jPanel3.add(txtAreaHabite);
        txtAreaHabite.setBounds(10, 110, 130, 30);

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel23.setText("Área Aprovada");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(330, 90, 100, 20);
        jPanel3.add(txtAreaAprovada);
        txtAreaAprovada.setBounds(330, 110, 139, 30);

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel24.setText("Nº de Aprovação");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(330, 140, 100, 20);
        jPanel3.add(txtNumAprovacao);
        txtNumAprovacao.setBounds(330, 160, 140, 30);

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel25.setText("Nº Habite-se");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(10, 140, 90, 20);
        jPanel3.add(txtNumHabite);
        txtNumHabite.setBounds(10, 160, 130, 30);

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel26.setText("Data de Expedição");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(10, 190, 110, 20);
        jPanel3.add(txtDataHabite);
        txtDataHabite.setBounds(10, 210, 110, 30);

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel27.setText("Observação");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(10, 240, 100, 20);

        txtObservacao.setColumns(20);
        txtObservacao.setRows(5);
        jScrollPane4.setViewportView(txtObservacao);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel15);
        jPanel15.setBounds(10, 260, 630, 110);

        txtComplemento2.setColumns(20);
        txtComplemento2.setRows(5);
        jScrollPane3.setViewportView(txtComplemento2);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel14);
        jPanel14.setBounds(10, 20, 630, 70);
        jPanel3.add(txtAnoHabite);
        txtAnoHabite.setBounds(160, 160, 50, 30);

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel20.setText("Ano");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(160, 140, 40, 20);

        jTabbedPane1.addTab("Habite-se", jPanel3);

        jPanel2.setLayout(null);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel12.setText("Comunique-se");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 0, 100, 20);

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel13.setText("Logradouro");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 220, 80, 20);
        jPanel2.add(txtLogradouro);
        txtLogradouro.setBounds(10, 240, 550, 30);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel14.setText("Bairro");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 270, 60, 20);
        jPanel2.add(txtBairroComunique);
        txtBairroComunique.setBounds(10, 290, 250, 30);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel15.setText("Nº");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(570, 220, 20, 20);
        jPanel2.add(txtNum);
        txtNum.setBounds(570, 240, 70, 30);

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel16.setText("Cidade");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(280, 270, 60, 20);
        jPanel2.add(txtCidade);
        txtCidade.setBounds(280, 290, 300, 30);

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel17.setText("UF");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(590, 270, 30, 20);

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel18.setText("CEP");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(10, 320, 50, 20);
        jPanel2.add(txtCep);
        txtCep.setBounds(10, 340, 240, 30);

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel19.setText("Data de Expedição");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(280, 320, 120, 20);
        jPanel2.add(txtDataComunique);
        txtDataComunique.setBounds(280, 340, 110, 30);

        txtUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUfActionPerformed(evt);
            }
        });
        jPanel2.add(txtUf);
        txtUf.setBounds(590, 290, 50, 30);

        txtComunique.setColumns(20);
        txtComunique.setRows(5);
        jScrollPane2.setViewportView(txtComunique);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel13);
        jPanel13.setBounds(10, 20, 630, 200);

        jTabbedPane1.addTab("Comunique-se", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 200, 660, 405);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 612, 660, 10);

        btnExcluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete1.png"))); // NOI18N
        btnExcluir.setText("Excluir Processo");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(520, 620, 150, 30);

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

        cbxPesquisa.setFont(new java.awt.Font("SansSerif", 1, 12));
        cbxPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nº Processo", "Requerente", "Assunto", "Endereço", "Ident. Cadastral", "Profissional", "Insc. Municipal" }));
        getContentPane().add(cbxPesquisa);
        cbxPesquisa.setBounds(10, 40, 128, 30);

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
        tblProcesso.getColumnModel().getColumn(5).setMinWidth(50);
        tblProcesso.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblProcesso.getColumnModel().getColumn(5).setMaxWidth(300);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel12);
        jPanel12.setBounds(10, 80, 660, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormExcluirRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_btnListarActionPerformed

    private void tblProcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcessoMouseClicked
        Object a = tblProcesso.getValueAt(tblProcesso.getSelectedRow(), 0);

        String idt = String.valueOf(a);
        int id = Integer.parseInt(idt);

        try {
            preenche_jtable2(id);
        } catch (SQLException ex) {
            Logger.getLogger(FormExcluirRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }


        pes.setID(id);
        
        
        txtDtEntrada.setText("");

        txtDtSaida.setText("");

        txtAndamento.setText("");

        cbxExpedicao.setSelectedItem("");

        txtDtArquivado.setText("");

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
        txtComplemento2.setText(comp_habite);

        String area_habite = pes.pesquisaAreaHabite();
        txtAreaHabite.setText(area_habite);

        String area_aprov = pes.pesquisaAreaHabite();
        txtAreaAprovada.setText(area_aprov);

        String num_habite = pes.pesquisaNumHabite();
        txtNumHabite.setText(num_habite);
        
        String ano_habite = pes.pesquisaAnoHabite();
        txtAnoHabite.setText(ano_habite);

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
        txtContrucao.setText(construcao);

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

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //Fecha o sistema
        int id = pes.pesquisaCodProcesso();
        atualv.setId(id);


        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Deseja excluir esse registro?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (opc.toString().equals("0")) {
            atualv.excluirRegistro();

            JOptionPane.showMessageDialog(null, "Exclusão  efetuada com sucesso!");
            try {
                preenche_jtable();
            } catch (SQLException ex) {
                Logger.getLogger(FormExcluirRegistros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (proExc.equals(proExc)) {
            FormMenu M = new FormMenu(this, true);
            M.setVisible(true);
            M.group = proExc;
            M.acesso_user = acesso_bkp;
            dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tblAndamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAndamentoMouseClicked
        Object b = tblAndamento.getValueAt(tblAndamento.getSelectedRow(), 0);

        String idt = String.valueOf(b);
        int id = Integer.parseInt(idt);

        cad.setCodAndamento(id);

        txtDtEntrada.setText("");
        txtDtSaida.setText("");
        txtDtArquivado.setText("");
        txtAndamento.setText("");
        cbxExpedicao.setSelectedItem("");

        String dt1 = cad.pesquisaDtEntradaAndamento2();
        txtDtEntrada.setText(dt1);

        String dt2 = cad.pesquisaDtSaidaAndamento2();
        txtDtSaida.setText(dt2);

        String andamento = cad.pesquisaAndamento2();
        txtAndamento.setText(andamento);

        String exp = cad.pesquisaExpedicaoAndamento2();
        cbxExpedicao.setSelectedItem(exp);

        String dt3 = cad.pesquisaDtArquivadoAndamento2();
        txtDtArquivado.setText(dt3);
        
}//GEN-LAST:event_tblAndamentoMouseClicked

    private void txtUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUfActionPerformed

    private void txtListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtListarActionPerformed

    private void txtListarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListarKeyPressed
        if(evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
	   btnListar.doClick();
        }
    }//GEN-LAST:event_txtListarKeyPressed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormExcluirRegistros().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cbxExpedicao;
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
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
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
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable tblAndamento;
    private javax.swing.JTable tblProcesso;
    private javax.swing.JTextField txtAlvConstrucao;
    private javax.swing.JTextArea txtAndamento;
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
    private javax.swing.JTextArea txtComplemento2;
    private javax.swing.JTextArea txtComplementoAlvara;
    private javax.swing.JTextArea txtComunique;
    private javax.swing.JTextField txtContrucao;
    private javax.swing.JTextField txtCreasp1;
    private javax.swing.JTextField txtCreasp2;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDataAlvara;
    private javax.swing.JTextField txtDataComunique;
    private javax.swing.JTextField txtDataHabite;
    private javax.swing.JTextField txtDtArquivado;
    private javax.swing.JTextField txtDtEntrada;
    private javax.swing.JTextField txtDtSaida;
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
                                            ResultSet resultado = bd.consultaTable("SELECT codprocesso, numprocesso, anoprocesso, requerente, assunto, endereco  FROM processo "
                                                    + "WHERE processo.inscrmunicipalresptecnico LIKE '%" + pesquisa + "%' OR processo.  inscrmunicipalautorprojeto  LIKE '%" + pesquisa + "%' ORDER BY codprocesso DESC LIMIT 100");

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
            ResultSet resultado = bd.consultaTable("SELECT codandamentos,entrada, andamentos, saida, arquivado, expedicoes  FROM andamentos "
                    + "WHERE codprocesso = '" + id + "'");
            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
            {
                modelo.addRow(new Object[]{resultado.getInt("codandamentos"), resultado.getString("entrada"), resultado.getString("andamentos"), resultado.getString("saida"), resultado.getString("arquivado"), resultado.getString("expedicoes")});
            }

            resultado.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
        }

    }
}
