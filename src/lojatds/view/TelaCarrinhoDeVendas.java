/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatds.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lojatds.controller.VendaController;
import lojatds.model.Venda;
import lojatds.model.dao.DatabaseException;



/**
 *
 * @author Rafa
 */
public class TelaCarrinhoDeVendas extends javax.swing.JFrame {
    
    private Venda venda;
    ProdutoTableModel produtoModel = new ProdutoTableModel();
    private final VendaController vendacontroller;
    
    /**
     * Creates new form TelaCarrinhoDeVendas
     */
    public TelaCarrinhoDeVendas(Venda v, VendaController vendacontroller) {
        super("Carrinho de vendas");
        this.venda = v;
        this.vendacontroller = vendacontroller;
        initComponents();
        
        jTextFieldVendasCliente.setText(venda.getCliente().getNome());
        jTextFieldValorTotalCarrinhoVenda.setText(String.valueOf(venda.getTotal()));
        jTableCarrinhoDeVendas.setModel(produtoModel);
        produtoModel.updateProdutos(venda.getLista());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameCarrinhoDeVendas = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarrinhoDeVendas = new javax.swing.JTable();
        jLabelCarrinhosDeComprasVendas = new javax.swing.JLabel();
        jButtonConfimarVenda = new javax.swing.JButton();
        jButtonExcluirProdutoCarrinhoVendas = new javax.swing.JButton();
        jTextFieldVendasCliente = new javax.swing.JTextField();
        jLabelClienteCarrinhoDeVenda = new javax.swing.JLabel();
        jLabelValorTotalCarrinhoDeVendas = new javax.swing.JLabel();
        jTextFieldValorTotalCarrinhoVenda = new javax.swing.JTextField();
        jSeparatorCarrinhoDeVendas = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jInternalFrameCarrinhoDeVendas.setVisible(true);
        jInternalFrameCarrinhoDeVendas.getContentPane().setLayout(null);

        jTableCarrinhoDeVendas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCarrinhoDeVendas);

        jInternalFrameCarrinhoDeVendas.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 50, 490, 140);

        jLabelCarrinhosDeComprasVendas.setText("Carrinho de vendas");
        jInternalFrameCarrinhoDeVendas.getContentPane().add(jLabelCarrinhosDeComprasVendas);
        jLabelCarrinhosDeComprasVendas.setBounds(50, 30, 110, 14);

        jButtonConfimarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojatds/view/imagens/accept.png"))); // NOI18N
        jButtonConfimarVenda.setText("Confirmar venda");
        jButtonConfimarVenda.setToolTipText("Confirmar venda");
        jButtonConfimarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfimarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfimarVendaActionPerformed(evt);
            }
        });
        jInternalFrameCarrinhoDeVendas.getContentPane().add(jButtonConfimarVenda);
        jButtonConfimarVenda.setBounds(80, 270, 150, 30);

        jButtonExcluirProdutoCarrinhoVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lojatds/view/imagens/delete.png"))); // NOI18N
        jButtonExcluirProdutoCarrinhoVendas.setText("Excluir do carrinho");
        jButtonExcluirProdutoCarrinhoVendas.setToolTipText("Excluir item do carrinho");
        jButtonExcluirProdutoCarrinhoVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExcluirProdutoCarrinhoVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirProdutoCarrinhoVendasActionPerformed(evt);
            }
        });
        jInternalFrameCarrinhoDeVendas.getContentPane().add(jButtonExcluirProdutoCarrinhoVendas);
        jButtonExcluirProdutoCarrinhoVendas.setBounds(340, 270, 150, 30);

        jTextFieldVendasCliente.setEnabled(false);
        jTextFieldVendasCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVendasClienteActionPerformed(evt);
            }
        });
        jInternalFrameCarrinhoDeVendas.getContentPane().add(jTextFieldVendasCliente);
        jTextFieldVendasCliente.setBounds(100, 210, 110, 30);

        jLabelClienteCarrinhoDeVenda.setText("Cliente:");
        jInternalFrameCarrinhoDeVendas.getContentPane().add(jLabelClienteCarrinhoDeVenda);
        jLabelClienteCarrinhoDeVenda.setBounds(40, 210, 60, 14);

        jLabelValorTotalCarrinhoDeVendas.setText("Valor total da venda:");
        jInternalFrameCarrinhoDeVendas.getContentPane().add(jLabelValorTotalCarrinhoDeVendas);
        jLabelValorTotalCarrinhoDeVendas.setBounds(270, 210, 110, 14);

        jTextFieldValorTotalCarrinhoVenda.setEnabled(false);
        jTextFieldValorTotalCarrinhoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTotalCarrinhoVendaActionPerformed(evt);
            }
        });
        jInternalFrameCarrinhoDeVendas.getContentPane().add(jTextFieldValorTotalCarrinhoVenda);
        jTextFieldValorTotalCarrinhoVenda.setBounds(390, 210, 120, 30);

        jSeparatorCarrinhoDeVendas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jInternalFrameCarrinhoDeVendas.getContentPane().add(jSeparatorCarrinhoDeVendas);
        jSeparatorCarrinhoDeVendas.setBounds(20, 10, 530, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrameCarrinhoDeVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrameCarrinhoDeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldVendasClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVendasClienteActionPerformed
        jTextFieldVendasCliente.setText(venda.getCliente().getNome());
    }//GEN-LAST:event_jTextFieldVendasClienteActionPerformed

    private void jButtonExcluirProdutoCarrinhoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirProdutoCarrinhoVendasActionPerformed
        venda.removerProduto(produtoModel.getProduto(jTableCarrinhoDeVendas.getSelectedRow()));
        jTableCarrinhoDeVendas.setModel(produtoModel);
        produtoModel.updateProdutos(venda.getLista());
    }//GEN-LAST:event_jButtonExcluirProdutoCarrinhoVendasActionPerformed

    private void jButtonConfimarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfimarVendaActionPerformed
        try {
            //System.out.println(venda.getCliente().getCodigo() + "teste 1");
            vendacontroller.cadastrar(venda);           
            venda.getLista().removeAll(venda.getLista());
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
            dispose();
            
        } catch (DatabaseException ex) {
            Logger.getLogger(TelaCarrinhoDeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfimarVendaActionPerformed

    private void jTextFieldValorTotalCarrinhoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotalCarrinhoVendaActionPerformed
        jTextFieldValorTotalCarrinhoVenda.setText(String.valueOf(venda.getTotal()));
    }//GEN-LAST:event_jTextFieldValorTotalCarrinhoVendaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCarrinhoDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCarrinhoDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCarrinhoDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCarrinhoDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaCarrinhoDeVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfimarVenda;
    private javax.swing.JButton jButtonExcluirProdutoCarrinhoVendas;
    private javax.swing.JInternalFrame jInternalFrameCarrinhoDeVendas;
    private javax.swing.JLabel jLabelCarrinhosDeComprasVendas;
    private javax.swing.JLabel jLabelClienteCarrinhoDeVenda;
    private javax.swing.JLabel jLabelValorTotalCarrinhoDeVendas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorCarrinhoDeVendas;
    private javax.swing.JTable jTableCarrinhoDeVendas;
    private javax.swing.JTextField jTextFieldValorTotalCarrinhoVenda;
    private javax.swing.JTextField jTextFieldVendasCliente;
    // End of variables declaration//GEN-END:variables
}
