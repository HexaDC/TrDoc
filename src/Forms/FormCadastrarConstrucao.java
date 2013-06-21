package Forms;

import Classes.Cadastra.ClassCadastrarConstrucao;
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

/**
 *
 * @author 11187
 */
public class FormCadastrarConstrucao extends javax.swing.JFrame {

    AcessoBD bd = new AcessoBD();
    ClassCadastrarConstrucao cad = new ClassCadastrarConstrucao();
    private int largura = 524;
    private int altura = 274;

    public FormCadastrarConstrucao() {
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
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtConstrucao = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnConcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConstrucao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Cadastrar Tipos de Construção");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 173, 14);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 30, 500, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 150, 500, 10);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("Construção");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 160, 110, 16);
        getContentPane().add(txtConstrucao);
        txtConstrucao.setBounds(10, 180, 500, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 220, 500, 10);

        btnConcluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/concluir.png"))); // NOI18N
        btnConcluir.setText("Concluir");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConcluir);
        btnConcluir.setBounds(390, 230, 100, 30);

        btnEditar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(270, 230, 90, 30);

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
        btnExcluir.setBounds(150, 230, 90, 30);

        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(30, 230, 90, 30);

        tblConstrucao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConstrucao.getTableHeader().setReorderingAllowed(false);
        tblConstrucao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConstrucaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblConstrucao);
        tblConstrucao.getColumnModel().getColumn(0).setMinWidth(0);
        tblConstrucao.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblConstrucao.getColumnModel().getColumn(0).setMaxWidth(0);
        tblConstrucao.getColumnModel().getColumn(1).setResizable(false);
        tblConstrucao.getColumnModel().getColumn(1).setPreferredWidth(430);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 500, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastrarConstrucao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        try {
            String tipo = txtConstrucao.getText().toUpperCase();
            cad.cadastrarConstrucao(tipo);

            txtConstrucao.setText("");
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastrarConstrucao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        Object a = tblConstrucao.getValueAt(tblConstrucao.getSelectedRow(), 0);
        String num = String.valueOf(a);
        int id = Integer.valueOf(num);
        cad.setIdConstrucao(id);

        String tipo = txtConstrucao.getText().toUpperCase();

        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Deseja Salvar essa alteração?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (opc.toString().equals("0")) {
            cad.atualizarConstrucao(tipo);
            JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");
            try {
                preenche_jtable();
            } catch (SQLException ex) {
                Logger.getLogger(FormListarProfissional.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        txtConstrucao.setText("");
        btnConcluir.setEnabled(true);
        btnExcluir.setEnabled(false);
        btnEditar.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Object a = tblConstrucao.getValueAt(tblConstrucao.getSelectedRow(), 0);
        String num = String.valueOf(a);
        int id = Integer.valueOf(num);
        cad.setIdConstrucao(id);


        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Deseja excluir esse registro?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (opc.toString().equals("0")) {
            cad.deletaConstrucao();
            JOptionPane.showMessageDialog(null, "Alteração salva com sucesso!");
            try {
                preenche_jtable();
            } catch (SQLException ex) {
                Logger.getLogger(FormListarProfissional.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        txtConstrucao.setText("");
        btnConcluir.setEnabled(true);
        btnExcluir.setEnabled(false);
        btnEditar.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblConstrucaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConstrucaoMouseClicked
        Object a = tblConstrucao.getValueAt(tblConstrucao.getSelectedRow(), 0);
        String num = String.valueOf(a);
        int id = Integer.valueOf(num);
        cad.setIdConstrucao(id);

        String tipo = cad.pesquisaConstrucao();

        txtConstrucao.setText(tipo);

        btnConcluir.setEnabled(false);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_tblConstrucaoMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormCadastrarConstrucao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblConstrucao;
    private javax.swing.JTextField txtConstrucao;
    // End of variables declaration//GEN-END:variables

    public void preenche_jtable() throws SQLException {

        DefaultTableModel modelo = (DefaultTableModel) tblConstrucao.getModel();
        modelo.setNumRows(0);

        try {
            ResultSet resultado = bd.consultaTable("SELECT * FROM construcao ORDER BY tipo ASC");

            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
            {
                modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("tipo")});
            }

            resultado.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
        }

    }
}
