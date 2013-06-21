package Forms;

import Classes.Pesquisa.ClassPesquisaProfissional;
import Classes.Cadastra.ClassCadastrarProfissional;
import Classes.Atualiza.ClassAtualizarProfissional;
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

public class FormListarProfissional extends javax.swing.JFrame {

    AcessoBD bd = new AcessoBD();
    ClassCadastrarProfissional cad = new ClassCadastrarProfissional();
    ClassPesquisaProfissional pes = new ClassPesquisaProfissional();
    ClassAtualizarProfissional atu = new ClassAtualizarProfissional();
    public String admTec;
    public boolean[] acesso_bkp;
    private int largura = 674;
    private int altura = 371;

    public FormListarProfissional() {
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

    FormListarProfissional(FormMenu aThis, boolean b) {
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
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFormacao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtInscrMunicipal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCreasp = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnConcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfissional = new javax.swing.JTable();

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
        jLabel1.setText(" Técnicos da Secretaria");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 131, 14);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 30, 653, 10);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 160, 40, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 150, 653, 10);
        getContentPane().add(txtNome);
        txtNome.setBounds(10, 180, 650, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel3.setText("Formação");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 210, 80, 20);
        getContentPane().add(txtFormacao);
        txtFormacao.setBounds(10, 230, 300, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel4.setText("Inscrição Municipal");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 260, 150, 20);
        getContentPane().add(txtInscrMunicipal);
        txtInscrMunicipal.setBounds(10, 280, 290, 30);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("CREASP");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 210, 60, 20);
        getContentPane().add(txtCreasp);
        txtCreasp.setBounds(320, 230, 340, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 320, 650, 10);

        btnConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/concluir.png"))); // NOI18N
        btnConcluir.setText("Concluir");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConcluir);
        btnConcluir.setBounds(560, 330, 100, 30);

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
        btnAtualizar.setBounds(230, 330, 100, 30);

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
        btnExcluir.setBounds(120, 330, 90, 30);

        btnVoltar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(10, 330, 90, 30);

        tblProfissional.setModel(new javax.swing.table.DefaultTableModel(
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
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProfissional.getTableHeader().setReorderingAllowed(false);
        tblProfissional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProfissionalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProfissional);
        tblProfissional.getColumnModel().getColumn(0).setMinWidth(0);
        tblProfissional.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblProfissional.getColumnModel().getColumn(0).setMaxWidth(0);
        tblProfissional.getColumnModel().getColumn(1).setResizable(false);
        tblProfissional.getColumnModel().getColumn(1).setPreferredWidth(500);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 650, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Object a = tblProfissional.getValueAt(tblProfissional.getSelectedRow(), 0);

        String idt = String.valueOf(a);
        int id = Integer.parseInt(idt);
        atu.setID(id);


        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Deseja excluir esse registro ?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (opc.toString().equals("0")) {
            atu.excluirProfissional();

            try {
                preenche_jtable();
            } catch (SQLException ex) {
                Logger.getLogger(FormListarProfissional.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Exclusão efetuada!");

        }

        txtNome.setText("");
        txtFormacao.setText("");
        txtCreasp.setText("");
        txtInscrMunicipal.setText("");

        btnConcluir.setEnabled(true);
        btnExcluir.setEnabled(false);
        btnAtualizar.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        String nome = txtNome.getText().toUpperCase();
        String form = txtFormacao.getText().toUpperCase();
        String creasp = txtCreasp.getText().toUpperCase();
        String indc = txtInscrMunicipal.getText().toUpperCase();

        cad.cadastrarProfissional(nome, form, creasp, indc);
        JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");

        txtNome.setText("");
        txtFormacao.setText("");
        txtCreasp.setText("");
        txtInscrMunicipal.setText("");

        btnAtualizar.setEnabled(false);
        btnExcluir.setEnabled(false);

        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormListarProfissional.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnConcluirActionPerformed

    private void tblProfissionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProfissionalMouseClicked
        Object a = tblProfissional.getValueAt(tblProfissional.getSelectedRow(), 0);

        String n = String.valueOf(a);
        pes.setIdProfissional(Integer.valueOf(n));

        String nome = pes.pesquisaNomeProfissional();
        txtNome.setText(nome);

        String form = pes.pesquisaFormacao();
        txtFormacao.setText(form);

        String creasp = pes.pesquisaCreasp();
        txtCreasp.setText(creasp);

        String insc = pes.pesquisaInscrMunicipal();
        txtInscrMunicipal.setText(insc);


        btnAtualizar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnConcluir.setEnabled(false);
    }//GEN-LAST:event_tblProfissionalMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        int id = pes.pesquisaIdProfissional();
        atu.setID(id);

        String nome = txtNome.getText().toUpperCase();
        String form = txtFormacao.getText().toUpperCase();
        String creasp = txtCreasp.getText().toUpperCase();
        String indc = txtInscrMunicipal.getText().toUpperCase();


        Object[] options = {"Sim", "Não"};
        Object opc = JOptionPane.showOptionDialog(null, "Deseja Salvar essa alteração?", "Tramitação de Documentos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (opc.toString().equals("0")) {
            atu.atualizarProfissional(nome, form, creasp, indc);
            JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");
            try {
                preenche_jtable();
            } catch (SQLException ex) {
                Logger.getLogger(FormListarProfissional.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        txtNome.setText("");
        txtFormacao.setText("");
        txtCreasp.setText("");
        txtInscrMunicipal.setText("");

        btnConcluir.setEnabled(true);
        btnExcluir.setEnabled(false);
        btnAtualizar.setEnabled(false);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (admTec.equals(admTec)) {
            FormMenu M = new FormMenu(this, true);
            M.setVisible(true);
            M.group = admTec;
            M.acesso_user = acesso_bkp;
            dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            preenche_jtable();
        } catch (SQLException ex) {
            Logger.getLogger(FormListarProfissional.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormListarProfissional().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblProfissional;
    private javax.swing.JTextField txtCreasp;
    private javax.swing.JTextField txtFormacao;
    private javax.swing.JTextField txtInscrMunicipal;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    public void preenche_jtable() throws SQLException {

        DefaultTableModel modelo = (DefaultTableModel) tblProfissional.getModel();
        modelo.setNumRows(0);

        try {
            ResultSet resultado = bd.consultaTable("SELECT * FROM profissional ORDER BY profissional ASC");

            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
            {
                modelo.addRow(new Object[]{resultado.getInt("id"), resultado.getString("profissional")});
            }

            resultado.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar o jTable " + erro);
        }

    }
}
