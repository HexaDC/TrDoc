
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

public class FormRelatorioComunique extends javax.swing.JFrame {

    AcessoBD bd =  new AcessoBD();
    ClassPesquisaDadosRequerente pes = new ClassPesquisaDadosRequerente();
    ClassSelecionarId sel = new ClassSelecionarId();
    ClassCarregarCombo com = new ClassCarregarCombo();
    public String emiCom;
    public boolean[] acesso_bkp;
    private int largura = 662;
    private int altura = 688;
    
    public FormRelatorioComunique() {
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
        for(int i = 0; i<f.size(); i++){
            cbxFiscal.addItem(f.elementAt(i));
        }
    }

    FormRelatorioComunique(FormMenu aThis, boolean b) {
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
        for(int i = 0; i<f.size(); i++){
            cbxFiscal.addItem(f.elementAt(i));
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnListar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
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
        jLabel21 = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtBairroComunique = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtDataComunique = new javax.swing.JTextField();
        txtUf = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComunique = new javax.swing.JTextArea();
        cbxPesquisa = new javax.swing.JComboBox();
        txtListar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbxFiscal = new javax.swing.JComboBox();
        btnVoltar = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnFiscal = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblProcesso = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TRDoc - Tramitação de Documentos");
        setResizable(false);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        btnListar.setFont(new java.awt.Font("SansSerif", 1, 12));
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROGRAMA/lista.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(570, 40, 80, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 170, 640, 10);

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 12));

        jPanel1.setLayout(null);

        jTabbedPane3.setFont(new java.awt.Font("SansSerif", 1, 12));

        jPanel7.setLayout(null);

        txtData.setFocusable(false);
        jPanel7.add(txtData);
        txtData.setBounds(210, 20, 100, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel7.setText("Data de Entrada");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(210, 0, 90, 20);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel4.setText("Assunto");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(10, 100, 47, 20);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("Endereço");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(10, 170, 70, 20);

        txtEndereco.setFocusable(false);
        jPanel7.add(txtEndereco);
        txtEndereco.setBounds(10, 190, 590, 30);

        txtBairro.setFocusable(false);
        jPanel7.add(txtBairro);
        txtBairro.setBounds(10, 240, 380, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel6.setText("Bairro");
        jPanel7.add(jLabel6);
        jLabel6.setBounds(10, 220, 60, 20);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel8.setText("Loteamento");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(10, 270, 68, 20);

        txtLoteamento.setFocusable(false);
        jPanel7.add(txtLoteamento);
        txtLoteamento.setBounds(10, 290, 140, 30);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel9.setText("Lote");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(320, 270, 25, 20);

        txtLote.setFocusable(false);
        jPanel7.add(txtLote);
        txtLote.setBounds(320, 290, 70, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel10.setText("Quadra");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(170, 270, 42, 20);

        txtQuadra.setFocusable(false);
        jPanel7.add(txtQuadra);
        txtQuadra.setBounds(170, 290, 120, 30);

        txtIdentCadastral.setFocusable(false);
        jPanel7.add(txtIdentCadastral);
        txtIdentCadastral.setBounds(410, 240, 190, 30);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel11.setText("Identificação Cadastral");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(410, 220, 140, 20);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("Nº Processo");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(10, 0, 90, 20);
        jPanel7.add(txtProcesso);
        txtProcesso.setBounds(10, 20, 120, 30);

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel21.setText("Ano");
        jPanel7.add(jLabel21);
        jLabel21.setBounds(150, 0, 22, 20);

        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });
        jPanel7.add(txtAno);
        txtAno.setBounds(150, 20, 40, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel3.setText("Requerente");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(10, 50, 66, 20);
        jPanel7.add(txtRequerente);
        txtRequerente.setBounds(10, 70, 590, 30);

        txtAssunto.setColumns(20);
        txtAssunto.setRows(5);
        txtAssunto.setFocusable(false);
        jScrollPane1.setViewportView(txtAssunto);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel4);
        jPanel4.setBounds(10, 120, 590, 50);

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel5);
        jPanel5.setBounds(10, 10, 590, 310);

        jTabbedPane3.addTab("Andamento", jPanel8);

        jPanel1.add(jTabbedPane3);
        jTabbedPane3.setBounds(12, 12, 610, 360);

        jTabbedPane1.addTab("Principal", jPanel1);

        jPanel2.setLayout(null);

        jLabel13.setText("Comunique-se:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 0, 86, 20);

        jLabel14.setText("Logradouro:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 230, 67, 16);

        txtLogradouro.setFocusable(false);
        jPanel2.add(txtLogradouro);
        txtLogradouro.setBounds(10, 250, 540, 30);

        jLabel15.setText("Bairro:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 280, 36, 16);

        txtBairroComunique.setFocusable(false);
        jPanel2.add(txtBairroComunique);
        txtBairroComunique.setBounds(10, 300, 220, 30);

        jLabel16.setText("Nº:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(560, 230, 16, 16);

        txtNum.setFocusable(false);
        jPanel2.add(txtNum);
        txtNum.setBounds(560, 250, 60, 30);

        jLabel17.setText("Cidade:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(240, 280, 43, 16);

        txtCidade.setFocusable(false);
        jPanel2.add(txtCidade);
        txtCidade.setBounds(240, 300, 330, 30);

        jLabel18.setText("Uf:");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(580, 280, 15, 16);

        jLabel19.setText("Cep:");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(10, 330, 26, 16);

        txtCep.setFocusable(false);
        jPanel2.add(txtCep);
        txtCep.setBounds(10, 350, 190, 30);

        jLabel20.setText("Data:");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(230, 330, 29, 16);

        txtDataComunique.setFocusable(false);
        jPanel2.add(txtDataComunique);
        txtDataComunique.setBounds(240, 350, 110, 30);

        txtUf.setFocusable(false);
        jPanel2.add(txtUf);
        txtUf.setBounds(580, 300, 40, 30);

        txtComunique.setColumns(20);
        txtComunique.setRows(5);
        txtComunique.setFocusable(false);
        jScrollPane2.setViewportView(txtComunique);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(10, 20, 610, 210);

        jTabbedPane1.addTab("Comunique-se", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 180, 640, 410);

        cbxPesquisa.setFont(new java.awt.Font("SansSerif", 1, 12));
        cbxPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nº Processo", "Requerente", "Assunto", "Endereço", "Ident. Cadastral", "Profissional", "Insc. Municipal" }));
        getContentPane().add(cbxPesquisa);
        cbxPesquisa.setBounds(10, 40, 130, 30);

        txtListar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtListarKeyPressed(evt);
            }
        });
        getContentPane().add(txtListar);
        txtListar.setBounds(150, 40, 410, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 30, 640, 10);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel1.setText("Emissão de Comunique-se");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 151, 16);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel12.setText("Fiscal");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 600, 33, 30);

        getContentPane().add(cbxFiscal);
        cbxFiscal.setBounds(50, 600, 330, 30);

        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 12));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROGRAMA/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(10, 650, 90, 30);

        btnRelatorio.setFont(new java.awt.Font("SansSerif", 1, 12));
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROGRAMA/habite.png"))); // NOI18N
        btnRelatorio.setText("Emitir Relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(btnRelatorio);
        btnRelatorio.setBounds(510, 650, 140, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 640, 640, 10);

        btnFiscal.setFont(new java.awt.Font("SansSerif", 1, 12));
        btnFiscal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROGRAMA/user_business.png"))); // NOI18N
        btnFiscal.setText("Adicionar Novo Fiscal");
        btnFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiscalActionPerformed(evt);
            }
        });
        getContentPane().add(btnFiscal);
        btnFiscal.setBounds(400, 600, 200, 30);

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
        tblProcesso.getColumnModel().getColumn(3).setMaxWidth(200);
        tblProcesso.getColumnModel().getColumn(4).setMinWidth(50);
        tblProcesso.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblProcesso.getColumnModel().getColumn(4).setMaxWidth(300);
        tblProcesso.getColumnModel().getColumn(5).setMinWidth(50);
        tblProcesso.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblProcesso.getColumnModel().getColumn(5).setMaxWidth(200);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 80, 640, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormRelatorioComunique.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_btnListarActionPerformed

    private void tblProcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcessoMouseClicked
        Object a = tblProcesso.getValueAt(tblProcesso.getSelectedRow(), 0);
        
        String idt = String.valueOf(a);
        int id = Integer.parseInt(idt);
        
        
        try {
            preenche_jtable2(id);
        } catch (SQLException ex) {
            Logger.getLogger(FormRelatorioComunique.class.getName()).log(Level.SEVERE, null, ex);
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
        
        
        //COMUNIQUE
        String comunique = pes.pesquisaComunique();
        txtComunique.setText(comunique);

        String logradouro = pes.pesquisaLogradouro();
        txtLogradouro.setText(logradouro);

        String bairro2 = pes.pesquisaBairroComunique();
        txtBairroComunique.setText(bairro2);

        String num_c = pes.pesquisaNumComunique();
        txtNum.setText(num_c);
        
        String cep = pes.pesquisaCepComunique();
        txtCep.setText(cep);

        String cidade = pes.pesquisaCidadeComunique();
        txtCidade.setText(cidade);

        String uf = pes.pesquisaEstadoComunique();
        txtUf.setText(uf);

        String data_comunique = pes.pesquisaDataComunique();
        txtDataComunique.setText(data_comunique);
        
       
    }//GEN-LAST:event_tblProcessoMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (emiCom.equals(emiCom)) {
            FormMenu M = new FormMenu(this, true);
            M.setVisible(true);
            M.group = emiCom;
            M.acesso_user = acesso_bkp;
            dispose();
        }
}//GEN-LAST:event_btnVoltarActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        Connection con = (Connection) bd.getConnection();

        String num1 = txtProcesso.getText();
        String ano = txtAno.getText();
        int num = Integer.valueOf(num1);
        int processo = sel.selecionarIdPro(num,ano);

        String f = cbxFiscal.getSelectedItem().toString();
        int fiscal = sel.selecionarIdFis(f);

        HashMap parametro = new HashMap();
        parametro.put("ID", String.valueOf(processo));
        parametro.put("IDF", String.valueOf(fiscal));

        try {
            JasperPrint jp = JasperFillManager.fillReport("./relatorios/RelatorioComunique.jasper", parametro, con);
            JasperViewer jrv = new JasperViewer(jp, false);
            jrv.setVisible(true);

            //Altera o icone e o título da janela
            jrv.setTitle("TRDoc - Tramitação de Documentos");
            URL url = this.getClass().getResource("/Icons/vistoria.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
            jrv.setIconImage(imagemTitulo);

        } catch (JRException ex) {
            Logger.getLogger(FormRelatorioComunique.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiscalActionPerformed
        FormCadastrarFiscal L = new FormCadastrarFiscal(this, true);
        L.setVisible(true);
    }//GEN-LAST:event_btnFiscalActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Carrega o jcombobox profissional
         Vector f = com.Fiscal();
        cbxFiscal.removeAllItems();
        cbxFiscal.addItem("");
        for(int i = 0; i<f.size(); i++){
            cbxFiscal.addItem(f.elementAt(i));
        }
    }//GEN-LAST:event_formWindowActivated

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        //Carrega o jcombobox profissional
         Vector f = com.Fiscal();
        cbxFiscal.removeAllItems();
        cbxFiscal.addItem("");
        for(int i = 0; i<f.size(); i++){
            cbxFiscal.addItem(f.elementAt(i));
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void txtListarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtListarKeyPressed
        if(evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
	   btnListar.doClick();
        }
    }//GEN-LAST:event_txtListarKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormRelatorioComunique().setVisible(true);
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable tblAndamento;
    private javax.swing.JTable tblProcesso;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextArea txtAssunto;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBairroComunique;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextArea txtComunique;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDataComunique;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdentCadastral;
    private javax.swing.JTextField txtListar;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtLoteamento;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtProcesso;
    private javax.swing.JTextField txtQuadra;
    private javax.swing.JTextField txtRequerente;
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
