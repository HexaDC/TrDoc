package Forms;

import User.ClassEditarUser;
import User.ClassPesquisaDadosUser;
import User.ClassExcluirUser;
import User.ClassCadastrarUser;
import User.ClassVerificaSenha;
import User.ClassVerificaUsuario;
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

public class FormListarUser extends javax.swing.JFrame {

    ClassPesquisaDadosUser pes = new ClassPesquisaDadosUser();
    ClassExcluirUser exc = new ClassExcluirUser();
    ClassCadastrarUser cad = new ClassCadastrarUser();
    ClassVerificaUsuario ver = new ClassVerificaUsuario();
    ClassEditarUser edi = new ClassEditarUser();
    private int largura = 632;
    private int altura =  569;

    public FormListarUser() {
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

    public FormListarUser(ClassVerificaSenha aThis, boolean b) {
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

    public FormListarUser(FormMenu aThis, boolean b) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnNovo = new javax.swing.JButton();
        btnConcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        cxEmiGuia = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cxAdmTec = new javax.swing.JCheckBox();
        cxAdmAss = new javax.swing.JCheckBox();
        cxAdmEnc = new javax.swing.JCheckBox();
        cxTrmCom = new javax.swing.JCheckBox();
        cxTrmHab = new javax.swing.JCheckBox();
        cxTrmAlv = new javax.swing.JCheckBox();
        cxTrmPro = new javax.swing.JCheckBox();
        cxProPes = new javax.swing.JCheckBox();
        cxProAdi = new javax.swing.JCheckBox();
        cxProAtu = new javax.swing.JCheckBox();
        cxEmiCom = new javax.swing.JCheckBox();
        cxProExc = new javax.swing.JCheckBox();
        cxEmiHab = new javax.swing.JCheckBox();
        cxEmiAlv = new javax.swing.JCheckBox();
        radPers = new javax.swing.JRadioButton();
        radRecep = new javax.swing.JRadioButton();
        radTecn = new javax.swing.JRadioButton();
        radTram = new javax.swing.JRadioButton();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        cxAdmEsp = new javax.swing.JCheckBox();
        cxTrmFis = new javax.swing.JCheckBox();
        cxTrmFis1 = new javax.swing.JCheckBox();

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

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel1.setText("Usuários do Sistema");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 118, 16);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 30, 609, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 190, 609, 10);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("Perfil de Acesso");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 270, 110, 15);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 320, 609, 10);

        txtLogin.setEditable(false);
        getContentPane().add(txtLogin);
        txtLogin.setBounds(500, 220, 120, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel3.setText("Matricula");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(500, 200, 70, 20);

        txtNome.setEditable(false);
        getContentPane().add(txtNome);
        txtNome.setBounds(10, 220, 480, 30);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 200, 50, 20);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(10, 520, 609, 20);

        btnNovo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/novo2_1.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(540, 530, 80, 30);

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
        btnConcluir.setBounds(420, 530, 100, 30);

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
        btnAtualizar.setBounds(300, 530, 100, 30);

        btnExcluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete1.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(180, 530, 100, 30);

        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(10, 530, 90, 30);

        cxEmiGuia.setText("Guia de Emplacamento");
        cxEmiGuia.setEnabled(false);
        cxEmiGuia.setFocusable(false);
        cxEmiGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEmiGuiaActionPerformed(evt);
            }
        });
        getContentPane().add(cxEmiGuia);
        cxEmiGuia.setBounds(460, 460, 170, 29);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("Administração");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 330, 90, 16);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel6.setText("Tramitação");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 330, 80, 16);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel7.setText("Processos");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 330, 70, 16);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel8.setText("Emissão");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(460, 330, 90, 16);

        cxAdmTec.setText("Técnicos da Secretaria");
        cxAdmTec.setEnabled(false);
        cxAdmTec.setFocusable(false);
        cxAdmTec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAdmTecActionPerformed(evt);
            }
        });
        getContentPane().add(cxAdmTec);
        cxAdmTec.setBounds(10, 350, 170, 29);

        cxAdmAss.setText("Assinatura do Secretário");
        cxAdmAss.setEnabled(false);
        cxAdmAss.setFocusable(false);
        cxAdmAss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAdmAssActionPerformed(evt);
            }
        });
        getContentPane().add(cxAdmAss);
        cxAdmAss.setBounds(10, 380, 180, 29);

        cxAdmEnc.setSelected(true);
        cxAdmEnc.setText("Encerrar Sessão");
        cxAdmEnc.setEnabled(false);
        cxAdmEnc.setFocusable(false);
        getContentPane().add(cxAdmEnc);
        cxAdmEnc.setBounds(10, 410, 150, 29);

        cxTrmCom.setText("Comunique-se");
        cxTrmCom.setEnabled(false);
        cxTrmCom.setFocusable(false);
        cxTrmCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTrmComActionPerformed(evt);
            }
        });
        getContentPane().add(cxTrmCom);
        cxTrmCom.setBounds(180, 350, 116, 29);

        cxTrmHab.setText("Habite-se");
        cxTrmHab.setEnabled(false);
        cxTrmHab.setFocusable(false);
        cxTrmHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTrmHabActionPerformed(evt);
            }
        });
        getContentPane().add(cxTrmHab);
        cxTrmHab.setBounds(180, 380, 87, 29);

        cxTrmAlv.setText("Alvarás");
        cxTrmAlv.setEnabled(false);
        cxTrmAlv.setFocusable(false);
        cxTrmAlv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTrmAlvActionPerformed(evt);
            }
        });
        getContentPane().add(cxTrmAlv);
        cxTrmAlv.setBounds(180, 410, 73, 29);

        cxTrmPro.setText("Protocolo de Denûncia");
        cxTrmPro.setEnabled(false);
        cxTrmPro.setFocusable(false);
        cxTrmPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTrmProActionPerformed(evt);
            }
        });
        getContentPane().add(cxTrmPro);
        cxTrmPro.setBounds(180, 440, 170, 29);

        cxProPes.setText("Pesquisar");
        cxProPes.setEnabled(false);
        cxProPes.setFocusable(false);
        cxProPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxProPesActionPerformed(evt);
            }
        });
        getContentPane().add(cxProPes);
        cxProPes.setBounds(350, 350, 90, 29);

        cxProAdi.setText("Adicionar");
        cxProAdi.setEnabled(false);
        cxProAdi.setFocusable(false);
        cxProAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxProAdiActionPerformed(evt);
            }
        });
        getContentPane().add(cxProAdi);
        cxProAdi.setBounds(350, 380, 84, 29);

        cxProAtu.setText("Atualizar");
        cxProAtu.setEnabled(false);
        cxProAtu.setFocusable(false);
        cxProAtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxProAtuActionPerformed(evt);
            }
        });
        getContentPane().add(cxProAtu);
        cxProAtu.setBounds(350, 410, 79, 29);

        cxEmiCom.setText("Comunique-se");
        cxEmiCom.setEnabled(false);
        cxEmiCom.setFocusable(false);
        cxEmiCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEmiComActionPerformed(evt);
            }
        });
        getContentPane().add(cxEmiCom);
        cxEmiCom.setBounds(460, 350, 120, 29);

        cxProExc.setText("Excluir");
        cxProExc.setEnabled(false);
        cxProExc.setFocusable(false);
        cxProExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxProExcActionPerformed(evt);
            }
        });
        getContentPane().add(cxProExc);
        cxProExc.setBounds(350, 440, 69, 29);

        cxEmiHab.setText("Habite-se");
        cxEmiHab.setEnabled(false);
        cxEmiHab.setFocusable(false);
        cxEmiHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEmiHabActionPerformed(evt);
            }
        });
        getContentPane().add(cxEmiHab);
        cxEmiHab.setBounds(460, 380, 100, 29);

        cxEmiAlv.setText("Alvarás");
        cxEmiAlv.setEnabled(false);
        cxEmiAlv.setFocusable(false);
        cxEmiAlv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEmiAlvActionPerformed(evt);
            }
        });
        getContentPane().add(cxEmiAlv);
        cxEmiAlv.setBounds(460, 410, 90, 29);

        buttonGroup1.add(radPers);
        radPers.setText("Personalizado");
        radPers.setEnabled(false);
        radPers.setFocusable(false);
        getContentPane().add(radPers);
        radPers.setBounds(440, 290, 130, 29);

        buttonGroup1.add(radRecep);
        radRecep.setText("Recepção");
        radRecep.setEnabled(false);
        radRecep.setFocusable(false);
        radRecep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radRecepActionPerformed(evt);
            }
        });
        getContentPane().add(radRecep);
        radRecep.setBounds(30, 290, 120, 29);

        buttonGroup1.add(radTecn);
        radTecn.setText("Técnico");
        radTecn.setEnabled(false);
        radTecn.setFocusable(false);
        radTecn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTecnActionPerformed(evt);
            }
        });
        getContentPane().add(radTecn);
        radTecn.setBounds(160, 290, 93, 29);

        buttonGroup1.add(radTram);
        radTram.setText("Tramitação");
        radTram.setEnabled(false);
        radTram.setFocusable(false);
        radTram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTramActionPerformed(evt);
            }
        });
        getContentPane().add(radTram);
        radTram.setBounds(290, 290, 110, 29);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(10, 260, 609, 10);

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUser.getTableHeader().setReorderingAllowed(false);
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUser);
        tblUser.getColumnModel().getColumn(0).setMinWidth(0);
        tblUser.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblUser.getColumnModel().getColumn(0).setMaxWidth(0);
        tblUser.getColumnModel().getColumn(1).setResizable(false);
        tblUser.getColumnModel().getColumn(1).setPreferredWidth(450);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 610, 140);

        cxAdmEsp.setText("Alteração de Data");
        cxAdmEsp.setEnabled(false);
        cxAdmEsp.setFocusable(false);
        cxAdmEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAdmEspActionPerformed(evt);
            }
        });
        getContentPane().add(cxAdmEsp);
        cxAdmEsp.setBounds(470, 430, 140, 29);

        cxTrmFis.setText("Lançamentos de Fiscais");
        cxTrmFis.setEnabled(false);
        cxTrmFis.setFocusable(false);
        cxTrmFis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTrmFisActionPerformed(evt);
            }
        });
        getContentPane().add(cxTrmFis);
        cxTrmFis.setBounds(180, 470, 170, 29);

        cxTrmFis1.setText("Permite Alteração");
        cxTrmFis1.setEnabled(false);
        cxTrmFis1.setFocusable(false);
        cxTrmFis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTrmFis1ActionPerformed(evt);
            }
        });
        getContentPane().add(cxTrmFis1);
        cxTrmFis1.setBounds(190, 490, 170, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //exclui o usuário
        Object a = tblUser.getValueAt(tblUser.getSelectedRow(), 0);
        String idt = String.valueOf(a);
        int id = Integer.parseInt(idt);
        exc.setId(id);

        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Deseja excluir esse usuário ?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);
        if (opc.toString().equals("0")) {
            exc.excluirUser();

            try {
                preenche_jtable();
            } catch (SQLException ex) {
                Logger.getLogger(FormListarUser.class.getName()).log(Level.SEVERE, null, ex);
            }
             btnConcluir.setEnabled(false);
        btnAtualizar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        radRecep.setSelected(false);
        radRecep.setEnabled(false);
        
        radTecn.setSelected(false);
        radTecn.setEnabled(false);
        
        radTram.setSelected(false);
        radTram.setEnabled(false);
        
        radPers.setSelected(false);
        
        
        cxAdmTec.setSelected(false);
        cxAdmTec.setEnabled(false);
        
        cxAdmAss.setSelected(false);
        cxAdmAss.setEnabled(false);
        
        cxAdmEnc.setSelected(false);
        cxAdmEnc.setEnabled(false);
        
        cxTrmAlv.setSelected(false);
        cxTrmAlv.setEnabled(false);
        
        cxTrmCom.setSelected(false);
        cxTrmCom.setEnabled(false);
        
        cxTrmHab.setSelected(false);
        cxTrmHab.setEnabled(false);
        
        cxTrmPro.setSelected(false);
        cxTrmPro.setEnabled(false);
        
        cxTrmFis.setSelected(false);
        cxTrmFis.setEnabled(false);
        
        cxTrmFis1.setSelected(false);
        cxTrmFis1.setEnabled(false);
        
        cxProAdi.setSelected(false);
        cxProAdi.setEnabled(false);
        
        cxProAtu.setSelected(false);
        cxProAtu.setEnabled(false);
        
        cxProExc.setSelected(false);
        cxProExc.setEnabled(false);
        
        cxProPes.setSelected(false);
        cxProPes.setEnabled(false);
        
        cxEmiAlv.setSelected(false);
        cxEmiAlv.setEnabled(false);
        
        cxEmiCom.setSelected(false);
        cxEmiCom.setEnabled(false);
        
        cxEmiGuia.setSelected(false);
        cxEmiGuia.setEnabled(false);
        
        cxEmiHab.setSelected(false);
        cxEmiHab.setEnabled(false);
        
        
        

        txtNome.setText("");
        txtNome.setEditable(false);
        txtLogin.setText("");
        txtLogin.setEditable(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseClicked
        Object a = tblUser.getValueAt(tblUser.getSelectedRow(), 0);
        String acesso1[] = new String[18];
        boolean acesso[] = new boolean[18];
        String idt = String.valueOf(a);
        int id = Integer.parseInt(idt);
        pes.setId(id);

        String nome = pes.pesquisaNomeUsuario();
        txtNome.setText(nome);

        String login = pes.pesquisaLoginUsuario();
        txtLogin.setText(login);
        
        int tp_acesso = pes.pesquisaPrivilegio();
        
        radRecep.setEnabled(true);
        radTram.setEnabled(true);
        radTecn.setEnabled(true);
        radPers.setEnabled(true);
        
         if(tp_acesso == 1)
        {
            radRecep.setSelected(true);
        }
        else
        {
            if (tp_acesso == 2)
            {
                radTecn.setSelected(true);
            }
            else
            {
                if (tp_acesso == 3)
                {
                    radTram.setSelected(true);
                }
                else
                {
                    if (tp_acesso == 4)
                    {
                        radPers.setSelected(true);
                    }
                }
            }
        }
        
        acesso1 = pes.pesquisaAcesso();
        for(int i = 0; i < acesso1.length; i++)
        {
            acesso[i]=Boolean.parseBoolean(acesso1[i]);
        }
        
        
        
        cxAdmTec.setSelected(acesso[0]);
        cxAdmTec.setEnabled(true);
        
        cxAdmAss.setSelected(acesso[1]);
        cxAdmAss.setEnabled(true);
        
        cxAdmEnc.setSelected(acesso[2]);
        cxAdmEnc.setEnabled(false);
        
        cxAdmEsp.setSelected(acesso[15]);
        cxAdmEsp.setEnabled(true);
               
        cxTrmCom.setSelected(acesso[3]);
        cxTrmCom.setEnabled(true);
        
        cxTrmHab.setSelected(acesso[4]);
        cxTrmHab.setEnabled(true);
        
        cxTrmAlv.setSelected(acesso[5]);
        cxTrmAlv.setEnabled(true);
        
        cxTrmPro.setSelected(acesso[6]);
        cxTrmPro.setEnabled(true);
        
        cxTrmFis.setSelected(acesso[16]);
        cxTrmFis.setEnabled(true);
        
        cxTrmFis1.setSelected(acesso[17]);
        cxTrmFis1.setEnabled(true);
        
        cxProPes.setSelected(acesso[7]);
        cxProPes.setEnabled(true);
        
        cxProAdi.setSelected(acesso[8]);
        cxProAdi.setEnabled(true);
        
        cxProAtu.setSelected(acesso[9]);
        cxProAtu.setEnabled(true);
        
        cxProExc.setSelected(acesso[10]);
        cxProExc.setEnabled(true);
                       
        cxEmiCom.setSelected(acesso[11]);
        cxEmiCom.setEnabled(true);
        
        cxEmiHab.setSelected(acesso[12]);
        cxEmiHab.setEnabled(true);
        
        cxEmiAlv.setSelected(acesso[13]);
        cxEmiAlv.setEnabled(true);
        
        cxEmiGuia.setSelected(acesso[14]);
        cxEmiGuia.setEnabled(true);
        
       
 
        btnAtualizar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnConcluir.setEnabled(false);
    }//GEN-LAST:event_tblUserMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormListarUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        
        String nome = txtNome.getText().toUpperCase();
        String login = txtLogin.getText().toUpperCase();
        
        boolean acesso[] = new boolean[18];
        int tipo = 9;
        
        if(radRecep.isSelected())
        {
            tipo = 1;
        }
        else
        {
            if (radTecn.isSelected())
            {
                tipo = 2;
            }
            else
            {
                if (radTram.isSelected())
                {
                    tipo = 3;
                }
                else
                {
                    if (radPers.isSelected())
                    {
                        tipo = 4;
                    }
                }
            }
        }
        
        
        
        if (cxAdmTec.isSelected())
        {
            acesso[0] = true;
        }
        else
        {
            acesso[0] = false;
        }
        
        if (cxAdmAss.isSelected())
        {
            acesso[1] = true;
        }
        else
        {
            acesso[1] = false;
        }
        
        
        if (cxAdmEnc.isSelected())
        {
            acesso[2] = true;
        }
        else
        {
            acesso[2] = false;
        }
        
        
        if (cxTrmCom.isSelected())
        {
            acesso[3] = true;
        }
        else
        {
            acesso[3] = false;
        }
        
        
        if (cxTrmHab.isSelected())
        {
            acesso[4] = true;
        }
        else
        {
            acesso[4] = false;
        }
        
        if (cxTrmAlv.isSelected())
        {
            acesso[5] = true;
        }
        else
        {
            acesso[5] = false;
        }
        
        
        if (cxTrmPro.isSelected())
        {
            acesso[6] = true;
        }
        else
        {
            acesso[6] = false;
        }
        
        
        if (cxProPes.isSelected())
        {
            acesso[7] = true;
        }
        else
        {
            acesso[7] = false;
        }
        
        
        if (cxProAdi.isSelected())
        {
            acesso[8] = true;
        }
        else
        {
            acesso[8] = false;
        }
        
        
        if (cxProAtu.isSelected())
        {
            acesso[9] = true;
        }
        else
        {
            acesso[9] = false;
        }
        
        
        if (cxProExc.isSelected())
        {
            acesso[10] = true;
        }
        else
        {
            acesso[10] = false;
        }
        
        
        if (cxEmiCom.isSelected())
        {
            acesso[11] = true;
        }
        else
        {
            acesso[11] = false;
        }
        
        
        if (cxEmiHab.isSelected())
        {
            acesso[12] = true;
        }
        else
        {
            acesso[12] = false;
        }
        
        
        if (cxEmiAlv.isSelected())
        {
            acesso[13] = true;
        }
        else
        {
            acesso[13] = false;
        }
        
        
        if (cxEmiGuia.isSelected())
        {
            acesso[14] = true;
        }
        else
        {
            acesso[14] = false;
        }
        
        if (cxAdmEsp.isSelected())
        {
            acesso[15] = true;
        }
        else
        {
            acesso[15] = false;
        }
        
        if (cxTrmFis.isSelected())
        {
            acesso[16] = true;
        }
        else
        {
            acesso[16] = false;
        }
        
        if (cxTrmFis1.isSelected())
        {
            acesso[17] = true;
        }
        else
        {
            acesso[17] = false;
        } 
                  

        
        String acesso2 = new String();
        
        for(int i = 0;i<acesso.length;i++)
        {
            if(i==0)
            {
                acesso2 = String.valueOf(acesso[i]);
            }
            else
            {
                acesso2 = acesso2 + "," + String.valueOf(acesso[i]);
            }
            
        }
        
        if (nome.equals("") || login.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        } else {
            ver.setNomeUsuario(nome);
            ver.setUser(login);
            boolean verifica = ver.verificaUsuario();

            if (verifica == true) {
                JOptionPane.showMessageDialog(null, "Usuário não disponível");
            } else {
                cad.cadastrarUser(acesso2 , tipo, nome, login);
                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
                try {
                    preenche_jtable();
                } catch (SQLException ex) {
                    Logger.getLogger(FormListarUser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        btnConcluir.setEnabled(false);
        btnAtualizar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        radRecep.setSelected(false);
        radRecep.setEnabled(false);
        
        radTecn.setSelected(false);
        radTecn.setEnabled(false);
        
        radTram.setSelected(false);
        radTram.setEnabled(false);
        
        radPers.setSelected(false);
        
        
        cxAdmTec.setSelected(false);
        cxAdmTec.setEnabled(false);
        
        cxAdmAss.setSelected(false);
        cxAdmAss.setEnabled(false);
        
        cxAdmEnc.setSelected(false);
        cxAdmEnc.setEnabled(false);
        
        cxAdmEsp.setSelected(false);
        cxAdmEsp.setEnabled(false);
        
        cxTrmAlv.setSelected(false);
        cxTrmAlv.setEnabled(false);
        
        cxTrmCom.setSelected(false);
        cxTrmCom.setEnabled(false);
        
        cxTrmHab.setSelected(false);
        cxTrmHab.setEnabled(false);
        
        cxTrmPro.setSelected(false);
        cxTrmPro.setEnabled(false);
        
        cxTrmFis.setSelected(false);
        cxTrmFis.setEnabled(false);
        
        cxTrmFis1.setSelected(false);
        cxTrmFis1.setEnabled(false);
        
        cxProAdi.setSelected(false);
        cxProAdi.setEnabled(false);
        
        cxProAtu.setSelected(false);
        cxProAtu.setEnabled(false);
        
        cxProExc.setSelected(false);
        cxProExc.setEnabled(false);
        
        cxProPes.setSelected(false);
        cxProPes.setEnabled(false);
        
        cxEmiAlv.setSelected(false);
        cxEmiAlv.setEnabled(false);
        
        cxEmiCom.setSelected(false);
        cxEmiCom.setEnabled(false);
        
        cxEmiGuia.setSelected(false);
        cxEmiGuia.setEnabled(false);
        
        cxEmiHab.setSelected(false);
        cxEmiHab.setEnabled(false);
        
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormListarUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        txtNome.setText("");
        txtNome.setEditable(false);
        txtLogin.setText("");
        txtLogin.setEditable(false);
        
        
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
      
        Object b = tblUser.getValueAt(tblUser.getSelectedRow(), 0);
      
      String x = String.valueOf(b) ;
      int num = Integer.valueOf(x) ;
      edi.setId(num);
      
      
       String nome = txtNome.getText().toUpperCase();
        String login = txtLogin.getText().toUpperCase();
        
        boolean acesso[] = new boolean[18];
        boolean adm1,adm2,adm3,trm1,trm2,trm3,trm4,pro1,pro2,pro3,pro4,emi1,emi2,emi3,emi4;
        int tipo = 9;
        
        if(radRecep.isSelected())
        {
            tipo = 1;
        }
        else
        {
            if (radTecn.isSelected())
            {
                tipo = 2;
            }
            else
            {
                if (radTram.isSelected())
                {
                    tipo = 3;
                }
                else
                {
                    if (radPers.isSelected())
                    {
                        tipo = 4;
                    }
                }
            }
        }
        
        
        
        if (cxAdmTec.isSelected())
        {
            acesso[0] = true;
        }
        else
        {
            acesso[0] = false;
        }
        
        if (cxAdmAss.isSelected())
        {
            acesso[1] = true;
        }
        else
        {
            acesso[1] = false;
        }
        
        
        if (cxAdmEnc.isSelected())
        {
            acesso[2] = true;
        }
        else
        {
            acesso[2] = false;
        }
        
        
        if (cxTrmCom.isSelected())
        {
            acesso[3] = true;
        }
        else
        {
            acesso[3] = false;
        }
        
        
        if (cxTrmHab.isSelected())
        {
            acesso[4] = true;
        }
        else
        {
            acesso[4] = false;
        }
        
        if (cxTrmAlv.isSelected())
        {
            acesso[5] = true;
        }
        else
        {
            acesso[5] = false;
        }
        
        
        if (cxTrmPro.isSelected())
        {
            acesso[6] = true;
        }
        else
        {
            acesso[6] = false;
        }
        
        
        if (cxProPes.isSelected())
        {
            acesso[7] = true;
        }
        else
        {
            acesso[7] = false;
        }
        
        
        if (cxProAdi.isSelected())
        {
            acesso[8] = true;
        }
        else
        {
            acesso[8] = false;
        }
        
        
        if (cxProAtu.isSelected())
        {
            acesso[9] = true;
        }
        else
        {
            acesso[9] = false;
        }
        
        
        if (cxProExc.isSelected())
        {
            acesso[10] = true;
        }
        else
        {
            acesso[10] = false;
        }
        
        
        if (cxEmiCom.isSelected())
        {
            acesso[11] = true;
        }
        else
        {
            acesso[11] = false;
        }
        
        
        if (cxEmiHab.isSelected())
        {
            acesso[12] = true;
        }
        else
        {
            acesso[12] = false;
        }
        
        
        if (cxEmiAlv.isSelected())
        {
            acesso[13] = true;
        }
        else
        {
            acesso[13] = false;
        }
        
        
        if (cxEmiGuia.isSelected())
        {
            acesso[14] = true;
        }
        else
        {
            acesso[14] = false;
        }
        
        if (cxAdmEsp.isSelected())
        {
            acesso[15] = true;
        }
        else
        {
            acesso[15] = false;
        }
        
        if (cxTrmFis.isSelected())
        {
            acesso[16] = true;
        }
        else
        {
            acesso[16] = false;
        }
        
        if (cxTrmFis1.isSelected())
        {
            acesso[17] = true;
        }
        else
        {
            acesso[17] = false;
        }
        
        String acesso2 = new String();
        
        for(int i = 0;i<acesso.length;i++)
        {
            if(i==0)
            {
                acesso2 = String.valueOf(acesso[i]);
            }
            else
            {
                acesso2 = acesso2 + "," + String.valueOf(acesso[i]);
            }
            
        }
        
        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Deseja alterar esse registro ?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);
        if (opc.toString().equals("0")) {
            
             edi.editarUser(acesso2, tipo, nome, login);
             JOptionPane.showMessageDialog(null, "Alteração salva com sucesso!");
              btnConcluir.setEnabled(false);
        btnAtualizar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        radRecep.setSelected(false);
        radRecep.setEnabled(false);
        
        radTecn.setSelected(false);
        radTecn.setEnabled(false);
        
        radTram.setSelected(false);
        radTram.setEnabled(false);
        
        radPers.setSelected(false);
        
        
        cxAdmTec.setSelected(false);
        cxAdmTec.setEnabled(false);
        
        cxAdmAss.setSelected(false);
        cxAdmAss.setEnabled(false);
        
        cxAdmEnc.setSelected(false);
        cxAdmEnc.setEnabled(false);
        
        cxAdmEsp.setSelected(false);
        cxAdmEsp.setEnabled(false);
        
        cxTrmAlv.setSelected(false);
        cxTrmAlv.setEnabled(false);
        
        cxTrmCom.setSelected(false);
        cxTrmCom.setEnabled(false);
        
        cxTrmHab.setSelected(false);
        cxTrmHab.setEnabled(false);
        
        cxTrmPro.setSelected(false);
        cxTrmPro.setEnabled(false);
        
        cxTrmFis.setSelected(false);
        cxTrmFis.setEnabled(false);
        
        cxTrmFis1.setSelected(false);
        cxTrmFis1.setEnabled(false);
        
        cxProAdi.setSelected(false);
        cxProAdi.setEnabled(false);
        
        cxProAtu.setSelected(false);
        cxProAtu.setEnabled(false);
        
        cxProExc.setSelected(false);
        cxProExc.setEnabled(false);
        
        cxProPes.setSelected(false);
        cxProPes.setEnabled(false);
        
        cxEmiAlv.setSelected(false);
        cxEmiAlv.setEnabled(false);
        
        cxEmiCom.setSelected(false);
        cxEmiCom.setEnabled(false);
        
        cxEmiGuia.setSelected(false);
        cxEmiGuia.setEnabled(false);
        
        cxEmiHab.setSelected(false);
        cxEmiHab.setEnabled(false);
        
        
        

        txtNome.setText("");
        txtNome.setEditable(false);
        txtLogin.setText("");
        txtLogin.setEditable(false);
             
            try {
                preenche_jtable();
            } catch (SQLException ex) {
                Logger.getLogger(FormListarUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        FormLogin L = new FormLogin(this, true);
        L.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        btnConcluir.setEnabled(true);
        btnAtualizar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        radRecep.setSelected(false);
        radRecep.setEnabled(true);
        
        radTecn.setSelected(false);
        radTecn.setEnabled(true);
        
        radTram.setSelected(false);
        radTram.setEnabled(true);
        
        radPers.setSelected(true);
        radRecep.setEnabled(true);
        
        
        cxAdmTec.setSelected(false);
        cxAdmTec.setEnabled(true);
        
        cxAdmAss.setSelected(false);
        cxAdmAss.setEnabled(true);
        
        cxAdmEnc.setSelected(true);
        cxAdmEnc.setEnabled(false);
        
        cxAdmEsp.setSelected(false);
        cxAdmEsp.setEnabled(true);
               
        cxTrmCom.setSelected(false);
        cxTrmCom.setEnabled(true);
        
        cxTrmHab.setSelected(false);
        cxTrmHab.setEnabled(true);
        
        cxTrmAlv.setSelected(false);
        cxTrmAlv.setEnabled(true);
        
        cxTrmPro.setSelected(false);
        cxTrmPro.setEnabled(true);
        
        cxTrmFis.setSelected(false);
        cxTrmFis.setEnabled(true);
        
        cxTrmFis1.setSelected(false);
        cxTrmFis1.setEnabled(false);
        
        cxProPes.setSelected(false);
        cxProPes.setEnabled(true);
        
        cxProAdi.setSelected(false);
        cxProAdi.setEnabled(true);
        
        cxProAtu.setSelected(false);
        cxProAtu.setEnabled(true);
        
        cxProExc.setSelected(false);
        cxProExc.setEnabled(true);
                       
        cxEmiCom.setSelected(false);
        cxEmiCom.setEnabled(true);
        
        cxEmiHab.setSelected(false);
        cxEmiHab.setEnabled(true);
        
        cxEmiAlv.setSelected(false);
        cxEmiAlv.setEnabled(true);
        
        cxEmiGuia.setSelected(false);
        cxEmiGuia.setEnabled(true);
        
       

        txtNome.setText("");
        txtNome.setEditable(true);
        txtLogin.setText("");
        txtLogin.setEditable(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void cxAdmTecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAdmTecActionPerformed
        radPers.setSelected(true);
    }//GEN-LAST:event_cxAdmTecActionPerformed

    private void radRecepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radRecepActionPerformed
        cxAdmTec.setSelected(false);
        cxAdmTec.setEnabled(true);
        
        cxAdmAss.setSelected(false);
        cxAdmAss.setEnabled(true);
        
        cxAdmEnc.setSelected(true);
        cxAdmEnc.setEnabled(false);
        
        cxAdmEsp.setSelected(false);
        cxAdmEsp.setEnabled(true);
               
        cxTrmCom.setSelected(false);
        cxTrmCom.setEnabled(true);
        
        cxTrmHab.setSelected(false);
        cxTrmHab.setEnabled(true);
        
        cxTrmAlv.setSelected(false);
        cxTrmAlv.setEnabled(true);
        
        cxTrmPro.setSelected(true);
        cxTrmPro.setEnabled(true);
        
        cxTrmFis.setSelected(false);
        cxTrmFis.setEnabled(true);
        
        cxTrmFis1.setSelected(false);
        cxTrmFis1.setEnabled(false);
        
        cxProPes.setSelected(true);
        cxProPes.setEnabled(true);
        
        cxProAdi.setSelected(false);
        cxProAdi.setEnabled(true);
        
        cxProAtu.setSelected(false);
        cxProAtu.setEnabled(true);
        
        cxProExc.setSelected(false);
        cxProExc.setEnabled(true);
                       
        cxEmiCom.setSelected(false);
        cxEmiCom.setEnabled(true);
        
        cxEmiHab.setSelected(false);
        cxEmiHab.setEnabled(true);
        
        cxEmiAlv.setSelected(false);
        cxEmiAlv.setEnabled(true);
        
        cxEmiGuia.setSelected(false);
        cxEmiGuia.setEnabled(true);
        
    }//GEN-LAST:event_radRecepActionPerformed

    private void radTecnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTecnActionPerformed
        cxAdmTec.setSelected(false);
        cxAdmTec.setEnabled(true);
        
        cxAdmAss.setSelected(false);
        cxAdmAss.setEnabled(true);
        
        cxAdmEnc.setSelected(true);
        cxAdmEnc.setEnabled(false);
        
        cxAdmEsp.setSelected(false);
        cxAdmEsp.setEnabled(true);
               
        cxTrmCom.setSelected(true);
        cxTrmCom.setEnabled(true);
        
        cxTrmHab.setSelected(true);
        cxTrmHab.setEnabled(true);
        
        cxTrmAlv.setSelected(true);
        cxTrmAlv.setEnabled(true);
        
        cxTrmPro.setSelected(false);
        cxTrmPro.setEnabled(true);
        
        cxTrmFis.setSelected(false);
        cxTrmFis.setEnabled(true);
        
        cxTrmFis.setSelected(false);
        cxTrmFis.setEnabled(false);
        
        cxProPes.setSelected(true);
        cxProPes.setEnabled(true);
        
        cxProAdi.setSelected(true);
        cxProAdi.setEnabled(true);
        
        cxProAtu.setSelected(true);
        cxProAtu.setEnabled(true);
        
        cxProExc.setSelected(false);
        cxProExc.setEnabled(true);
                       
        cxEmiCom.setSelected(true);
        cxEmiCom.setEnabled(true);
        
        cxEmiHab.setSelected(true);
        cxEmiHab.setEnabled(true);
        
        cxEmiAlv.setSelected(true);
        cxEmiAlv.setEnabled(true);
        
        cxEmiGuia.setSelected(false);
        cxEmiGuia.setEnabled(true);
    }//GEN-LAST:event_radTecnActionPerformed

    private void radTramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTramActionPerformed
        cxAdmTec.setSelected(false);
        cxAdmTec.setEnabled(true);
        
        cxAdmAss.setSelected(false);
        cxAdmAss.setEnabled(true);
        
        cxAdmEnc.setSelected(true);
        cxAdmEnc.setEnabled(false);
        
        cxAdmEsp.setSelected(false);
        cxAdmEsp.setEnabled(true);
               
        cxTrmCom.setSelected(true);
        cxTrmCom.setEnabled(true);
        
        cxTrmHab.setSelected(true);
        cxTrmHab.setEnabled(true);
        
        cxTrmAlv.setSelected(true);
        cxTrmAlv.setEnabled(true);
        
        cxTrmPro.setSelected(false);
        cxTrmPro.setEnabled(true);
        
        cxTrmFis.setSelected(false);
        cxTrmFis.setEnabled(true);
        
        cxTrmFis.setSelected(false);
        cxTrmFis.setEnabled(false);
        
        cxProPes.setSelected(true);
        cxProPes.setEnabled(true);
        
        cxProAdi.setSelected(true);
        cxProAdi.setEnabled(true);
        
        cxProAtu.setSelected(true);
        cxProAtu.setEnabled(true);
        
        cxProExc.setSelected(false);
        cxProExc.setEnabled(true);
                       
        cxEmiCom.setSelected(false);
        cxEmiCom.setEnabled(true);
        
        cxEmiHab.setSelected(false);
        cxEmiHab.setEnabled(true);
        
        cxEmiAlv.setSelected(false);
        cxEmiAlv.setEnabled(true);
        
        cxEmiGuia.setSelected(false);
        cxEmiGuia.setEnabled(true);
    }//GEN-LAST:event_radTramActionPerformed

    private void cxAdmAssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAdmAssActionPerformed
radPers.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_cxAdmAssActionPerformed

    private void cxTrmComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTrmComActionPerformed
radPers.setSelected(true);              // TODO add your handling code here:
   // TODO add your handling code here:
    }//GEN-LAST:event_cxTrmComActionPerformed

    private void cxTrmHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTrmHabActionPerformed
radPers.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_cxTrmHabActionPerformed

    private void cxTrmAlvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTrmAlvActionPerformed
radPers.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_cxTrmAlvActionPerformed

    private void cxTrmProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTrmProActionPerformed
radPers.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_cxTrmProActionPerformed

    private void cxProPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxProPesActionPerformed
radPers.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_cxProPesActionPerformed

    private void cxProAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxProAdiActionPerformed
radPers.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_cxProAdiActionPerformed

    private void cxProAtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxProAtuActionPerformed
radPers.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_cxProAtuActionPerformed

    private void cxProExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxProExcActionPerformed
radPers.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_cxProExcActionPerformed

    private void cxEmiComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEmiComActionPerformed
radPers.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_cxEmiComActionPerformed

    private void cxEmiHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEmiHabActionPerformed
radPers.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_cxEmiHabActionPerformed

    private void cxEmiAlvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEmiAlvActionPerformed
radPers.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_cxEmiAlvActionPerformed

    private void cxEmiGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEmiGuiaActionPerformed
radPers.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_cxEmiGuiaActionPerformed

    private void cxAdmEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAdmEspActionPerformed
radPers.setSelected(true);          // TODO add your handling code here:
    }//GEN-LAST:event_cxAdmEspActionPerformed

    private void cxTrmFisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTrmFisActionPerformed
       radPers.setSelected(true);
        cxTrmFis.setEnabled(true);
    }//GEN-LAST:event_cxTrmFisActionPerformed

    private void cxTrmFis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTrmFis1ActionPerformed
        radPers.setSelected(true);
        cxTrmFis.setSelected(true);
    }//GEN-LAST:event_cxTrmFis1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormListarUser().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox cxAdmAss;
    private javax.swing.JCheckBox cxAdmEnc;
    private javax.swing.JCheckBox cxAdmEsp;
    private javax.swing.JCheckBox cxAdmTec;
    private javax.swing.JCheckBox cxEmiAlv;
    private javax.swing.JCheckBox cxEmiCom;
    private javax.swing.JCheckBox cxEmiGuia;
    private javax.swing.JCheckBox cxEmiHab;
    private javax.swing.JCheckBox cxProAdi;
    private javax.swing.JCheckBox cxProAtu;
    private javax.swing.JCheckBox cxProExc;
    private javax.swing.JCheckBox cxProPes;
    private javax.swing.JCheckBox cxTrmAlv;
    private javax.swing.JCheckBox cxTrmCom;
    private javax.swing.JCheckBox cxTrmFis;
    private javax.swing.JCheckBox cxTrmFis1;
    private javax.swing.JCheckBox cxTrmHab;
    private javax.swing.JCheckBox cxTrmPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JRadioButton radPers;
    private javax.swing.JRadioButton radRecep;
    private javax.swing.JRadioButton radTecn;
    private javax.swing.JRadioButton radTram;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
//preenche a jTable

    public void preenche_jtable() throws SQLException {

        AcessoBD bd = new AcessoBD();

        DefaultTableModel modelo = (DefaultTableModel) tblUser.getModel();
        modelo.setNumRows(0);

        try {
            ResultSet resultado = bd.consultaTable("SELECT * FROM usuario WHERE tipo != 99 AND tipo != 0 ORDER BY nome ASC");
            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
            {
                String user = resultado.getString("nome");

                modelo.addRow(new Object[]{resultado.getInt("id"), user});

            }
            resultado.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
        }
    }
}
