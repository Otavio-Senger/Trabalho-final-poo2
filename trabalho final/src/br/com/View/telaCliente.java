/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.View;

import br.com.DAO.clienteDAO;
import br.com.DAO.conexaoDAO;
import br.com.DTO.clienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;


/**
 *
 * @author aluno.saolucas
 */
public class telaCliente extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form telaCliente
     */
    public telaCliente() {
        initComponents();

        conexao = conexaoDAO.conector();
        
        ImageIcon pesquisar = new ImageIcon("src/img/search.png");
        btnPesquisar.setIcon(pesquisar);
        
        ImageIcon incluir = new ImageIcon("src/img/person_add.png");
        btnIncluir.setIcon(incluir);
        
        ImageIcon excluir = new ImageIcon("src/img/delete_.png");
        btnExcluir.setIcon(excluir);
        
        ImageIcon editar = new ImageIcon("src/img/edit.png");
        btnEditar.setIcon(editar);
        
        ImageIcon limpar = new ImageIcon("src/img/limpar.png");
        btnLimpar.setIcon(limpar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtCPFcnpj = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(480, 530));

        jLabel1.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel3.setText("Endereço");

        jLabel4.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel4.setText("Telefone");

        jLabel5.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel5.setText("E-mail");

        jLabel6.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel6.setText("CPF/CNPJ");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLimpar.setPreferredSize(new java.awt.Dimension(33, 9));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Artifakt Element Black", 0, 24)); // NOI18N
        jLabel7.setText("Tela Cliente");

        jLabel9.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel9.setText("Incluir");

        jLabel10.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel10.setText("Excluir");

        jLabel11.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel11.setText("Editar");

        jLabel12.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel12.setText("Limpar");

        jLabel8.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel8.setText("Pesquisar");

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Clientes"
            }
        ));
        tabelaClientes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaClientesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                .addComponent(txtNome))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(txtEndereco)
                                    .addComponent(txtTelefone)
                                    .addComponent(txtEmail)
                                    .addComponent(txtCPFcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel9)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel10)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel11)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel12)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPFcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        int idCliente = Integer.parseInt(txtID.getText());
        String nomeClientes = txtNome.getText();
        String enderecoCliente = txtEndereco.getText();
        String telefoneCliente = txtTelefone.getText();
        String emailClientes = txtEmail.getText();
        String cpf_cnpj = txtCPFcnpj.getText();

        clienteDTO cdto = new clienteDTO();

        cdto.setIdClientes(idCliente);
        cdto.setNomeClientes(nomeClientes);
        cdto.setEnderecoClientes(enderecoCliente);
        cdto.setTelefoneClientes(telefoneCliente);
        cdto.setEmailClientes(emailClientes);
        cdto.setCpf_cnpjClientes(cpf_cnpj);

        clienteDAO cdao = new clienteDAO();
        cdao.pesquisar(cdto);


    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

        int idCliente = Integer.parseInt(txtID.getText());
        String nomeClientes = txtNome.getText();
        String enderecoCliente = txtEndereco.getText();
        String telefoneCliente = txtTelefone.getText();
        String emailClientes = txtEmail.getText();
        String cpf_cnpj = txtCPFcnpj.getText();

        clienteDTO cdto = new clienteDTO();

        cdto.setIdClientes(idCliente);
        cdto.setNomeClientes(nomeClientes);
        cdto.setEnderecoClientes(enderecoCliente);
        cdto.setTelefoneClientes(telefoneCliente);
        cdto.setEmailClientes(emailClientes);
        cdto.setCpf_cnpjClientes(cpf_cnpj);

        clienteDAO cdao = new clienteDAO();
        cdao.incluirClientes(cdto);


    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int idCliente = Integer.parseInt(txtID.getText());
        clienteDTO cdto = new clienteDTO();
        cdto.setIdClientes(idCliente);
        
        clienteDAO cdao = new clienteDAO();
        cdao.deletarCliente(cdto);



    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int idCliente = Integer.parseInt(txtID.getText());
        String nomeClientes = txtNome.getText();
        String enderecoCliente = txtEndereco.getText();
        String telefoneCliente = txtTelefone.getText();
        String emailClientes = txtEmail.getText();
        String cpf_cnpj = txtCPFcnpj.getText();

        clienteDTO cdto = new clienteDTO();

        cdto.setIdClientes(idCliente);
        cdto.setNomeClientes(nomeClientes);
        cdto.setEnderecoClientes(enderecoCliente);
        cdto.setTelefoneClientes(telefoneCliente);
        cdto.setEmailClientes(emailClientes);
        cdto.setCpf_cnpjClientes(cpf_cnpj);

        clienteDAO cdao = new clienteDAO();
        cdao.editarClientes(cdto);


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
        int idCliente = Integer.parseInt(txtID.getText());
        clienteDTO cdto = new clienteDTO();
        cdto.setIdClientes(idCliente);
        
        clienteDAO cdao = new clienteDAO();
        cdao.limpar();
        
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tabelaClientesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaClientesAncestorAdded
      
        clienteDAO cdao = new clienteDAO();
        cdao.preenchertabela();
        
    }//GEN-LAST:event_tabelaClientesAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabelaClientes;
    public static javax.swing.JTextField txtCPFcnpj;
    public static javax.swing.JTextField txtEmail;
    public static javax.swing.JTextField txtEndereco;
    public static javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtNome;
    public static javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
