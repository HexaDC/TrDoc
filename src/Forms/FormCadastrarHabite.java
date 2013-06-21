/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormCadastrarHabite.java
 *
 * Created on 29/07/2011, 12:11:15
 */
package Forms;

import Classes.Cadastra.ClassCadastrarAndamento;
import Classes.Pesquisa.ClassPesquisaDadosRequerente;
import Classes.Pesquisa.ClassCarregarCombo;
import Classes.Atualiza.ClassAtualizarHabite;
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
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jenny
 */
public class FormCadastrarHabite extends javax.swing.JFrame {

    AcessoBD bd = new AcessoBD();
    ClassCadastrarAndamento cad = new ClassCadastrarAndamento();
    ClassPesquisaDadosRequerente pes = new ClassPesquisaDadosRequerente();
    ClassAtualizarHabite atu = new ClassAtualizarHabite();
    ClassCarregarCombo com = new ClassCarregarCombo();
    public String trmHab;
    public boolean[] acesso_bkp;
    private int largura = 665;
    private int altura = 661;

    public FormCadastrarHabite() {
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


        Vector c = com.Construcao();
        comboConstrucao.removeAllItems();
        comboConstrucao.addItem(" ");
        for (int i = 0; i < c.size(); i++) {
            comboConstrucao.addItem(c.elementAt(i));
        }
    }

    FormCadastrarHabite(FormMenu aThis, boolean b) {
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


        Vector c = com.Construcao();
        comboConstrucao.removeAllItems();
        comboConstrucao.addItem(" ");
        for (int i = 0; i < c.size(); i++) {
            comboConstrucao.addItem(c.elementAt(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConcluir = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        cbxPesquisa = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        txtListar = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        txtAno = new javax.swing.JTextField();
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
        jLabel16 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
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
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAndamento = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAndamento = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        comboConstrucao = new javax.swing.JComboBox();
        txtAreaHabite = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtNumHabite = new javax.swing.JTextField();
        txtAreaAprov = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNumAprovacao = new javax.swing.JTextField();
        javax.swing.text.MaskFormatter maskdata = null;
        try {
            maskdata = new javax.swing.text.MaskFormatter("##/##/####");
            maskdata.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDataHabite = new javax.swing.JFormattedTextField(maskdata);
        jLabel17 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtFinalidade = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComplemento = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter maskano = null;
        try {
            maskano = new javax.swing.text.MaskFormatter("##");
            maskano.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtAnoHabite = new javax.swing.JFormattedTextField(maskano);
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblProcesso = new javax.swing.JTable();

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

        btnConcluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/concluir.png"))); // NOI18N
        btnConcluir.setText("Concluir Tramitação");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConcluir);
        btnConcluir.setBounds(480, 620, 170, 30);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(10, 610, 642, 20);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel1.setText("Habite-se");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 11, 54, 16);

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

        btnListar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lista.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(560, 40, 90, 30);

        cbxPesquisa.setFont(new java.awt.Font("SansSerif", 1, 12));
        cbxPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nº Processo", "Requerente", "Assunto", "Endereço", "Ident. Cadastral", "Profissional", "Insc. Municipal" }));
        getContentPane().add(cbxPesquisa);
        cbxPesquisa.setBounds(10, 40, 120, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(12, 33, 643, 10);

        txtListar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListarKeyPressed(evt);
            }
        });
        getContentPane().add(txtListar);
        txtListar.setBounds(140, 40, 410, 30);

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jPanel1.setLayout(null);

        jTabbedPane3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jPanel7.setLayout(null);

        txtAno.setFocusable(false);
        jPanel7.add(txtAno);
        txtAno.setBounds(120, 20, 51, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel7.setText("Ano");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(120, 0, 22, 20);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel4.setText("Assunto");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(10, 100, 47, 20);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("Endereço");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(10, 170, 54, 20);

        txtEndereco.setFocusable(false);
        jPanel7.add(txtEndereco);
        txtEndereco.setBounds(10, 190, 582, 30);

        txtBairro.setFocusable(false);
        jPanel7.add(txtBairro);
        txtBairro.setBounds(10, 240, 582, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel6.setText("Bairro");
        jPanel7.add(jLabel6);
        jLabel6.setBounds(10, 220, 35, 20);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel8.setText("Loteamento");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(10, 270, 68, 20);

        txtLoteamento.setFocusable(false);
        jPanel7.add(txtLoteamento);
        txtLoteamento.setBounds(10, 290, 150, 30);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel9.setText("Lote");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(300, 270, 25, 20);

        txtLote.setFocusable(false);
        jPanel7.add(txtLote);
        txtLote.setBounds(300, 290, 70, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel10.setText("Quadra");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(180, 270, 42, 20);

        txtQuadra.setFocusable(false);
        jPanel7.add(txtQuadra);
        txtQuadra.setBounds(180, 290, 100, 30);

        txtIdentCadastral.setFocusable(false);
        jPanel7.add(txtIdentCadastral);
        txtIdentCadastral.setBounds(380, 290, 210, 30);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel11.setText("Identificação Cadastral");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(380, 270, 150, 20);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("Nº Processo");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(10, 0, 70, 20);

        txtProcesso.setFocusable(false);
        jPanel7.add(txtProcesso);
        txtProcesso.setBounds(10, 20, 87, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel3.setText("Requerente");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(10, 50, 66, 20);

        txtRequerente.setFocusable(false);
        jPanel7.add(txtRequerente);
        txtRequerente.setBounds(10, 70, 582, 30);

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel16.setText("Data Entrada");
        jPanel7.add(jLabel16);
        jLabel16.setBounds(200, 0, 73, 20);

        txtData.setFocusable(false);
        jPanel7.add(txtData);
        txtData.setBounds(200, 20, 90, 30);

        txtAssunto.setColumns(20);
        txtAssunto.setRows(5);
        txtAssunto.setFocusable(false);
        jScrollPane1.setViewportView(txtAssunto);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel4);
        jPanel4.setBounds(10, 120, 580, 50);

        jTabbedPane3.addTab("Processo", jPanel7);

        jPanel8.setLayout(null);

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel26.setText("Data de Entrada");
        jPanel8.add(jLabel26);
        jLabel26.setBounds(10, 120, 90, 20);
        jPanel8.add(txtDtEntrada);
        txtDtEntrada.setBounds(10, 140, 113, 30);

        jLabel41.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel41.setText("Data de Saída");
        jPanel8.add(jLabel41);
        jLabel41.setBounds(330, 120, 78, 20);

        jLabel42.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel42.setText("Andamento");
        jPanel8.add(jLabel42);
        jLabel42.setBounds(10, 170, 65, 20);

        jLabel44.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel44.setText("Expedição");
        jPanel8.add(jLabel44);
        jLabel44.setBounds(170, 120, 59, 20);

        cbxExpedicao.setFont(new java.awt.Font("SansSerif", 1, 12));
        cbxExpedicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALVARÁS", "COMUNIQUE-SE", "HABITE-SE", "OUTROS" }));
        jPanel8.add(cbxExpedicao);
        cbxExpedicao.setBounds(167, 140, 130, 30);

        jLabel43.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel43.setText("Data Aquivado");
        jPanel8.add(jLabel43);
        jLabel43.setBounds(480, 120, 81, 20);

        btnAndamento.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAndamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/vistoria.png"))); // NOI18N
        btnAndamento.setText("Adicionar Andamento");
        btnAndamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndamentoActionPerformed(evt);
            }
        });
        jPanel8.add(btnAndamento);
        btnAndamento.setBounds(410, 290, 180, 30);
        jPanel8.add(txtDtSaida);
        txtDtSaida.setBounds(330, 140, 113, 30);
        jPanel8.add(txtDtArquivado);
        txtDtArquivado.setBounds(480, 140, 101, 30);

        btnAtualizar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/arrow_refresh.png"))); // NOI18N
        btnAtualizar.setText("Atualizar Andamento");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel8.add(btnAtualizar);
        btnAtualizar.setBounds(10, 290, 170, 30);

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel5);
        jPanel5.setBounds(10, 10, 580, 110);

        txtAndamento.setColumns(20);
        txtAndamento.setRows(5);
        jScrollPane8.setViewportView(txtAndamento);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel6);
        jPanel6.setBounds(10, 190, 580, 90);

        jTabbedPane3.addTab("Andamento", jPanel8);

        jPanel1.add(jTabbedPane3);
        jTabbedPane3.setBounds(10, 10, 610, 360);

        jTabbedPane1.addTab("Principal", jPanel1);

        jPanel2.setLayout(null);

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel13.setText("Tipo de Construção");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 80, 110, 20);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel14.setText("Complemento");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 0, 79, 20);

        comboConstrucao.setFont(new java.awt.Font("SansSerif", 1, 12));
        jPanel2.add(comboConstrucao);
        comboConstrucao.setBounds(10, 100, 610, 28);
        jPanel2.add(txtAreaHabite);
        txtAreaHabite.setBounds(10, 150, 130, 30);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel15.setText("Área Habite-se ( m² )");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 130, 130, 20);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel12.setText("Observação");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 280, 69, 20);

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel19.setText("Data de Expedição");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(10, 230, 120, 20);

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel24.setText("Área Aprovada ( m² )");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(240, 130, 130, 20);
        jPanel2.add(txtNumHabite);
        txtNumHabite.setBounds(10, 200, 130, 30);
        jPanel2.add(txtAreaAprov);
        txtAreaAprov.setBounds(240, 150, 130, 30);

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel18.setText("N° Habite-se");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(10, 180, 80, 20);
        jPanel2.add(txtNumAprovacao);
        txtNumAprovacao.setBounds(240, 200, 130, 30);
        jPanel2.add(txtDataHabite);
        txtDataHabite.setBounds(10, 250, 110, 30);

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel17.setText("N° de Aprovação");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(240, 180, 150, 20);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROGRAMA/add.png"))); // NOI18N
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);
        btnAdd.setBounds(694, 13, 79, 26);

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel20.setText("Finalidade");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(240, 230, 57, 20);
        jPanel2.add(txtFinalidade);
        txtFinalidade.setBounds(240, 250, 130, 30);

        txtComplemento.setColumns(20);
        txtComplemento.setRows(5);
        jScrollPane2.setViewportView(txtComplemento);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel9);
        jPanel9.setBounds(10, 20, 610, 60);

        txtObservacao.setColumns(20);
        txtObservacao.setRows(5);
        jScrollPane3.setViewportView(txtObservacao);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10);
        jPanel10.setBounds(10, 300, 610, 70);

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel21.setText("Ano");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(150, 180, 48, 20);

        txtAnoHabite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoHabiteActionPerformed(evt);
            }
        });
        jPanel2.add(txtAnoHabite);
        txtAnoHabite.setBounds(150, 200, 40, 30);

        jTabbedPane1.addTab("Habite-se", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 190, 640, 410);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 180, 643, 10);

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblProcessoMouseEntered(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 80, 640, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        //realiza o cadastro do habite-se
        int id = pes.pesquisaCodProcesso();
        atu.setId(id);

        String obs = txtObservacao.getText().toUpperCase();
        String constru = comboConstrucao.getSelectedItem().toString();
        String comp = txtComplemento.getText().toUpperCase();
        String area_h = txtAreaHabite.getText().toUpperCase();
        String area_a = txtAreaAprov.getText().toUpperCase();
        String num_aprov = txtNumAprovacao.getText().toUpperCase();
        String ano_habite = txtAnoHabite.getText().toUpperCase();
        String finalidade = txtFinalidade.getText().toUpperCase();
        String num_h = txtNumHabite.getText().toUpperCase();
        String data = txtDataHabite.getText().toUpperCase();

        atu.atualizarHabite(obs, comp, constru, area_h, num_aprov,  num_h, ano_habite, data, area_a,finalidade);
        JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
        
        txtObservacao.setText("");
        txtComplemento.setText("");
        comboConstrucao.setSelectedItem("");
        txtAreaHabite.setText("");
        txtAreaAprov.setText("");
        txtNumAprovacao.setText("");
        txtAnoHabite.setText("");
        txtNumHabite.setText("");
        txtDataHabite.setText("");
        
}//GEN-LAST:event_btnConcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (trmHab.equals(trmHab)) {
            FormMenu M = new FormMenu(this, true);
            M.setVisible(true);
            M.group = trmHab;
            M.acesso_user = acesso_bkp;
            dispose();
        }
}//GEN-LAST:event_btnVoltarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastrarHabite.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_btnListarActionPerformed

    private void tblProcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcessoMouseClicked
        Object a = tblProcesso.getValueAt(tblProcesso.getSelectedRow(), 0);

        String idt = String.valueOf(a);
        int id = Integer.parseInt(idt);

        try {
            preenche_jtable2(id);
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastrarHabite.class.getName()).log(Level.SEVERE, null, ex);
        }

        pes.setID(id);
        
        txtDtEntrada.setText("");

        txtDtSaida.setText("");

        txtAndamento.setText("");

        cbxExpedicao.setSelectedItem("");

        txtDtArquivado.setText("");
        btnAndamento.setEnabled(true);
        btnAtualizar.setEnabled(false);

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
        
         //DADOS DO HABITE
        String cbConst = pes.pesquisaConstruHabite();
        comboConstrucao.setSelectedItem(cbConst);
        
        String comp_habite = pes.pesquisaComplementoHabite();
        txtComplemento.setText(comp_habite);

        String area_habite = pes.pesquisaAreaHabite();
        txtAreaHabite.setText(area_habite);

        String area_aprov = pes.pesquisaAreaAprovHabite();
        txtAreaAprov.setText(area_aprov);
        
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
}//GEN-LAST:event_tblProcessoMouseClicked

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

    private void btnAndamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndamentoActionPerformed
        String num = txtProcesso.getText();
        int n = Integer.valueOf(num);
        String ano = txtAno.getText();
        int nu = pes.pesquisaCodigoProcessos(n,ano);
        
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
        int nu = pes.pesquisaCodigoProcessos(n,ano);
        
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

    private void tblProcessoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcessoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProcessoMouseEntered

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
                new FormCadastrarHabite().setVisible(true);
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable tblAndamento;
    private javax.swing.JTable tblProcesso;
    private javax.swing.JTextArea txtAndamento;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAnoHabite;
    private javax.swing.JTextField txtAreaAprov;
    private javax.swing.JTextField txtAreaHabite;
    private javax.swing.JTextArea txtAssunto;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextArea txtComplemento;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDataHabite;
    private javax.swing.JTextField txtDtArquivado;
    private javax.swing.JTextField txtDtEntrada;
    private javax.swing.JTextField txtDtSaida;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFinalidade;
    private javax.swing.JTextField txtIdentCadastral;
    private javax.swing.JTextField txtListar;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtLoteamento;
    private javax.swing.JTextField txtNumAprovacao;
    private javax.swing.JTextField txtNumHabite;
    private javax.swing.JTextArea txtObservacao;
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
