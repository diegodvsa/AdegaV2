package Telas;

import java.awt.Color;
import Models.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ddevesa
 */
public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        
    }
    
    /*
        @operacao
        guarda operação a ser realizada ao clicar em salvar:
        1- Cadastrar, 2-Editar    
    */    
    private int operacao = 0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFill = new javax.swing.JLayeredPane();
        pnlHome = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblDesc1 = new javax.swing.JLabel();
        pnlClientes = new javax.swing.JPanel();
        lblMenuC = new javax.swing.JLabel();
        scTbClientes = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        lblNomeC = new javax.swing.JLabel();
        txtNomeC = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();
        lblCep = new javax.swing.JLabel();
        lblLogradouro = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelarC = new javax.swing.JButton();
        lblCodigoC = new javax.swing.JLabel();
        txtCodigoC = new javax.swing.JLabel();
        sideBar = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblEsconder = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        lblRodape = new javax.swing.JLabel();
        pnlProdutos = new javax.swing.JPanel();
        lblMenuC1 = new javax.swing.JLabel();
        scTbClientes1 = new javax.swing.JScrollPane();
        tbClientes1 = new javax.swing.JTable();
        lblNomeP = new javax.swing.JLabel();
        txtNomeC1 = new javax.swing.JTextField();
        lblProdutos = new javax.swing.JLabel();
        btnSalvarP = new javax.swing.JButton();
        btnCadastrarP = new javax.swing.JButton();
        btnEditarP = new javax.swing.JButton();
        btnDeletarP = new javax.swing.JButton();
        btnCancelarP = new javax.swing.JButton();
        lblCodigoP = new javax.swing.JLabel();
        txtCodigoP = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        txtAlcoolico = new javax.swing.JComboBox<>();
        lblAlcoolico = new javax.swing.JLabel();
        lblTeor = new javax.swing.JLabel();
        txtTeor = new javax.swing.JTextField();
        lblLitragem = new javax.swing.JLabel();
        txtLitragem = new javax.swing.JTextField();
        lblUnidade = new javax.swing.JLabel();
        txtUnidade = new javax.swing.JComboBox<>();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 430));

        pnlFill.setBackground(new java.awt.Color(71, 71, 71));
        pnlFill.setMaximumSize(new java.awt.Dimension(740, 430));
        pnlFill.setOpaque(true);

        pnlHome.setBackground(new java.awt.Color(71, 71, 71));
        pnlHome.setMaximumSize(new java.awt.Dimension(740, 430));
        pnlHome.setMinimumSize(new java.awt.Dimension(740, 430));
        pnlHome.setRequestFocusEnabled(false);

        lblMenu.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(241, 196, 15));
        lblMenu.setText(">");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Ubuntu", 1, 28)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(241, 196, 15));
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Adegapp");

        lblDesc1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblDesc1.setForeground(new java.awt.Color(241, 196, 15));
        lblDesc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesc1.setText("sistema para adegas");

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu)
                .addContainerGap(736, Short.MAX_VALUE))
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(484, 484, 484)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(lblDesc1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(lblTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDesc1)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        pnlClientes.setBackground(new java.awt.Color(71, 71, 71));
        pnlClientes.setMaximumSize(new java.awt.Dimension(740, 430));
        pnlClientes.setMinimumSize(new java.awt.Dimension(740, 430));
        pnlClientes.setPreferredSize(new java.awt.Dimension(740, 430));

        lblMenuC.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        lblMenuC.setForeground(new java.awt.Color(241, 196, 15));
        lblMenuC.setText(">");
        lblMenuC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        tbClientes.setBackground(new java.awt.Color(250, 250, 250));
        tbClientes.setForeground(new java.awt.Color(71, 71, 71));
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Data de Nascimento"
            }
        ));
        tbClientes.setSelectionBackground(new java.awt.Color(71, 71, 71));
        tbClientes.setSelectionForeground(new java.awt.Color(241, 196, 15));
        tbClientes.setShowGrid(false);
        scTbClientes.setViewportView(tbClientes);
        if (tbClientes.getColumnModel().getColumnCount() > 0) {
            tbClientes.getColumnModel().getColumn(0).setMinWidth(50);
            tbClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbClientes.getColumnModel().getColumn(0).setMaxWidth(50);
            tbClientes.getColumnModel().getColumn(0).setHeaderValue("Código");
            tbClientes.getColumnModel().getColumn(1).setHeaderValue("Nome");
            tbClientes.getColumnModel().getColumn(2).setHeaderValue("Data de Nascimento");
        }

        lblNomeC.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblNomeC.setForeground(new java.awt.Color(200, 200, 200));
        lblNomeC.setText("Nome:");

        txtNomeC.setBackground(new java.awt.Color(71, 71, 71));
        txtNomeC.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtNomeC.setForeground(new java.awt.Color(250, 250, 250));
        txtNomeC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 250, 250)));
        txtNomeC.setMaximumSize(new java.awt.Dimension(280, 30));
        txtNomeC.setMinimumSize(new java.awt.Dimension(280, 30));
        txtNomeC.setPreferredSize(new java.awt.Dimension(280, 30));

        lblData.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(200, 200, 200));
        lblData.setText("Data de nascimento:");

        txtData.setBackground(new java.awt.Color(71, 71, 71));
        txtData.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 250, 250)));
        txtData.setForeground(new java.awt.Color(250, 250, 250));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtData.setMaximumSize(new java.awt.Dimension(280, 30));
        txtData.setMinimumSize(new java.awt.Dimension(280, 30));

        txtCep.setBackground(new java.awt.Color(71, 71, 71));
        txtCep.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 250, 250)));
        txtCep.setForeground(new java.awt.Color(250, 250, 250));
        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtCep.setMaximumSize(new java.awt.Dimension(280, 30));
        txtCep.setMinimumSize(new java.awt.Dimension(280, 30));

        lblCep.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblCep.setForeground(new java.awt.Color(200, 200, 200));
        lblCep.setText("CEP:");

        lblLogradouro.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblLogradouro.setForeground(new java.awt.Color(200, 200, 200));
        lblLogradouro.setText("Logradouro:");

        txtLogradouro.setBackground(new java.awt.Color(71, 71, 71));
        txtLogradouro.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtLogradouro.setForeground(new java.awt.Color(250, 250, 250));
        txtLogradouro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 250, 250)));
        txtLogradouro.setMaximumSize(new java.awt.Dimension(280, 30));
        txtLogradouro.setMinimumSize(new java.awt.Dimension(280, 30));
        txtLogradouro.setPreferredSize(new java.awt.Dimension(280, 30));

        lblNumero.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(200, 200, 200));
        lblNumero.setText("Número:");

        txtNumero.setBackground(new java.awt.Color(71, 71, 71));
        txtNumero.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(250, 250, 250));
        txtNumero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 250, 250)));
        txtNumero.setMaximumSize(new java.awt.Dimension(280, 30));
        txtNumero.setMinimumSize(new java.awt.Dimension(280, 30));
        txtNumero.setPreferredSize(new java.awt.Dimension(280, 30));

        lblBairro.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(200, 200, 200));
        lblBairro.setText("Bairro:");

        txtBairro.setBackground(new java.awt.Color(71, 71, 71));
        txtBairro.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtBairro.setForeground(new java.awt.Color(250, 250, 250));
        txtBairro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 250, 250)));
        txtBairro.setMaximumSize(new java.awt.Dimension(280, 30));
        txtBairro.setMinimumSize(new java.awt.Dimension(280, 30));
        txtBairro.setPreferredSize(new java.awt.Dimension(280, 30));

        lblCidade.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(200, 200, 200));
        lblCidade.setText("Cidade:");

        txtCidade.setBackground(new java.awt.Color(71, 71, 71));
        txtCidade.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(250, 250, 250));
        txtCidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 250, 250)));
        txtCidade.setMaximumSize(new java.awt.Dimension(280, 30));
        txtCidade.setMinimumSize(new java.awt.Dimension(280, 30));
        txtCidade.setPreferredSize(new java.awt.Dimension(280, 30));

        txtEstado.setBackground(new java.awt.Color(71, 71, 71));
        txtEstado.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(250, 250, 250));
        txtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP" }));
        txtEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 250, 250)));

        lblEstado.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(200, 200, 200));
        lblEstado.setText("Estado:");
        lblEstado.setToolTipText("");

        lblClientes.setBackground(new java.awt.Color(71, 71, 71));
        lblClientes.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblClientes.setForeground(new java.awt.Color(241, 196, 15));
        lblClientes.setText("Clientes");

        btnSalvar.setBackground(new java.awt.Color(241, 196, 15));
        btnSalvar.setForeground(new java.awt.Color(71, 71, 71));
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setEnabled(false);
        btnSalvar.setFocusPainted(false);
        btnSalvar.setPreferredSize(new java.awt.Dimension(56, 40));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(241, 196, 15));
        btnCadastrar.setForeground(new java.awt.Color(71, 71, 71));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.setPreferredSize(new java.awt.Dimension(56, 40));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(241, 196, 15));
        btnEditar.setForeground(new java.awt.Color(71, 71, 71));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.setPreferredSize(new java.awt.Dimension(56, 40));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(241, 196, 15));
        btnDeletar.setForeground(new java.awt.Color(71, 71, 71));
        btnDeletar.setText("Deletar");
        btnDeletar.setToolTipText("");
        btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletar.setFocusPainted(false);
        btnDeletar.setPreferredSize(new java.awt.Dimension(56, 40));

        btnCancelarC.setBackground(new java.awt.Color(241, 196, 15));
        btnCancelarC.setForeground(new java.awt.Color(71, 71, 71));
        btnCancelarC.setText("Cancelar");
        btnCancelarC.setToolTipText("");
        btnCancelarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarC.setEnabled(false);
        btnCancelarC.setFocusPainted(false);
        btnCancelarC.setPreferredSize(new java.awt.Dimension(56, 40));
        btnCancelarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCActionPerformed(evt);
            }
        });

        lblCodigoC.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblCodigoC.setForeground(new java.awt.Color(200, 200, 200));
        lblCodigoC.setText("Código:");

        txtCodigoC.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        txtCodigoC.setForeground(new java.awt.Color(200, 200, 200));
        txtCodigoC.setText("0");

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClientesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblClientes)
                .addGap(117, 117, 117))
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlClientesLayout.createSequentialGroup()
                                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlClientesLayout.createSequentialGroup()
                                        .addComponent(lblData)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCep))
                                    .addGroup(pnlClientesLayout.createSequentialGroup()
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblLogradouro)
                                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlClientesLayout.createSequentialGroup()
                                        .addComponent(lblNumero)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblBairro))
                                    .addGroup(pnlClientesLayout.createSequentialGroup()
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlClientesLayout.createSequentialGroup()
                                        .addComponent(lblCidade)
                                        .addGap(168, 168, 168)
                                        .addComponent(lblEstado))
                                    .addGroup(pnlClientesLayout.createSequentialGroup()
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlClientesLayout.createSequentialGroup()
                                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCodigoC)
                                            .addComponent(txtCodigoC))
                                        .addGap(31, 31, 31)
                                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNomeC)
                                            .addComponent(txtNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(scTbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlClientesLayout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelarC, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblMenuC)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addComponent(lblMenuC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeC)
                            .addComponent(lblCodigoC))
                        .addGap(6, 6, 6)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoC))
                        .addGap(6, 6, 6)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(lblCep))
                        .addGap(6, 6, 6)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(lblLogradouro)
                        .addGap(6, 6, 6)
                        .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero)
                            .addComponent(lblBairro))
                        .addGap(6, 6, 6)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCidade)
                            .addComponent(lblEstado))
                        .addGap(6, 6, 6)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(scTbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        sideBar.setBackground(new java.awt.Color(241, 196, 15));

        lblTitulo.setFont(new java.awt.Font("Ubuntu", 1, 28)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(71, 71, 71));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Adegapp");

        lblDesc.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblDesc.setForeground(new java.awt.Color(120, 120, 120));
        lblDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesc.setText("sistema para adegas");

        lblEsconder.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        lblEsconder.setForeground(new java.awt.Color(71, 71, 71));
        lblEsconder.setText("<");
        lblEsconder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEsconder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEsconderMouseClicked(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(241, 196, 15));
        btnClientes.setForeground(new java.awt.Color(71, 71, 71));
        btnClientes.setText("Clientes");
        btnClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(71, 71, 71)));
        btnClientes.setFocusPainted(false);
        btnClientes.setMaximumSize(new java.awt.Dimension(55, 35));
        btnClientes.setMinimumSize(new java.awt.Dimension(55, 35));
        btnClientes.setOpaque(true);
        btnClientes.setPreferredSize(new java.awt.Dimension(55, 35));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSExited(evt);
            }
        });
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProdutos.setBackground(new java.awt.Color(241, 196, 15));
        btnProdutos.setForeground(new java.awt.Color(71, 71, 71));
        btnProdutos.setText("Produtos");
        btnProdutos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(71, 71, 71)));
        btnProdutos.setFocusPainted(false);
        btnProdutos.setMaximumSize(new java.awt.Dimension(55, 35));
        btnProdutos.setMinimumSize(new java.awt.Dimension(55, 35));
        btnProdutos.setOpaque(true);
        btnProdutos.setPreferredSize(new java.awt.Dimension(55, 35));
        btnProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSExited(evt);
            }
        });
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(241, 196, 15));
        btnUsuarios.setForeground(new java.awt.Color(71, 71, 71));
        btnUsuarios.setText("Usuários");
        btnUsuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(71, 71, 71)));
        btnUsuarios.setFocusPainted(false);
        btnUsuarios.setMaximumSize(new java.awt.Dimension(55, 35));
        btnUsuarios.setMinimumSize(new java.awt.Dimension(55, 35));
        btnUsuarios.setOpaque(true);
        btnUsuarios.setPreferredSize(new java.awt.Dimension(55, 35));
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSExited(evt);
            }
        });

        lblRodape.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblRodape.setForeground(new java.awt.Color(150, 150, 150));
        lblRodape.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRodape.setText("Programação para Computadores II - ETEC TS");

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEsconder, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btnUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addComponent(lblEsconder, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDesc)
                .addGap(26, 26, 26)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(lblRodape)
                .addContainerGap())
        );

        pnlProdutos.setBackground(new java.awt.Color(71, 71, 71));
        pnlProdutos.setMaximumSize(new java.awt.Dimension(740, 430));
        pnlProdutos.setMinimumSize(new java.awt.Dimension(740, 430));

        lblMenuC1.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        lblMenuC1.setForeground(new java.awt.Color(241, 196, 15));
        lblMenuC1.setText(">");
        lblMenuC1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        tbClientes1.setBackground(new java.awt.Color(250, 250, 250));
        tbClientes1.setForeground(new java.awt.Color(71, 71, 71));
        tbClientes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço"
            }
        ));
        tbClientes1.setSelectionBackground(new java.awt.Color(71, 71, 71));
        tbClientes1.setSelectionForeground(new java.awt.Color(241, 196, 15));
        tbClientes1.setShowGrid(false);
        scTbClientes1.setViewportView(tbClientes1);
        if (tbClientes1.getColumnModel().getColumnCount() > 0) {
            tbClientes1.getColumnModel().getColumn(0).setMinWidth(50);
            tbClientes1.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbClientes1.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        lblNomeP.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblNomeP.setForeground(new java.awt.Color(200, 200, 200));
        lblNomeP.setText("Nome:");

        txtNomeC1.setBackground(new java.awt.Color(71, 71, 71));
        txtNomeC1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtNomeC1.setForeground(new java.awt.Color(250, 250, 250));
        txtNomeC1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 250, 250)));
        txtNomeC1.setMaximumSize(new java.awt.Dimension(280, 30));
        txtNomeC1.setMinimumSize(new java.awt.Dimension(280, 30));
        txtNomeC1.setPreferredSize(new java.awt.Dimension(280, 30));

        lblProdutos.setBackground(new java.awt.Color(71, 71, 71));
        lblProdutos.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(241, 196, 15));
        lblProdutos.setText("Produtos");

        btnSalvarP.setBackground(new java.awt.Color(241, 196, 15));
        btnSalvarP.setForeground(new java.awt.Color(71, 71, 71));
        btnSalvarP.setText("Salvar");
        btnSalvarP.setToolTipText("");
        btnSalvarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarP.setEnabled(false);
        btnSalvarP.setFocusPainted(false);
        btnSalvarP.setPreferredSize(new java.awt.Dimension(56, 40));

        btnCadastrarP.setBackground(new java.awt.Color(241, 196, 15));
        btnCadastrarP.setForeground(new java.awt.Color(71, 71, 71));
        btnCadastrarP.setText("Cadastrar");
        btnCadastrarP.setToolTipText("");
        btnCadastrarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarP.setFocusPainted(false);
        btnCadastrarP.setPreferredSize(new java.awt.Dimension(56, 40));
        btnCadastrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPActionPerformed(evt);
            }
        });

        btnEditarP.setBackground(new java.awt.Color(241, 196, 15));
        btnEditarP.setForeground(new java.awt.Color(71, 71, 71));
        btnEditarP.setText("Editar");
        btnEditarP.setToolTipText("");
        btnEditarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarP.setFocusPainted(false);
        btnEditarP.setPreferredSize(new java.awt.Dimension(56, 40));

        btnDeletarP.setBackground(new java.awt.Color(241, 196, 15));
        btnDeletarP.setForeground(new java.awt.Color(71, 71, 71));
        btnDeletarP.setText("Deletar");
        btnDeletarP.setToolTipText("");
        btnDeletarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletarP.setFocusPainted(false);
        btnDeletarP.setPreferredSize(new java.awt.Dimension(56, 40));

        btnCancelarP.setBackground(new java.awt.Color(241, 196, 15));
        btnCancelarP.setForeground(new java.awt.Color(71, 71, 71));
        btnCancelarP.setText("Cancelar");
        btnCancelarP.setToolTipText("");
        btnCancelarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarP.setEnabled(false);
        btnCancelarP.setFocusPainted(false);
        btnCancelarP.setPreferredSize(new java.awt.Dimension(56, 40));

        lblCodigoP.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblCodigoP.setForeground(new java.awt.Color(200, 200, 200));
        lblCodigoP.setText("Código:");

        txtCodigoP.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        txtCodigoP.setForeground(new java.awt.Color(200, 200, 200));
        txtCodigoP.setText("0");

        lblDescricao.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(200, 200, 200));
        lblDescricao.setText("Descrição:");

        txtDescricao.setBackground(new java.awt.Color(71, 71, 71));
        txtDescricao.setColumns(20);
        txtDescricao.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtDescricao.setForeground(new java.awt.Color(250, 250, 250));
        txtDescricao.setRows(5);
        txtDescricao.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(250, 250, 250)));
        jScrollPane2.setViewportView(txtDescricao);

        txtAlcoolico.setBackground(new java.awt.Color(71, 71, 71));
        txtAlcoolico.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtAlcoolico.setForeground(new java.awt.Color(250, 250, 250));
        txtAlcoolico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "N" }));
        txtAlcoolico.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 250, 250)));

        lblAlcoolico.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblAlcoolico.setForeground(new java.awt.Color(200, 200, 200));
        lblAlcoolico.setText("Alcoólico:");

        lblTeor.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblTeor.setForeground(new java.awt.Color(200, 200, 200));
        lblTeor.setText("Teor (%):");

        txtTeor.setBackground(new java.awt.Color(71, 71, 71));
        txtTeor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtTeor.setForeground(new java.awt.Color(250, 250, 250));
        txtTeor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 250, 250)));
        txtTeor.setMaximumSize(new java.awt.Dimension(280, 30));
        txtTeor.setMinimumSize(new java.awt.Dimension(280, 30));
        txtTeor.setPreferredSize(new java.awt.Dimension(280, 30));

        lblLitragem.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblLitragem.setForeground(new java.awt.Color(200, 200, 200));
        lblLitragem.setText("Litragem:");

        txtLitragem.setBackground(new java.awt.Color(71, 71, 71));
        txtLitragem.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtLitragem.setForeground(new java.awt.Color(250, 250, 250));
        txtLitragem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 250, 250)));
        txtLitragem.setMaximumSize(new java.awt.Dimension(280, 30));
        txtLitragem.setMinimumSize(new java.awt.Dimension(280, 30));
        txtLitragem.setPreferredSize(new java.awt.Dimension(280, 30));

        lblUnidade.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblUnidade.setForeground(new java.awt.Color(200, 200, 200));
        lblUnidade.setText("Unidade:");

        txtUnidade.setBackground(new java.awt.Color(71, 71, 71));
        txtUnidade.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtUnidade.setForeground(new java.awt.Color(250, 250, 250));
        txtUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L", "mL" }));
        txtUnidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 250, 250)));

        lblPreco.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(200, 200, 200));
        lblPreco.setText("Preço:");

        txtPreco.setBackground(new java.awt.Color(71, 71, 71));
        txtPreco.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtPreco.setForeground(new java.awt.Color(250, 250, 250));
        txtPreco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(250, 250, 250)));
        txtPreco.setMaximumSize(new java.awt.Dimension(280, 30));
        txtPreco.setMinimumSize(new java.awt.Dimension(280, 30));
        txtPreco.setPreferredSize(new java.awt.Dimension(280, 30));

        javax.swing.GroupLayout pnlProdutosLayout = new javax.swing.GroupLayout(pnlProdutos);
        pnlProdutos.setLayout(pnlProdutosLayout);
        pnlProdutosLayout.setHorizontalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProdutosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblProdutos)
                .addGap(117, 117, 117))
            .addGroup(pnlProdutosLayout.createSequentialGroup()
                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProdutosLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlProdutosLayout.createSequentialGroup()
                                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlProdutosLayout.createSequentialGroup()
                                        .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlProdutosLayout.createSequentialGroup()
                                                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(pnlProdutosLayout.createSequentialGroup()
                                                        .addGap(74, 74, 74)
                                                        .addComponent(lblTeor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlProdutosLayout.createSequentialGroup()
                                                        .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(txtAlcoolico, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(lblAlcoolico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(lblPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtTeor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(pnlProdutosLayout.createSequentialGroup()
                                                        .addComponent(lblLitragem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblUnidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(11, 11, 11))
                                                    .addGroup(pnlProdutosLayout.createSequentialGroup()
                                                        .addComponent(txtLitragem, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtUnidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                            .addComponent(lblDescricao)
                                            .addGroup(pnlProdutosLayout.createSequentialGroup()
                                                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblCodigoP)
                                                    .addComponent(txtCodigoP))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNomeC1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblNomeP)))
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addGroup(pnlProdutosLayout.createSequentialGroup()
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(scTbClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProdutosLayout.createSequentialGroup()
                                .addComponent(btnSalvarP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCadastrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeletarP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelarP, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlProdutosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblMenuC1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlProdutosLayout.setVerticalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProdutosLayout.createSequentialGroup()
                .addComponent(lblMenuC1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProdutosLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeP)
                            .addComponent(lblCodigoP))
                        .addGap(6, 6, 6)
                        .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAlcoolico)
                            .addComponent(lblTeor)
                            .addComponent(lblLitragem)
                            .addComponent(lblUnidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlcoolico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTeor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLitragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scTbClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlFill.setLayer(pnlHome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlFill.setLayer(pnlClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlFill.setLayer(sideBar, javax.swing.JLayeredPane.PALETTE_LAYER);
        pnlFill.setLayer(pnlProdutos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlFillLayout = new javax.swing.GroupLayout(pnlFill);
        pnlFill.setLayout(pnlFillLayout);
        pnlFillLayout.setHorizontalGroup(
            pnlFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFillLayout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 537, Short.MAX_VALUE))
            .addGroup(pnlFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFillLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(pnlFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFillLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        pnlFillLayout.setVerticalGroup(
            pnlFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFillLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(pnlFillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlFillLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblEsconderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEsconderMouseClicked
        sideBar.setVisible(false);
    }//GEN-LAST:event_lblEsconderMouseClicked

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        sideBar.setVisible(true);        
    }//GEN-LAST:event_lblMenuMouseClicked

    private void btnSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSMouseEntered
        javax.swing.JButton btn = (javax.swing.JButton) evt.getComponent();
        btn.setBackground(new Color(71,71,71));
        btn.setForeground(new Color(241,196,15));
    }//GEN-LAST:event_btnSMouseEntered

    private void btnSExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSExited
        javax.swing.JButton btn = (javax.swing.JButton) evt.getComponent();
        btn.setForeground(new Color(71,71,71));
        btn.setBackground(new Color(241,196,15));
    }//GEN-LAST:event_btnSExited

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        pnlHome.setVisible(false);
        pnlHome.setEnabled(false);
        pnlProdutos.setVisible(false);
        pnlProdutos.setEnabled(false);
        pnlClientes.setVisible(true);
        pnlClientes.setEnabled(true);
        sideBar.setVisible(false);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        pnlHome.setVisible(false);
        pnlHome.setEnabled(false);
        pnlClientes.setVisible(false);
        pnlClientes.setEnabled(false);
        pnlProdutos.setVisible(true);
        pnlProdutos.setEnabled(true);
        sideBar.setVisible(false);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnCadastrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPActionPerformed
        
    }//GEN-LAST:event_btnCadastrarPActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        btnCadastrar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelarC.setEnabled(true);
        operacao = 1;
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCActionPerformed
        habilitarBotoesC();
    }//GEN-LAST:event_btnCancelarCActionPerformed

    private void habilitarBotoesC(){
        btnCadastrar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelarC.setEnabled(false);
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(operacao == 1){
            cliente().inserir();            
            habilitarBotoesC();
        }
        else if(operacao == 2){
            cliente().alterar();            
            habilitarBotoesC();
        }        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private Date pegarData(){
        
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            
            try {
                Date data = formato.parse(txtData.getText());
                formato.format(data);
                return data;
            } catch (ParseException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
    }
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnCadastrar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelarC.setEnabled(true);
        operacao = 2;
    }//GEN-LAST:event_btnEditarActionPerformed
   
    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    public Cliente cliente(){
        Cliente cliente = new Cliente(
            Integer.parseInt(txtCodigoC.getText()),
            txtNomeC.getText(),
            pegarData(),
            txtCep.getText(),
            txtLogradouro.getText(),
            Integer.parseInt(txtNumero.getText()),
            txtBairro.getText(),
            txtCidade.getText(),
            (String)txtEstado.getSelectedItem());
        return cliente;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastrarP;
    private javax.swing.JButton btnCancelarC;
    private javax.swing.JButton btnCancelarP;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDeletarP;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarP;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarP;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlcoolico;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblCodigoC;
    private javax.swing.JLabel lblCodigoP;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblDesc1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEsconder;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblLitragem;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMenuC;
    private javax.swing.JLabel lblMenuC1;
    private javax.swing.JLabel lblNomeC;
    private javax.swing.JLabel lblNomeP;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblRodape;
    private javax.swing.JLabel lblTeor;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JLayeredPane pnlFill;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlProdutos;
    private javax.swing.JScrollPane scTbClientes;
    private javax.swing.JScrollPane scTbClientes1;
    private javax.swing.JPanel sideBar;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTable tbClientes1;
    private javax.swing.JComboBox<String> txtAlcoolico;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JLabel txtCodigoC;
    private javax.swing.JLabel txtCodigoP;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JComboBox<String> txtEstado;
    private javax.swing.JTextField txtLitragem;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNomeC;
    private javax.swing.JTextField txtNomeC1;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtTeor;
    private javax.swing.JComboBox<String> txtUnidade;
    // End of variables declaration//GEN-END:variables
}
