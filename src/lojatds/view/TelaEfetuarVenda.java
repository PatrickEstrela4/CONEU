/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatds.view;

import java.awt.Component;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lojatds.controller.ClienteController;
import lojatds.controller.ProdutoController;
import lojatds.controller.VendaController;
import lojatds.model.Cliente;
import lojatds.model.Produto;
import lojatds.model.Venda;
import lojatds.model.dao.DAOFactory;
import lojatds.model.dao.DatabaseException;

/**
 *
 * @author Rafa
 */
public class TelaEfetuarVenda extends javax.swing.JFrame implements Observer {

    ClienteTableModel clienteModel = new ClienteTableModel();
    private final ClienteController clientecontroller;
    ProdutoTableModel produtoModel = new ProdutoTableModel();
    private final ProdutoController produtocontroller;
    private final VendaController vendacontroller;

    Venda venda = new Venda();

    /**
     * Creates new form TelaEfetuarVenda
     *
     * @param clientecontroller
     * @param produtocontroller
     */
    public TelaEfetuarVenda(ClienteController clientecontroller, ProdutoController produtocontroller, VendaController vendacontroller) {
        super("Efetuar venda");
        this.clientecontroller = clientecontroller;
        this.produtocontroller = produtocontroller;
        this.vendacontroller = vendacontroller;
        initComponents();
        jTableClienteVendas.setModel(clienteModel);
        jTableProdutoVendas.setModel(produtoModel);
        try {
            clienteModel.updateClientes(clientecontroller.listar());
        } catch (DatabaseException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco: " + ex.getMessage());
        }
        try {
            produtoModel.updateProdutos(produtocontroller.listar());
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabelCliente = new javax.swing.JLabel();
        jTextFieldPesquisarCliente = new javax.swing.JTextField();
        jButtonPesquisarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClienteVendas = new javax.swing.JTable();
        jLabelCodigoCliente = new javax.swing.JLabel();
        jTextFieldCodigoCliente = new javax.swing.JTextField();
        jLabelNomeCliente = new javax.swing.JLabel();
        jTextFieldClienteVenda = new javax.swing.JTextField();
        jSeparatorEfetuarVenda = new javax.swing.JSeparator();
        jLabelProduto = new javax.swing.JLabel();
        jTextFieldPesquisarProduto = new javax.swing.JTextField();
        jButtonPesquisarProduto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProdutoVendas = new javax.swing.JTable();
        jLabelCodigoProduto = new javax.swing.JLabel();
        jTextFieldCodigoProduto = new javax.swing.JTextField();
        jLabelNomeProduto = new javax.swing.JLabel();
        jTextFieldNomeProdutoVenda = new javax.swing.JTextField();
        jSeparatorEfetuarVenda2 = new javax.swing.JSeparator();
        jLabelQuantidadeProdutoVenda = new javax.swing.JLabel();
        jTextFieldQuantidadeProdutoVenda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldValorUnitario = new javax.swing.JTextField();
        jLabelValorTotal = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jButtonAdicionarAoCarrinhoVenda = new javax.swing.JButton();
        jButtonCancelarVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        jLabelCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCliente.setText("Cliente");
        jInternalFrame1.getContentPane().add(jLabelCliente);
        jLabelCliente.setBounds(20, 10, 50, 20);
        jInternalFrame1.getContentPane().add(jTextFieldPesquisarCliente);
        jTextFieldPesquisarCliente.setBounds(20, 30, 270, 30);

        jButtonPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojatds/view/imagens/search.png"))); // NOI18N
        jButtonPesquisarCliente.setText("Pesquisar");
        jButtonPesquisarCliente.setToolTipText("Pesquisar cliente");
        jButtonPesquisarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarClienteActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonPesquisarCliente);
        jButtonPesquisarCliente.setBounds(300, 30, 120, 30);

        jTableClienteVendas.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableClienteVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteVendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClienteVendas);

        jInternalFrame1.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 690, 110);

        jLabelCodigoCliente.setText("Código:");
        jInternalFrame1.getContentPane().add(jLabelCodigoCliente);
        jLabelCodigoCliente.setBounds(20, 200, 50, 14);

        jTextFieldCodigoCliente.setEnabled(false);
        jInternalFrame1.getContentPane().add(jTextFieldCodigoCliente);
        jTextFieldCodigoCliente.setBounds(70, 190, 50, 30);

        jLabelNomeCliente.setText("Cliente:");
        jInternalFrame1.getContentPane().add(jLabelNomeCliente);
        jLabelNomeCliente.setBounds(160, 200, 50, 14);

        jTextFieldClienteVenda.setEnabled(false);
        jTextFieldClienteVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteVendaActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTextFieldClienteVenda);
        jTextFieldClienteVenda.setBounds(210, 190, 320, 30);

        jSeparatorEfetuarVenda.setToolTipText("");
        jSeparatorEfetuarVenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSeparatorEfetuarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparatorEfetuarVenda.setName(""); // NOI18N
        jInternalFrame1.getContentPane().add(jSeparatorEfetuarVenda);
        jSeparatorEfetuarVenda.setBounds(10, 10, 710, 220);

        jLabelProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelProduto.setText("Produto");
        jInternalFrame1.getContentPane().add(jLabelProduto);
        jLabelProduto.setBounds(20, 240, 60, 20);
        jInternalFrame1.getContentPane().add(jTextFieldPesquisarProduto);
        jTextFieldPesquisarProduto.setBounds(20, 260, 270, 30);

        jButtonPesquisarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojatds/view/imagens/search.png"))); // NOI18N
        jButtonPesquisarProduto.setText("Pesquisar");
        jButtonPesquisarProduto.setToolTipText("Pesquisar produto");
        jButtonPesquisarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarProdutoActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonPesquisarProduto);
        jButtonPesquisarProduto.setBounds(300, 260, 120, 30);

        jTableProdutoVendas.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableProdutoVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutoVendasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableProdutoVendas);

        jInternalFrame1.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 310, 690, 100);

        jLabelCodigoProduto.setText("Código:");
        jInternalFrame1.getContentPane().add(jLabelCodigoProduto);
        jLabelCodigoProduto.setBounds(20, 430, 50, 14);

        jTextFieldCodigoProduto.setEnabled(false);
        jTextFieldCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoProdutoActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTextFieldCodigoProduto);
        jTextFieldCodigoProduto.setBounds(70, 420, 50, 30);

        jLabelNomeProduto.setText("Produto:");
        jInternalFrame1.getContentPane().add(jLabelNomeProduto);
        jLabelNomeProduto.setBounds(170, 430, 50, 14);

        jTextFieldNomeProdutoVenda.setEnabled(false);
        jInternalFrame1.getContentPane().add(jTextFieldNomeProdutoVenda);
        jTextFieldNomeProdutoVenda.setBounds(220, 420, 300, 30);

        jSeparatorEfetuarVenda2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jInternalFrame1.getContentPane().add(jSeparatorEfetuarVenda2);
        jSeparatorEfetuarVenda2.setBounds(10, 240, 710, 230);

        jLabelQuantidadeProdutoVenda.setText("Quantidade:");
        jInternalFrame1.getContentPane().add(jLabelQuantidadeProdutoVenda);
        jLabelQuantidadeProdutoVenda.setBounds(20, 490, 70, 14);

        jTextFieldQuantidadeProdutoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldQuantidadeProdutoVendaKeyReleased(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTextFieldQuantidadeProdutoVenda);
        jTextFieldQuantidadeProdutoVenda.setBounds(90, 480, 60, 30);

        jLabel1.setText("Valor unitário:");
        jInternalFrame1.getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 490, 80, 14);

        jTextFieldValorUnitario.setEnabled(false);
        jInternalFrame1.getContentPane().add(jTextFieldValorUnitario);
        jTextFieldValorUnitario.setBounds(250, 480, 60, 30);

        jLabelValorTotal.setText("Valor total:");
        jInternalFrame1.getContentPane().add(jLabelValorTotal);
        jLabelValorTotal.setBounds(380, 490, 60, 14);

        jTextFieldValorTotal.setEnabled(false);
        jInternalFrame1.getContentPane().add(jTextFieldValorTotal);
        jTextFieldValorTotal.setBounds(440, 480, 60, 30);

        jButtonAdicionarAoCarrinhoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojatds/view/imagens/cart_add.png"))); // NOI18N
        jButtonAdicionarAoCarrinhoVenda.setText("Adicionar ao carrinho");
        jButtonAdicionarAoCarrinhoVenda.setToolTipText("Confirmar venda");
        jButtonAdicionarAoCarrinhoVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarAoCarrinhoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarAoCarrinhoVendaActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonAdicionarAoCarrinhoVenda);
        jButtonAdicionarAoCarrinhoVenda.setBounds(90, 550, 180, 30);

        jButtonCancelarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojatds/view/imagens/cancel.png"))); // NOI18N
        jButtonCancelarVenda.setText("Cancelar Venda");
        jButtonCancelarVenda.setToolTipText("Cancelar venda");
        jButtonCancelarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarVendaActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonCancelarVenda);
        jButtonCancelarVenda.setBounds(480, 550, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(761, 657));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoProdutoActionPerformed

    private void jButtonPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarClienteActionPerformed
        try {
            clienteModel.updateClientes(clientecontroller.pesquisar(jTextFieldPesquisarCliente.getText()));
        } catch (DatabaseException ex) {
            Logger.getLogger(TelaGerenciarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPesquisarClienteActionPerformed

    private void jTableClienteVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteVendasMouseClicked
        try {
            produtoModel.updateProdutos(produtocontroller.listar());
        } catch (DatabaseException ex) {
            Logger.getLogger(TelaEfetuarCompra.class.getName()).log(Level.SEVERE, null, ex);
        }

        int linha = jTableClienteVendas.getSelectedRow();
        Cliente ev = clienteModel.getCliente(linha);
        jTextFieldCodigoCliente.setText("" + ev.getCodigo());
        jTextFieldClienteVenda.setText(ev.getNome());

        venda.setCliente(ev);
    }//GEN-LAST:event_jTableClienteVendasMouseClicked

    private void jTableProdutoVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoVendasMouseClicked

        int linha = jTableProdutoVendas.getSelectedRow();
        Produto ev = produtoModel.getProduto(linha);
        jTextFieldCodigoProduto.setText("" + ev.getCodigo());
        jTextFieldNomeProdutoVenda.setText(ev.getNome());
        jTextFieldValorUnitario.setText(String.valueOf(ev.getPrecoDeVenda()));

    }//GEN-LAST:event_jTableProdutoVendasMouseClicked

    private void jButtonCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarVendaActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarVendaActionPerformed

    private void jTextFieldClienteVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteVendaActionPerformed

    private void jButtonAdicionarAoCarrinhoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarAoCarrinhoVendaActionPerformed
        if (jTextFieldQuantidadeProdutoVenda.getText() == "") {
            JOptionPane.showMessageDialog(null, "Digite a quantidade de produtos", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } else if (jTextFieldClienteVenda.getText() == "") {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } else if (jTextFieldNomeProdutoVenda.getText() == "") {
            JOptionPane.showMessageDialog(null, "Selecione um Produto", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } else {

            Produto prod = produtoModel.getProduto(jTableProdutoVendas.getSelectedRow());
            prod.setQuantidade(Integer.parseInt(jTextFieldQuantidadeProdutoVenda.getText()));
            System.out.println(venda.getLista().contains(prod));

            if (venda.getLista().contains(prod)) {

                int a;
                a = venda.getLista().indexOf(prod);
                System.out.println(venda.getLista().get(a).equals(prod));

                venda.getLista().get(a).setQuantidade(venda.getLista().get(a).getQuantidade() + prod.getQuantidade());
            } else {
                venda.addProduto(prod);
            }

            float total = 0;
            for (Produto p : venda.getLista()) {
                total = (total + (p.getPrecoDeCompra() * p.getQuantidade()));
            }

            venda.setTotal(total);
            jTextFieldQuantidadeProdutoVenda.setText("");try {
                produtoModel.updateProdutos(produtocontroller.listar());
            } catch (DatabaseException ex) {
                JOptionPane.showMessageDialog(this, "Erro no banco: " + ex.getMessage());
            }
            new TelaCarrinhoDeVendas(venda, vendacontroller).setVisible(true);

            
        }


    }//GEN-LAST:event_jButtonAdicionarAoCarrinhoVendaActionPerformed

    private void jButtonPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarProdutoActionPerformed
        try {
            produtoModel.updateProdutos(produtocontroller.pesquisar(jTextFieldPesquisarProduto.getText()));
        } catch (DatabaseException ex) {
            Logger.getLogger(TelaGerenciarProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPesquisarProdutoActionPerformed

    private void jTextFieldQuantidadeProdutoVendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeProdutoVendaKeyReleased
        float total = 0;
        total = (Float.parseFloat(jTextFieldValorUnitario.getText())
                * Float.parseFloat(jTextFieldQuantidadeProdutoVenda.getText())) + venda.getTotal();

        jTextFieldValorTotal.setText(String.valueOf(total));        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantidadeProdutoVendaKeyReleased

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
            java.util.logging.Logger.getLogger(TelaEfetuarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEfetuarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEfetuarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEfetuarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                DAOFactory dao = DAOFactory.getDAOFactory();
                ClienteController clientecontroller = new ClienteController(dao);
                ProdutoController produtocontroller = new ProdutoController(dao);
                VendaController vendacontroller = new VendaController(dao);
                TelaEfetuarVenda view = new TelaEfetuarVenda(clientecontroller, produtocontroller, vendacontroller);
                clientecontroller.addObserver(view);
                produtocontroller.addObserver(view);
                view.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarAoCarrinhoVenda;
    private javax.swing.JButton jButtonCancelarVenda;
    private javax.swing.JButton jButtonPesquisarCliente;
    private javax.swing.JButton jButtonPesquisarProduto;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelCodigoCliente;
    private javax.swing.JLabel jLabelCodigoProduto;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelNomeProduto;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelQuantidadeProdutoVenda;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparatorEfetuarVenda;
    private javax.swing.JSeparator jSeparatorEfetuarVenda2;
    private javax.swing.JTable jTableClienteVendas;
    private javax.swing.JTable jTableProdutoVendas;
    private javax.swing.JTextField jTextFieldClienteVenda;
    private javax.swing.JTextField jTextFieldCodigoCliente;
    private javax.swing.JTextField jTextFieldCodigoProduto;
    private javax.swing.JTextField jTextFieldNomeProdutoVenda;
    private javax.swing.JTextField jTextFieldPesquisarCliente;
    private javax.swing.JTextField jTextFieldPesquisarProduto;
    private javax.swing.JTextField jTextFieldQuantidadeProdutoVenda;
    private javax.swing.JTextField jTextFieldValorTotal;
    private javax.swing.JTextField jTextFieldValorUnitario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        try {
            System.out.println(clientecontroller.listar());
            clienteModel.updateClientes(clientecontroller.listar());
        } catch (DatabaseException e) {
            JOptionPane.showMessageDialog(this, "Erro no banco: " + e.getMessage());
        }

        try {
            System.out.println(produtocontroller.listar());
            produtoModel.updateProdutos(produtocontroller.listar());
        } catch (DatabaseException ex) {
            JOptionPane.showMessageDialog(this, "Erro no banco: " + ex.getMessage());
        }
    }
}