/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormCadastrarAlvara.java
 *
 * Created on 19/07/2011, 10:29:56
 */
package Forms;

import Classes.Cadastra.ClassCadastrarAndamento;
import Classes.Pesquisa.ClassPesquisaDadosRequerente;
import Classes.Pesquisa.ClassPesquisaProfissional;
import Classes.Pesquisa.ClassCarregarCombo;
import Classes.Atualiza.ClassAtualizarAlvara;
import Util.AcessoBD;
import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jenny
 */
public class FormCadastrarAlvara extends javax.swing.JFrame {

    AcessoBD bd = new AcessoBD();
    ClassCarregarCombo com = new ClassCarregarCombo();
    ClassPesquisaDadosRequerente pes = new ClassPesquisaDadosRequerente();
    ClassAtualizarAlvara atu = new ClassAtualizarAlvara();
    public boolean[] acesso_bkp;
    ClassCadastrarAndamento cad = new ClassCadastrarAndamento();
    public String trmAlv;
    private int largura = 591;
    private int altura = 669;

    public FormCadastrarAlvara() {
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


        //Carrega o jcombobox profissional
        Vector p = com.Profissional();
        comboProfissional1.removeAllItems();
        comboProfissional2.removeAllItems();
        comboProfissional1.addItem("O mesmo");
        comboProfissional2.addItem("Nenhum");
        for (int i = 0; i < p.size(); i++) {
            comboProfissional1.addItem(p.elementAt(i));
            comboProfissional2.addItem(p.elementAt(i));
        }
        comboProfissional1.setSelectedItem("O mesmo");
        comboProfissional2.setSelectedItem("Nenhum");
        

        Vector c = com.Construcao();
        comboConstrucao.removeAllItems();
        comboConstrucao.addItem("Escolha");
        for (int i = 0; i < c.size(); i++) {
            comboConstrucao.addItem(c.elementAt(i));
        }
    }

    FormCadastrarAlvara(FormMenu aThis, boolean b) {
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


        //Carrega o jcombobox profissional
        Vector p = com.Profissional();
        comboProfissional1.removeAllItems();
        comboProfissional2.removeAllItems();
        comboProfissional1.addItem("O mesmo");
        comboProfissional2.addItem("Nenhum");
        for (int i = 0; i < p.size(); i++) {
            comboProfissional1.addItem(p.elementAt(i));
            comboProfissional2.addItem(p.elementAt(i));
        }
        comboProfissional1.setSelectedItem("O mesmo");
        comboProfissional2.setSelectedItem("Nenhum");
        

        Vector c = com.Construcao();
        comboConstrucao.removeAllItems();
        comboConstrucao.addItem("Escolha");
        for (int i = 0; i < c.size(); i++) {
            comboConstrucao.addItem(c.elementAt(i));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtComplemento = new javax.swing.JTextField();
        btnListar = new javax.swing.JButton();
        cbxPesquisa = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtListar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        javax.swing.text.MaskFormatter dt_6 = null;
        try {
            dt_6 = new javax.swing.text.MaskFormatter("##/##/####");
            dt_6.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtData = new javax.swing.JFormattedTextField(dt_6);
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
        jLabel2 = new javax.swing.JLabel();
        txtProcesso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRequerente = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAssunto = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter entrada4 = null;
        try {
            entrada4 = new javax.swing.text.MaskFormatter("##/##/####");
            entrada4.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDtEntrada = new javax.swing.JFormattedTextField(entrada4);
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        cbxExpedicao = new javax.swing.JComboBox();
        jLabel43 = new javax.swing.JLabel();
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
        btnAtualizar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAndamento = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAndamento = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        tecnico = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtFormacao2 = new javax.swing.JTextField();
        crea2 = new javax.swing.JLabel();
        txtCreasp2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtInscMunicipal2 = new javax.swing.JTextField();
        comboProfissional2 = new javax.swing.JComboBox();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtArt2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFormacao1 = new javax.swing.JTextField();
        crea = new javax.swing.JLabel();
        txtCreasp1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtInscMunicipal1 = new javax.swing.JTextField();
        comboProfissional1 = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtArt1 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter ano = null;
        try {
            ano = new javax.swing.text.MaskFormatter("##");
            ano.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtAnoAlvConstrucao = new javax.swing.JFormattedTextField(ano);
        jLabel18 = new javax.swing.JLabel();
        comboConstrucao = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        txtNumAlvConstrucao = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        comboSituacao = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter dt1 = null;
        try {
            dt1 = new javax.swing.text.MaskFormatter("##/##/####");
            dt1.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDataAlvara = new javax.swing.JFormattedTextField(dt1);
        txtArea = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComplemento2 = new javax.swing.JTextArea();
        jSeparator4 = new javax.swing.JSeparator();
        btnConcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblProcesso = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TRDoc - Tramitação de Documentos");
        setResizable(false);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        btnListar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lista.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(490, 40, 90, 30);

        cbxPesquisa.setFont(new java.awt.Font("SansSerif", 1, 12));
        cbxPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nº Processo", "Requerente", "Assunto", "Endereço", "Ident. Cadastral", "Profissional", "Insc. Municipal" }));
        getContentPane().add(cbxPesquisa);
        cbxPesquisa.setBounds(10, 40, 128, 30);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel1.setText("Alvarás");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 50, 16);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(12, 33, 570, 10);

        txtListar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListarKeyPressed(evt);
            }
        });
        getContentPane().add(txtListar);
        txtListar.setBounds(150, 40, 330, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 180, 570, 10);

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 12));

        jPanel1.setLayout(null);

        jTabbedPane3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jPanel7.setLayout(null);

        txtData.setFocusable(false);
        jPanel7.add(txtData);
        txtData.setBounds(180, 20, 110, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel7.setText("Data de Entrada");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(180, 0, 100, 20);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel4.setText("Assunto");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(10, 100, 47, 20);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("Endereço");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(10, 180, 80, 20);

        txtEndereco.setFocusable(false);
        jPanel7.add(txtEndereco);
        txtEndereco.setBounds(10, 200, 510, 30);

        txtBairro.setFocusable(false);
        jPanel7.add(txtBairro);
        txtBairro.setBounds(10, 250, 330, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel6.setText("Bairro");
        jPanel7.add(jLabel6);
        jLabel6.setBounds(10, 230, 60, 20);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel8.setText("Loteamento");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(10, 280, 80, 20);

        txtLoteamento.setFocusable(false);
        jPanel7.add(txtLoteamento);
        txtLoteamento.setBounds(10, 300, 100, 30);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel9.setText("Lote");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(260, 280, 40, 20);

        txtLote.setFocusable(false);
        jPanel7.add(txtLote);
        txtLote.setBounds(260, 300, 90, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel10.setText("Quadra");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(130, 280, 50, 20);

        txtQuadra.setFocusable(false);
        jPanel7.add(txtQuadra);
        txtQuadra.setBounds(130, 300, 110, 30);

        txtIdentCadastral.setFocusable(false);
        jPanel7.add(txtIdentCadastral);
        txtIdentCadastral.setBounds(370, 250, 150, 30);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel11.setText("Identificação Cadastral");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(370, 230, 140, 20);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("Nº Processo");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(10, 0, 70, 20);

        txtProcesso.setFocusable(false);
        jPanel7.add(txtProcesso);
        txtProcesso.setBounds(10, 20, 90, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel3.setText("Requerente");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(10, 50, 66, 20);

        txtRequerente.setFocusable(false);
        jPanel7.add(txtRequerente);
        txtRequerente.setBounds(10, 70, 510, 30);

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel27.setText("Ano");
        jPanel7.add(jLabel27);
        jLabel27.setBounds(120, 0, 30, 20);

        txtAno.setFocusable(false);
        jPanel7.add(txtAno);
        txtAno.setBounds(120, 20, 44, 30);

        txtAssunto.setColumns(20);
        txtAssunto.setRows(5);
        txtAssunto.setFocusable(false);
        jScrollPane1.setViewportView(txtAssunto);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel4);
        jPanel4.setBounds(10, 120, 510, 60);

        jTabbedPane3.addTab("Processo", jPanel7);

        jPanel8.setLayout(null);

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel26.setText("Data de Entrada");
        jPanel8.add(jLabel26);
        jLabel26.setBounds(10, 140, 100, 20);
        jPanel8.add(txtDtEntrada);
        txtDtEntrada.setBounds(10, 160, 100, 30);

        jLabel41.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel41.setText("Data de Saída");
        jPanel8.add(jLabel41);
        jLabel41.setBounds(130, 140, 80, 20);

        jLabel42.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel42.setText("Andamento");
        jPanel8.add(jLabel42);
        jLabel42.setBounds(10, 190, 65, 16);

        jLabel44.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel44.setText("Expedição");
        jPanel8.add(jLabel44);
        jLabel44.setBounds(370, 140, 70, 20);

        cbxExpedicao.setFont(new java.awt.Font("SansSerif", 1, 12));
        cbxExpedicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALVARÁS", "COMUNIQUE-SE", "HABITE-SE", "OUTROS" }));
        jPanel8.add(cbxExpedicao);
        cbxExpedicao.setBounds(370, 160, 134, 30);

        jLabel43.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel43.setText("Data Aquivado");
        jPanel8.add(jLabel43);
        jLabel43.setBounds(250, 140, 90, 20);

        btnAndamento.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAndamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/vistoria.png"))); // NOI18N
        btnAndamento.setText("Adicionar Andamento");
        btnAndamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndamentoActionPerformed(evt);
            }
        });
        jPanel8.add(btnAndamento);
        btnAndamento.setBounds(355, 300, 170, 30);
        jPanel8.add(txtDtSaida);
        txtDtSaida.setBounds(130, 160, 100, 30);
        jPanel8.add(txtDtArquivado);
        txtDtArquivado.setBounds(250, 160, 100, 30);

        btnAtualizar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/arrow_refresh.png"))); // NOI18N
        btnAtualizar.setText("Atualizar Andamento");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel8.add(btnAtualizar);
        btnAtualizar.setBounds(10, 300, 180, 30);

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
        tblAndamento.getColumnModel().getColumn(0).setResizable(false);
        tblAndamento.getColumnModel().getColumn(0).setPreferredWidth(10);
        tblAndamento.getColumnModel().getColumn(1).setResizable(false);
        tblAndamento.getColumnModel().getColumn(1).setPreferredWidth(20);
        tblAndamento.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblAndamento.getColumnModel().getColumn(3).setResizable(false);
        tblAndamento.getColumnModel().getColumn(3).setPreferredWidth(20);
        tblAndamento.getColumnModel().getColumn(4).setResizable(false);
        tblAndamento.getColumnModel().getColumn(4).setPreferredWidth(20);
        tblAndamento.getColumnModel().getColumn(5).setResizable(false);
        tblAndamento.getColumnModel().getColumn(5).setPreferredWidth(50);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel6);
        jPanel6.setBounds(10, 10, 510, 130);

        txtAndamento.setColumns(20);
        txtAndamento.setRows(5);
        jScrollPane8.setViewportView(txtAndamento);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9);
        jPanel9.setBounds(10, 210, 510, 80);

        jTabbedPane3.addTab("Andamento", jPanel8);

        jPanel1.add(jTabbedPane3);
        jTabbedPane3.setBounds(12, 10, 540, 370);

        jTabbedPane1.addTab("Principal", jPanel1);

        jPanel2.setLayout(null);

        tecnico.setFont(new java.awt.Font("SansSerif", 1, 12));

        jPanel5.setLayout(null);

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel22.setText("Nome do Responsável Técnico");
        jPanel5.add(jLabel22);
        jLabel22.setBounds(10, 0, 190, 20);

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel23.setText("Formação");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(10, 50, 57, 20);

        txtFormacao2.setFocusable(false);
        txtFormacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormacao2ActionPerformed(evt);
            }
        });
        jPanel5.add(txtFormacao2);
        txtFormacao2.setBounds(10, 70, 210, 30);

        crea2.setFont(new java.awt.Font("SansSerif", 1, 12));
        crea2.setText("CREASP");
        jPanel5.add(crea2);
        crea2.setBounds(230, 50, 47, 20);

        txtCreasp2.setFocusable(false);
        jPanel5.add(txtCreasp2);
        txtCreasp2.setBounds(230, 70, 150, 30);

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel24.setText("ART");
        jPanel5.add(jLabel24);
        jLabel24.setBounds(10, 100, 23, 20);

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel25.setText("Inscrição Municipal");
        jPanel5.add(jLabel25);
        jLabel25.setBounds(390, 50, 120, 20);

        txtInscMunicipal2.setFocusable(false);
        jPanel5.add(txtInscMunicipal2);
        txtInscMunicipal2.setBounds(390, 70, 130, 30);

        comboProfissional2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProfissional2ActionPerformed(evt);
            }
        });
        jPanel5.add(comboProfissional2);
        comboProfissional2.setBounds(10, 20, 510, 30);

        txtArt2.setColumns(20);
        txtArt2.setRows(5);
        jScrollPane5.setViewportView(txtArt2);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel12);
        jPanel12.setBounds(10, 120, 510, 40);

        tecnico.addTab("Responsável Técnico", jPanel5);

        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel14.setText("Nome do Autor do Projeto");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(10, 0, 170, 20);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel15.setText("Formação");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(10, 50, 57, 20);

        txtFormacao1.setFocusable(false);
        jPanel3.add(txtFormacao1);
        txtFormacao1.setBounds(10, 70, 210, 30);

        crea.setFont(new java.awt.Font("SansSerif", 1, 12));
        crea.setText("CREASP");
        jPanel3.add(crea);
        crea.setBounds(230, 50, 47, 20);

        txtCreasp1.setFocusable(false);
        jPanel3.add(txtCreasp1);
        txtCreasp1.setBounds(230, 70, 150, 30);

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel16.setText("ART");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(10, 100, 23, 20);

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel17.setText("Inscrição Municipal");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(390, 50, 120, 20);

        txtInscMunicipal1.setFocusable(false);
        jPanel3.add(txtInscMunicipal1);
        txtInscMunicipal1.setBounds(390, 70, 130, 30);

        comboProfissional1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProfissional1ActionPerformed(evt);
            }
        });
        jPanel3.add(comboProfissional1);
        comboProfissional1.setBounds(10, 20, 510, 30);

        txtArt1.setColumns(20);
        txtArt1.setRows(5);
        jScrollPane4.setViewportView(txtArt1);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel10);
        jPanel10.setBounds(10, 120, 510, 40);

        tecnico.addTab("Autor do Projeto", jPanel3);

        jPanel2.add(tecnico);
        tecnico.setBounds(10, 10, 540, 200);

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel19.setText("Complemento");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(10, 260, 79, 20);
        jPanel2.add(txtAnoAlvConstrucao);
        txtAnoAlvConstrucao.setBounds(160, 350, 40, 30);

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel18.setText("Construção");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(10, 210, 80, 20);

        jPanel2.add(comboConstrucao);
        comboConstrucao.setBounds(10, 230, 430, 30);

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel20.setText("Ano");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(160, 330, 90, 20);

        txtNumAlvConstrucao.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(txtNumAlvConstrucao);
        txtNumAlvConstrucao.setBounds(10, 350, 140, 30);

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel28.setText("Nº Alvará Construção");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(10, 330, 130, 20);

        comboSituacao.setFont(new java.awt.Font("SansSerif", 1, 12));
        comboSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AMPLIAÇÃO", "REFORMA", "SUBSTITUIÇÃO", "REGULARIZAÇÃO", "DEMOLIÇÃO", "CONSTRUÇÃO" }));
        jPanel2.add(comboSituacao);
        comboSituacao.setBounds(430, 350, 130, 30);

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel13.setText("Situação");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(430, 330, 80, 20);
        jPanel2.add(txtDataAlvara);
        txtDataAlvara.setBounds(220, 350, 100, 30);
        jPanel2.add(txtArea);
        txtArea.setBounds(330, 350, 90, 30);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel12.setText("Área ( m² )");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(330, 330, 60, 20);

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel21.setText("Data do Alvará");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(220, 330, 82, 20);

        btnAdd.setFont(new java.awt.Font("SansSerif", 1, 12));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROGRAMA/add.png"))); // NOI18N
        btnAdd.setText("Adiciona");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);
        btnAdd.setBounds(460, 230, 77, 30);

        txtComplemento2.setColumns(20);
        txtComplemento2.setRows(5);
        jScrollPane3.setViewportView(txtComplemento2);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel13);
        jPanel13.setBounds(10, 280, 540, 50);

        jTabbedPane1.addTab("Alvarás", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 190, 570, 420);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(10, 620, 570, 10);

        btnConcluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/concluir.png"))); // NOI18N
        btnConcluir.setText("Concluir Tramitação");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConcluir);
        btnConcluir.setBounds(410, 630, 170, 30);

        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(10, 630, 90, 30);

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
        tblProcesso.getColumnModel().getColumn(4).setMaxWidth(300);
        tblProcesso.getColumnModel().getColumn(5).setMinWidth(50);
        tblProcesso.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblProcesso.getColumnModel().getColumn(5).setMaxWidth(300);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel11);
        jPanel11.setBounds(10, 80, 570, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastrarAlvara.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_btnListarActionPerformed

    private void tblProcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcessoMouseClicked
        Object C = tblProcesso.getValueAt(tblProcesso.getSelectedRow(), 0);

        String idt = String.valueOf(C);
        int id = Integer.parseInt(idt);

        try {
            preenche_jtable2(id);
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastrarAlvara.class.getName()).log(Level.SEVERE, null, ex);
        }



        pes.setID(id);

        txtDtEntrada.setText("");

        txtDtSaida.setText("");

        txtAndamento.setText("");

        txtFormacao1.setText("");

        txtFormacao2.setText("");

        cbxExpedicao.setSelectedItem("");

        txtDtArquivado.setText("");
        btnAndamento.setEnabled(true);
        btnAtualizar.setEnabled(false);

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
        if(nome1.equals("")||(nome1.equals(null))){
            
        }else{
            comboProfissional1.setSelectedItem(nome1);
        }
        

        String creasp1 = pes.pesquisaCreaspAutor();
        txtCreasp1.setText(creasp1);

        String insc1 = pes.pesquisaInscMunicipalAutor();
        txtInscMunicipal1.setText(insc1);

        String art1 = pes.pesquisaArtAutor();
        txtArt1.setText(art1);

        String nome2 = pes.pesquisaNomeProfissionalTecnico();
        if(nome2.equals("")||(nome2.equals(null))){
            
        }else{
        comboProfissional2.setSelectedItem(nome2);
        }

        String creasp2 = pes.pesquisaCreaspTecnico();
        txtCreasp2.setText(creasp2);

        String insc2 = pes.pesquisaInscMunicipalTecnico();
        txtInscMunicipal2.setText(insc2);

        String art2 = pes.pesquisaArtTecnico();
        txtArt2.setText(art2);

        String construcao = pes.pesquisaConstrucaoAlvara();
        comboConstrucao.setSelectedItem(construcao);

        String comp_alv = pes.pesquisaComplementoAlvara();
        txtComplemento2.setText(comp_alv);

        String ano_alvconstru = pes.pesquisaAnoAlvaraConstrucao();
        txtAnoAlvConstrucao.setText(ano_alvconstru);

        String num_alvc = pes.pesquisaNumAlvaraConstrucao();
        txtNumAlvConstrucao.setText(num_alvc);

        String area_alv = pes.pesquisaAreaAlvara();
        txtArea.setText(area_alv);

        String dt_alv = pes.pesquisaDataAlvaraConstrucao();
        txtDataAlvara.setText(dt_alv);

        String situacao = pes.pesquisaSituacao();
        comboSituacao.setSelectedItem(situacao);
}//GEN-LAST:event_tblProcessoMouseClicked

    private void comboProfissional1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProfissional1ActionPerformed
        
            if(comboProfissional1.getSelectedItem().toString().equals("O mesmo")){
                txtFormacao1.setText("");
                txtCreasp1.setText("");
                txtInscMunicipal1.setText("");
                txtArt1.setText("");
            }else{
            ClassPesquisaProfissional pro1 = new ClassPesquisaProfissional();

            JComboBox cb1 = (JComboBox) evt.getSource();
            String p = (String) cb1.getSelectedItem();

            int id1 = pro1.pesquisaIdProfissional2(p);
            pro1.setIdProfissional(id1);

            String form1 = pro1.pesquisaFormacao();
            txtFormacao1.setText(form1);

            String creas1 = pro1.pesquisaCreasp();
            txtCreasp1.setText(creas1);

            String inc1 = pro1.pesquisaInscrMunicipal();
            txtInscMunicipal1.setText(inc1);
            }
}//GEN-LAST:event_comboProfissional1ActionPerformed

    private void comboProfissional2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProfissional2ActionPerformed
            if(comboProfissional2.getSelectedItem().toString().equals("Nenhum")){
                txtFormacao2.setText("");
                txtCreasp2.setText("");
                txtInscMunicipal2.setText("");
                txtArt2.setText("");
            }else{
            ClassPesquisaProfissional pro2 = new ClassPesquisaProfissional();
            JComboBox cb2 = (JComboBox) evt.getSource();
            String p = (String) cb2.getSelectedItem();

            int id2 = pro2.pesquisaIdProfissional2(p);
            pro2.setIdProfissional(id2);

            String form2 = pro2.pesquisaFormacao();
            txtFormacao2.setText(form2);

            String creas2 = pro2.pesquisaCreasp();
            txtCreasp2.setText(creas2);

            String inc2 = pro2.pesquisaInscrMunicipal();
            txtInscMunicipal2.setText(inc2);
            }
}//GEN-LAST:event_comboProfissional2ActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        //Realiza o cadastro de alvara
        Object C = tblProcesso.getValueAt(tblProcesso.getSelectedRow(), 0);

        String idt = String.valueOf(C);
        int id = Integer.parseInt(idt);

        String prof1 = "";
        String form1 = "";
        String creasp1 = "";
        String art1 = "";
        String insc1 = "";
        String prof2 = "";
        String form2 = "";
        String creasp2 = "";
        String art2 = "";
        String insc2 = "";
        atu.setId(id);

        

        // técnico responsável
        if (comboProfissional2.getSelectedItem().equals("Nenhum")) {
            //do nothing!
        }else{
            prof2 = comboProfissional2.getSelectedItem().toString();
            form2 = txtFormacao2.getText();
            creasp2 = txtCreasp2.getText();
            art2 = txtArt2.getText();
            insc2 = txtInscMunicipal2.getText();
        }

        //autor do projeto
        if (comboProfissional1.getSelectedItem().equals("O mesmo")) {
            //do nothing!
        }else{
            prof1 = comboProfissional1.getSelectedItem().toString();
            form1 = txtFormacao1.getText();
            creasp1 = txtCreasp1.getText();
            art1 = txtArt1.getText();
            insc1 = txtInscMunicipal1.getText();
        }
        
        //Dados de alvará
        String constr = comboConstrucao.getSelectedItem().toString();
        String compc = txtComplemento2.getText().toUpperCase();
        String anoc = txtAnoAlvConstrucao.getText().toUpperCase();
        String numc = txtNumAlvConstrucao.getText().toUpperCase();
        String areac = txtArea.getText().toUpperCase();
        String data = txtDataAlvara.getText().toUpperCase();
        String sit = comboSituacao.getSelectedItem().toString();

        atu.atualizarAlvara(prof1, form1, creasp1, art1, insc1, prof2, form2, creasp2, art2, insc2, areac, compc, numc, anoc, data,constr, sit);
        JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");

        comboProfissional1.setSelectedItem("Nenhum");
        txtFormacao1.setText("");
        txtCreasp1.setText("");
        txtArt1.setText("");
        txtInscMunicipal1.setText("");

        comboProfissional2.setSelectedItem("Nenhum");
        txtFormacao2.setText("");
        txtCreasp2.setText("");
        txtArt2.setText("");
        txtInscMunicipal2.setText("");

        txtComplemento2.setText("");
        txtAnoAlvConstrucao.setText("");
        txtNumAlvConstrucao.setText("");
        txtArea.setText("");
        txtDataAlvara.setText("");
        
        txtProcesso.setText("");
        txtAno.setText("");
        txtData.setText("");
        txtRequerente.setText("");
        txtAssunto.setText("");
        txtEndereco.setText("");
        txtBairro.setText("");
        txtIdentCadastral.setText("");
        txtLoteamento.setText("");
        txtQuadra.setText("");
        txtLote.setText("");
        
        txtDtEntrada.setText("");
        txtDtSaida.setText("");
        txtDtArquivado.setText("");
        txtAndamento.setText("");
        
        tblAndamento.clearSelection();
        tblProcesso.clearSelection();
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void btnAndamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndamentoActionPerformed
        String num = txtProcesso.getText();
        int n = Integer.valueOf(num);
        String ano = txtAno.getText();
        int nu = pes.pesquisaCodigoProcessos(n, ano);

        cad.setId(nu);

        String dt_entrada_and = txtDtEntrada.getText().toUpperCase();
        String dt_saida_and = txtDtSaida.getText().toUpperCase();
        String arquivado = txtDtArquivado.getText().toUpperCase();
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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (trmAlv.equals(trmAlv)) {
            FormMenu M = new FormMenu(this, true);
            M.setVisible(true);
            M.group = trmAlv;
            M.acesso_user = acesso_bkp;
            dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Vector c = com.Construcao();
        comboConstrucao.removeAllItems();
        comboConstrucao.addItem(" ");
        for (int i = 0; i < c.size(); i++) {
            comboConstrucao.addItem(c.elementAt(i));
        }
    }//GEN-LAST:event_formWindowActivated

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        FormCadastrarConstrucao C = new FormCadastrarConstrucao();
        C.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

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
        btnAtualizar.setEnabled(true);
    }//GEN-LAST:event_tblAndamentoMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
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
            btnAtualizar.setEnabled(false);


        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtFormacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormacao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormacao2ActionPerformed

    private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoActionPerformed

    private void txtListarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListarKeyPressed
        if(evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
	   btnListar.doClick();
        }
    }//GEN-LAST:event_txtListarKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormCadastrarAlvara().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAndamento;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cbxExpedicao;
    private javax.swing.JComboBox cbxPesquisa;
    private javax.swing.JComboBox comboConstrucao;
    private javax.swing.JComboBox comboProfissional1;
    private javax.swing.JComboBox comboProfissional2;
    private javax.swing.JComboBox comboSituacao;
    private javax.swing.JLabel crea;
    private javax.swing.JLabel crea2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tblAndamento;
    private javax.swing.JTable tblProcesso;
    private javax.swing.JTabbedPane tecnico;
    private javax.swing.JTextArea txtAndamento;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAnoAlvConstrucao;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextArea txtArt1;
    private javax.swing.JTextArea txtArt2;
    private javax.swing.JTextArea txtAssunto;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextArea txtComplemento2;
    private javax.swing.JTextField txtCreasp1;
    private javax.swing.JTextField txtCreasp2;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDataAlvara;
    private javax.swing.JTextField txtDtArquivado;
    private javax.swing.JTextField txtDtEntrada;
    private javax.swing.JTextField txtDtSaida;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFormacao1;
    private javax.swing.JTextField txtFormacao2;
    private javax.swing.JTextField txtIdentCadastral;
    private javax.swing.JTextField txtInscMunicipal1;
    private javax.swing.JTextField txtInscMunicipal2;
    private javax.swing.JTextField txtListar;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtLoteamento;
    private javax.swing.JTextField txtNumAlvConstrucao;
    private javax.swing.JTextField txtProcesso;
    private javax.swing.JTextField txtQuadra;
    private javax.swing.JTextField txtRequerente;
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
