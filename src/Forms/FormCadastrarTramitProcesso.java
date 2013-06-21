//criado em 27-12-2010
package Forms;

import Classes.Cadastra.ClassCadastrarProcesso;
import Classes.Cadastra.ClassCadastrarAndamento;
import Classes.Pesquisa.ClassPesquisaDadosRequerente;
import Classes.Pesquisa.ClassSelecionarId;
import User.ClassVerificaSenha;
import Util.AcessoBD;
import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class FormCadastrarTramitProcesso extends javax.swing.JFrame {

    AcessoBD bd;
    ClassCadastrarProcesso cadp = new ClassCadastrarProcesso();
    ClassCadastrarAndamento cada = new ClassCadastrarAndamento();
    ClassSelecionarId sel = new ClassSelecionarId();
    ClassPesquisaDadosRequerente pes = new ClassPesquisaDadosRequerente();
    ClassVerificaSenha ver;
    public boolean[] acesso_bkp;
    public String proAd;
    private int largura = 751;
    private int altura = 573;

    public FormCadastrarTramitProcesso() {
        initComponents();
        btnConcluir.setEnabled(false);
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

    FormCadastrarTramitProcesso(FormMenu aThis, boolean b) {
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

        jLabel8 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtAssunto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtLoteamento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtQuadra = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        javax.swing.text.MaskFormatter ident4 = null;
        try {
            ident4 = new javax.swing.text.MaskFormatter("##.###.###-*");
            ident4.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtIdentCadastral = new javax.swing.JFormattedTextField(ident4);
        btnConcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtProcesso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtRequerente = new javax.swing.JTextField();
        javax.swing.text.MaskFormatter ano_proc = null;
        try {
            ano_proc = new javax.swing.text.MaskFormatter("##");}
        catch (java.text.ParseException exc) {}
        txtAno = new javax.swing.JFormattedTextField(ano_proc);
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter entrada3 = null;
        try {
            entrada3 = new javax.swing.text.MaskFormatter("##/##/####");
            entrada3.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDataEntrada = new javax.swing.JFormattedTextField(entrada3);
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnVoltar = new javax.swing.JButton();
        comboExpedicao = new javax.swing.JComboBox();

        javax.swing.text.MaskFormatter saida_and = null;
        try {
            saida_and = new javax.swing.text.MaskFormatter("##/##/####");
            saida_and.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtSaidaAndamento = 
        new javax.swing.JFormattedTextField(saida_and);
        ;
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        javax.swing.text.MaskFormatter dt_andamento = null;
        try {
            dt_andamento = new javax.swing.text.MaskFormatter("##/##/####");
            dt_andamento.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDataEntradaAndamento = new javax.swing.JFormattedTextField(dt_andamento);

        javax.swing.text.MaskFormatter arquivado_and = null;
        try {
            arquivado_and = new javax.swing.text.MaskFormatter("##/##/####");
            arquivado_and.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtDataArquivado = 
        new javax.swing.JFormattedTextField(arquivado_and);
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAndamento = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TRDoc - Tramitação de Documentos");
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel8.setText("Bairro");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(440, 170, 35, 20);
        getContentPane().add(txtBairro);
        txtBairro.setBounds(440, 190, 300, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel6.setText("Endereço");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 170, 54, 20);
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(10, 190, 420, 30);
        getContentPane().add(txtAssunto);
        txtAssunto.setBounds(430, 130, 310, 30);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel11.setText("Quadra");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(150, 230, 42, 20);
        getContentPane().add(txtLote);
        txtLote.setBounds(260, 250, 50, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel10.setText("Lote");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(260, 230, 25, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Tramitação do Processo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 145, 15);
        getContentPane().add(txtLoteamento);
        txtLoteamento.setBounds(10, 250, 120, 30);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel9.setText("Loteamento");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 230, 68, 20);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel12.setText("Identificação Cadastral");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(330, 230, 140, 20);
        getContentPane().add(txtQuadra);
        txtQuadra.setBounds(150, 250, 90, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 520, 730, 10);
        getContentPane().add(txtIdentCadastral);
        txtIdentCadastral.setBounds(330, 250, 160, 30);

        btnConcluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/concluir.png"))); // NOI18N
        btnConcluir.setText("Incluir Processo");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConcluir);
        btnConcluir.setBounds(587, 530, 150, 30);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel2.setText("N° do Processo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 40, 100, 20);

        txtProcesso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtProcessoMouseExited(evt);
            }
        });
        txtProcesso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProcessoFocusLost(evt);
            }
        });
        getContentPane().add(txtProcesso);
        txtProcesso.setBounds(10, 60, 100, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel3.setText("Data de Entrada");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 40, 100, 20);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel7.setText("Assunto");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(430, 110, 47, 20);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(10, 320, 730, 20);
        getContentPane().add(txtRequerente);
        txtRequerente.setBounds(10, 130, 410, 30);

        txtAno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAnoFocusLost(evt);
            }
        });
        getContentPane().add(txtAno);
        txtAno.setBounds(130, 60, 40, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel4.setText("Ano");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 40, 22, 20);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("Requerente");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 110, 66, 20);
        getContentPane().add(txtDataEntrada);
        txtDataEntrada.setBounds(190, 60, 100, 30);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(10, 290, 730, 10);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setText("Andamentos");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 300, 78, 15);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(10, 30, 730, 20);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(10, 100, 730, 20);

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

        comboExpedicao.setFont(new java.awt.Font("SansSerif", 1, 12));
        comboExpedicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALVARÁS", "COMUNIQUE-SE", "HABITE-SE", "OUTROS" }));
        comboExpedicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboExpedicaoActionPerformed(evt);
            }
        });
        getContentPane().add(comboExpedicao);
        comboExpedicao.setBounds(130, 350, 130, 28);
        getContentPane().add(txtSaidaAndamento);
        txtSaidaAndamento.setBounds(300, 350, 90, 30);

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel18.setText("Expedição");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(140, 330, 70, 20);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel15.setText("Andamento:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 390, 68, 20);
        getContentPane().add(txtDataEntradaAndamento);
        txtDataEntradaAndamento.setBounds(10, 350, 90, 30);
        getContentPane().add(txtDataArquivado);
        txtDataArquivado.setBounds(440, 350, 90, 30);

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel17.setText("Arquivado");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(450, 330, 70, 20);

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel16.setText("Data Saída");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(310, 330, 80, 20);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel14.setText("Data Entrada");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 330, 90, 20);

        txtAndamento.setColumns(20);
        txtAndamento.setRows(5);
        jScrollPane1.setViewportView(txtAndamento);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 410, 730, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        //realiza o cadastro principal
        String processo = txtProcesso.getText();
        int p = Integer.valueOf(processo);

        String ano = txtAno.getText();
        String dt_entrada = txtDataEntrada.getText().toUpperCase();
        String requerente = txtRequerente.getText().toUpperCase();
        String assunto = txtAssunto.getText().toUpperCase();
        String endereco = txtEndereco.getText().toUpperCase();
        String bairro = txtBairro.getText().toUpperCase();
        String loteamento = txtLoteamento.getText().toUpperCase();
        String lote = txtLote.getText().toUpperCase();
        String quadra = txtQuadra.getText().toUpperCase();
        String ident = txtIdentCadastral.getText().toUpperCase();

        cadp.cadastrarProcesso(p, ano, dt_entrada, requerente, assunto, endereco, bairro, loteamento, lote, quadra, ident);


        //cadastrar andamento
        int id = sel.selecionarIdProcesso();
        cada.setId(id);
        String dt_entrada_and = txtDataEntradaAndamento.getText().toUpperCase();
        String dt_saida_and = txtSaidaAndamento.getText().toUpperCase();
        String arquivado = txtDataArquivado.getText().toUpperCase();
        String andamento = txtAndamento.getText().toUpperCase();
        String espedicao = comboExpedicao.getSelectedItem().toString();

        cada.cadastrarAndamento(andamento, dt_entrada_and, dt_saida_and, arquivado, espedicao);
        JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");

        txtProcesso.setText("");
        txtAno.setText("");
        txtDataEntrada.setText("");
        txtRequerente.setText("");
        txtAssunto.setText("");
        txtEndereco.setText("");
        txtBairro.setText("");
        txtLoteamento.setText("");
        txtLote.setText("");
        txtQuadra.setText("");
        txtIdentCadastral.setText("");

        txtDataEntradaAndamento.setText("");
        txtSaidaAndamento.setText("");
        txtDataArquivado.setText("");
        txtAndamento.setText("");
}//GEN-LAST:event_btnConcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (proAd.equals(proAd)) {

            FormMenu M = new FormMenu(this, true);
            M.setVisible(true);
            M.group = proAd;
            M.acesso_user = acesso_bkp;
            dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtProcessoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProcessoMouseExited
       
    }//GEN-LAST:event_txtProcessoMouseExited

    private void txtProcessoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProcessoFocusLost
       
    }//GEN-LAST:event_txtProcessoFocusLost

    private void txtAnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnoFocusLost
        String pro = txtProcesso.getText();
        String ano = txtAno.getText();
        int n = Integer.valueOf(pro);
        int nn = Integer.valueOf(ano);

        boolean resposta = pes.verificaCodigoProcessos(n,nn);


        if (resposta == true) {
            JOptionPane.showMessageDialog(null, "Processo já cadastrado");
            txtProcesso.setText("");
            txtAno.setText("");
            txtProcesso.requestFocus();
            btnConcluir.setEnabled(false);
           
        }
        else
        {
            btnConcluir.setEnabled(true);
        }
    }//GEN-LAST:event_txtAnoFocusLost

    private void comboExpedicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboExpedicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboExpedicaoActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormCadastrarTramitProcesso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox comboExpedicao;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextArea txtAndamento;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAssunto;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtDataArquivado;
    private javax.swing.JTextField txtDataEntrada;
    private javax.swing.JTextField txtDataEntradaAndamento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdentCadastral;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtLoteamento;
    private javax.swing.JTextField txtProcesso;
    private javax.swing.JTextField txtQuadra;
    private javax.swing.JTextField txtRequerente;
    private javax.swing.JTextField txtSaidaAndamento;
    // End of variables declaration//GEN-END:variables
}
