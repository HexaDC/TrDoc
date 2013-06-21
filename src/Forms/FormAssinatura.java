package Forms;

import Classes.Atualiza.ClassAtualizarAssinatura;
import Classes.Cadastra.ClassCadastrarAssinatura;
import Classes.Atualiza.ClassAtualizarAlvara;
import Classes.Pesquisa.ClassPesquisaAssinatura;
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

public class FormAssinatura extends javax.swing.JFrame {

    AcessoBD bd = new AcessoBD();
    ClassCadastrarAssinatura cad = new ClassCadastrarAssinatura();
    ClassPesquisaAssinatura pes = new ClassPesquisaAssinatura();
    ClassAtualizarAssinatura atu = new ClassAtualizarAssinatura();
    public String emiAlvRes;
    private int id,opt;
    public boolean[] acesso_bkp2;
    private int largura = 390;
    private int altura = 311;

    public FormAssinatura() {
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
    
    public FormAssinatura(int id2, int opt2) {
        initComponents();
        id = id2;
        opt = opt2;
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

    FormAssinatura(FormMenu aThis, boolean b) {
        initComponents();

         /////////////////////// Formato - Localização - Ícone ///////////////////
        try {

            URL url_th = this.getClass().getResource("/System/trdoc.theme");
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNome = new javax.swing.JTextField();
        txtRegistro = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        btnConcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAssinatura = new javax.swing.JTable();

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
        jLabel1.setText("Escolha uma Assinatura");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 170, 16);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 33, 0, 10);

        txtNome.setEditable(false);
        txtNome.setFont(new java.awt.Font("SansSerif", 3, 12));
        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNome.setBorder(null);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(10, 180, 370, 20);

        txtRegistro.setEditable(false);
        txtRegistro.setFont(new java.awt.Font("SansSerif", 0, 10));
        txtRegistro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegistro.setBorder(null);
        getContentPane().add(txtRegistro);
        txtRegistro.setBounds(10, 210, 370, 20);

        txtCargo.setEditable(false);
        txtCargo.setFont(new java.awt.Font("SansSerif", 1, 11));
        txtCargo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCargo.setBorder(null);
        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCargo);
        txtCargo.setBounds(10, 240, 370, 20);

        btnConcluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/concluir.png"))); // NOI18N
        btnConcluir.setText("Gerar Documento");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConcluir);
        btnConcluir.setBounds(200, 270, 170, 30);

        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(20, 270, 90, 30);

        tblAssinatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "Nome", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAssinatura.getTableHeader().setReorderingAllowed(false);
        tblAssinatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAssinaturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAssinatura);
        tblAssinatura.getColumnModel().getColumn(0).setMinWidth(0);
        tblAssinatura.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblAssinatura.getColumnModel().getColumn(0).setMaxWidth(0);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 30, 370, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        Connection con = (Connection) bd.getConnection();
        Object x = tblAssinatura.getValueAt(tblAssinatura.getSelectedRow(), 0);
        String id2 = String.valueOf(x);
        ClassAtualizarAlvara flag = new ClassAtualizarAlvara();

        HashMap parametro = new HashMap();
        parametro.put("ID1", String.valueOf(id));
        parametro.put("ID2", String.valueOf(id2));
        
        if(opt == 1){
             try {
            JasperPrint jp = JasperFillManager.fillReport("./relatorios/RelatorioAlvara2.jasper", parametro, con);
            JasperViewer jrv = new JasperViewer(jp, false);
            jrv.setVisible(true);

            //Altera o icone e o título da janela
            jrv.setTitle("TRDoc - Tramitação de Documentos");
            URL url = this.getClass().getResource("/Icons/vistoria.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
            jrv.setIconImage(imagemTitulo);
            flag.atualizaFlag(id);

        } catch (JRException ex) {
            Logger.getLogger(FormRelatorioAlvara.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            if(opt == 2){
                 try {
            JasperPrint jp = JasperFillManager.fillReport("./relatorios/RelatorioAlvara2.jasper", parametro, con);
            JasperViewer jrv = new JasperViewer(jp, false);
            jrv.setVisible(true);

            //Altera o icone e o título da janela
            jrv.setTitle("TRDoc - Tramitação de Documentos");
            URL url = this.getClass().getResource("/Icons/vistoria.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
            jrv.setIconImage(imagemTitulo);
            flag.atualizaFlag(id);

        } catch (JRException ex) {
            Logger.getLogger(FormRelatorioAlvara.class.getName()).log(Level.SEVERE, null, ex);
        }
            }else{
                if(opt == 3){
                     try {
            JasperPrint jp = JasperFillManager.fillReport("./relatorios/RelatorioAlvara3.jasper", parametro, con);
            JasperViewer jrv = new JasperViewer(jp, false);
            jrv.setVisible(true);

            //Altera o icone e o título da janela
            jrv.setTitle("TRDoc - Tramitação de Documentos");
            URL url = this.getClass().getResource("/Icons/vistoria.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
            jrv.setIconImage(imagemTitulo);
            flag.atualizaFlag(id);
            
        } catch (JRException ex) {
            Logger.getLogger(FormRelatorioAlvara.class.getName()).log(Level.SEVERE, null, ex);
        }
                }else{
                    JOptionPane.showMessageDialog(null, "Erro!");
                }
            }
        }
        
        
        

    }//GEN-LAST:event_btnConcluirActionPerformed

    private void tblAssinaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAssinaturaMouseClicked
        Object a = tblAssinatura.getValueAt(tblAssinatura.getSelectedRow(), 0);

        String n = String.valueOf(a);
        pes.setIdAssinatura(Integer.valueOf(n));

        String nome = pes.pesquisaNomeAssinatura();
        txtNome.setText(nome);

        String reg = pes.pesquisaRegistro();
        txtRegistro.setText(reg);

        String cargo = pes.pesquisaCargo();
        txtCargo.setText(cargo);


        btnConcluir.setEnabled(true);
    }//GEN-LAST:event_tblAssinaturaMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (emiAlvRes.equals(emiAlvRes)) {
            FormRelatorioAlvara A = new FormRelatorioAlvara(this, true);
            A.setVisible(true);
            A.emiAlv = emiAlvRes;
            A.acesso_bkp = acesso_bkp2;
            dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormAssinatura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormAssinatura().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblAssinatura;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRegistro;
    // End of variables declaration//GEN-END:variables

    public void preenche_jtable() throws SQLException {

        DefaultTableModel modelo = (DefaultTableModel) tblAssinatura.getModel();
        modelo.setNumRows(0);
        btnConcluir.setEnabled(false);

        try {
            ResultSet resultado = bd.consultaTable("SELECT * FROM assinatura ORDER BY nome ASC");

            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
            {
                modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("nome"), resultado.getString("cargo")});
            }

            resultado.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
        }

    }
}
