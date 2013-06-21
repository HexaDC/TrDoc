//Criado em 27-12-2010 Jennifer de Melo Lima
package Forms;

import User.ClassVerificaSenha;
import Util.AcessoBD;
import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class FormMenu extends javax.swing.JFrame {

    AcessoBD bd;
    public String group;
    public String[] acesso_str = new String[18];
    public boolean[] acesso_user = new boolean[18];
    ClassVerificaSenha ver;
    private int largura = 461;
    private int altura = 163;

    public FormMenu() {
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

    FormMenu(JFrame aThis, boolean b) {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAdmin = new javax.swing.JMenu();
        admTecnico = new javax.swing.JMenuItem();
        admAssinatura = new javax.swing.JMenuItem();
        admEncerrar = new javax.swing.JMenuItem();
        mnuTramitacao = new javax.swing.JMenu();
        trmComunique = new javax.swing.JMenuItem();
        trmHabite = new javax.swing.JMenuItem();
        trmAlvara = new javax.swing.JMenuItem();
        trmProtocolo = new javax.swing.JMenuItem();
        trmLancamento = new javax.swing.JMenuItem();
        mnuProcessos = new javax.swing.JMenu();
        proPesquisa = new javax.swing.JMenuItem();
        proAdicionar = new javax.swing.JMenuItem();
        proAtualizar = new javax.swing.JMenuItem();
        proExcluir = new javax.swing.JMenuItem();
        mnuEmissao = new javax.swing.JMenu();
        emiComunique = new javax.swing.JMenuItem();
        emiHabite = new javax.swing.JMenuItem();
        emiAlvara = new javax.swing.JMenuItem();
        emiGuia = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TRDoc - Tramitação de Documentos");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 204));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));

        mnuAdmin.setBackground(new java.awt.Color(204, 204, 204));
        mnuAdmin.setText("Administração");
        mnuAdmin.setFont(new java.awt.Font("SansSerif", 1, 12));

        admTecnico.setFont(new java.awt.Font("SansSerif", 1, 12));
        admTecnico.setForeground(new java.awt.Color(51, 51, 51));
        admTecnico.setText("Técnicos da Secretaria");
        admTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admTecnicoActionPerformed(evt);
            }
        });
        mnuAdmin.add(admTecnico);

        admAssinatura.setFont(new java.awt.Font("SansSerif", 1, 12));
        admAssinatura.setForeground(new java.awt.Color(51, 51, 51));
        admAssinatura.setText("Assinatura Secretário");
        admAssinatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admAssinaturaActionPerformed(evt);
            }
        });
        mnuAdmin.add(admAssinatura);

        admEncerrar.setFont(new java.awt.Font("SansSerif", 1, 12));
        admEncerrar.setText("Encerrar Sessão");
        admEncerrar.setOpaque(true);
        admEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admEncerrarActionPerformed(evt);
            }
        });
        mnuAdmin.add(admEncerrar);

        jMenuBar1.add(mnuAdmin);

        mnuTramitacao.setBackground(new java.awt.Color(204, 204, 204));
        mnuTramitacao.setText("Tramitação");
        mnuTramitacao.setFont(new java.awt.Font("SansSerif", 1, 12));

        trmComunique.setFont(new java.awt.Font("SansSerif", 1, 12));
        trmComunique.setForeground(new java.awt.Color(51, 51, 51));
        trmComunique.setText("Comunique-se");
        trmComunique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trmComuniqueActionPerformed(evt);
            }
        });
        mnuTramitacao.add(trmComunique);

        trmHabite.setFont(new java.awt.Font("SansSerif", 1, 12));
        trmHabite.setForeground(new java.awt.Color(51, 51, 51));
        trmHabite.setText("Habite-se");
        trmHabite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trmHabiteActionPerformed(evt);
            }
        });
        mnuTramitacao.add(trmHabite);

        trmAlvara.setFont(new java.awt.Font("SansSerif", 1, 12));
        trmAlvara.setForeground(new java.awt.Color(51, 51, 51));
        trmAlvara.setText("Alvarás");
        trmAlvara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trmAlvaraActionPerformed(evt);
            }
        });
        mnuTramitacao.add(trmAlvara);

        trmProtocolo.setFont(new java.awt.Font("SansSerif", 1, 12));
        trmProtocolo.setForeground(new java.awt.Color(51, 51, 51));
        trmProtocolo.setText("Protocolo de Denúncia");
        trmProtocolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trmProtocoloActionPerformed(evt);
            }
        });
        mnuTramitacao.add(trmProtocolo);

        trmLancamento.setFont(new java.awt.Font("SansSerif", 1, 12));
        trmLancamento.setForeground(new java.awt.Color(51, 51, 51));
        trmLancamento.setText("Lançamento de Fiscais");
        trmLancamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trmLancamentoActionPerformed(evt);
            }
        });
        mnuTramitacao.add(trmLancamento);

        jMenuBar1.add(mnuTramitacao);

        mnuProcessos.setBackground(new java.awt.Color(204, 204, 204));
        mnuProcessos.setText("Processos");
        mnuProcessos.setFont(new java.awt.Font("SansSerif", 1, 12));

        proPesquisa.setFont(new java.awt.Font("SansSerif", 1, 12));
        proPesquisa.setForeground(new java.awt.Color(51, 51, 51));
        proPesquisa.setText("Pesquisar");
        proPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proPesquisaActionPerformed(evt);
            }
        });
        mnuProcessos.add(proPesquisa);

        proAdicionar.setFont(new java.awt.Font("SansSerif", 1, 12));
        proAdicionar.setForeground(new java.awt.Color(51, 51, 51));
        proAdicionar.setText("Adicionar");
        proAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proAdicionarActionPerformed(evt);
            }
        });
        mnuProcessos.add(proAdicionar);

        proAtualizar.setFont(new java.awt.Font("SansSerif", 1, 12));
        proAtualizar.setForeground(new java.awt.Color(51, 51, 51));
        proAtualizar.setText("Atualizar");
        proAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proAtualizarActionPerformed(evt);
            }
        });
        mnuProcessos.add(proAtualizar);

        proExcluir.setFont(new java.awt.Font("SansSerif", 1, 12));
        proExcluir.setForeground(new java.awt.Color(51, 51, 51));
        proExcluir.setText("Excluir");
        proExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proExcluirActionPerformed(evt);
            }
        });
        mnuProcessos.add(proExcluir);

        jMenuBar1.add(mnuProcessos);

        mnuEmissao.setBackground(new java.awt.Color(204, 204, 204));
        mnuEmissao.setText("Emissão");
        mnuEmissao.setFont(new java.awt.Font("SansSerif", 1, 12));

        emiComunique.setFont(new java.awt.Font("SansSerif", 1, 12));
        emiComunique.setForeground(new java.awt.Color(51, 51, 51));
        emiComunique.setText("Comunique-se");
        emiComunique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emiComuniqueActionPerformed(evt);
            }
        });
        mnuEmissao.add(emiComunique);

        emiHabite.setFont(new java.awt.Font("SansSerif", 1, 12));
        emiHabite.setForeground(new java.awt.Color(51, 51, 51));
        emiHabite.setText("Habite-se");
        emiHabite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emiHabiteActionPerformed(evt);
            }
        });
        mnuEmissao.add(emiHabite);

        emiAlvara.setFont(new java.awt.Font("SansSerif", 1, 12));
        emiAlvara.setForeground(new java.awt.Color(51, 51, 51));
        emiAlvara.setText("Alvarás");
        emiAlvara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emiAlvaraActionPerformed(evt);
            }
        });
        mnuEmissao.add(emiAlvara);

        emiGuia.setFont(new java.awt.Font("SansSerif", 1, 12));
        emiGuia.setForeground(new java.awt.Color(51, 51, 51));
        emiGuia.setText("Guia de Emplacamento");
        emiGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emiGuiaActionPerformed(evt);
            }
        });
        mnuEmissao.add(emiGuia);

        jMenuBar1.add(mnuEmissao);

        setJMenuBar(jMenuBar1);
    }// </editor-fold>//GEN-END:initComponents

    private void proAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proAdicionarActionPerformed
        // Formulário de tramitacao
        if (group.equals(group)) {
            FormCadastrarTramitProcesso T = new FormCadastrarTramitProcesso(this, true);
            T.setVisible(true);
            T.proAd = group;
            T.acesso_bkp = acesso_user;
            dispose();
        }
    }//GEN-LAST:event_proAdicionarActionPerformed

    private void trmComuniqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trmComuniqueActionPerformed
        //formulário de Verificação de processo
        if (group.equals(group)) {
            FormCadastrarComunique V = new FormCadastrarComunique();
            V.setVisible(true);
            V.trmCom = group;
            V.acesso_bkp = acesso_user;
            dispose();
        }
    }//GEN-LAST:event_trmComuniqueActionPerformed

    private void trmAlvaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trmAlvaraActionPerformed
        //formulário de Verificação de processo
        if (group.equals(group)) {
            FormCadastrarAlvara V = new FormCadastrarAlvara(this, true);
            V.setVisible(true);
            V.trmAlv = group;
            V.acesso_bkp = acesso_user;
            dispose();
        }
    }//GEN-LAST:event_trmAlvaraActionPerformed

    private void trmHabiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trmHabiteActionPerformed
        //formulário de Verificação de processo
        if (group.equals(group)) {
            FormCadastrarHabite V = new FormCadastrarHabite(this, true);
            V.setVisible(true);
            V.trmHab = group;
            V.acesso_bkp = acesso_user;
            dispose();
        }
    }//GEN-LAST:event_trmHabiteActionPerformed

    private void trmProtocoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trmProtocoloActionPerformed
        if (group.equals(group)) {
            FormCadastrarVistoria C = new FormCadastrarVistoria(this, true);
            C.setVisible(true);
            C.trmVis = group;
            C.acesso_bkp = acesso_user;
            dispose();
        }
    }//GEN-LAST:event_trmProtocoloActionPerformed

    private void proPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proPesquisaActionPerformed
        if (group.equals(group)) {
            FormVisualizarRegistros P = new FormVisualizarRegistros();
            P.setVisible(true);
            P.proPes = group;
            P.acesso_bkp = acesso_user;
            dispose();
        }
    }//GEN-LAST:event_proPesquisaActionPerformed

    private void emiComuniqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emiComuniqueActionPerformed
        if (group.equals(group)) {
            FormRelatorioComunique R = new FormRelatorioComunique(this, true);
            R.setVisible(true);
            R.emiCom = group;
            R.acesso_bkp = acesso_user;
            dispose();
        }
    }//GEN-LAST:event_emiComuniqueActionPerformed

    private void proAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proAtualizarActionPerformed
        if (group.equals(group)) {
            FormAtualizarRegistros A = new FormAtualizarRegistros(this, true);
            A.setVisible(true);
            A.proAtu = group;
            A.acesso_bkp = acesso_user;
            dispose();
        }
    }//GEN-LAST:event_proAtualizarActionPerformed

    private void emiHabiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emiHabiteActionPerformed
        if (group.equals(group)) {
            FormRelatorioHabite L = new FormRelatorioHabite(this, true);
            L.setVisible(true);
            L.emiHab = group;
            L.acesso_bkp = acesso_user;
            dispose();
        }
    }//GEN-LAST:event_emiHabiteActionPerformed

    private void admEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admEncerrarActionPerformed
        //Fecha o sistema
        FormLogin L = new FormLogin();
        L.setVisible(true);
        dispose();

    }//GEN-LAST:event_admEncerrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*verifica o tipo de acesso ao sistema de cada usuário*/
        if (group.equals("0")) {
            mnuAdmin.setEnabled(true);
            admTecnico.setEnabled(true);
            admAssinatura.setEnabled(true);
            admEncerrar.setEnabled(true);
            mnuTramitacao.setEnabled(true);
            trmComunique.setEnabled(true);
            trmHabite.setEnabled(true);
            trmAlvara.setEnabled(true);
            trmProtocolo.setEnabled(true);
            trmLancamento.setEnabled(true);
            mnuProcessos.setEnabled(true);
            proPesquisa.setEnabled(true);
            proAdicionar.setEnabled(true);
            proAtualizar.setEnabled(true);
            proExcluir.setEnabled(true);
            mnuEmissao.setEnabled(true);
            emiComunique.setEnabled(true);
            emiHabite.setEnabled(true);
            emiAlvara.setEnabled(true);
            emiGuia.setEnabled(true);
        } else {
            if (group.equals("1")) {
                mnuAdmin.setEnabled(true);
                admTecnico.setEnabled(acesso_user[0]);
                admAssinatura.setEnabled(acesso_user[1]);
                admEncerrar.setEnabled(acesso_user[2]);
                mnuTramitacao.setEnabled(true);
                trmComunique.setEnabled(acesso_user[3]);
                trmHabite.setEnabled(acesso_user[4]);
                trmAlvara.setEnabled(acesso_user[5]);
                trmProtocolo.setEnabled(acesso_user[6]);
                trmLancamento.setEnabled(acesso_user[16]);
                mnuProcessos.setEnabled(true);
                proPesquisa.setEnabled(acesso_user[7]);
                proAdicionar.setEnabled(acesso_user[8]);
                proAtualizar.setEnabled(acesso_user[9]);
                proExcluir.setEnabled(acesso_user[10]);
                mnuEmissao.setEnabled(true);
                emiComunique.setEnabled(acesso_user[11]);
                emiHabite.setEnabled(acesso_user[12]);
                emiAlvara.setEnabled(acesso_user[13]);
                emiGuia.setEnabled(acesso_user[14]);
            } else {
                if (group.equals("2")) {
                    mnuAdmin.setEnabled(true);
                    admTecnico.setEnabled(acesso_user[0]);
                    admAssinatura.setEnabled(acesso_user[1]);
                    admEncerrar.setEnabled(acesso_user[2]);
                    mnuTramitacao.setEnabled(true);
                    trmComunique.setEnabled(acesso_user[3]);
                    trmHabite.setEnabled(acesso_user[4]);
                    trmAlvara.setEnabled(acesso_user[5]);
                    trmProtocolo.setEnabled(acesso_user[6]);
                    trmLancamento.setEnabled(acesso_user[16]);
                    mnuProcessos.setEnabled(true);
                    proPesquisa.setEnabled(acesso_user[7]);
                    proAdicionar.setEnabled(acesso_user[8]);
                    proAtualizar.setEnabled(acesso_user[9]);
                    proExcluir.setEnabled(acesso_user[10]);
                    mnuEmissao.setEnabled(true);
                    emiComunique.setEnabled(acesso_user[11]);
                    emiHabite.setEnabled(acesso_user[12]);
                    emiAlvara.setEnabled(acesso_user[13]);
                    emiGuia.setEnabled(acesso_user[14]);
                } else {
                    if (group.equals("3")) {
                        mnuAdmin.setEnabled(true);
                        admTecnico.setEnabled(acesso_user[0]);
                        admAssinatura.setEnabled(acesso_user[1]);
                        admEncerrar.setEnabled(acesso_user[2]);
                        mnuTramitacao.setEnabled(true);
                        trmComunique.setEnabled(acesso_user[3]);
                        trmHabite.setEnabled(acesso_user[4]);
                        trmAlvara.setEnabled(acesso_user[5]);
                        trmProtocolo.setEnabled(acesso_user[6]);
                        trmLancamento.setEnabled(acesso_user[16]);
                        mnuProcessos.setEnabled(true);
                        proPesquisa.setEnabled(acesso_user[7]);
                        proAdicionar.setEnabled(acesso_user[8]);
                        proAtualizar.setEnabled(acesso_user[9]);
                        proExcluir.setEnabled(acesso_user[10]);
                        mnuEmissao.setEnabled(true);
                        emiComunique.setEnabled(acesso_user[11]);
                        emiHabite.setEnabled(acesso_user[12]);
                        emiAlvara.setEnabled(acesso_user[13]);
                        emiGuia.setEnabled(acesso_user[14]);
                    } else {
                        if (group.equals("4")) {
                            mnuAdmin.setEnabled(true);
                            admTecnico.setEnabled(acesso_user[0]);
                            admAssinatura.setEnabled(acesso_user[1]);
                            admEncerrar.setEnabled(acesso_user[2]);
                            mnuTramitacao.setEnabled(true);
                            trmComunique.setEnabled(acesso_user[3]);
                            trmHabite.setEnabled(acesso_user[4]);
                            trmAlvara.setEnabled(acesso_user[5]);
                            trmProtocolo.setEnabled(acesso_user[6]);
                            trmLancamento.setEnabled(acesso_user[16]);
                            mnuProcessos.setEnabled(true);
                            proPesquisa.setEnabled(acesso_user[7]);
                            proAdicionar.setEnabled(acesso_user[8]);
                            proAtualizar.setEnabled(acesso_user[9]);
                            proExcluir.setEnabled(acesso_user[10]);
                            mnuEmissao.setEnabled(true);
                            emiComunique.setEnabled(acesso_user[11]);
                            emiHabite.setEnabled(acesso_user[12]);
                            emiAlvara.setEnabled(acesso_user[13]);
                            emiGuia.setEnabled(acesso_user[14]);
                        } else {
                            mnuAdmin.setEnabled(true);
                            admTecnico.setEnabled(false);
                            admAssinatura.setEnabled(false);
                            admEncerrar.setEnabled(true);
                            mnuTramitacao.setEnabled(false);
                            trmComunique.setEnabled(false);
                            trmHabite.setEnabled(false);
                            trmAlvara.setEnabled(false);
                            trmProtocolo.setEnabled(false);
                            trmLancamento.setEnabled(false);
                            mnuProcessos.setEnabled(false);
                            proPesquisa.setEnabled(false);
                            proAdicionar.setEnabled(false);
                            proAtualizar.setEnabled(false);
                            proExcluir.setEnabled(false);
                            mnuEmissao.setEnabled(false);
                            emiComunique.setEnabled(false);
                            emiHabite.setEnabled(false);
                            emiAlvara.setEnabled(false);
                            emiGuia.setEnabled(false);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void emiGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emiGuiaActionPerformed
        if (group.equals(group)) {
            FormCadastrarNumeracao L = new FormCadastrarNumeracao(this, true);
            L.setVisible(true);
            L.emiGuia = group;
            L.acesso_bkp = acesso_user;
            dispose();
        }
    }//GEN-LAST:event_emiGuiaActionPerformed

    private void emiAlvaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emiAlvaraActionPerformed
        if (group.equals(group)) {
            FormRelatorioAlvara L = new FormRelatorioAlvara(this, true);
            L.setVisible(true);
            L.emiAlv = group;
            L.acesso_bkp = acesso_user;
            dispose();
        }
    }//GEN-LAST:event_emiAlvaraActionPerformed

    private void admTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admTecnicoActionPerformed
        if (group.equals(group)) {
            FormListarProfissional P = new FormListarProfissional(this, true);
            P.setVisible(true);
            P.admTec = group;
            P.acesso_bkp = acesso_user;
            dispose();
        }
    }//GEN-LAST:event_admTecnicoActionPerformed

    private void proExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proExcluirActionPerformed
        if (group.equals(group)) {
            FormExcluirRegistros A = new FormExcluirRegistros(this, true);
            A.setVisible(true);
            A.proExc = group;
            A.acesso_bkp = acesso_user;
            dispose();
        }
    }//GEN-LAST:event_proExcluirActionPerformed

    private void admAssinaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admAssinaturaActionPerformed
        if (group.equals(group)) {
            FormListarAssinatura P = new FormListarAssinatura(this, true);
            P.setVisible(true);
            P.admAss = group;
            P.acesso_bkp = acesso_user;
            dispose();
        }
    }//GEN-LAST:event_admAssinaturaActionPerformed

    private void trmLancamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trmLancamentoActionPerformed
        if (group.equals(group)) {
            FormLancamentoFiscais P = new FormLancamentoFiscais(this, true);
            P.setVisible(true);
            P.lanfiscal = group;
            P.acesso_bkp = acesso_user;
            dispose();
        }
}//GEN-LAST:event_trmLancamentoActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem admAssinatura;
    private javax.swing.JMenuItem admEncerrar;
    private javax.swing.JMenuItem admTecnico;
    private javax.swing.JMenuItem emiAlvara;
    private javax.swing.JMenuItem emiComunique;
    private javax.swing.JMenuItem emiGuia;
    private javax.swing.JMenuItem emiHabite;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuAdmin;
    private javax.swing.JMenu mnuEmissao;
    private javax.swing.JMenu mnuProcessos;
    private javax.swing.JMenu mnuTramitacao;
    private javax.swing.JMenuItem proAdicionar;
    private javax.swing.JMenuItem proAtualizar;
    private javax.swing.JMenuItem proExcluir;
    private javax.swing.JMenuItem proPesquisa;
    private javax.swing.JMenuItem trmAlvara;
    private javax.swing.JMenuItem trmComunique;
    private javax.swing.JMenuItem trmHabite;
    private javax.swing.JMenuItem trmLancamento;
    private javax.swing.JMenuItem trmProtocolo;
    // End of variables declaration//GEN-END:variables
}
