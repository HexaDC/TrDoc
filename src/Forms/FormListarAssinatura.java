package Forms;

import Classes.Atualiza.ClassAtualizarAssinatura;
import Classes.Cadastra.ClassCadastrarAssinatura;
import Classes.Pesquisa.ClassPesquisaAssinatura;
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

public class FormListarAssinatura extends javax.swing.JFrame {

    AcessoBD bd = new AcessoBD();
    ClassCadastrarAssinatura cad = new ClassCadastrarAssinatura();
    ClassPesquisaAssinatura pes = new ClassPesquisaAssinatura();
    ClassAtualizarAssinatura atu = new ClassAtualizarAssinatura();
    public String admAss;
    public boolean[] acesso_bkp;
    private int largura = 441;
    private int altura = 322;

    public FormListarAssinatura() {
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

    FormListarAssinatura(FormMenu aThis, boolean b) {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNome = new javax.swing.JTextField();
        txtRegistro = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        btnConcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Cadastro de Assinaturas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 138, 14);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 31, 0, 10);
        getContentPane().add(txtNome);
        txtNome.setBounds(10, 180, 420, 30);
        getContentPane().add(txtRegistro);
        txtRegistro.setBounds(10, 210, 420, 30);
        getContentPane().add(txtCargo);
        txtCargo.setBounds(10, 240, 420, 30);

        btnConcluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/concluir.png"))); // NOI18N
        btnConcluir.setText("Concluir");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConcluir);
        btnConcluir.setBounds(330, 280, 100, 30);

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
        btnAtualizar.setBounds(220, 280, 100, 30);

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
        btnExcluir.setBounds(110, 280, 100, 30);

        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(10, 280, 90, 30);

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", "Assinatura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistro.getTableHeader().setReorderingAllowed(false);
        tblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistro);
        tblRegistro.getColumnModel().getColumn(0).setMinWidth(0);
        tblRegistro.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblRegistro.getColumnModel().getColumn(0).setMaxWidth(0);
        tblRegistro.getColumnModel().getColumn(1).setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 30, 420, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Object a = tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 0);

        String idt = String.valueOf(a);
        int id = Integer.parseInt(idt);
        atu.setID(id);


        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Deseja excluir esse registro ?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (opc.toString().equals("0")) {
            atu.excluirAssinatura();

            try {
                preenche_jtable();
            } catch (SQLException ex) {
                Logger.getLogger(FormListarAssinatura.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Exclusão efetuada!");

        }

        txtNome.setText("");
        txtRegistro.setText("");
        txtCargo.setText("");

        btnConcluir.setEnabled(true);
        btnExcluir.setEnabled(false);
        btnAtualizar.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        String nome = txtNome.getText();
        String reg = txtRegistro.getText();
        String cargo = txtCargo.getText();

        cad.cadastrarAssinatura(nome, reg, cargo);
        JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");

        txtNome.setText("");
        txtRegistro.setText("");
        txtCargo.setText("");

        btnAtualizar.setEnabled(false);
        btnExcluir.setEnabled(false);

        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormListarAssinatura.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnConcluirActionPerformed

    private void tblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroMouseClicked
        Object a = tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 0);

        String n = String.valueOf(a);
        pes.setIdAssinatura(Integer.valueOf(n));

        String nome = pes.pesquisaNomeAssinatura();
        txtNome.setText(nome);

        String reg = pes.pesquisaRegistro();
        txtRegistro.setText(reg);

        String cargo = pes.pesquisaCargo();
        txtCargo.setText(cargo);


        btnAtualizar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnConcluir.setEnabled(false);
    }//GEN-LAST:event_tblRegistroMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        int id = pes.pesquisaIdAssinatura();
        atu.setID(id);

        String nome = txtNome.getText();
        String reg = txtRegistro.getText();
        String cargo = txtCargo.getText();


        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Deseja Salvar essa alteração?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (opc.toString().equals("0")) {
            atu.atualizarAssinatura(nome, reg, cargo);
            JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");
            try {
                preenche_jtable();
            } catch (SQLException ex) {
                Logger.getLogger(FormListarAssinatura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        txtNome.setText("");
        txtRegistro.setText("");
        txtCargo.setText("");

        btnConcluir.setEnabled(true);
        btnExcluir.setEnabled(false);
        btnAtualizar.setEnabled(false);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (admAss.equals(admAss)) {
            FormMenu M = new FormMenu(this, true);
            M.setVisible(true);
            M.group = admAss;
            M.acesso_user = acesso_bkp;
            dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormListarAssinatura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormListarAssinatura().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRegistro;
    // End of variables declaration//GEN-END:variables

    public void preenche_jtable() throws SQLException {

        DefaultTableModel modelo = (DefaultTableModel) tblRegistro.getModel();
        modelo.setNumRows(0);

        try {
            ResultSet resultado = bd.consultaTable("SELECT * FROM assinatura ORDER BY nome ASC");

            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
            {
                modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("cargo")});
            }

            resultado.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
        }

    }
}
