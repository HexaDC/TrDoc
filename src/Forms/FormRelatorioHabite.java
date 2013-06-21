/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormRelatorioHabite.java
 *
 * Created on 01/08/2011, 13:39:22
 */
package Forms;

import Classes.Pesquisa.ClassPesquisaDadosRequerente;
import Classes.Pesquisa.ClassSelecionarId;
import Classes.Pesquisa.ClassCarregarCombo;
import Util.AcessoBD;
import com.mysql.jdbc.Connection;
import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class FormRelatorioHabite extends javax.swing.JFrame {
AcessoBD bd = new AcessoBD();
    ClassPesquisaDadosRequerente pes = new ClassPesquisaDadosRequerente();
    ClassCarregarCombo com = new ClassCarregarCombo();
    ClassSelecionarId sel = new ClassSelecionarId();
    public String emiHab;
    public boolean[] acesso_bkp;
    private int largura = 694;
    private int altura = 701;

    public FormRelatorioHabite() {
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

        Vector f = com.Fiscal();
        cbxFiscal.removeAllItems();
        cbxFiscal.addItem("");
        for (int i = 0; i < f.size(); i++) {
            cbxFiscal.addItem(f.elementAt(i));
        }

    }

    FormRelatorioHabite(FormMenu aThis, boolean b) {
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

        Vector f = com.Fiscal();
        cbxFiscal.removeAllItems();
        cbxFiscal.addItem("");
        for (int i = 0; i < f.size(); i++) {
            cbxFiscal.addItem(f.elementAt(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxPesquisa = new javax.swing.JComboBox();
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
        jLabel2 = new javax.swing.JLabel();
        txtProcesso = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRequerente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAssunto = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAndamento = new javax.swing.JTable();
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
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComplemento = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        txtAnoHabite = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtListar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnVoltar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnRelatorio = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cbxFiscal = new javax.swing.JComboBox();
        btnFiscal = new javax.swing.JButton();
        javax.swing.text.MaskFormatter dt_novo = null;
        try {
            dt_novo = new javax.swing.text.MaskFormatter("##/##/####");
            dt_novo.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDtRelatorio = new javax.swing.JFormattedTextField(dt_novo);
        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblProcesso = new javax.swing.JTable();
        lblDtEmissao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TRDoc - Tramitação de Documentos");
        setResizable(false);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel1.setText("Emissão de Habite-se");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 123, 16);

        cbxPesquisa.setFont(new java.awt.Font("SansSerif", 1, 12));
        cbxPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nº Processo", "Requerente", "Assunto", "Endereço", "Ident. Cadastral", "Profissional", "Insc. Municipal" }));
        cbxPesquisa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxPesquisaItemStateChanged(evt);
            }
        });
        cbxPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxPesquisa);
        cbxPesquisa.setBounds(10, 40, 140, 30);

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jPanel1.setLayout(null);

        jTabbedPane3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jPanel7.setLayout(null);

        txtData.setFocusable(false);
        jPanel7.add(txtData);
        txtData.setBounds(220, 20, 110, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel7.setText("Data de Entrada");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(220, 0, 100, 20);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel4.setText("Assunto");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(10, 100, 60, 20);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("Endereço");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(10, 180, 70, 20);

        txtEndereco.setFocusable(false);
        jPanel7.add(txtEndereco);
        txtEndereco.setBounds(10, 200, 610, 30);

        txtBairro.setFocusable(false);
        jPanel7.add(txtBairro);
        txtBairro.setBounds(10, 250, 360, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel6.setText("Bairro");
        jPanel7.add(jLabel6);
        jLabel6.setBounds(10, 230, 50, 20);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel8.setText("Loteamento");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(10, 280, 80, 20);

        txtLoteamento.setFocusable(false);
        jPanel7.add(txtLoteamento);
        txtLoteamento.setBounds(10, 300, 170, 30);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel9.setText("Lote");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(320, 280, 30, 20);

        txtLote.setFocusable(false);
        jPanel7.add(txtLote);
        txtLote.setBounds(320, 300, 80, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel10.setText("Quadra");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(190, 280, 50, 20);

        txtQuadra.setFocusable(false);
        jPanel7.add(txtQuadra);
        txtQuadra.setBounds(190, 300, 120, 30);

        txtIdentCadastral.setFocusable(false);
        jPanel7.add(txtIdentCadastral);
        txtIdentCadastral.setBounds(380, 250, 240, 30);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel11.setText("Identificação Cadastral");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(380, 230, 150, 20);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("Nº Processo");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(10, 0, 100, 20);
        jPanel7.add(txtProcesso);
        txtProcesso.setBounds(10, 20, 110, 30);

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel13.setText("Ano");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(150, 0, 30, 20);
        jPanel7.add(txtAno);
        txtAno.setBounds(150, 20, 50, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel3.setText("Requerente");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(10, 50, 80, 20);
        jPanel7.add(txtRequerente);
        txtRequerente.setBounds(10, 70, 610, 30);

        txtAssunto.setColumns(20);
        txtAssunto.setRows(5);
        txtAssunto.setFocusable(false);
        jScrollPane1.setViewportView(txtAssunto);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel4);
        jPanel4.setBounds(10, 120, 610, 60);

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

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel5);
        jPanel5.setBounds(10, 10, 610, 320);

        jTabbedPane3.addTab("Andamento", jPanel8);

        jPanel1.add(jTabbedPane3);
        jTabbedPane3.setBounds(10, 10, 640, 370);

        jTabbedPane1.addTab("Principal", jPanel1);

        jPanel3.setLayout(null);

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel21.setText("Complemento");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(10, 0, 79, 20);

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel22.setText("Área Habite-se ( m² )");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(10, 100, 120, 20);

        txtAreaHabite.setFocusable(false);
        txtAreaHabite.setInheritsPopupMenu(true);
        jPanel3.add(txtAreaHabite);
        txtAreaHabite.setBounds(10, 120, 120, 30);

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel23.setText("Área Aprovada ( m² )");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(230, 100, 120, 20);

        txtAreaAprovada.setFocusable(false);
        txtAreaAprovada.setInheritsPopupMenu(true);
        jPanel3.add(txtAreaAprovada);
        txtAreaAprovada.setBounds(230, 120, 120, 30);

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel24.setText("Nº de Aprovação");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(230, 150, 110, 20);

        txtNumAprovacao.setFocusable(false);
        txtNumAprovacao.setInheritsPopupMenu(true);
        jPanel3.add(txtNumAprovacao);
        txtNumAprovacao.setBounds(230, 170, 100, 30);

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel25.setText("Nº Habite-se");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(10, 150, 69, 20);

        txtNumHabite.setFocusable(false);
        txtNumHabite.setInheritsPopupMenu(true);
        jPanel3.add(txtNumHabite);
        txtNumHabite.setBounds(10, 170, 110, 30);

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel26.setText("Data de Expedição");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(10, 200, 110, 20);

        txtDataHabite.setFocusable(false);
        txtDataHabite.setInheritsPopupMenu(true);
        jPanel3.add(txtDataHabite);
        txtDataHabite.setBounds(10, 220, 110, 30);

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel27.setText("Observação");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(10, 250, 69, 20);

        txtComplemento.setColumns(20);
        txtComplemento.setRows(5);
        txtComplemento.setEnabled(false);
        txtComplemento.setFocusable(false);
        jScrollPane3.setViewportView(txtComplemento);

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6);
        jPanel6.setBounds(10, 20, 640, 80);

        txtObservacao.setColumns(20);
        txtObservacao.setRows(5);
        txtObservacao.setFocusable(false);
        txtObservacao.setInheritsPopupMenu(true);
        jScrollPane4.setViewportView(txtObservacao);

        org.jdesktop.layout.GroupLayout jPanel9Layout = new org.jdesktop.layout.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel9);
        jPanel9.setBounds(10, 270, 640, 110);
        jPanel3.add(txtAnoHabite);
        txtAnoHabite.setBounds(130, 170, 40, 30);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel14.setText("Ano");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(130, 150, 48, 20);

        jTabbedPane1.addTab("Habite-se", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 180, 670, 420);

        txtListar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListarKeyPressed(evt);
            }
        });
        getContentPane().add(txtListar);
        txtListar.setBounds(160, 40, 420, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 30, 670, 10);

        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(10, 660, 90, 30);

        btnListar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lista.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(590, 40, 90, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 170, 670, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 650, 670, 20);

        btnRelatorio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/habite.png"))); // NOI18N
        btnRelatorio.setText("Emitir Relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(btnRelatorio);
        btnRelatorio.setBounds(540, 660, 140, 30);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel12.setText("Fiscal");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 610, 33, 30);

        getContentPane().add(cbxFiscal);
        cbxFiscal.setBounds(50, 610, 360, 30);

        btnFiscal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnFiscal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user_business.png"))); // NOI18N
        btnFiscal.setText("Adicionar Novo Fiscal");
        btnFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiscalActionPerformed(evt);
            }
        });
        getContentPane().add(btnFiscal);
        btnFiscal.setBounds(420, 610, 180, 30);

        txtDtRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtRelatorioActionPerformed(evt);
            }
        });
        txtDtRelatorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDtRelatorioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDtRelatorioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDtRelatorioKeyTyped(evt);
            }
        });
        getContentPane().add(txtDtRelatorio);
        txtDtRelatorio.setBounds(420, 660, 110, 30);

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
        tblProcesso.getColumnModel().getColumn(5).setMaxWidth(200);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 80, 670, 80);

        lblDtEmissao.setFont(new java.awt.Font("SansSerif", 1, 12));
        lblDtEmissao.setText("Alterar Data de Emissão:");
        getContentPane().add(lblDtEmissao);
        lblDtEmissao.setBounds(270, 660, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblProcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcessoMouseClicked
        Object a = tblProcesso.getValueAt(tblProcesso.getSelectedRow(), 0);

        String idt = String.valueOf(a);
        int id = Integer.parseInt(idt);


        try {
            preenche_jtable2(id);
        } catch (SQLException ex) {
            Logger.getLogger(FormRelatorioHabite.class.getName()).log(Level.SEVERE, null, ex);
        }


        pes.setID(id);
        
        

        int p = pes.pesquisanumProcesso();
        String processo = String.valueOf(p);
        txtProcesso.setText(processo);
        
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        Date dtr = new Date();
        txtDtRelatorio.setText(sdf1.format(dtr) );
        
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



        //DADOS DO HABITE
        String comp_habite = pes.pesquisaComplementoHabite();
        txtComplemento.setText(comp_habite);

        String area_habite = pes.pesquisaAreaHabite();
        txtAreaHabite.setText(area_habite);

        String area_aprov = pes.pesquisaAreaAprovHabite();
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

}//GEN-LAST:event_tblProcessoMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (emiHab.equals(emiHab)) {
            FormMenu M = new FormMenu(this, true);
            M.setVisible(true);
            M.group = emiHab;
            M.acesso_user = acesso_bkp;
            dispose();
        }
}//GEN-LAST:event_btnVoltarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormRelatorioHabite.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_btnListarActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        Connection con = (Connection) bd.getConnection();

        String num = txtProcesso.getText();
        String ano = txtAno.getText();
        int id = sel.selecionarIdPro(Integer.parseInt(num), ano);

        String nome = cbxFiscal.getSelectedItem().toString();
        int idf = sel.selecionarIdFis(nome);
        String dtr = txtDtRelatorio.getText();


        HashMap parametro = new HashMap();
        parametro.put("ID", String.valueOf(id));
        parametro.put("IDF", String.valueOf(idf));
        parametro.put("DTR", String.valueOf(dtr));

        try {
            JasperPrint jp = JasperFillManager.fillReport("./relatorios/RelatorioHabite.jasper", parametro, con);
            JasperViewer jrv = new JasperViewer(jp, false);
            jrv.setVisible(true);

            //Altera o icone e o título da janela
            jrv.setTitle("TRDoc - Tramitação de Documentos");
            URL url = this.getClass().getResource("/Icons/vistoria.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
            jrv.setIconImage(imagemTitulo);

        } catch (JRException ex) {
            Logger.getLogger(FormRelatorioHabite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiscalActionPerformed
        FormCadastrarFiscal L = new FormCadastrarFiscal(this, true);
        L.setVisible(true);
    }//GEN-LAST:event_btnFiscalActionPerformed

    private void cbxPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPesquisaActionPerformed
        
    }//GEN-LAST:event_cbxPesquisaActionPerformed

    private void cbxPesquisaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxPesquisaItemStateChanged
        txtListar.setText("");
    }//GEN-LAST:event_cbxPesquisaItemStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Vector f = com.Fiscal();
        cbxFiscal.removeAllItems();
        cbxFiscal.addItem("");
        for (int i = 0; i < f.size(); i++) {
            cbxFiscal.addItem(f.elementAt(i));
        }
    }//GEN-LAST:event_formWindowActivated

    private void txtDtRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtRelatorioActionPerformed
    
    }//GEN-LAST:event_txtDtRelatorioActionPerformed

    private void txtDtRelatorioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDtRelatorioKeyTyped
        
    }//GEN-LAST:event_txtDtRelatorioKeyTyped

    private void txtDtRelatorioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDtRelatorioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtRelatorioKeyReleased

    private void txtDtRelatorioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDtRelatorioKeyPressed
  
    }//GEN-LAST:event_txtDtRelatorioKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    txtDtRelatorio.setVisible(acesso_bkp[15]);
    lblDtEmissao.setVisible(acesso_bkp[15]);
    txtDtRelatorio.setEditable(acesso_bkp[15]);
    txtDtRelatorio.setEnabled(true);
         
    }//GEN-LAST:event_formWindowOpened

    private void txtListarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListarKeyPressed
        if(evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
	   btnListar.doClick();
        }
    }//GEN-LAST:event_txtListarKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormRelatorioHabite().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiscal;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cbxFiscal;
    private javax.swing.JComboBox cbxPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lblDtEmissao;
    private javax.swing.JTable tblAndamento;
    private javax.swing.JTable tblProcesso;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAnoHabite;
    private javax.swing.JTextField txtAreaAprovada;
    private javax.swing.JTextField txtAreaHabite;
    private javax.swing.JTextArea txtAssunto;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextArea txtComplemento;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDataHabite;
    private javax.swing.JTextField txtDtRelatorio;
    private javax.swing.JTextField txtEndereco;
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
