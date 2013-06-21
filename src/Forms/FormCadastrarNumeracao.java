package Forms;

import Classes.Pesquisa.ClassPesquisaDadosRequerente;
import Classes.Pesquisa.ClassSelecionarId;
import Classes.Cadastra.ClassCadastrarNumeracao;
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
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
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

public class FormCadastrarNumeracao extends javax.swing.JFrame {

    
        
    AcessoBD bd = new AcessoBD();
    ClassPesquisaDadosRequerente pes = new ClassPesquisaDadosRequerente();
    ClassCadastrarNumeracao cad = new ClassCadastrarNumeracao();
    ClassSelecionarId sel = new ClassSelecionarId();
    public String emiGuia;
    public boolean[] acesso_bkp;
    private int largura = 704;
    private int altura = 570;

    public FormCadastrarNumeracao() {
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

        
        //Data do Sistema
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance();
        String data2 = df.format(now);
        txtDtEmissao.setText(data2);
    }

    FormCadastrarNumeracao(FormMenu aThis, boolean b) {
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

        //Data do Sistema
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance();
        String data2 = df.format(now);
        txtDtEmissao.setText(data2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cbxPesquisa = new javax.swing.JComboBox();
        txtPesquisa = new javax.swing.JTextField();
        btnListar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtDtEntrada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtProcesso = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtRequerente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAssunto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtLoteamento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtQuadra = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtIdentCadastral = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNumeracao = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDtEmissao = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNumControle = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnConcluir = new javax.swing.JButton();
        btnGuia = new javax.swing.JButton();
        txtVoltar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProcesso = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TRDoc - Tramitação de Documentos");
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel1.setText("Guia de Emplacamento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 130, 16);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 30, 680, 10);

        cbxPesquisa.setFont(new java.awt.Font("SansSerif", 1, 12));
        cbxPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nº Processo", "Requerente", "Assunto", "Endereço", "Ident. Cadastral", "Profissional", "Insc. Municipal" }));
        getContentPane().add(cbxPesquisa);
        cbxPesquisa.setBounds(10, 40, 120, 30);

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });
        getContentPane().add(txtPesquisa);
        txtPesquisa.setBounds(140, 40, 450, 30);

        btnListar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lista.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(601, 40, 90, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 190, 680, 10);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("Nº Processo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 200, 90, 20);

        txtDtEntrada.setEditable(false);
        getContentPane().add(txtDtEntrada);
        txtDtEntrada.setBounds(240, 220, 110, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel3.setText("Ano");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 200, 22, 20);

        txtAno.setEditable(false);
        getContentPane().add(txtAno);
        txtAno.setBounds(150, 220, 60, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel4.setText("Data Entrada");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 200, 73, 20);

        txtProcesso.setEditable(false);
        getContentPane().add(txtProcesso);
        txtProcesso.setBounds(10, 220, 110, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 260, 680, 10);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("Requerente");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 270, 66, 20);

        txtRequerente.setEditable(false);
        getContentPane().add(txtRequerente);
        txtRequerente.setBounds(10, 290, 440, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel6.setText("Assunto");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 270, 47, 20);

        txtAssunto.setEditable(false);
        getContentPane().add(txtAssunto);
        txtAssunto.setBounds(460, 290, 230, 30);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel7.setText("Endereço");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 320, 60, 20);

        txtEndereco.setEditable(false);
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(10, 340, 470, 30);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel8.setText("Bairro");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 320, 50, 20);

        txtBairro.setEditable(false);
        getContentPane().add(txtBairro);
        txtBairro.setBounds(490, 340, 200, 30);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel9.setText("Lote");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(290, 370, 50, 20);

        txtLote.setEditable(false);
        getContentPane().add(txtLote);
        txtLote.setBounds(290, 390, 70, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel10.setText("Loteamento");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 370, 80, 20);

        txtLoteamento.setEditable(false);
        getContentPane().add(txtLoteamento);
        txtLoteamento.setBounds(10, 390, 140, 30);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel11.setText("Quadra");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(170, 370, 60, 20);

        txtQuadra.setEditable(false);
        getContentPane().add(txtQuadra);
        txtQuadra.setBounds(170, 390, 100, 30);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel12.setText("Identificação Cadastral");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(380, 370, 140, 20);

        txtIdentCadastral.setEditable(false);
        getContentPane().add(txtIdentCadastral);
        txtIdentCadastral.setBounds(380, 390, 190, 30);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(10, 430, 680, 20);

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel13.setText("Emplacamento");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 440, 85, 16);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel14.setText("Numeração");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(170, 460, 70, 20);
        getContentPane().add(txtNumeracao);
        txtNumeracao.setBounds(150, 480, 110, 30);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel15.setText("Data Emissão");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(310, 460, 90, 20);

        txtDtEmissao.setEditable(false);
        getContentPane().add(txtDtEmissao);
        txtDtEmissao.setBounds(290, 480, 130, 30);

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel16.setText("Nº Controle");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 460, 63, 20);

        txtNumControle.setEditable(false);
        txtNumControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumControleActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumControle);
        txtNumControle.setBounds(10, 480, 100, 30);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(10, 520, 680, 10);

        btnConcluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/concluir.png"))); // NOI18N
        btnConcluir.setText("Incluir Numeração");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConcluir);
        btnConcluir.setBounds(430, 530, 160, 30);

        btnGuia.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnGuia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/habite.png"))); // NOI18N
        btnGuia.setText("Emitir Guia ");
        btnGuia.setEnabled(false);
        btnGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuia);
        btnGuia.setBounds(290, 530, 120, 30);

        txtVoltar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/voltar.png"))); // NOI18N
        txtVoltar.setText("Voltar");
        txtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(txtVoltar);
        txtVoltar.setBounds(10, 530, 90, 30);

        btnNovo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/novo2.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setEnabled(false);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(610, 530, 80, 30);

        tblProcesso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "Nº Proc.", "Ano", "Requerente", "Assunto", "Endereço"
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
        jScrollPane1.setViewportView(tblProcesso);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 80, 680, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtProcesso.setText("");
        txtDtEntrada.setText("");
        txtAno.setText("");
        txtRequerente.setText("");
        txtAssunto.setText("");
        txtEndereco.setText("");
        txtBairro.setText("");
        txtLoteamento.setText("");
        txtLote.setText("");
        txtQuadra.setText("");
        txtLote.setText("");
        txtIdentCadastral.setText("");


        txtNumeracao.setText("");
        txtNumControle.setText("");

        btnConcluir.setEnabled(true);
        btnGuia.setEnabled(false);

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastrarNumeracao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void tblProcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcessoMouseClicked
        Object a = tblProcesso.getValueAt(tblProcesso.getSelectedRow(), 0);

        String idt = String.valueOf(a);
        int id = Integer.parseInt(idt);
        pes.setID(id);

        int p = pes.pesquisanumProcesso();
        String processo = String.valueOf(p);
        txtProcesso.setText(processo);

        int n = pes.verificaNumeracao();
        String numeracao = String.valueOf(n);
        txtNumeracao.setText(numeracao);

        String ano = pes.pesquisaAnoProcesso();
        txtAno.setText(ano);

        String dt = pes.pesquisaDataEntrada();
        txtDtEntrada.setText(dt);

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

        
        
        int id_c = pes.pesquisaIdControle();
        pes.setIdControle(id_c);
        
        

        txtNumControle.setText(String.valueOf(pes.getIdControle()));
    }//GEN-LAST:event_tblProcessoMouseClicked

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        String num1 = txtProcesso.getText();
        String ano1 = txtAno.getText();
        int id = sel.selecionarIdPro(Integer.valueOf(num1),ano1);
        cad.setId(id);

        String num = txtNumeracao.getText().toUpperCase();
        String dt = txtDtEmissao.getText().toUpperCase();
        String cont = txtNumControle.getText().toUpperCase();

        cad.cadastrarNumeracao(num, dt, cont);

        JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");

        btnNovo.setEnabled(true);
        btnGuia.setEnabled(true);
        btnConcluir.setEnabled(false);
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void btnGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiaActionPerformed
        
        String insc = txtIdentCadastral.getText();

        if (insc.equals("00.000.000-0")) {
            JOptionPane.showMessageDialog(null, "Número de Inscrição Municipal incorreto... Preencha o campo corretamente!");

        } else {
            Connection con = (Connection) bd.getConnection();
            int id = pes.pesquisaCodProcesso();
            //gera o relatório
            HashMap parametro = new HashMap();
            parametro.put("COD", String.valueOf(id));

            try {
                JasperPrint jp = JasperFillManager.fillReport("./relatorios/RelatorioNumeracao.jasper", parametro, con);
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

        }
    }//GEN-LAST:event_btnGuiaActionPerformed

    private void txtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVoltarActionPerformed
        if (emiGuia.equals(emiGuia)) {
            FormMenu M = new FormMenu(this, true);
            M.setVisible(true);
            M.group = emiGuia;
            M.acesso_user = acesso_bkp;
            dispose();
        }
    }//GEN-LAST:event_txtVoltarActionPerformed

    private void txtNumControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumControleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumControleActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        if(evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER) {
	   btnListar.doClick();
        }
    }//GEN-LAST:event_txtPesquisaKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormCadastrarNumeracao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnGuia;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox cbxPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tblProcesso;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAssunto;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtDtEmissao;
    private javax.swing.JTextField txtDtEntrada;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdentCadastral;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtLoteamento;
    private javax.swing.JTextField txtNumControle;
    private javax.swing.JTextField txtNumeracao;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtProcesso;
    private javax.swing.JTextField txtQuadra;
    private javax.swing.JTextField txtRequerente;
    private javax.swing.JButton txtVoltar;
    // End of variables declaration//GEN-END:variables

   public void preenche_jtable() throws SQLException {

        DefaultTableModel modelo = (DefaultTableModel) tblProcesso.getModel();
        modelo.setNumRows(0);

        String d1, m1, a1;


        String pesquisa = txtPesquisa.getText().toString();
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
}
