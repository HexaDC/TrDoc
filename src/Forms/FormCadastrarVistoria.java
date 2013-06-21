/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormCadastrarVistoria.java
 *
 * Created on 14/07/2011, 14:10:03
 */
package Forms;

import Classes.Pesquisa.ClassPesquisaVistoria;
import Classes.Cadastra.ClassCadastrarVistoria;
import Classes.Pesquisa.ClassSelecionarId;
import Classes.Cadastra.ClassCadastrarDenunciado;
import Classes.Pesquisa.ClassCarregarCombo;
import Classes.Atualiza.ClassAtualizarVistoria;
import Classes.Cadastra.ClassCadastrarDenunciante;
import Util.AcessoBD;
import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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

/**
 *
 * @author Jenny
 */
public class FormCadastrarVistoria extends javax.swing.JFrame {

    /** Creates new form FormCadastrarVistoria */
    AcessoBD bd = new AcessoBD();
    ClassCadastrarVistoria cad = new ClassCadastrarVistoria();
    ClassCadastrarDenunciante cadd = new ClassCadastrarDenunciante();
    ClassCadastrarDenunciado cadde = new ClassCadastrarDenunciado();
    ClassSelecionarId sel = new ClassSelecionarId();
    ClassCarregarCombo com = new ClassCarregarCombo();
    ClassPesquisaVistoria pes = new ClassPesquisaVistoria();
    ClassAtualizarVistoria atu = new ClassAtualizarVistoria();
    public String trmVis;
    public boolean[] acesso_bkp;
    private int largura = 664;
    private int altura = 641;

    public FormCadastrarVistoria() {
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

        //Carrega o jcombobox
        Vector f = com.Fiscal();
        cbxFiscal.removeAllItems();
        cbxFiscal.addItem(" ");
        for (int i = 0; i < f.size(); i++) {
            cbxFiscal.addItem(f.elementAt(i));
        }
    }

    FormCadastrarVistoria(FormMenu aThis, boolean b) {
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

        //Carrega o jcombobox
        Vector f = com.Fiscal();
        cbxFiscal.removeAllItems();
        cbxFiscal.addItem(" ");
        for (int i = 0; i < f.size(); i++) {
            cbxFiscal.addItem(f.elementAt(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbxFiscal = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtAtendente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAtendimento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter dt = null;
        try {
            dt = new javax.swing.text.MaskFormatter("##/##/####");
            dt.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDtDenuncia = new javax.swing.JFormattedTextField(dt);
        btnFiscal = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAssunto = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtDenunciante = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEndereco1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtBairro1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtQuadra1 = new javax.swing.JTextField();
        txtLoteamento1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtLote1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter ident4 = null;
        try {
            ident4 = new javax.swing.text.MaskFormatter("##.###.###-*");
            ident4.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtInscrMunicipal1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter tel = null;
        try {
            tel = new javax.swing.text.MaskFormatter("(##)####-####");
            tel.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtTelefone1 = new javax.swing.JFormattedTextField(tel);
        jLabel8 = new javax.swing.JLabel();
        txtComplemento1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtQuadra2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtLote2 = new javax.swing.JTextField();
        javax.swing.text.MaskFormatter ident5 = null;
        try {
            ident5 = new javax.swing.text.MaskFormatter("##.###.###-*");
            ident5.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtInscrMunicipal2 = new javax.swing.JTextField();
        txtBairro2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtDenunciado = new javax.swing.JTextField();
        txtEndereco2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtNum2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtReferencia = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDenuncia = new javax.swing.JTextArea();
        txtLoteamento2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter dt2 = null;
        try {
            dt2 = new javax.swing.text.MaskFormatter("##/##/####");
            dt2.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDtRetorno = new javax.swing.JFormattedTextField(dt2);
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtProvidencias = new javax.swing.JTextArea();
        txtListar = new javax.swing.JTextField();
        btnListar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        btnNovo = new javax.swing.JButton();
        btnConcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDenuncia = new javax.swing.JTable();
        cbxPesquisa = new javax.swing.JComboBox();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Denúncia e Vistoria");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 117, 15);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 32, 640, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(12, 190, 640, 10);

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(600, 367));

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 339));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel4.setText("Fiscal");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 220, 40, 20);

        jPanel1.add(cbxFiscal);
        cbxFiscal.setBounds(10, 240, 370, 30);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("Atendente");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 50, 58, 20);
        jPanel1.add(txtAtendente);
        txtAtendente.setBounds(10, 70, 190, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel6.setText("Atendimento");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 50, 120, 20);
        jPanel1.add(txtAtendimento);
        txtAtendimento.setBounds(210, 70, 410, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel7.setText("Assunto");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 100, 70, 20);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("Nº Denúncia");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 80, 20);

        txtNum.setEditable(false);
        jPanel1.add(txtNum);
        txtNum.setBounds(10, 20, 110, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel3.setText("Data");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 0, 26, 20);
        jPanel1.add(txtDtDenuncia);
        txtDtDenuncia.setBounds(150, 20, 110, 30);

        btnFiscal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnFiscal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user_business.png"))); // NOI18N
        btnFiscal.setText("Adicionar Novo Fiscal");
        btnFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiscalActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiscal);
        btnFiscal.setBounds(400, 240, 180, 30);

        txtAssunto.setColumns(20);
        txtAssunto.setLineWrap(true);
        txtAssunto.setRows(5);
        txtAssunto.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtAssunto);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 120, 610, 100);

        jTabbedPane1.addTab("Dados Principais", jPanel1);

        jPanel2.setLayout(null);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel9.setText("Nome");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 0, 50, 20);
        jPanel2.add(txtDenunciante);
        txtDenunciante.setBounds(10, 20, 610, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel10.setText("Endereço");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 50, 70, 20);
        jPanel2.add(txtEndereco1);
        txtEndereco1.setBounds(10, 70, 540, 30);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel11.setText("Nº");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(560, 50, 12, 20);
        jPanel2.add(txtNum1);
        txtNum1.setBounds(560, 70, 60, 30);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel12.setText("Bairro");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 150, 40, 20);
        jPanel2.add(txtBairro1);
        txtBairro1.setBounds(10, 170, 410, 30);

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel13.setText("Quadra");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(160, 200, 42, 20);
        jPanel2.add(txtQuadra1);
        txtQuadra1.setBounds(160, 220, 80, 30);
        jPanel2.add(txtLoteamento1);
        txtLoteamento1.setBounds(10, 220, 130, 30);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel15.setText("Loteamento");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 200, 80, 20);
        jPanel2.add(txtLote1);
        txtLote1.setBounds(260, 220, 50, 30);

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel16.setText("Inscrição Municipal");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(440, 150, 120, 20);
        jPanel2.add(txtInscrMunicipal1);
        txtInscrMunicipal1.setBounds(440, 170, 183, 30);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel14.setText("Lote");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(260, 200, 40, 20);

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel17.setText("Telefone");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(460, 100, 70, 20);
        jPanel2.add(txtTelefone1);
        txtTelefone1.setBounds(460, 120, 160, 30);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel8.setText("Complemento");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 100, 110, 20);
        jPanel2.add(txtComplemento1);
        txtComplemento1.setBounds(10, 120, 430, 30);

        jTabbedPane1.addTab("Denunciante", jPanel2);

        jPanel3.setLayout(null);
        jPanel3.add(jSeparator3);
        jSeparator3.setBounds(10, 160, 610, 11);

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel26.setText("Ponto de Referência");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(10, 170, 130, 20);

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel27.setText("Descrição da Ocorrência");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(10, 250, 170, 16);
        jPanel3.add(txtQuadra2);
        txtQuadra2.setBounds(460, 120, 80, 30);

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel20.setText("Lote");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(560, 100, 30, 20);

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel21.setText("Inscrição Municipal");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(460, 0, 130, 20);
        jPanel3.add(txtLote2);
        txtLote2.setBounds(560, 120, 60, 30);
        jPanel3.add(txtInscrMunicipal2);
        txtInscrMunicipal2.setBounds(460, 20, 160, 30);
        jPanel3.add(txtBairro2);
        txtBairro2.setBounds(10, 120, 300, 30);

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel22.setText("Bairro");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(10, 100, 40, 20);

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel23.setText("Quadra");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(460, 100, 50, 20);

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel24.setText("Endereço");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(10, 50, 70, 20);

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel25.setText("Nome");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(10, 0, 40, 20);
        jPanel3.add(txtDenunciado);
        txtDenunciado.setBounds(10, 20, 440, 30);
        jPanel3.add(txtEndereco2);
        txtEndereco2.setBounds(10, 70, 540, 30);

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel29.setText("Nº");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(560, 50, 20, 20);
        jPanel3.add(txtNum2);
        txtNum2.setBounds(560, 70, 60, 30);

        txtReferencia.setColumns(20);
        txtReferencia.setLineWrap(true);
        txtReferencia.setRows(5);
        txtReferencia.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtReferencia);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6);
        jPanel6.setBounds(10, 190, 610, 60);

        txtDenuncia.setColumns(20);
        txtDenuncia.setLineWrap(true);
        txtDenuncia.setRows(5);
        txtDenuncia.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtDenuncia);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7);
        jPanel7.setBounds(10, 270, 610, 70);
        jPanel3.add(txtLoteamento2);
        txtLoteamento2.setBounds(320, 120, 130, 30);

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel18.setText("Loteamento");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(320, 100, 80, 20);

        jTabbedPane1.addTab("Denunciado", jPanel3);

        jPanel4.setLayout(null);
        jPanel4.add(jSeparator4);
        jSeparator4.setBounds(12, 278, 610, 10);

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel28.setText("Data Retorno");
        jPanel4.add(jLabel28);
        jLabel28.setBounds(40, 290, 90, 16);
        jPanel4.add(txtDtRetorno);
        txtDtRetorno.setBounds(30, 310, 100, 30);

        txtProvidencias.setColumns(20);
        txtProvidencias.setLineWrap(true);
        txtProvidencias.setRows(5);
        txtProvidencias.setWrapStyleWord(true);
        jScrollPane5.setViewportView(txtProvidencias);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel8);
        jPanel8.setBounds(10, 10, 610, 260);

        jTabbedPane1.addTab("Providências", jPanel4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 206, 640, 380);

        txtListar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListarKeyPressed(evt);
            }
        });
        getContentPane().add(txtListar);
        txtListar.setBounds(150, 40, 400, 30);

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
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(10, 590, 640, 10);

        btnNovo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/novo2.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(450, 600, 90, 30);

        btnConcluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/concluir.png"))); // NOI18N
        btnConcluir.setText("Concluir");
        btnConcluir.setEnabled(false);
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConcluir);
        btnConcluir.setBounds(550, 600, 100, 30);

        btnAtualizar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(340, 600, 100, 30);

        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(10, 600, 90, 30);

        btnRelatorio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/habite.png"))); // NOI18N
        btnRelatorio.setText("Relatório");
        btnRelatorio.setEnabled(false);
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(btnRelatorio);
        btnRelatorio.setBounds(170, 600, 110, 30);

        tblDenuncia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nº", "Data", "Fiscal", "Assunto", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDenuncia.getTableHeader().setReorderingAllowed(false);
        tblDenuncia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDenunciaMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblDenuncia);
        tblDenuncia.getColumnModel().getColumn(0).setMinWidth(80);
        tblDenuncia.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblDenuncia.getColumnModel().getColumn(0).setMaxWidth(80);
        tblDenuncia.getColumnModel().getColumn(1).setMinWidth(80);
        tblDenuncia.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblDenuncia.getColumnModel().getColumn(1).setMaxWidth(80);
        tblDenuncia.getColumnModel().getColumn(2).setMinWidth(50);
        tblDenuncia.getColumnModel().getColumn(2).setPreferredWidth(200);
        tblDenuncia.getColumnModel().getColumn(2).setMaxWidth(400);
        tblDenuncia.getColumnModel().getColumn(3).setMinWidth(50);
        tblDenuncia.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblDenuncia.getColumnModel().getColumn(3).setMaxWidth(400);
        tblDenuncia.getColumnModel().getColumn(4).setMinWidth(0);
        tblDenuncia.getColumnModel().getColumn(4).setPreferredWidth(0);
        tblDenuncia.getColumnModel().getColumn(4).setMaxWidth(0);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel9);
        jPanel9.setBounds(10, 80, 640, 100);

        cbxPesquisa.setFont(new java.awt.Font("SansSerif", 1, 12));
        cbxPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nº Denúncia", "Denunciado", "Fiscal", "Rua", "Bairro", "Atendente", "Assunto" }));
        getContentPane().add(cbxPesquisa);
        cbxPesquisa.setBounds(10, 40, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        btnNovo.setEnabled(false);
        pes.pesquisaIdVistoria();
        String num = pes.pesquisaNum_Denuncia();
        txtNum.setText(num);

        btnConcluir.setEnabled(true);

        txtDtDenuncia.setText("");
        txtAtendente.setText("");
        txtAtendimento.setText("");
        txtAssunto.setText("");
        txtProvidencias.setText("");
        txtDtRetorno.setText("");

        txtDenunciante.setText("");
        txtEndereco1.setText("");
        txtNum1.setText("");
        txtBairro1.setText("");
        txtQuadra1.setText("");
        txtLote1.setText("");
        txtInscrMunicipal1.setText("");
        txtTelefone1.setText("");
        txtLoteamento1.setText("");

        txtDenunciado.setText("");
        txtEndereco2.setText("");
        txtNum2.setText("");
        txtBairro2.setText("");
        txtLoteamento2.setText("");
        txtQuadra2.setText("");
        txtLote2.setText("");
        txtInscrMunicipal2.setText("");
        txtReferencia.setText("");
        txtDenuncia.setText("");

        btnConcluir.setEnabled(true);
        btnRelatorio.setEnabled(false);
        btnAtualizar.setEnabled(false);

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastrarVistoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        btnConcluir.setEnabled(false);
        
        String dt_denuncia = txtDtDenuncia.getText().toUpperCase();
        String num = txtNum.getText().toUpperCase();
        String fiscal = cbxFiscal.getSelectedItem().toString();
        String atendente = txtAtendente.getText().toUpperCase();
        String atendimento = txtAtendimento.getText().toUpperCase();
        String assunto = txtAssunto.getText().toUpperCase();

        String providencia = txtProvidencias.getText().toUpperCase();
        String dt_retorno = txtDtRetorno.getText().toUpperCase();

        cad.cadastrarVistoria(dt_denuncia, num, fiscal, atendente, atendimento, assunto, providencia, dt_retorno);

        //cadastra o denunciante
        int id = sel.selecionarIdVistoria();
        cadd.setId(id);

        String denunciante = txtDenunciante.getText().toUpperCase();
        String endereco1 = txtEndereco1.getText().toUpperCase();
        String complemento1 = txtComplemento1.getText().toUpperCase();
        String num1 = txtNum1.getText().toUpperCase();
        String bairro1 = txtBairro1.getText().toUpperCase();
        String quadra1 = txtQuadra1.getText().toUpperCase();
        String lote1 = txtLote1.getText().toUpperCase();
        String insc1 = txtInscrMunicipal1.getText().toUpperCase();
        String telefone = txtTelefone1.getText().toUpperCase();
        String loteamento = txtLoteamento1.getText().toUpperCase();

        cadd.cadastrarDenunciante(denunciante, endereco1, complemento1, num1, bairro1, quadra1, lote1, insc1, telefone, loteamento);

        //cadastra o denunciado
        cadde.setId(id);

        String denunciado = txtDenunciado.getText().toUpperCase();
        String endereco2 = txtEndereco2.getText().toUpperCase();
        String num2 = txtNum2.getText().toUpperCase();
        String bairro2 = txtBairro2.getText().toUpperCase();
        String loteamento2 = txtLoteamento2.getText().toUpperCase();
        String quadra2 = txtQuadra2.getText().toUpperCase();
        String lote2 = txtLote2.getText().toUpperCase();
        String insc2 = txtInscrMunicipal2.getText().toUpperCase();
        String referencia = txtReferencia.getText().toUpperCase();
        String denuncia = txtDenuncia.getText().toUpperCase();

        cadde.cadastrarDenunciado(denunciado, endereco2, num2, bairro2, quadra2, lote2, loteamento2, insc2, referencia, denuncia);

        txtDtDenuncia.setText("");
        txtNum.setText("");
        cbxFiscal.setSelectedItem("");
        txtAtendente.setText("");
        txtAtendimento.setText("");
        txtAssunto.setText("");

        txtProvidencias.setText("");
        txtDtRetorno.setText("");

        txtDenunciante.setText("");
        txtEndereco1.setText("");
        txtComplemento1.setText("");
        txtNum1.setText("");
        txtBairro1.setText("");
        txtQuadra1.setText("");
        txtLote1.setText("");
        txtInscrMunicipal1.setText("");
        txtTelefone1.setText("");
        txtLoteamento1.setText("");

        txtDenunciado.setText("");
        txtEndereco2.setText("");
        txtNum2.setText("");
        txtBairro2.setText("");
        txtLoteamento2.setText("");
        txtQuadra2.setText("");
        txtLote2.setText("");
        txtInscrMunicipal2.setText("");
        txtReferencia.setText("");
        txtDenuncia.setText("");

        btnNovo.setEnabled(true);
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void tblDenunciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDenunciaMouseClicked
        Object a = tblDenuncia.getValueAt(tblDenuncia.getSelectedRow(), 4);

        String n = String.valueOf(a);
        int num = Integer.valueOf(n);

        pes.setId(num);

        txtDtDenuncia.setText("");

        //dados principais
        String dt = pes.pesquisaDataDenuncia();
        txtDtDenuncia.setText(dt);
        String atendente = pes.pesquisaAtendente();
        txtAtendente.setText(atendente);
        String atendimento = pes.pesquisaAtendimento();
        txtAtendimento.setText(atendimento);
        String fiscal = pes.pesquisaFiscal();
        cbxFiscal.setSelectedItem(fiscal);
        String assunto = pes.pesquisaAssunto();
        txtAssunto.setText(assunto);

        //dados denunciante
        String nome1 = pes.pesquisaDenunciante();
        txtDenunciante.setText(nome1);
        String end1 = pes.pesquisaDenuncianteEndereco();
        txtEndereco1.setText(end1);
        String comp1 = pes.pesquisaDenuncianteComplemento();
        txtComplemento1.setText(comp1);
        String bar1 = pes.pesquisaDenuncianteBairro();
        txtBairro1.setText(bar1);
        String num1 = pes.pesquisaDenuncianteNum();
        txtNum1.setText(num1);
        String lote1 = pes.pesquisaDenuncianteLote();
        txtLote1.setText(lote1);
        String loteamento1 = pes.pesquisaDenuncianteLoteamento();
        txtLoteamento1.setText(loteamento1);
        String quadra1 = pes.pesquisaDenuncianteQuadra();
        txtQuadra1.setText(quadra1);
        String telefone = pes.pesquisaDenuncianteTelefone();
        txtTelefone1.setText(telefone);
        String insc1 = pes.pesquisaDenuncianteInscrMunicipal();
        txtInscrMunicipal1.setText(insc1);

        //denunciado
        String nome2 = pes.pesquisaDenunciado();
        txtDenunciado.setText(nome2);
        String end2 = pes.pesquisaDenunciadoEndereco();
        txtEndereco2.setText(end2);
        String bar2 = pes.pesquisaDenunciadoBairro();
        txtBairro2.setText(bar2);
        String num2 = pes.pesquisaDenunciadoNum();
        txtNum2.setText(num2);
        String loteamento2 = pes.pesquisaDenunciadoLoteamento();
        txtLoteamento2.setText(loteamento2);
        String lote2 = pes.pesquisaDenunciadoLote();
        txtLote2.setText(lote2);
        String quadra2 = pes.pesquisaDenunciadoQuadra();
        txtQuadra2.setText(quadra2);
        String insc2 = pes.pesquisaDenunciadoInscrMunicipal();
        txtInscrMunicipal2.setText(insc2);
        String ref = pes.pesquisaDenunciadoReferencia();
        txtReferencia.setText(ref);
        String de = pes.pesquisaDenunciadoDescricao();
        txtDenuncia.setText(de);

        String pro = pes.pesquisaProvidencias();
        txtProvidencias.setText(pro);
        String dt2 = pes.pesquisaDataRetorno();
        txtDtRetorno.setText(dt2);

        //num da denuncia
        String d = pes.pesquisaNumDenuncia();
        txtNum.setText(d);

        btnConcluir.setEnabled(false);
        btnAtualizar.setEnabled(true);
        btnRelatorio.setEnabled(true);
        btnNovo.setEnabled(true);

    }//GEN-LAST:event_tblDenunciaMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        String i = txtNum.getText();

        int id = pes.pesquisaIdVistoria2(i);
        atu.setId(id);

        //dados principais
        String fiscal = cbxFiscal.getSelectedItem().toString();
        String atendente = txtAtendente.getText().toUpperCase();
        String atendimento = txtAtendimento.getText().toUpperCase();
        String assunto = txtAssunto.getText().toUpperCase();
        String providencia = txtProvidencias.getText().toUpperCase();
        String dt_retorno = txtDtRetorno.getText().toUpperCase();
        String dt_denuncia = txtDtDenuncia.getText().toLowerCase();

        //dados denunciante
        String denunciante = txtDenunciante.getText().toUpperCase();
        String endereco1 = txtEndereco1.getText().toUpperCase();
        String complemento1 = txtComplemento1.getText().toUpperCase();
        String num1 = txtNum1.getText().toUpperCase();
        String bairro1 = txtBairro1.getText().toUpperCase();
        String quadra1 = txtQuadra1.getText().toUpperCase();
        String lote1 = txtLote1.getText().toUpperCase();
        String insc1 = txtInscrMunicipal1.getText().toUpperCase();
        String telefone = txtTelefone1.getText().toUpperCase();
        String loteamento = txtLoteamento1.getText().toUpperCase();

        //dados denunciado
        String denunciado = txtDenunciado.getText().toUpperCase();
        String endereco2 = txtEndereco2.getText().toUpperCase();
        String num2 = txtNum2.getText().toUpperCase();
        String bairro2 = txtBairro2.getText().toUpperCase();
        String loteamento2 = txtLoteamento2.getText().toUpperCase();
        String quadra2 = txtQuadra2.getText().toUpperCase();
        String lote2 = txtLote2.getText().toUpperCase();
        String insc2 = txtInscrMunicipal2.getText().toUpperCase();
        String referencia = txtReferencia.getText().toUpperCase();
        String denuncia = txtDenuncia.getText().toUpperCase();


        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Deseja salvar as alterações?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (opc.toString().equals("0")) {

            atu.atualizarVistoria(fiscal, atendente, atendimento, assunto, providencia, dt_retorno, dt_denuncia);
            atu.atualizarDenunciante(denunciante, endereco1, complemento1, bairro1, num1, quadra1, lote1, loteamento, insc1, telefone);
            atu.atualizarDenunciado(denunciado, endereco2, bairro2, num2, quadra2, lote2, loteamento2, insc2, referencia, denuncia);

            JOptionPane.showMessageDialog(null, "Atualização efetuada com sucesso!");


            try {
                preenche_jtable();
            } catch (SQLException ex) {
                Logger.getLogger(FormCadastrarVistoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


        
        txtDtDenuncia.setText("");
        txtNum.setText("");
        cbxFiscal.setSelectedItem("");
        txtAtendente.setText("");
        txtAtendimento.setText("");
        txtAssunto.setText("");

        txtProvidencias.setText("");
        txtDtRetorno.setText("");

        txtDenunciante.setText("");
        txtEndereco1.setText("");
        txtComplemento1.setText("");
        txtNum1.setText("");
        txtBairro1.setText("");
        txtQuadra1.setText("");
        txtLote1.setText("");
        txtInscrMunicipal1.setText("");
        txtTelefone1.setText("");
        txtLoteamento1.setText("");

        txtDenunciado.setText("");
        txtEndereco2.setText("");
        txtNum2.setText("");
        txtBairro2.setText("");
        txtLoteamento2.setText("");
        txtQuadra2.setText("");
        txtLote2.setText("");
        txtInscrMunicipal2.setText("");
        txtReferencia.setText("");
        txtDenuncia.setText("");

        btnAtualizar.setEnabled(false);
        btnRelatorio.setEnabled(false);
        btnNovo.setEnabled(true);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (trmVis.equals(trmVis)) {
            FormMenu M = new FormMenu(this, true);
            M.setVisible(true);
            M.group = trmVis;
            M.acesso_user = acesso_bkp;
            dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        Connection con = (Connection) bd.getConnection();
        String n = txtNum.getText();
        int id = pes.pesquisaIdVistoria2(n);
        //gera o relatório

        HashMap parametro = new HashMap();
        parametro.put("ID", String.valueOf(id));

        try {
            JasperPrint jp = JasperFillManager.fillReport("./relatorios/RelatorioDenuncia.jasper", parametro, con);
            JasperViewer jrv = new JasperViewer(jp, false);
            jrv.setVisible(true);

            //Altera o icone e o título da janela
            jrv.setTitle("TRDoc - Tramitação de Documentos");
            URL url = this.getClass().getResource("/Icons/vistoria.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
            jrv.setIconImage(imagemTitulo);

            try {
                preenche_jtable();
            } catch (SQLException ex) {
                Logger.getLogger(FormCadastrarVistoria.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (JRException ex) {
            Logger.getLogger(FormCadastrarVistoria.class.getName()).log(Level.SEVERE, null, ex);
        }

        btnAtualizar.setEnabled(false);
        btnNovo.setEnabled(true);
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiscalActionPerformed
        FormCadastrarFiscal C = new FormCadastrarFiscal();
        C.setVisible(true);
    }//GEN-LAST:event_btnFiscalActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Carrega o jcombobox profissional
        Vector f = com.Fiscal();
        cbxFiscal.removeAllItems();
        cbxFiscal.addItem("");
        for (int i = 0; i < f.size(); i++) {
            cbxFiscal.addItem(f.elementAt(i));
        }
    }//GEN-LAST:event_formWindowActivated

    private void txtListarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListarKeyPressed
        if(evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
	   btnListar.doClick();
        }
    }//GEN-LAST:event_txtListarKeyPressed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormCadastrarVistoria().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnFiscal;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbxFiscal;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblDenuncia;
    private javax.swing.JTextArea txtAssunto;
    private javax.swing.JTextField txtAtendente;
    private javax.swing.JTextField txtAtendimento;
    private javax.swing.JTextField txtBairro1;
    private javax.swing.JTextField txtBairro2;
    private javax.swing.JTextField txtComplemento1;
    private javax.swing.JTextArea txtDenuncia;
    private javax.swing.JTextField txtDenunciado;
    private javax.swing.JTextField txtDenunciante;
    private javax.swing.JTextField txtDtDenuncia;
    private javax.swing.JTextField txtDtRetorno;
    private javax.swing.JTextField txtEndereco1;
    private javax.swing.JTextField txtEndereco2;
    private javax.swing.JTextField txtInscrMunicipal1;
    private javax.swing.JTextField txtInscrMunicipal2;
    private javax.swing.JTextField txtListar;
    private javax.swing.JTextField txtLote1;
    private javax.swing.JTextField txtLote2;
    private javax.swing.JTextField txtLoteamento1;
    private javax.swing.JTextField txtLoteamento2;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextArea txtProvidencias;
    private javax.swing.JTextField txtQuadra1;
    private javax.swing.JTextField txtQuadra2;
    private javax.swing.JTextArea txtReferencia;
    private javax.swing.JTextField txtTelefone1;
    // End of variables declaration//GEN-END:variables

    public void preenche_jtable() throws SQLException {

        DefaultTableModel modelo = (DefaultTableModel) tblDenuncia.getModel();
        modelo.setNumRows(0);


        String pesquisa = txtListar.getText().toString();
        String combo = cbxPesquisa.getSelectedItem().toString();

        if (pesquisa.equals("")) {
            try {
                ResultSet resultado = bd.consultaTable("SELECT * FROM vistoria  ORDER BY dt_denuncia DESC LIMIT 100 ");

                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                {
                    modelo.addRow(new Object[]{resultado.getString("num_denuncia"), resultado.getString("dt_denuncia"), resultado.getString("fiscal"), resultado.getString("assunto"), resultado.getString("id")});
                }

                resultado.first();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
            }

        } else {
            if (combo.equals("Nº Denúncia")) {
                try {
                    ResultSet resultado = bd.consultaTable("SELECT id, num_denuncia, fiscal,assunto, dt_denuncia FROM vistoria WHERE num_denuncia LIKE '%" + pesquisa + "%'");

                    while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                    {
                        modelo.addRow(new Object[]{resultado.getString("num_denuncia"), resultado.getString("dt_denuncia"), resultado.getString("fiscal"), resultado.getString("assunto"), resultado.getString("id")});
                    }

                    resultado.first();
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                }

            } else {
                if (combo.equals("Denuciado")) {
                    try {
                        ResultSet resultado = bd.consultaTable("SELECT vistoria.id, vistoria.num_denuncia, vistoria.fiscal, "
                                + "vistoria.assunto, vistoria.dt_denuncia FROM vistoria "
                                + "INNER JOIN denunciado ON denunciado.vistoria_id = vistoria.id "
                                + "WHERE denunciado.nome_denunciado LIKE '%" + pesquisa + "%'");

                        while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                        {
                            modelo.addRow(new Object[]{resultado.getString("num_denuncia"), resultado.getString("dt_denuncia"), resultado.getString("fiscal"), resultado.getString("assunto"), resultado.getString("id")});
                        }

                        resultado.first();
                    } catch (SQLException erro) {
                        JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                    }

                } else {
                    if (combo.equals("Fiscal")) {
                        try {
                            ResultSet resultado = bd.consultaTable("SELECT id, num_denuncia, fiscal,assunto, dt_denuncia FROM vistoria WHERE fiscal LIKE '%" + pesquisa + "%'");

                            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                            {
                                modelo.addRow(new Object[]{resultado.getString("num_denuncia"), resultado.getString("dt_denuncia"), resultado.getString("fiscal"), resultado.getString("assunto"), resultado.getString("id")});
                            }

                            resultado.first();
                        } catch (SQLException erro) {
                            JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                        }

                    } else {
                        if (combo.equals("Rua")) {
                            try {
                                ResultSet resultado = bd.consultaTable("SELECT vistoria.id, vistoria.num_denuncia, vistoria.fiscal, "
                                        + "vistoria.assunto, vistoria.dt_denuncia FROM vistoria "
                                        + "INNER JOIN denunciado ON denunciado.vistoria_id = vistoria.id "
                                        + "WHERE denunciado.endereco_denunciado LIKE '%" + pesquisa + "%'");

                                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                {
                                    modelo.addRow(new Object[]{resultado.getString("num_denuncia"), resultado.getString("dt_denuncia"), resultado.getString("fiscal"), resultado.getString("assunto"), resultado.getString("id")});
                                }

                                resultado.first();
                            } catch (SQLException erro) {
                                JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                            }

                        } else {
                            if (combo.equals("Bairro")) {
                                try {
                                    ResultSet resultado = bd.consultaTable("SELECT vistoria.id, vistoria.num_denuncia, vistoria.fiscal, "
                                            + "vistoria.assunto, vistoria.dt_denuncia FROM vistoria "
                                            + "INNER JOIN denunciado ON denunciado.vistoria_id = vistoria.id "
                                            + "WHERE denunciado.bairro_denunciado LIKE '%" + pesquisa + "%'");
                                    while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                    {
                                        modelo.addRow(new Object[]{resultado.getString("num_denuncia"), resultado.getString("dt_denuncia"), resultado.getString("fiscal"), resultado.getString("assunto"), resultado.getString("id")});
                                    }

                                    resultado.first();
                                } catch (SQLException erro) {
                                    JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                                }
                            } else {
                                if (combo.equals("Atendente")) {
                                    try {
                                        ResultSet resultado = bd.consultaTable("SELECT id, num_denuncia, fiscal,assunto, dt_denuncia FROM vistoria WHERE atendente LIKE '%" + pesquisa + "%'");

                                        while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                        {
                                            modelo.addRow(new Object[]{resultado.getString("num_denuncia"), resultado.getString("dt_denuncia"), resultado.getString("fiscal"), resultado.getString("assunto"), resultado.getString("id")});
                                        }

                                        resultado.first();
                                    } catch (SQLException erro) {
                                        JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                                    }
                                } else {
                                    if (combo.equals("Assunto")) {
                                        try {
                                            ResultSet resultado = bd.consultaTable("SELECT id, num_denuncia, fiscal,assunto, dt_denuncia FROM vistoria WHERE assunto LIKE '%" + pesquisa + "%'");

                                            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                            {
                                                modelo.addRow(new Object[]{resultado.getString("num_denuncia"), resultado.getString("dt_denuncia"), resultado.getString("fiscal"), resultado.getString("assunto"), resultado.getString("id")});
                                            }
                                            resultado.first();
                                        } catch (SQLException erro) {
                                            JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
