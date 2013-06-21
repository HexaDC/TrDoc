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
public class FormAtualizarRegistros extends javax.swing.JFrame {
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
    public String proAtu;
    public boolean[] acesso_bkp;
    private int largura = 614;
    private int altura = 657;

    public FormAtualizarRegistros() {
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

    FormAtualizarRegistros(FormMenu aThis, boolean b) {
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
        javax.swing.text.MaskFormatter dt = null;
        try {
            dt = new javax.swing.text.MaskFormatter("##/##/####");
            dt.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtData = new javax.swing.JFormattedTextField(dt);
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
        javax.swing.text.MaskFormatter ident2 = null;
        try {
            ident2 = new javax.swing.text.MaskFormatter("##.###.###-************************");
            ident2.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtIdentCadastral = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProcesso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRequerente = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAssunto = new javax.swing.JTextArea();
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
        btnAndamento = new javax.swing.JButton();
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
        btnAtualizar1 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAndamento = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
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
        javax.swing.text.MaskFormatter ano_1 = null;
        try {
            ano_1 = new javax.swing.text.MaskFormatter("##");
            ano_1.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtAnoAlvConstrucao = new javax.swing.JFormattedTextField(ano_1);
        jLabel37 = new javax.swing.JLabel();
        txtAlvConstrucao = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtAreaAlv = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter dt_1 = null;
        try {
            dt_1 = new javax.swing.text.MaskFormatter("##/##/####");
            dt_1.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDataAlvara =  new javax.swing.JFormattedTextField(dt_1);
        txtContrucao = new javax.swing.JTextField();
        txtSituacao = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
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
        javax.swing.text.MaskFormatter dt_2 = null;
        try {
            dt_2 = new javax.swing.text.MaskFormatter("##/##/####");
            dt_2.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDataHabite =  new javax.swing.JFormattedTextField(dt_2);
        jLabel27 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtFinalidade = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtConstru = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComplemento = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        jLabel47 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter ano_hab = null;
        try {
            ano_hab = new javax.swing.text.MaskFormatter("##");
            ano_hab.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtAnoHabite = new javax.swing.JFormattedTextField(ano_hab);
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
        javax.swing.text.MaskFormatter cep = null;
        try {
            cep = new javax.swing.text.MaskFormatter("##.###-###");
            cep.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtCep = new javax.swing.JFormattedTextField(cep);
        jLabel19 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter dt_3 = null;
        try {
            dt_3 = new javax.swing.text.MaskFormatter("##/##/####");
            dt_3.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDataComunique = new javax.swing.JFormattedTextField(dt_3);
        txtUf = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComunique = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        btnAtualizar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        cbxPesquisa = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
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
        jLabel1.setText("Atualização de Registros");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 141, 16);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 30, 590, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 190, 590, 10);

        btnListar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lista.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(520, 40, 81, 30);

        txtListar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListarKeyPressed(evt);
            }
        });
        getContentPane().add(txtListar);
        txtListar.setBounds(140, 40, 370, 30);

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 12));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(720, 339));

        jPanel1.setLayout(null);

        jTabbedPane3.setFont(new java.awt.Font("SansSerif", 1, 12));

        jPanel7.setLayout(null);

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        jPanel7.add(txtData);
        txtData.setBounds(190, 20, 100, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel7.setText("Data de Entrada");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(190, 0, 100, 20);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel4.setText("Assunto");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(10, 100, 48, 20);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("Endereço");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(10, 160, 80, 20);
        jPanel7.add(txtEndereco);
        txtEndereco.setBounds(10, 180, 530, 30);
        jPanel7.add(txtBairro);
        txtBairro.setBounds(10, 230, 330, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel6.setText("Bairro");
        jPanel7.add(jLabel6);
        jLabel6.setBounds(10, 210, 50, 20);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel8.setText("Loteamento");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(10, 260, 80, 20);
        jPanel7.add(txtLoteamento);
        txtLoteamento.setBounds(10, 280, 120, 30);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel9.setText("Lote");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(240, 260, 40, 20);
        jPanel7.add(txtLote);
        txtLote.setBounds(240, 280, 70, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel10.setText("Quadra");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(140, 260, 50, 20);
        jPanel7.add(txtQuadra);
        txtQuadra.setBounds(140, 280, 90, 30);
        jPanel7.add(txtIdentCadastral);
        txtIdentCadastral.setBounds(360, 230, 180, 30);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel11.setText("Identificação Cadastral");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(360, 210, 140, 20);

        jLabel45.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel45.setText("Ano");
        jPanel7.add(jLabel45);
        jLabel45.setBounds(120, 0, 50, 20);

        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });
        jPanel7.add(txtAno);
        txtAno.setBounds(120, 20, 50, 30);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("Nº Processo");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(10, 0, 71, 20);
        jPanel7.add(txtProcesso);
        txtProcesso.setBounds(10, 20, 90, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel3.setText("Requerente");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(10, 50, 95, 20);
        jPanel7.add(txtRequerente);
        txtRequerente.setBounds(10, 70, 530, 30);

        txtAssunto.setColumns(20);
        txtAssunto.setRows(5);
        jScrollPane1.setViewportView(txtAssunto);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel13);
        jPanel13.setBounds(10, 120, 530, 40);

        jTabbedPane3.addTab("Processo", jPanel7);

        jPanel8.setLayout(null);

        jLabel41.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel41.setText("Data de Entrada");
        jPanel8.add(jLabel41);
        jLabel41.setBounds(10, 110, 100, 20);
        jPanel8.add(txtDtEntrada);
        txtDtEntrada.setBounds(10, 130, 113, 30);

        jLabel42.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel42.setText("Data de Saída");
        jPanel8.add(jLabel42);
        jLabel42.setBounds(310, 110, 90, 20);

        jLabel43.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel43.setText("Andamento");
        jPanel8.add(jLabel43);
        jLabel43.setBounds(10, 160, 80, 20);

        jLabel44.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel44.setText("Expedição");
        jPanel8.add(jLabel44);
        jLabel44.setBounds(140, 110, 70, 20);

        cbxExpedicao.setFont(new java.awt.Font("SansSerif", 1, 12));
        cbxExpedicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALVARÁS", "COMUNIQUE-SE", "HABITE-SE", "OUTROS" }));
        jPanel8.add(cbxExpedicao);
        cbxExpedicao.setBounds(140, 130, 151, 30);

        jLabel46.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel46.setText("Data Aquivado");
        jPanel8.add(jLabel46);
        jLabel46.setBounds(440, 110, 90, 20);

        btnAndamento.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAndamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/vistoria.png"))); // NOI18N
        btnAndamento.setText("Adicionar Andamento");
        btnAndamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndamentoActionPerformed(evt);
            }
        });
        jPanel8.add(btnAndamento);
        btnAndamento.setBounds(370, 280, 170, 30);
        jPanel8.add(txtDtSaida);
        txtDtSaida.setBounds(310, 130, 113, 30);
        jPanel8.add(txtDtArquivado);
        txtDtArquivado.setBounds(440, 130, 101, 30);

        btnAtualizar1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAtualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/arrow_refresh.png"))); // NOI18N
        btnAtualizar1.setText("Atualizar Andamento");
        btnAtualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizar1ActionPerformed(evt);
            }
        });
        jPanel8.add(btnAtualizar1);
        btnAtualizar1.setBounds(10, 280, 170, 30);

        btnExcluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete1.png"))); // NOI18N
        btnExcluir.setText("Excluir Andamento");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel8.add(btnExcluir);
        btnExcluir.setBounds(190, 280, 170, 30);

        tblAndamento.setFont(new java.awt.Font("SansSerif", 1, 12));
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
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel10);
        jPanel10.setBounds(10, 10, 530, 100);

        jPanel11.setLayout(null);
        jPanel8.add(jPanel11);
        jPanel11.setBounds(10, 200, 530, 0);

        txtAndamento.setColumns(20);
        txtAndamento.setRows(5);
        jScrollPane8.setViewportView(txtAndamento);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel12);
        jPanel12.setBounds(10, 180, 530, 90);

        jTabbedPane3.addTab("Andamento", jPanel8);

        jPanel1.add(jTabbedPane3);
        jTabbedPane3.setBounds(10, 10, 558, 350);

        jTabbedPane1.addTab("Principal", jPanel1);

        jPanel4.setLayout(null);

        jTabbedPane2.setFont(new java.awt.Font("SansSerif", 1, 12));

        jPanel6.setLayout(null);
        jPanel6.add(txtInscMunicipal2);
        txtInscMunicipal2.setBounds(310, 70, 230, 30);
        jPanel6.add(txtCreasp2);
        txtCreasp2.setBounds(10, 70, 270, 30);

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel31.setText("Inscrição Municipal");
        jPanel6.add(jLabel31);
        jLabel31.setBounds(310, 50, 130, 20);

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel32.setText("Creasp");
        jPanel6.add(jLabel32);
        jLabel32.setBounds(10, 50, 41, 20);

        jLabel33.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel33.setText("Nome do Responsável Técnico");
        jPanel6.add(jLabel33);
        jLabel33.setBounds(10, 0, 200, 20);
        jPanel6.add(txtProfissional2);
        txtProfissional2.setBounds(10, 20, 530, 30);

        jTabbedPane2.addTab("Responsável Técnico", jPanel6);

        jPanel5.setLayout(null);

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel28.setText("Nome do Autor do Projeto");
        jPanel5.add(jLabel28);
        jLabel28.setBounds(10, 0, 180, 20);

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel29.setText("Creasp");
        jPanel5.add(jLabel29);
        jLabel29.setBounds(10, 50, 44, 20);
        jPanel5.add(txtCreasp1);
        txtCreasp1.setBounds(10, 70, 270, 30);

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel30.setText("Inscrição Municipal");
        jPanel5.add(jLabel30);
        jLabel30.setBounds(310, 50, 130, 20);
        jPanel5.add(txtInscMunicipal1);
        txtInscMunicipal1.setBounds(310, 70, 230, 30);
        jPanel5.add(txtProfissional1);
        txtProfissional1.setBounds(10, 20, 530, 30);

        jTabbedPane2.addTab("Autor do Projeto", jPanel5);

        jPanel4.add(jTabbedPane2);
        jTabbedPane2.setBounds(10, 10, 560, 140);

        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel34.setText("Tipo de Construção");
        jPanel4.add(jLabel34);
        jLabel34.setBounds(10, 160, 130, 20);

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel35.setText("Complemento");
        jPanel4.add(jLabel35);
        jLabel35.setBounds(10, 210, 90, 20);

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel36.setText("Ano");
        jPanel4.add(jLabel36);
        jLabel36.setBounds(150, 310, 90, 20);
        jPanel4.add(txtAnoAlvConstrucao);
        txtAnoAlvConstrucao.setBounds(150, 330, 50, 30);

        jLabel37.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel37.setText("Nº Alv. Construção");
        jPanel4.add(jLabel37);
        jLabel37.setBounds(10, 310, 110, 20);

        txtAlvConstrucao.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(txtAlvConstrucao);
        txtAlvConstrucao.setBounds(10, 330, 130, 30);

        jLabel38.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel38.setText("Área ( m² )");
        jPanel4.add(jLabel38);
        jLabel38.setBounds(280, 310, 60, 20);
        jPanel4.add(txtAreaAlv);
        txtAreaAlv.setBounds(280, 330, 100, 30);

        jLabel39.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel39.setText("Situação");
        jPanel4.add(jLabel39);
        jLabel39.setBounds(390, 310, 80, 20);

        jLabel40.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel40.setText("Data de Expedição");
        jPanel4.add(jLabel40);
        jLabel40.setBounds(450, 160, 110, 20);
        jPanel4.add(txtDataAlvara);
        txtDataAlvara.setBounds(450, 180, 120, 30);
        jPanel4.add(txtContrucao);
        txtContrucao.setBounds(10, 180, 420, 30);
        jPanel4.add(txtSituacao);
        txtSituacao.setBounds(390, 330, 180, 30);

        txtComplementoAlvara.setColumns(20);
        txtComplementoAlvara.setRows(5);
        jScrollPane5.setViewportView(txtComplementoAlvara);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel17);
        jPanel17.setBounds(10, 230, 560, 80);

        jTabbedPane1.addTab("Alvarás", jPanel4);

        jPanel3.setLayout(null);

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel21.setText("Complemento");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(10, 0, 79, 20);

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel22.setText("Área Habite-se ( m² )");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(10, 130, 130, 20);
        jPanel3.add(txtAreaHabite);
        txtAreaHabite.setBounds(10, 150, 140, 30);

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel23.setText("Área Aprovada ( m² )");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(270, 130, 120, 16);
        jPanel3.add(txtAreaAprovada);
        txtAreaAprovada.setBounds(270, 150, 139, 30);

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel24.setText("Nº de Aprovação");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(270, 180, 110, 20);
        jPanel3.add(txtNumAprovacao);
        txtNumAprovacao.setBounds(270, 200, 140, 30);

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel25.setText("Nº Habite-se");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(10, 180, 69, 20);
        jPanel3.add(txtNumHabite);
        txtNumHabite.setBounds(10, 200, 139, 30);

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel26.setText("Data de Expedição");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(10, 230, 110, 20);
        jPanel3.add(txtDataHabite);
        txtDataHabite.setBounds(10, 250, 110, 30);

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel27.setText("Observação");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(10, 280, 80, 20);

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel20.setText("Finalidade");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(270, 230, 70, 20);
        jPanel3.add(txtFinalidade);
        txtFinalidade.setBounds(270, 250, 210, 30);

        jLabel48.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel48.setText("Tipo de Construção");
        jPanel3.add(jLabel48);
        jLabel48.setBounds(10, 80, 120, 20);
        jPanel3.add(txtConstru);
        txtConstru.setBounds(10, 100, 560, 30);

        txtComplemento.setColumns(20);
        txtComplemento.setRows(5);
        jScrollPane3.setViewportView(txtComplemento);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel15);
        jPanel15.setBounds(10, 20, 560, 60);

        txtObservacao.setColumns(20);
        txtObservacao.setRows(5);
        jScrollPane4.setViewportView(txtObservacao);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel16);
        jPanel16.setBounds(10, 300, 560, 60);

        jLabel47.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel47.setText("Ano");
        jPanel3.add(jLabel47);
        jLabel47.setBounds(170, 180, 22, 20);

        txtAnoHabite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoHabiteActionPerformed(evt);
            }
        });
        jPanel3.add(txtAnoHabite);
        txtAnoHabite.setBounds(170, 200, 40, 30);

        jTabbedPane1.addTab("Habite-se", jPanel3);

        jPanel2.setLayout(null);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel12.setText("Comunique-se");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 0, 82, 20);

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel13.setText("Logradouro");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 210, 80, 20);
        jPanel2.add(txtLogradouro);
        txtLogradouro.setBounds(10, 230, 480, 30);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel14.setText("Bairro");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 260, 50, 20);
        jPanel2.add(txtBairroComunique);
        txtBairroComunique.setBounds(10, 280, 190, 30);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel15.setText("Nº");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(500, 210, 30, 20);
        jPanel2.add(txtNum);
        txtNum.setBounds(500, 230, 70, 30);

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel16.setText("Cidade");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(210, 260, 43, 20);
        jPanel2.add(txtCidade);
        txtCidade.setBounds(210, 280, 300, 30);

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel17.setText("UF");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(520, 260, 20, 20);

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel18.setText("Cep");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(10, 310, 22, 20);
        jPanel2.add(txtCep);
        txtCep.setBounds(10, 330, 180, 30);

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel19.setText("Data de expedição");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(210, 310, 110, 20);
        jPanel2.add(txtDataComunique);
        txtDataComunique.setBounds(210, 330, 110, 30);
        jPanel2.add(txtUf);
        txtUf.setBounds(520, 280, 50, 30);

        txtComunique.setColumns(20);
        txtComunique.setRows(5);
        jScrollPane2.setViewportView(txtComunique);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel14);
        jPanel14.setBounds(10, 20, 560, 190);

        jTabbedPane1.addTab("Comunique-se", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 200, 590, 400);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 610, 590, 10);

        btnAtualizar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        btnAtualizar.setText("Atualizar Processo");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(420, 620, 180, 30);

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
        cbxPesquisa.setBounds(10, 40, 120, 30);

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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel9);
        jPanel9.setBounds(10, 80, 590, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormAtualizarRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_btnListarActionPerformed

    private void tblProcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcessoMouseClicked
        Object a = tblProcesso.getValueAt(tblProcesso.getSelectedRow(), 0);

        String idt = String.valueOf(a);
        int id = Integer.parseInt(idt);

        try {
            preenche_jtable2(id);
        } catch (SQLException ex) {
            Logger.getLogger(FormAtualizarRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }


        pes.setID(id);


        txtDtEntrada.setText("");

        txtDtSaida.setText("");

        txtAndamento.setText("");

        cbxExpedicao.setSelectedItem("");

        txtDtArquivado.setText("");
        btnAndamento.setEnabled(true);
        btnAtualizar1.setEnabled(false);
        btnExcluir.setEnabled(false);

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

        String constru = pes.pesquisaConstruHabite();
        txtConstru.setText(constru);

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

        String finalidade = pes.pesquisaFinalidadeHabite();
        txtFinalidade.setText(finalidade);

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

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        int id = pes.pesquisaCodProcesso();
        atup.setId(id);

        String data_proc = txtData.getText();
        String assunto = txtAssunto.getText().toUpperCase();
        String endereco = txtEndereco.getText().toUpperCase();
        String bairro = txtBairro.getText().toUpperCase();
        String loteamento = txtLoteamento.getText().toUpperCase();
        String lote = txtLote.getText().toUpperCase();
        String quadra = txtQuadra.getText().toUpperCase();
        String ident = txtIdentCadastral.getText().toUpperCase();
        String requer = txtRequerente.getText().toUpperCase();

        //Comunique
        atuc.setId(id);
        String comunique = txtComunique.getText().toUpperCase();
        String logra = txtLogradouro.getText().toUpperCase();
        String bairroComunique = txtBairroComunique.getText().toUpperCase();
        String num = txtNum.getText().toUpperCase();
        String cidade = txtCidade.getText().toUpperCase();
        String uf = txtUf.getText().toUpperCase().toUpperCase();
        String cep = txtCep.getText().toUpperCase();
        String data = txtDataComunique.getText();


        //Habite
        atuh.setId(id);
        String obs = txtObservacao.getText().toUpperCase();
        String comp = txtComplemento.getText().toUpperCase();
        String constru = txtConstru.getText().toUpperCase();
        String area_h = txtAreaHabite.getText().toUpperCase();
        String area_a = txtAreaAprovada.getText().toUpperCase();
        String num_aprov = txtNumAprovacao.getText().toUpperCase();
        String num_h = txtNumHabite.getText().toUpperCase();
        String ano_habite = txtAnoHabite.getText().toUpperCase();
        String datah = txtDataHabite.getText().toUpperCase();
        String finalidade = txtFinalidade.getText().toUpperCase();




        //Alvarás
        atual.setId(id);
        //autor do projeto

        String prof1 = txtProfissional1.getText().toUpperCase();
        String creasp1 = txtCreasp1.getText().toUpperCase();
        String insc1 = txtInscMunicipal1.getText().toUpperCase();

        // técnico responsável
        String prof2 = txtProfissional2.getText().toUpperCase();
        String creasp2 = txtCreasp2.getText().toUpperCase();
        String insc2 = txtInscMunicipal2.getText().toUpperCase();

        //Dados de alvará
        String constralv = txtContrucao.getText().toUpperCase();
        String compl = txtComplementoAlvara.getText().toUpperCase();
        String nump = txtAnoAlvConstrucao.getText().toUpperCase();
        String numc = txtAlvConstrucao.getText().toUpperCase();
        String area = txtAreaAlv.getText().toUpperCase();
        String dataalv = txtDataAlvara.getText().toUpperCase();
        String sit = txtSituacao.getText().toUpperCase();


        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Deseja salvar as alterações?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (opc.toString().equals("0")) {
            atup.atualizarProcesso(data_proc, assunto, requer, endereco, bairro, loteamento, lote, quadra, ident);
            atuc.atualizarComunique(comunique, logra, bairroComunique, num, cidade, uf, cep, data);
            atuh.atualizarHabite(obs, comp, constru, area_h, num_aprov, num_h, ano_habite, datah, area_a, finalidade);
            atual.atualizarAlvara2(prof1, creasp1, insc1, prof2, creasp2, insc2, constralv, compl, nump, numc, area, dataalv, sit);
            JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");


            try {
                preenche_jtable();
            } catch (SQLException ex) {
                Logger.getLogger(FormAtualizarRegistros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        txtCreasp1.setText("");
        txtInscMunicipal1.setText("");
        txtProfissional1.setText("");
        txtCreasp2.setText("");
        txtInscMunicipal2.setText("");
        txtProfissional2.setText("");

        txtComplemento.setText("");
        txtDataAlvara.setText("");
        txtComunique.setText("");
        txtLogradouro.setText("");
        txtBairroComunique.setText("");
        txtNum.setText("");
        txtCidade.setText("");
        txtCep.setText("");
        txtDataComunique.setText("");
        txtUf.setText("");


        txtObservacao.setText("");
        txtComplemento.setText("");
        txtAreaHabite.setText("");
        txtAreaAprovada.setText("");
        txtNumAprovacao.setText("");
        txtNumHabite.setText("");
        txtAnoHabite.setText("");;                
        txtDataHabite.setText("");


        txtProcesso.setText("");
        txtAno.setText("");
        txtData.setText("");
        txtRequerente.setText("");
        txtAssunto.setText("");
        txtEndereco.setText("");
        txtBairro.setText("");
        txtLoteamento.setText("");
        txtLote.setText("");
        txtQuadra.setText("");
        txtIdentCadastral.setText("");

        txtDtEntrada.setText("");
        txtDtSaida.setText("");
        txtDtArquivado.setText("");
        txtAndamento.setText("");
        txtFinalidade.setText("");












    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (proAtu.equals(proAtu)) {
            FormMenu M = new FormMenu(this, true);
            M.setVisible(true);
            M.group = proAtu;
            M.acesso_user = acesso_bkp;
            dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAndamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndamentoActionPerformed
        String num = txtProcesso.getText();
        int n = Integer.valueOf(num);
        String ano = txtAno.getText();
        int nu = pes.pesquisaCodigoProcessos(n, ano);

        cad.setId(nu);

        String dt_entrada_and = txtDtEntrada.getText();
        String dt_saida_and = txtDtSaida.getText();
        String arquivado = txtDtArquivado.getText();
        String andamento = txtAndamento.getText().toUpperCase();
        String expedicao = cbxExpedicao.getSelectedItem().toString();


        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Salvar novo andamento?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (opc.toString().equals("0")) {
            cad.cadastrarAndamento(andamento, dt_entrada_and, dt_saida_and, arquivado, expedicao);

            JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");

            try {
                preenche_jtable2(nu);
            } catch (SQLException ex) {
                Logger.getLogger(FormCadastrarComunique.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtDtEntrada.setText("");
            txtDtSaida.setText("");
            txtDtArquivado.setText("");
            txtAndamento.setText("");
            cbxExpedicao.setSelectedItem("");
        }
}//GEN-LAST:event_btnAndamentoActionPerformed

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

        btnAndamento.setEnabled(false);
        btnAtualizar1.setEnabled(true);
        btnExcluir.setEnabled(true);
}//GEN-LAST:event_tblAndamentoMouseClicked

    private void btnAtualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizar1ActionPerformed
        Object b = tblAndamento.getValueAt(tblAndamento.getSelectedRow(), 0);

        String idt = String.valueOf(b);
        int id = Integer.parseInt(idt);
        cad.setCodAndamento(id);

        String dt0 = txtDtEntrada.getText();
        String dt1 = txtDtSaida.getText();
        String dt2 = txtDtArquivado.getText();
        String and = txtAndamento.getText();
        String exp = cbxExpedicao.getSelectedItem().toString();
        String num = txtProcesso.getText();
        int n = Integer.valueOf(num);
        String ano = txtAno.getText();
        int nu = pes.pesquisaCodigoProcessos(n, ano);

        cad.setId(nu);

        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Deseja salvar essa alteração?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (opc.toString().equals("0")) {
            cad.atualizarAndamento(dt0, dt1, dt2, and, exp);

            JOptionPane.showMessageDialog(null, "Alteração salva com sucesso!");

            try {
                preenche_jtable2(nu);
            } catch (SQLException ex) {
                Logger.getLogger(FormCadastrarComunique.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtDtEntrada.setText("");
            txtDtSaida.setText("");
            txtDtArquivado.setText("");
            txtAndamento.setText("");
            btnAndamento.setEnabled(true);
            btnAtualizar1.setEnabled(false);
            btnExcluir.setEnabled(false);


        }
}//GEN-LAST:event_btnAtualizar1ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Object b = tblAndamento.getValueAt(tblAndamento.getSelectedRow(), 0);

        String idt = String.valueOf(b);
        int id = Integer.parseInt(idt);
        cad.setCodAndamento(id);


        String num = txtProcesso.getText();
        int n = Integer.valueOf(num);
        String ano = txtAno.getText();
        int nu = pes.pesquisaCodigoProcessos(n, ano);

        cad.setId(nu);

        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Deseja excluir esse andamento?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (opc.toString().equals("0")) {
            cad.excluirAndamento();

            JOptionPane.showMessageDialog(null, "Exclusão de andamento efetuada com sucesso!");

            try {
                preenche_jtable2(nu);
            } catch (SQLException ex) {
                Logger.getLogger(FormCadastrarComunique.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtDtEntrada.setText("");
            txtDtSaida.setText("");
            txtDtArquivado.setText("");
            txtAndamento.setText("");
            btnAndamento.setEnabled(true);
            btnAtualizar1.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void txtAnoHabiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoHabiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoHabiteActionPerformed

    private void txtListarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListarKeyPressed
        if(evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
	   btnListar.doClick();
        }
    }//GEN-LAST:event_txtListarKeyPressed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormAtualizarRegistros().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndamento;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnAtualizar1;
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
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
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
    private javax.swing.JPanel jPanel17;
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
    private javax.swing.JTextArea txtComplemento;
    private javax.swing.JTextArea txtComplementoAlvara;
    private javax.swing.JTextArea txtComunique;
    private javax.swing.JTextField txtConstru;
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
    private javax.swing.JTextField txtFinalidade;
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
