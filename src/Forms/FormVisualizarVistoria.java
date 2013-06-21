package Forms;

import Classes.Pesquisa.ClassPesquisaVistoria;
import Util.AcessoBD;
import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class FormVisualizarVistoria extends javax.swing.JFrame {

    AcessoBD bd = new AcessoBD();
    ClassPesquisaVistoria pes = new ClassPesquisaVistoria();
    FormLancamentoFiscais form2;
    private int largura = 700;
    private int altura = 510;

    public FormVisualizarVistoria() {
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

    FormVisualizarVistoria(ClassPesquisaVistoria pes, FormLancamentoFiscais form) {
        initComponents();

        this.pes = pes;
        form2 = form;

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
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
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAssunto = new javax.swing.JTextArea();
        txtFiscal = new javax.swing.JTextField();
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
            ident4 = new javax.swing.text.MaskFormatter("##.###.###-#");
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
            ident5 = new javax.swing.text.MaskFormatter("##.###.###-#");
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
        jSeparator2 = new javax.swing.JSeparator();
        btnConfirmar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TrDoc - Tramitação  de Docuementos");
        setResizable(false);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel1.setText("Registros da Denúncia");

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(600, 367));

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 339));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel4.setText("Fiscal");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 220, 40, 20);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel5.setText("Atendente");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 50, 58, 20);

        txtAtendente.setFocusable(false);
        jPanel1.add(txtAtendente);
        txtAtendente.setBounds(10, 70, 190, 30);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel6.setText("Atendimento");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 50, 120, 20);

        txtAtendimento.setFocusable(false);
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

        txtDtDenuncia.setFocusable(false);
        jPanel1.add(txtDtDenuncia);
        txtDtDenuncia.setBounds(150, 20, 110, 30);

        txtAssunto.setColumns(20);
        txtAssunto.setLineWrap(true);
        txtAssunto.setRows(5);
        txtAssunto.setWrapStyleWord(true);
        txtAssunto.setFocusable(false);
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

        txtFiscal.setFocusable(false);
        jPanel1.add(txtFiscal);
        txtFiscal.setBounds(10, 240, 470, 30);

        jTabbedPane1.addTab("Dados Principais", jPanel1);

        jPanel2.setLayout(null);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel9.setText("Nome");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 0, 50, 20);

        txtDenunciante.setFocusable(false);
        jPanel2.add(txtDenunciante);
        txtDenunciante.setBounds(10, 20, 610, 30);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel10.setText("Endereço");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 50, 70, 20);

        txtEndereco1.setFocusable(false);
        jPanel2.add(txtEndereco1);
        txtEndereco1.setBounds(10, 70, 540, 30);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel11.setText("Nº");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(560, 50, 12, 20);

        txtNum1.setFocusable(false);
        jPanel2.add(txtNum1);
        txtNum1.setBounds(560, 70, 60, 30);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel12.setText("Bairro");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 150, 40, 20);

        txtBairro1.setFocusable(false);
        jPanel2.add(txtBairro1);
        txtBairro1.setBounds(10, 170, 430, 30);

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel13.setText("Quadra");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(160, 200, 42, 20);

        txtQuadra1.setFocusable(false);
        jPanel2.add(txtQuadra1);
        txtQuadra1.setBounds(160, 220, 80, 30);

        txtLoteamento1.setFocusable(false);
        jPanel2.add(txtLoteamento1);
        txtLoteamento1.setBounds(10, 220, 130, 30);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel15.setText("Loteamento");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 200, 80, 20);

        txtLote1.setFocusable(false);
        jPanel2.add(txtLote1);
        txtLote1.setBounds(260, 220, 50, 30);

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel16.setText("Inscrição Municipal");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(460, 150, 120, 20);

        txtInscrMunicipal1.setFocusable(false);
        jPanel2.add(txtInscrMunicipal1);
        txtInscrMunicipal1.setBounds(463, 170, 160, 30);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel14.setText("Lote");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(260, 200, 40, 20);

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel17.setText("Telefone");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(460, 100, 70, 20);

        txtTelefone1.setFocusable(false);
        jPanel2.add(txtTelefone1);
        txtTelefone1.setBounds(460, 120, 160, 30);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel8.setText("Complemento");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 100, 110, 20);

        txtComplemento1.setFocusable(false);
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

        txtQuadra2.setFocusable(false);
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

        txtLote2.setFocusable(false);
        jPanel3.add(txtLote2);
        txtLote2.setBounds(560, 120, 60, 30);

        txtInscrMunicipal2.setFocusable(false);
        jPanel3.add(txtInscrMunicipal2);
        txtInscrMunicipal2.setBounds(460, 20, 160, 30);

        txtBairro2.setFocusable(false);
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

        txtDenunciado.setFocusable(false);
        jPanel3.add(txtDenunciado);
        txtDenunciado.setBounds(10, 20, 440, 30);

        txtEndereco2.setFocusable(false);
        jPanel3.add(txtEndereco2);
        txtEndereco2.setBounds(10, 70, 540, 30);

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 12));
        jLabel29.setText("Nº");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(560, 50, 20, 20);

        txtNum2.setFocusable(false);
        jPanel3.add(txtNum2);
        txtNum2.setBounds(560, 70, 60, 30);

        txtReferencia.setColumns(20);
        txtReferencia.setLineWrap(true);
        txtReferencia.setRows(5);
        txtReferencia.setWrapStyleWord(true);
        txtReferencia.setFocusable(false);
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
        txtDenuncia.setFocusable(false);
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

        txtLoteamento2.setFocusable(false);
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

        txtDtRetorno.setFocusable(false);
        jPanel4.add(txtDtRetorno);
        txtDtRetorno.setBounds(30, 310, 100, 30);

        txtProvidencias.setColumns(20);
        txtProvidencias.setLineWrap(true);
        txtProvidencias.setRows(5);
        txtProvidencias.setWrapStyleWord(true);
        txtProvidencias.setFocusable(false);
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

        btnConfirmar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/vistoria.png"))); // NOI18N
        btnConfirmar.setText("Confirmar registro");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 399, Short.MAX_VALUE)
                        .addComponent(btnConfirmar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pes.getId();

        //dados principais
        String dt = pes.pesquisaDataDenuncia();
        txtDtDenuncia.setText(dt);
        String atendente = pes.pesquisaAtendente();
        txtAtendente.setText(atendente);
        String atendimento = pes.pesquisaAtendimento();
        txtAtendimento.setText(atendimento);
        String fiscal = pes.pesquisaFiscal();
        txtFiscal.setText(fiscal);
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
        txtEndereco2.setText(end2);;
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
    }//GEN-LAST:event_formWindowOpened

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        form2.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
       form2.xnome_corresp = txtDenunciado.getText();
       form2.xenderc_corresp = txtEndereco2.getText();
       form2.xbairro_corresp  = txtBairro2.getText();
       form2.xnum_corresp = txtNum2.getText();
       form2.xcomple_corresp = txtReferencia.getText();
       form2.xender_infrac = txtEndereco2.getText();
       form2.xnum_infrac = txtNum2.getText();
       form2.xlote_infrac = txtLote2.getText();
       form2.xloteame_infrac = txtLoteamento2.getText();
       form2.xquadra_infrac = txtQuadra2.getText();
       form2.xdenunc_infrac = txtDenuncia.getText();
       form2.xdata_retorno = txtDtRetorno.getText();
       form2.xinscmun_infrac = txtInscrMunicipal2.getText();
       form2.xprovidencias = txtProvidencias.getText();
       form2.xfiscais = txtFiscal.getText();
       form2.xdata_denuncia = txtDtDenuncia.getText();
       form2.xnum_denuncia = txtNum.getText();
       form2.loadData();
       form2.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormVisualizarVistoria().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
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
    private javax.swing.JTextField txtFiscal;
    private javax.swing.JTextField txtInscrMunicipal1;
    private javax.swing.JTextField txtInscrMunicipal2;
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
}
