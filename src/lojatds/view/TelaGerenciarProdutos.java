/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatds.view;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lojatds.controller.ProdutoController;
import lojatds.model.Produto;
import lojatds.model.dao.DAOFactory;
import lojatds.model.dao.DatabaseException;

/**
 *
 * @author Rafa
 */
public class TelaGerenciarProdutos extends javax.swing.JFrame implements Observer {

    private final ProdutoController controller;
    private ProdutoTableModel produtoModel;

    /**
     * Creates new form TelaGerenciarProdutos
     * @param controller
     */
    public TelaGerenciarProdutos(ProdutoController controller) {
        super("Gerenciar Produtos");
        this.controller = controller;
        produtoModel = new ProdutoTableModel();
        initComponents();
        jTableProduto.setModel(produtoModel);
        try {
            produtoModel.updateProdutos(controller.listar());
        } catch (DatabaseException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco: " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameProduto = new javax.swing.JInternalFrame();
        jTextFieldPesquisarProduto = new javax.swing.JTextField();
        jButtonPesquisarProduto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        jLabelCodigoProduto = new javax.swing.JLabel();
        jTextFieldCodigoProduto = new javax.swing.JTextField();
        jLabelDescricaoProduto = new javax.swing.JLabel();
        jTextFieldDescricaoProduto = new javax.swing.JTextField();
        jLabelValorDeCompraProduto = new javax.swing.JLabel();
        jTextFieldValorDeCompraProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldValorDeVenda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCadastrarEstoqueProduto = new javax.swing.JTextField();
        jButtonCadastrarProduto = new javax.swing.JButton();
        jButtonEditarProduto = new javax.swing.JButton();
        jButtonDeletarProduto = new javax.swing.JButton();
        jButtonLimparProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jInternalFrameProduto.setVisible(true);

        jTextFieldPesquisarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisarProdutoKeyReleased(evt);
            }
        });

        jButtonPesquisarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojatds/view/imagens/search.png"))); // NOI18N
        jButtonPesquisarProduto.setText("Pesquisar");
        jButtonPesquisarProduto.setToolTipText("Pesquisar produtos");
        jButtonPesquisarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarProdutoActionPerformed(evt);
            }
        });

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableProduto);

        jLabelCodigoProduto.setText("Código:");

        jTextFieldCodigoProduto.setEnabled(false);

        jLabelDescricaoProduto.setText("Descrição:");

        jLabelValorDeCompraProduto.setText("Valor de compra:");

        jLabel1.setText("Valor de venda:");

        jLabel2.setText("Estoque:");

        jButtonCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojatds/view/imagens/add.png"))); // NOI18N
        jButtonCadastrarProduto.setText("Cadastrar");
        jButtonCadastrarProduto.setToolTipText("Cadastrar produto");
        jButtonCadastrarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarProdutoActionPerformed(evt);
            }
        });

        jButtonEditarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojatds/view/imagens/cog_edit.png"))); // NOI18N
        jButtonEditarProduto.setText("Editar");
        jButtonEditarProduto.setToolTipText("Editar produto");
        jButtonEditarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarProdutoActionPerformed(evt);
            }
        });

        jButtonDeletarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojatds/view/imagens/cog_delete.png"))); // NOI18N
        jButtonDeletarProduto.setText("Excluir");
        jButtonDeletarProduto.setToolTipText("Excluir produto");
        jButtonDeletarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarProdutoActionPerformed(evt);
            }
        });

        jButtonLimparProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojatds/view/imagens/DeleteGrey.png"))); // NOI18N
        jButtonLimparProduto.setText("Limpar");
        jButtonLimparProduto.setToolTipText("Limpar campos");
        jButtonLimparProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameProdutoLayout = new javax.swing.GroupLayout(jInternalFrameProduto.getContentPane());
        jInternalFrameProduto.getContentPane().setLayout(jInternalFrameProdutoLayout);
        jInternalFrameProdutoLayout.setHorizontalGroup(
            jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameProdutoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameProdutoLayout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPesquisarProduto))
                    .addGroup(jInternalFrameProdutoLayout.createSequentialGroup()
                        .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameProdutoLayout.createSequentialGroup()
                                .addComponent(jLabelValorDeCompraProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldValorDeCompraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrameProdutoLayout.createSequentialGroup()
                                .addComponent(jLabelCodigoProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrameProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCadastrarEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonCadastrarProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrameProdutoLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldValorDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameProdutoLayout.createSequentialGroup()
                                .addComponent(jButtonEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jButtonDeletarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jButtonLimparProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameProdutoLayout.createSequentialGroup()
                                .addComponent(jLabelDescricaoProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );
        jInternalFrameProdutoLayout.setVerticalGroup(
            jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameProdutoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoProduto)
                    .addComponent(jTextFieldCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoProduto)
                    .addComponent(jTextFieldDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorDeCompraProduto)
                    .addComponent(jTextFieldValorDeCompraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldValorDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCadastrarEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonLimparProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonDeletarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCadastrarProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditarProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrameProduto, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrameProduto)
        );

        setSize(new java.awt.Dimension(691, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarProdutoActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja cadastrar o produto?",
                "Cadastrar produto", JOptionPane.YES_NO_OPTION)
                == JOptionPane.OK_OPTION) {

            Produto produto = new Produto();
            produto.setNome(jTextFieldDescricaoProduto.getText());
            produto.setQuantidade(Integer.parseInt(jTextFieldCadastrarEstoqueProduto.getText()));
            produto.setPrecoDeCompra(Float.parseFloat(jTextFieldValorDeCompraProduto.getText()));
            produto.setPrecoDeVenda(Float.parseFloat(jTextFieldValorDeVenda.getText()));

            try {
                controller.cadastrar(produto);
                JOptionPane.showMessageDialog(null, "Produto registrado com sucesso!");
                jTextFieldCodigoProduto.setText("");
                jTextFieldDescricaoProduto.setText("");
                jTextFieldCadastrarEstoqueProduto.setText("");
                jTextFieldValorDeCompraProduto.setText("");
                jTextFieldValorDeVenda.setText("");

            } catch (DatabaseException ex) {
                Logger.getLogger(TelaGerenciarClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonCadastrarProdutoActionPerformed

    private void jTableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoMouseClicked
        int linha = jTableProduto.getSelectedRow();
        Produto ev = produtoModel.getProduto(linha);
        jTextFieldCodigoProduto.setText("" + ev.getCodigo());
        jTextFieldDescricaoProduto.setText(ev.getNome());
        jTextFieldValorDeCompraProduto.setText(String.valueOf(ev.getPrecoDeCompra()));
        jTextFieldValorDeVenda.setText(String.valueOf(ev.getPrecoDeVenda()));
        jTextFieldCadastrarEstoqueProduto.setText(String.valueOf(ev.getQuantidade()));
    }//GEN-LAST:event_jTableProdutoMouseClicked

    private void jButtonEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarProdutoActionPerformed
        Produto produto = new Produto();
        produto.setNome(jTextFieldDescricaoProduto.getText());
        produto.setQuantidade(Integer.parseInt(jTextFieldCadastrarEstoqueProduto.getText()));
        produto.setPrecoDeCompra(Float.parseFloat(jTextFieldValorDeCompraProduto.getText()));
        produto.setPrecoDeVenda(Float.parseFloat(jTextFieldValorDeVenda.getText()));
        produto.setCodigo(Integer.parseInt(jTextFieldCodigoProduto.getText()));

        try {
            controller.atualizar(produto);
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
            jTextFieldCodigoProduto.setText("");
            jTextFieldDescricaoProduto.setText("");
            jTextFieldCadastrarEstoqueProduto.setText("");
            jTextFieldValorDeCompraProduto.setText("");
            jTextFieldValorDeVenda.setText("");

        } catch (DatabaseException ex) {
            Logger.getLogger(TelaGerenciarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEditarProdutoActionPerformed

    private void jButtonLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparProdutoActionPerformed
        jTextFieldCodigoProduto.setText("");
        jTextFieldDescricaoProduto.setText("");
        jTextFieldCadastrarEstoqueProduto.setText("");
        jTextFieldValorDeCompraProduto.setText("");
        jTextFieldValorDeVenda.setText("");
    }//GEN-LAST:event_jButtonLimparProdutoActionPerformed

    private void jButtonDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarProdutoActionPerformed
        try {
            int codigo = Integer.parseInt(jTextFieldCodigoProduto.getText());
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o produto?",
                    "Excluir produto", JOptionPane.YES_NO_OPTION)
                    == JOptionPane.OK_OPTION) {
                if (controller.excluir(codigo)) {
                    JOptionPane.showMessageDialog(this, "Produto removido com sucesso!");
                    jTextFieldCodigoProduto.setText("");
                    jTextFieldDescricaoProduto.setText("");
                    jTextFieldCadastrarEstoqueProduto.setText("");
                    jTextFieldValorDeCompraProduto.setText("");
                    jTextFieldValorDeVenda.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Falha");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Código Inválido");
        } catch (DatabaseException e) {
            JOptionPane.showMessageDialog(this, "Erro no banco: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeletarProdutoActionPerformed

    private void jButtonPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarProdutoActionPerformed
        try {
            produtoModel.updateProdutos(controller.pesquisar(jTextFieldPesquisarProduto.getText()));
        } catch (DatabaseException ex) {
            Logger.getLogger(TelaGerenciarProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPesquisarProdutoActionPerformed

    private void jTextFieldPesquisarProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarProdutoKeyReleased
        try {
            produtoModel.updateProdutos(controller.pesquisar(jTextFieldPesquisarProduto.getText()));
        } catch (DatabaseException ex) {
            Logger.getLogger(TelaGerenciarProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextFieldPesquisarProdutoKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaGerenciarClientes().setVisible(true);
                DAOFactory dao = DAOFactory.getDAOFactory();
                ProdutoController controller = new ProdutoController(dao);
                TelaGerenciarProdutos view = new TelaGerenciarProdutos(controller);
                controller.addObserver(view);
                view.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarProduto;
    private javax.swing.JButton jButtonDeletarProduto;
    private javax.swing.JButton jButtonEditarProduto;
    private javax.swing.JButton jButtonLimparProduto;
    private javax.swing.JButton jButtonPesquisarProduto;
    private javax.swing.JInternalFrame jInternalFrameProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCodigoProduto;
    private javax.swing.JLabel jLabelDescricaoProduto;
    private javax.swing.JLabel jLabelValorDeCompraProduto;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField jTextFieldCadastrarEstoqueProduto;
    private javax.swing.JTextField jTextFieldCodigoProduto;
    private javax.swing.JTextField jTextFieldDescricaoProduto;
    private javax.swing.JTextField jTextFieldPesquisarProduto;
    private javax.swing.JTextField jTextFieldValorDeCompraProduto;
    private javax.swing.JTextField jTextFieldValorDeVenda;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        try {
            System.out.println(controller.listar());
            produtoModel.updateProdutos(controller.listar());
        } catch (DatabaseException e) {
            JOptionPane.showMessageDialog(this, "Erro no banco: " + e.getMessage());
        }
    }
}