package Forms;

import Classes.Pesquisa.ClassPesquisaVistoria;
import Classes.Pesquisa.ClassCarregarCombo;
import Classes.Fiscais.ClassLancamentoFiscais;
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

public class FormLancamentoFiscais extends javax.swing.JFrame {

    AcessoBD bd = new AcessoBD();
    ClassCarregarCombo com = new ClassCarregarCombo();
    ClassLancamentoFiscais lan = new ClassLancamentoFiscais();
    ClassPesquisaVistoria pes = new ClassPesquisaVistoria();
    //variáveis
    public String lanfiscal;
    public String xnome_corresp, xenderc_corresp, xnum_corresp, xcomple_corresp, xbairro_corresp, xcidade_corresp, xestado_corresp, xcep_corresp;
    public String xender_infrac, xnum_infrac, xloteame_infrac, xlote_infrac, xquadra_infrac, xinscmun_infrac, xdenunc_infrac;
    public String xnum_notif, xdata_notif, xnum_auto, xdata_auto, xnum_processo, xnum_denuncia, xdata_denuncia;
    public String xlei, xartigo, xprazo, xfiscais;
    public String xprovidencias, xdata_retorno;
    public boolean[] acesso_bkp;
    private int largura = 750;
    private int altura = 630;

    public FormLancamentoFiscais() {

        initComponents();
        
        btnExcluir.setVisible(false);
        btnAtualizar.setVisible(false);
        btnConcluir.setVisible(false);
        btnNovo.setVisible(false);

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


        //Carrega o jcombobox
        Vector f = com.Fiscal();
        cbxFiscais.removeAllItems();
        cbxFiscais.addItem(" ");
        for (int i = 0; i < f.size(); i++) {
            cbxFiscais.addItem(f.elementAt(i));
        }
    }

    FormLancamentoFiscais(FormMenu aThis, boolean b) {
        initComponents();
        
        btnExcluir.setVisible(false);
        btnAtualizar.setVisible(false);
        btnConcluir.setVisible(false);
        btnNovo.setVisible(false);

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

        //Carrega o jcombobox
        Vector f = com.Fiscal();
        cbxFiscais.removeAllItems();
        cbxFiscais.addItem(" ");
        for (int i = 0; i < f.size(); i++) {
            cbxFiscais.addItem(f.elementAt(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEndereco1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtBairro1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtQuadra1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtInscrMunicipal1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtLoteamento1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtLote1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cbxPesquisa = new javax.swing.JComboBox();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFiscais = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbxFiscais = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtLei = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtArtigo = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtPrazo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        txtNumNotificacao = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter dt_fiscais = null;
        try {
            dt_fiscais = new javax.swing.text.MaskFormatter("##/##/####");
            dt_fiscais.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtData1 = new javax.swing.JFormattedTextField(dt_fiscais);
        jLabel30 = new javax.swing.JLabel();
        txtNumAutoInfracao = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter dt_fiscais2 = null;
        try {
            dt_fiscais2 = new javax.swing.text.MaskFormatter("##/##/####");
            dt_fiscais2.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtData2 = new javax.swing.JFormattedTextField(dt_fiscais2);
        jPanel8 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtNumProcesso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumDenuncia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDataDenuncia = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter ident5 = null;
        try {
            ident5 = new javax.swing.text.MaskFormatter("##.###.###-#");
            ident5.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtInscrMunicipalInfracao = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtEnderecoInfracao = new javax.swing.JTextField();
        txtNumInfracao = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtLoteamentoInfracao = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtQuadraInfracao = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtLoteInfracao = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDenunciaInfracao = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        txtNomeCorresp = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtEnderecoCorresp = new javax.swing.JTextField();
        txtNumCorresp = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtComplementoCorresp = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtBairroCorresp = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtCidadeCorresp = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtEstadoCorresp = new javax.swing.JTextField();
        txtCEPCorresp = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtProvidencias = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter dt_retorno = null;
        try {
            dt_retorno = new javax.swing.text.MaskFormatter("##/##/####");
            dt_retorno.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDataRetorno = new javax.swing.JFormattedTextField(dt_retorno);
        jSeparator6 = new javax.swing.JSeparator();
        btnNovo = new javax.swing.JButton();
        btnConcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        jLabel9.setText("Nome:");

        jLabel10.setText("Endereço:");

        jLabel11.setText("Nº:");

        jLabel12.setText("Bairro:");

        jLabel13.setText("Quadra:");

        jLabel14.setText("Inscr. Municipal:");

        jLabel15.setText("Loteamento:");

        jLabel16.setText("Lote:");

        jLabel17.setText("Telefone:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtEndereco1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBairro1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(txtLoteamento1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(txtQuadra1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLote1)
                            .addComponent(txtInscrMunicipal1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtQuadra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInscrMunicipal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtLoteamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtLote1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TrDoc- Tramitação de Documentos");
        setResizable(false);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel1.setText("Lançamento  de Fiscais");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("Pesquisar:");

        cbxPesquisa.setFont(new java.awt.Font("SansSerif", 1, 12));
        cbxPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nº Denúncia", "Nº Processo", "Nº Notificação", "Nº Auto de Infração", "Denunciado", "Bairro", "Endereço", "Assunto", "Ident. Cadastral", "Fiscal", " ", " " }));
        cbxPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPesquisaActionPerformed(evt);
            }
        });

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lista.png"))); // NOI18N
        btnPesquisar.setText("Listar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblFiscais.setFont(new java.awt.Font("SansSerif", 1, 12));
        tblFiscais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nº Denúncia", "Data Denúncia", "Nº Processo", "Endereço", "Denúncia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFiscais.getTableHeader().setReorderingAllowed(false);
        tblFiscais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFiscaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFiscais);
        tblFiscais.getColumnModel().getColumn(0).setMinWidth(0);
        tblFiscais.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblFiscais.getColumnModel().getColumn(0).setMaxWidth(0);
        tblFiscais.getColumnModel().getColumn(1).setResizable(false);
        tblFiscais.getColumnModel().getColumn(1).setPreferredWidth(30);
        tblFiscais.getColumnModel().getColumn(2).setResizable(false);
        tblFiscais.getColumnModel().getColumn(2).setPreferredWidth(30);
        tblFiscais.getColumnModel().getColumn(3).setResizable(false);
        tblFiscais.getColumnModel().getColumn(3).setPreferredWidth(30);
        tblFiscais.getColumnModel().getColumn(4).setPreferredWidth(150);
        tblFiscais.getColumnModel().getColumn(5).setPreferredWidth(200);

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jPanel7.setLayout(null);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel3.setText("Fiscais");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(12, 17, 40, 16);

        jPanel7.add(cbxFiscais);
        cbxFiscais.setBounds(12, 42, 700, 28);

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user_business.png"))); // NOI18N
        jButton1.setText("Adicionar Novo Fiscal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);
        jButton1.setBounds(540, 11, 169, 26);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel4.setText("Lei");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(12, 76, 17, 16);
        jPanel7.add(txtLei);
        txtLei.setBounds(12, 98, 153, 26);

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel27.setText("Artigo");
        jPanel7.add(jLabel27);
        jLabel27.setBounds(188, 76, 34, 16);

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel26.setText("/");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(173, 103, 3, 16);
        jPanel7.add(txtArtigo);
        txtArtigo.setBounds(188, 98, 147, 26);

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel28.setText("Prazo Intimação");
        jPanel7.add(jLabel28);
        jLabel28.setBounds(362, 76, 92, 16);
        jPanel7.add(txtPrazo);
        txtPrazo.setBounds(362, 98, 153, 26);
        jPanel7.add(jSeparator3);
        jSeparator3.setBounds(10, 130, 698, 2);

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel29.setText("Nº Notificação");
        jPanel7.add(jLabel29);
        jLabel29.setBounds(10, 150, 79, 16);
        jPanel7.add(txtNumNotificacao);
        txtNumNotificacao.setBounds(10, 170, 204, 26);

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel31.setText("/");
        jPanel7.add(jLabel31);
        jLabel31.setBounds(230, 170, 3, 16);

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel32.setText("Data");
        jPanel7.add(jLabel32);
        jLabel32.setBounds(240, 150, 26, 16);
        jPanel7.add(txtData1);
        txtData1.setBounds(240, 170, 111, 26);

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel30.setText("Nº Auto de Infração");
        jPanel7.add(jLabel30);
        jLabel30.setBounds(10, 200, 108, 16);
        jPanel7.add(txtNumAutoInfracao);
        txtNumAutoInfracao.setBounds(10, 220, 204, 26);

        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel34.setText("/");
        jPanel7.add(jLabel34);
        jLabel34.setBounds(230, 230, 3, 16);

        jLabel33.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel33.setText("Data");
        jPanel7.add(jLabel33);
        jLabel33.setBounds(240, 200, 26, 16);
        jPanel7.add(txtData2);
        txtData2.setBounds(240, 220, 111, 26);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel35.setText("Nº Processo");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel6.setText("Nº Denúncia");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel7.setText("Data Denúncia");

        btnVerificar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/vistoria.png"))); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNumDenuncia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumProcesso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerificar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDataDenuncia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(178, 178, 178)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8);
        jPanel8.setBounds(370, 150, 338, 180);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel8.setText("/");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(347, 103, 3, 16);

        jTabbedPane1.addTab("Dados da Infração", jPanel7);

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel21.setText("Inscrição Municipal");

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel24.setText("Endereço");

        txtNumInfracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumInfracaoActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel36.setText("Nº");

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel18.setText("Loteamento");

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel23.setText("Quadra");

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel20.setText("Lote");

        jLabel38.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel38.setText("Descrição da Ocorrência");

        txtDenunciaInfracao.setColumns(20);
        txtDenunciaInfracao.setLineWrap(true);
        txtDenunciaInfracao.setRows(5);
        txtDenunciaInfracao.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtDenunciaInfracao);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtEnderecoInfracao, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumInfracao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLoteamentoInfracao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuadraInfracao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtLoteInfracao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtInscrMunicipalInfracao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(568, 568, 568)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoInfracao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumInfracao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoteamentoInfracao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuadraInfracao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoteInfracao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInscrMunicipalInfracao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Local da Infração", jPanel4);

        jLabel40.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel40.setText("Nome");

        jLabel41.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel41.setText("Endereço");

        jLabel42.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel42.setText("Nº");

        jLabel43.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel43.setText("Complemento");

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel19.setText("Bairro");

        jLabel44.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel44.setText("Cidade");

        jLabel45.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel45.setText("Estado");

        jLabel46.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel46.setText("CEP");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(570, 570, 570)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtComplementoCorresp, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEstadoCorresp))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBairroCorresp, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                .addComponent(txtCEPCorresp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCidadeCorresp, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtNomeCorresp, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(txtEnderecoCorresp, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txtNumCorresp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCorresp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEnderecoCorresp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumCorresp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComplementoCorresp, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtBairroCorresp, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtCidadeCorresp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstadoCorresp, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtCEPCorresp, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(132, 132, 132))
        );

        jTabbedPane1.addTab(" Dados para Correspodência", jPanel5);

        txtProvidencias.setColumns(20);
        txtProvidencias.setRows(5);
        jScrollPane5.setViewportView(txtProvidencias);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("Data de Retorno");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(txtDataRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Providências", jPanel9);

        btnNovo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/novo2.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnConcluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/concluir.png"))); // NOI18N
        btnConcluir.setText("Concluir");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        btnAtualizar.setText("Atualizar Registro");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete1.png"))); // NOI18N
        btnExcluir.setText("Excluir Registro");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNovo))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisar)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnNovo)
                    .addComponent(btnConcluir)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (lanfiscal.equals(lanfiscal)) {

            FormMenu M = new FormMenu(this, true);
            M.setVisible(true);
            M.group = lanfiscal;
            M.acesso_user = acesso_bkp;
            dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtLei.setText("");
        txtArtigo.setText("");
        txtPrazo.setText("");
        cbxFiscais.setSelectedItem("");

        txtNumNotificacao.setText("");
        txtData1.setText("");
        txtNumAutoInfracao.setText("");
        txtData2.setText("");
        txtNumProcesso.setText("");
        txtNumDenuncia.setText("");

        txtEnderecoInfracao.setText("");
        txtNumInfracao.setText("");
        txtLoteamentoInfracao.setText("");
        txtLoteInfracao.setText("");
        txtQuadraInfracao.setText("");
        txtInscrMunicipalInfracao.setText("");
        txtDenunciaInfracao.setText("");

        txtNomeCorresp.setText("");
        txtEnderecoCorresp.setText("");
        txtNumCorresp.setText("");
        txtComplementoCorresp.setText("");
        txtBairroCorresp.setText("");
        txtCidadeCorresp.setText("");
        txtEstadoCorresp.setText("");
        txtCEPCorresp.setText("");

        txtProvidencias.setText("");
        txtDataRetorno.setText("");


        btnAtualizar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnConcluir.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        String nome_corresp, enderc_corresp, num_corresp, comple_corresp, bairro_corresp, cidade_corresp, estado_corresp, cep_corresp;
        String ender_infrac, num_infrac, loteame_infrac, lote_infrac, quadra_infrac, inscmun_infrac, denunc_infrac;
        String num_notif, data_notif, num_auto, data_auto, num_processo, num_denuncia, data_denuncia;
        String lei, artigo, prazo, fiscais;
        String providencias, data_retorno;

        lei = txtLei.getText().toUpperCase();
        artigo = txtArtigo.getText().toUpperCase();
        prazo = txtPrazo.getText().toUpperCase();
        fiscais = cbxFiscais.getSelectedItem().toString().toUpperCase();
        num_notif = txtNumNotificacao.getText().toUpperCase();
        data_notif = txtData1.getText().toUpperCase();
        num_auto = txtNumAutoInfracao.getText().toUpperCase();
        data_auto = txtData2.getText().toUpperCase();
        num_processo = txtNumProcesso.getText().toUpperCase();
        num_denuncia = txtNumDenuncia.getText().toUpperCase();
        data_denuncia = txtDataDenuncia.getText().toUpperCase();
        ender_infrac = txtEnderecoInfracao.getText().toUpperCase();
        num_infrac = txtNumInfracao.getText().toUpperCase();
        loteame_infrac = txtLoteamentoInfracao.getText().toUpperCase();
        lote_infrac = txtLoteInfracao.getText().toUpperCase();
        quadra_infrac = txtQuadraInfracao.getText().toUpperCase();
        inscmun_infrac = txtInscrMunicipalInfracao.getText().toUpperCase();
        denunc_infrac = txtDenunciaInfracao.getText().toUpperCase();
        nome_corresp = txtNomeCorresp.getText().toUpperCase();
        enderc_corresp = txtEnderecoCorresp.getText().toUpperCase();
        num_corresp = txtNumCorresp.getText().toUpperCase();
        comple_corresp = txtComplementoCorresp.getText().toUpperCase();
        bairro_corresp = txtBairroCorresp.getText().toUpperCase();
        cidade_corresp = txtCidadeCorresp.getText().toUpperCase();
        estado_corresp = txtEstadoCorresp.getText().toUpperCase();
        cep_corresp = txtCEPCorresp.getText().toUpperCase();
        providencias = txtProvidencias.getText().toUpperCase();
        data_retorno = txtDataRetorno.getText().toUpperCase();



        lan.cadastrarLancamento(
                lei,
                artigo,
                prazo,
                fiscais,
                num_notif,
                data_notif,
                num_auto,
                data_auto,
                num_processo,
                num_denuncia,
                data_denuncia,
                ender_infrac,
                num_infrac,
                loteame_infrac,
                lote_infrac,
                quadra_infrac,
                inscmun_infrac,
                denunc_infrac,
                nome_corresp,
                enderc_corresp,
                num_corresp,
                comple_corresp,
                bairro_corresp,
                cidade_corresp,
                estado_corresp,
                cep_corresp,
                providencias,
                data_retorno);

        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormLancamentoFiscais.class.getName()).log(Level.SEVERE, null, ex);
        }



        //limpa os campos após  o cadastro
        btnConcluir.setEnabled(false);

        txtLei.setText("");
        txtArtigo.setText("");
        txtPrazo.setText("");
        cbxFiscais.setSelectedItem("");
        txtNumNotificacao.setText("");
        txtData1.setText("");
        txtNumAutoInfracao.setText("");
        txtData2.setText("");
        txtNumProcesso.setText("");
        txtNumDenuncia.setText("");
        txtDataDenuncia.setText("");
        txtEnderecoInfracao.setText("");
        txtNumInfracao.setText("");
        txtLoteamentoInfracao.setText("");
        txtLoteInfracao.setText("");
        txtQuadraInfracao.setText("");
        txtInscrMunicipalInfracao.setText("");
        txtDenunciaInfracao.setText("");
        txtNomeCorresp.setText("");
        txtEnderecoCorresp.setText("");
        txtNumCorresp.setText("");
        txtComplementoCorresp.setText("");
        txtBairroCorresp.setText("");
        txtCidadeCorresp.setText("");
        txtEstadoCorresp.setText("");
        txtCEPCorresp.setText("");
        txtProvidencias.setText("");
        txtDataRetorno.setText("");


        //limpa as variáveis!
        xlei = "";
        txtArtigo.setText(xartigo = "");
        txtPrazo.setText(xprazo = "");

        txtNumNotificacao.setText(xnum_notif = "");
        txtData1.setText(xdata_notif = "");
        txtNumAutoInfracao.setText(xnum_auto = "");
        txtData2.setText(xdata_auto = "");
        txtNumProcesso.setText(xnum_processo = "");
        txtNumDenuncia.setText(xnum_denuncia = "");
        txtDataDenuncia.setText(xdata_denuncia = "");

        txtEnderecoInfracao.setText(xender_infrac = "");
        txtNumInfracao.setText(xnum_infrac = "");
        txtLoteamentoInfracao.setText(xloteame_infrac = "");
        txtLoteInfracao.setText(xlote_infrac = "");
        txtQuadraInfracao.setText(xquadra_infrac = "");
        txtInscrMunicipalInfracao.setText(xinscmun_infrac = "");
        txtDenunciaInfracao.setText(xdenunc_infrac = "");

        txtNomeCorresp.setText(xnome_corresp = "");
        txtEnderecoCorresp.setText(xenderc_corresp = "");
        txtNumCorresp.setText(xnum_corresp = "");
        txtComplementoCorresp.setText(xcomple_corresp = "");
        txtBairroCorresp.setText(xbairro_corresp = "");
        txtCidadeCorresp.setText(xcidade_corresp = "");
        txtEstadoCorresp.setText(xestado_corresp = "");
        txtCEPCorresp.setText(xcep_corresp = "");

        txtProvidencias.setText(xprovidencias = "");
        txtDataRetorno.setText(xdata_retorno = "");

    }//GEN-LAST:event_btnConcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        btnExcluir.setVisible(acesso_bkp[17]);
        btnAtualizar.setVisible(acesso_bkp[17]);
        btnConcluir.setVisible(acesso_bkp[17]);
        btnNovo.setVisible(acesso_bkp[17]);
    }//GEN-LAST:event_formWindowActivated
    public void loadData()
    {
    txtLei.setText(xlei);
        txtArtigo.setText(xartigo);
        txtPrazo.setText(xprazo);

        txtNumNotificacao.setText(xnum_notif);
        txtData1.setText(xdata_notif);
        txtNumAutoInfracao.setText(xnum_auto);
        txtData2.setText(xdata_auto);
        txtNumProcesso.setText(xnum_processo);
        txtNumDenuncia.setText(xnum_denuncia);
        txtDataDenuncia.setText(xdata_denuncia);

        txtEnderecoInfracao.setText(xender_infrac);
        txtNumInfracao.setText(xnum_infrac);
        txtLoteamentoInfracao.setText(xloteame_infrac);
        txtLoteInfracao.setText(xlote_infrac);
        txtQuadraInfracao.setText(xquadra_infrac);
        txtInscrMunicipalInfracao.setText(xinscmun_infrac);
        txtDenunciaInfracao.setText(xdenunc_infrac);

        txtNomeCorresp.setText(xnome_corresp);
        txtEnderecoCorresp.setText(xenderc_corresp);
        txtNumCorresp.setText(xnum_corresp);
        txtComplementoCorresp.setText(xcomple_corresp);
        txtBairroCorresp.setText(xbairro_corresp);
        txtCidadeCorresp.setText(xcidade_corresp);
        txtEstadoCorresp.setText(xestado_corresp);
        txtCEPCorresp.setText(xcep_corresp);

        txtProvidencias.setText(xprovidencias);
        txtDataRetorno.setText(xdata_retorno);

        //Carrega o jcombobox
        Vector f = com.Fiscal();
        cbxFiscais.removeAllItems();
        cbxFiscais.addItem(" ");
        for (int i = 0; i < f.size(); i++) {
            cbxFiscais.addItem(f.elementAt(i));
        }
    }
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormLancamentoFiscais.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tblFiscaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFiscaisMouseClicked
        Object a = tblFiscais.getValueAt(tblFiscais.getSelectedRow(), 0);

        String n = String.valueOf(a);
        int num = Integer.valueOf(n);
        String nome_corresp, enderc_corresp, num_corresp, comple_corresp, bairro_corresp, cidade_corresp, estado_corresp, cep_corresp;
        String ender_infrac, num_infrac, loteame_infrac, lote_infrac, quadra_infrac, inscmun_infrac, denunc_infrac;
        String num_notif, data_notif, num_auto, data_auto, num_processo, num_denuncia, data_denuncia;
        String lei, artigo, prazo, fiscais;
        String providencias, data_retorno;

        lei = lan.pesquisaLei(num);
        artigo = lan.pesquisaArtigo(num);
        prazo = lan.pesquisaPrazoNotificacao(num);
        fiscais = lan.pesquisaNomeFiscal(num);
        num_notif = lan.pesquisaNumNotificacao(num);
        data_notif = lan.pesquisaDataNotificacao(num);
        num_auto = lan.pesquisaNumeroInfrac(num);
        data_auto = lan.pesquisaDataInfracao(num);
        num_processo = lan.pesquisaNumProcesso(num);
        num_denuncia = lan.pesquisaNumDenuncia(num);
        data_denuncia = lan.pesquisaDataDenuncia(num);
        ender_infrac = lan.pesquisaEnderecoInfrac(num);
        num_infrac = lan.pesquisaNumeroInfrac(num);
        loteame_infrac = lan.pesquisaLoteamentoInfrac(num);
        lote_infrac = lan.pesquisaLoteInfrac(num);
        quadra_infrac = lan.pesquisaQuadraInfrac(num);
        inscmun_infrac = lan.pesquisaInscMunicipal(num);
        denunc_infrac = lan.pesquisaDescricaoInfrac(num);
        nome_corresp = lan.pesquisaNomeCorresp(num);
        enderc_corresp = lan.pesquisaEnderecoCorresp(num);
        num_corresp = lan.pesquisaNumeroCorresp(num);
        comple_corresp = lan.pesquisaCompleCorresp(num);
        bairro_corresp = lan.pesquisaBairroCorresp(num);
        cidade_corresp = lan.pesquisaCidadeCorresp(num);
        estado_corresp = lan.pesquisaEstadoCorresp(num);
        cep_corresp = lan.pesquisaCEPCorresp(num);
        data_retorno = lan.pesquisaDataRetorno(num);
        providencias = lan.pesquisaProvidencias(num);


        txtLei.setText(lei);
        txtArtigo.setText(artigo);
        txtPrazo.setText(prazo);
        txtNumNotificacao.setText(num_notif);
        txtData1.setText(data_notif);
        txtNumAutoInfracao.setText(num_auto);
        txtData2.setText(data_auto);
        txtNumProcesso.setText(num_processo);
        txtNumDenuncia.setText(num_denuncia);
        txtEnderecoInfracao.setText(ender_infrac);
        txtNumInfracao.setText(num_infrac);
        txtLoteamentoInfracao.setText(loteame_infrac);
        txtLoteInfracao.setText(lote_infrac);
        txtQuadraInfracao.setText(quadra_infrac);
        txtInscrMunicipalInfracao.setText(inscmun_infrac);
        txtDenunciaInfracao.setText(denunc_infrac);
        txtNomeCorresp.setText(nome_corresp);
        txtEnderecoCorresp.setText(enderc_corresp);
        txtNumCorresp.setText(num_corresp);
        txtComplementoCorresp.setText(comple_corresp);
        txtBairroCorresp.setText(bairro_corresp);
        txtCidadeCorresp.setText(cidade_corresp);
        txtEstadoCorresp.setText(estado_corresp);
        txtCEPCorresp.setText(cep_corresp);
        cbxFiscais.setSelectedItem(fiscais);
        txtDataDenuncia.setText(data_denuncia);
        txtProvidencias.setText(providencias);
        txtDataRetorno.setText(data_retorno);


        btnAtualizar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnConcluir.setEnabled(false);
    }//GEN-LAST:event_tblFiscaisMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Object a = tblFiscais.getValueAt(tblFiscais.getSelectedRow(), 0);

        String n = String.valueOf(a);
        int id = Integer.valueOf(n);
        lan.setIdLancamento(id);

        String denunc_corresp, enderc_corresp, num_corresp, comple_corresp, bairro_corresp, cidade_corresp, estado_corresp, cep_corresp, providencias, data_retorno;
        String ender_infrac, num_infrac, loteame_infrac, lote_infrac, quadra_infrac, inscmun_infrac, denunc_infrac;
        String num_notif, data_notif, num_auto, data_auto, num_processo, num_denuncia, data_denuncia;
        String lei, artigo, prazo, fiscais;

        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Salvar alterações ? ", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (opc.toString().equals("0")) {
            lei = txtLei.getText().toUpperCase();
            artigo = txtArtigo.getText().toUpperCase();
            prazo = txtPrazo.getText().toUpperCase();
            fiscais = cbxFiscais.getSelectedItem().toString();
            num_notif = txtNumNotificacao.getText().toUpperCase();
            data_notif = txtData1.getText().toUpperCase();
            num_auto = txtNumAutoInfracao.getText().toUpperCase();
            data_auto = txtData2.getText().toUpperCase();
            num_processo = txtNumProcesso.getText().toUpperCase();
            num_denuncia = txtNumDenuncia.getText().toUpperCase();
            data_denuncia = txtDataDenuncia.getText().toUpperCase();
            ender_infrac = txtEnderecoInfracao.getText().toUpperCase();
            num_infrac = txtNumInfracao.getText().toUpperCase();
            loteame_infrac = txtLoteamentoInfracao.getText().toUpperCase();
            lote_infrac = txtLoteInfracao.getText().toUpperCase();
            quadra_infrac = txtQuadraInfracao.getText().toUpperCase();
            inscmun_infrac = txtInscrMunicipalInfracao.getText().toUpperCase();
            denunc_infrac = txtDenunciaInfracao.getText().toUpperCase();
            denunc_corresp = txtNomeCorresp.getText().toUpperCase();
            enderc_corresp = txtEnderecoCorresp.getText().toUpperCase();
            num_corresp = txtNumCorresp.getText().toUpperCase();
            comple_corresp = txtComplementoCorresp.getText().toUpperCase();
            bairro_corresp = txtBairroCorresp.getText().toUpperCase();
            cidade_corresp = txtCidadeCorresp.getText().toUpperCase();
            estado_corresp = txtEstadoCorresp.getText().toUpperCase();
            cep_corresp = txtCEPCorresp.getText().toUpperCase();
            providencias = txtProvidencias.getText().toUpperCase();
            data_retorno = txtDataRetorno.getText().toUpperCase();

            lan.atualizarRegistrosGeral(
                    lei,
                    artigo,
                    prazo,
                    fiscais,
                    num_notif,
                    data_notif,
                    num_auto,
                    data_auto,
                    num_processo,
                    num_denuncia,
                    data_denuncia,
                    ender_infrac,
                    num_infrac,
                    loteame_infrac,
                    lote_infrac,
                    quadra_infrac,
                    inscmun_infrac,
                    denunc_infrac,
                    denunc_corresp,
                    enderc_corresp,
                    num_corresp,
                    comple_corresp,
                    bairro_corresp,
                    cidade_corresp,
                    estado_corresp,
                    cep_corresp,
                    providencias,
                    data_retorno);




        }
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormLancamentoFiscais.class.getName()).log(Level.SEVERE, null, ex);
        }

        //limpa os campos após  o cadastro
        txtLei.setText("");
        txtArtigo.setText("");
        txtPrazo.setText("");
        cbxFiscais.setSelectedItem("");
        txtNumNotificacao.setText("");
        txtData1.setText("");
        txtNumAutoInfracao.setText("");
        txtData2.setText("");
        txtNumProcesso.setText("");
        txtNumDenuncia.setText("");
        txtDataDenuncia.setText("");
        txtEnderecoInfracao.setText("");
        txtNumInfracao.setText("");
        txtLoteamentoInfracao.setText("");
        txtLoteInfracao.setText("");
        txtQuadraInfracao.setText("");
        txtInscrMunicipalInfracao.setText("");
        txtDenunciaInfracao.setText("");
        txtNomeCorresp.setText("");
        txtEnderecoCorresp.setText("");
        txtNumCorresp.setText("");
        txtComplementoCorresp.setText("");
        txtBairroCorresp.setText("");
        txtCidadeCorresp.setText("");
        txtEstadoCorresp.setText("");
        txtCEPCorresp.setText("");
        txtProvidencias.setText("");
        txtDataRetorno.setText("");
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Object a = tblFiscais.getValueAt(tblFiscais.getSelectedRow(), 0);

        String n = String.valueOf(a);
        int num = Integer.valueOf(n);
        lan.setIdLancamento(num);

        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Excluir registro ?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (opc.toString().equals("0")) {

            //exclui os registros da tabela lancamento_fiscais
            lan.excluirRegistrosLancamento();

            //limpa os campos após  o cadastro
            txtLei.setText("");
            txtArtigo.setText("");
            txtPrazo.setText("");
            cbxFiscais.setSelectedItem("");

            txtNumNotificacao.setText("");
            txtData1.setText("");
            txtNumAutoInfracao.setText("");
            txtData2.setText("");
            txtNumProcesso.setText("");
            txtNumDenuncia.setText("");
            txtDataDenuncia.setText("");

            txtEnderecoInfracao.setText("");
            txtNumInfracao.setText("");
            txtLoteamentoInfracao.setText("");
            txtLoteInfracao.setText("");
            txtQuadraInfracao.setText("");
            txtInscrMunicipalInfracao.setText("");
            txtDenunciaInfracao.setText("");

            txtNomeCorresp.setText("");
            txtEnderecoCorresp.setText("");
            txtNumCorresp.setText("");
            txtComplementoCorresp.setText("");
            txtBairroCorresp.setText("");
            txtCidadeCorresp.setText("");
            txtEstadoCorresp.setText("");
            txtCEPCorresp.setText("");

            txtProvidencias.setText("");
            txtDataRetorno.setText("");

            try {
                preenche_jtable();
            } catch (SQLException ex) {
                Logger.getLogger(FormLancamentoFiscais.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        String num = txtNumDenuncia.getText().toUpperCase();
        int id = pes.pesquisaIdVistoria2(num);

        if (id != 0) {
            pes.setId(id);
            FormVisualizarVistoria V = new FormVisualizarVistoria(pes, this);
            this.setVisible(false);
            V.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado !");
        }
}//GEN-LAST:event_btnVerificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FormCadastrarFiscal C = new FormCadastrarFiscal();
        C.setVisible(true);
}//GEN-LAST:event_jButton1ActionPerformed

    private void txtNumInfracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumInfracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumInfracaoActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        if (evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
            btnPesquisar.doClick();
        }
    }//GEN-LAST:event_txtPesquisaKeyPressed

    private void cbxPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPesquisaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblFiscais.getModel();
        modelo.setNumRows(0);
        
        txtPesquisa.setText("");
        
        txtLei.setText("");
        txtArtigo.setText("");
        txtPrazo.setText("");
        cbxFiscais.setSelectedItem("");

        txtNumNotificacao.setText("");
        txtData1.setText("");
        txtNumAutoInfracao.setText("");
        txtData2.setText("");
        txtNumProcesso.setText("");
        txtNumDenuncia.setText("");

        txtEnderecoInfracao.setText("");
        txtNumInfracao.setText("");
        txtLoteamentoInfracao.setText("");
        txtLoteInfracao.setText("");
        txtQuadraInfracao.setText("");
        txtInscrMunicipalInfracao.setText("");
        txtDenunciaInfracao.setText("");

        txtNomeCorresp.setText("");
        txtEnderecoCorresp.setText("");
        txtNumCorresp.setText("");
        txtComplementoCorresp.setText("");
        txtBairroCorresp.setText("");
        txtCidadeCorresp.setText("");
        txtEstadoCorresp.setText("");
        txtCEPCorresp.setText("");

        txtProvidencias.setText("");
        txtDataRetorno.setText("");
    }//GEN-LAST:event_cbxPesquisaActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormLancamentoFiscais().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cbxFiscais;
    private javax.swing.JComboBox cbxPesquisa;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JLabel jLabel38;
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
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblFiscais;
    private javax.swing.JTextField txtArtigo;
    private javax.swing.JTextField txtBairro1;
    private javax.swing.JTextField txtBairroCorresp;
    private javax.swing.JTextField txtCEPCorresp;
    private javax.swing.JTextField txtCidadeCorresp;
    private javax.swing.JTextField txtComplementoCorresp;
    private javax.swing.JTextField txtData1;
    private javax.swing.JTextField txtData2;
    private javax.swing.JTextField txtDataDenuncia;
    private javax.swing.JTextField txtDataRetorno;
    private javax.swing.JTextArea txtDenunciaInfracao;
    private javax.swing.JTextField txtEndereco1;
    private javax.swing.JTextField txtEnderecoCorresp;
    private javax.swing.JTextField txtEnderecoInfracao;
    private javax.swing.JTextField txtEstadoCorresp;
    private javax.swing.JTextField txtInscrMunicipal1;
    private javax.swing.JTextField txtInscrMunicipalInfracao;
    private javax.swing.JTextField txtLei;
    private javax.swing.JTextField txtLote1;
    private javax.swing.JTextField txtLoteInfracao;
    private javax.swing.JTextField txtLoteamento1;
    private javax.swing.JTextField txtLoteamentoInfracao;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNomeCorresp;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNumAutoInfracao;
    private javax.swing.JTextField txtNumCorresp;
    private javax.swing.JTextField txtNumDenuncia;
    private javax.swing.JTextField txtNumInfracao;
    private javax.swing.JTextField txtNumNotificacao;
    private javax.swing.JTextField txtNumProcesso;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPrazo;
    private javax.swing.JTextArea txtProvidencias;
    private javax.swing.JTextField txtQuadra1;
    private javax.swing.JTextField txtQuadraInfracao;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    public void preenche_jtable() throws SQLException {

        DefaultTableModel modelo = (DefaultTableModel) tblFiscais.getModel();
        modelo.setNumRows(0);


        String pesquisa = txtPesquisa.getText().toString();
        String combo = cbxPesquisa.getSelectedItem().toString();

        if (pesquisa.equals("")) {
            try {
                ResultSet resultado = bd.consultaTable("SELECT * FROM lancamento_fiscais LIMIT 100 ");

                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                {
                    modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("num_denuncia"), resultado.getString("data_denuncia"), resultado.getString("num_processo"), resultado.getString("ender_infrac"), resultado.getString("denunc_infrac")});
                }

                resultado.first();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao listar o jTable: " + e.getMessage());
            }

        } else {
            if (combo.equals("Nº Denúncia")) {
                try {
                    ResultSet resultado = bd.consultaTable("SELECT * FROM lancamento_fiscais WHERE num_denuncia LIKE '%" + pesquisa + "%'");

                    while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                    {
                        modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("num_denuncia"), resultado.getString("data_denuncia"), resultado.getString("num_processo"), resultado.getString("ender_infrac"), resultado.getString("denunc_infrac")});
                    }

                    resultado.first();
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                }

            } else {
                if (combo.equals("Nº Processo")) {
                    try {
                        ResultSet resultado = bd.consultaTable(" SELECT * FROM lancamento_fiscais WHERE num_processo LIKE '%" + pesquisa + "%'");

                        while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                        {
                            modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("num_denuncia"), resultado.getString("data_denuncia"), resultado.getString("num_processo"), resultado.getString("ender_infrac"), resultado.getString("denunc_infrac")});
                        }

                        resultado.first();
                    } catch (SQLException erro) {
                        JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                    }
//Nº Notificação
//Nº Auto de Infração
                } else {
                    if (combo.equals("Denunciado")) {
                        try {
                            ResultSet resultado = bd.consultaTable("SELECT * FROM lancamento_fiscais WHERE nome_corresp LIKE '%" + pesquisa + "%'");

                            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                            {
                                modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("num_denuncia"), resultado.getString("data_denuncia"), resultado.getString("num_processo"), resultado.getString("ender_infrac"), resultado.getString("denunc_infrac")});
                            }

                            resultado.first();
                        } catch (SQLException erro) {
                            JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                        }

                    } else {
                        if (combo.equals("Nº Notificação")) {
                            try {
                                ResultSet resultado = bd.consultaTable("SELECT * FROM lancamento_fiscais WHERE num_notif LIKE '%" + pesquisa + "%'");

                                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                {
                                    modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("num_denuncia"), resultado.getString("data_denuncia"), resultado.getString("num_processo"), resultado.getString("ender_infrac"), resultado.getString("denunc_infrac")});
                                }

                                resultado.first();
                            } catch (SQLException erro) {
                                JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                            }

                        } else {
                            if (combo.equals("Nº Auto de Infração")) {
                                try {
                                    ResultSet resultado = bd.consultaTable("SELECT * FROM lancamento_fiscais WHERE num_auto LIKE '%" + pesquisa + "%'");

                                    while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                    {
                                        modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("num_denuncia"), resultado.getString("data_denuncia"), resultado.getString("num_processo"), resultado.getString("ender_infrac"), resultado.getString("denunc_infrac")});
                                    }

                                    resultado.first();
                                } catch (SQLException erro) {
                                    JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                                }

                            } else {
                                if (combo.equals("Bairro")) {
                                    try {
                                        ResultSet resultado = bd.consultaTable("SELECT * FROM lancamento_fiscais WHERE bairro_corresp LIKE '%" + pesquisa + "%'");

                                        while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                        {
                                            modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("num_denuncia"), resultado.getString("data_denuncia"), resultado.getString("num_processo"), resultado.getString("ender_infrac"), resultado.getString("denunc_infrac")});
                                        }

                                        resultado.first();
                                    } catch (SQLException erro) {
                                        JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                                    }

                                } else {
                                    if (combo.equals("Endereço")) {
                                        try {
                                            ResultSet resultado = bd.consultaTable("SELECT * FROM lancamento_fiscais WHERE denunc_infrac LIKE '%" + pesquisa + "%'");
                                            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                            {
                                                modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("num_denuncia"), resultado.getString("data_denuncia"), resultado.getString("num_processo"), resultado.getString("ender_infrac"), resultado.getString("denunc_infrac")});
                                            }

                                            resultado.first();
                                        } catch (SQLException erro) {
                                            JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                                        }
                                    } else {
                                        if (combo.equals("Assunto")) {
                                            try {
                                                ResultSet resultado = bd.consultaTable("SELECT * FROM lancamento_fiscais WHERE denunc_infrac LIKE '%" + pesquisa + "%'");

                                                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                                {
                                                    modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("num_denuncia"), resultado.getString("data_denuncia"), resultado.getString("num_processo"), resultado.getString("ender_infrac"), resultado.getString("denunc_infrac")});
                                                }

                                                resultado.first();
                                            } catch (SQLException erro) {
                                                JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                                            }
                                        } else {
                                            if (combo.equals("Ident. Cadastral")) {
                                                try {
                                                    ResultSet resultado = bd.consultaTable("SELECT * FROM lancamento_fiscais WHERE inscmun_infrac LIKE '%" + pesquisa + "%'");

                                                    while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                                    {
                                                        modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("num_denuncia"), resultado.getString("data_denuncia"), resultado.getString("num_processo"), resultado.getString("ender_infrac"), resultado.getString("denunc_infrac")});
                                                    }
                                                    resultado.first();
                                                } catch (SQLException erro) {
                                                    JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                                                }
                                            } else {
                                                if (combo.equals("Fiscal")) {
                                                    try {
                                                        ResultSet resultado = bd.consultaTable("SELECT * FROM lancamento_fiscais WHERE fiscais LIKE '%" + pesquisa + "%'");

                                                        while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                                                        {
                                                            modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("num_denuncia"), resultado.getString("data_denuncia"), resultado.getString("num_processo"), resultado.getString("ender_infrac"), resultado.getString("denunc_infrac")});
                                                        }
                                                        resultado.first();
                                                    } catch (SQLException erro) {
                                                        JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
                                                    }
                                                }else{JOptionPane.showMessageDialog(null, "Erro ao listar o jTable?!? ");}
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
}
