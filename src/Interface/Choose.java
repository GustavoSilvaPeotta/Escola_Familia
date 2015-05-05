/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;


import Interface_Sub.Add_Folgas;
import Interface_Sub.Add_Inventario;
import Interface_Sub.Add_Projeto;
import Interface_Sub.Add_Universitario;
import Interface_Sub.Interface_Pesquisa;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author 30-90042
 */
public class Choose extends JFrame{
    
    public String text_p;
    
    /**
     * Creates new form Adicionar_Item
     * @param tabela
     */
    
    Choose() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        radio_uni = new javax.swing.JRadioButton();
        radio_proj = new javax.swing.JRadioButton();
        radio_inv = new javax.swing.JRadioButton();
        radio_folgas = new javax.swing.JRadioButton();
        botao_Confirma = new javax.swing.JToggleButton();
        botao_Volta = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(radio_uni);
        radio_uni.setText("Universitário");
        radio_uni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_uniActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_proj);
        radio_proj.setText("Projeto");

        buttonGroup1.add(radio_inv);
        radio_inv.setText("Inventário");
        radio_inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_invActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_folgas);
        radio_folgas.setText("Folga");

        botao_Confirma.setText("Incluir");
        botao_Confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_ConfirmaActionPerformed(evt);
            }
        });

        botao_Volta.setText("Voltar");
        botao_Volta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_VoltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio_uni)
                            .addComponent(radio_proj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio_folgas)
                            .addComponent(radio_inv)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botao_Confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_Volta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_uni)
                    .addComponent(radio_inv))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_proj)
                    .addComponent(radio_folgas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_Confirma)
                    .addComponent(botao_Volta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radio_uniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_uniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_uniActionPerformed

    private void botao_ConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_ConfirmaActionPerformed
        if (radio_uni.isSelected() == true){
            Add_Universitario universitario = null;
            try {
                universitario = new Add_Universitario();
            } catch (ParseException ex) {
                Logger.getLogger(Choose.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Choose.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Choose.class.getName()).log(Level.SEVERE, null, ex);
            }
            universitario.setVisible(true);
        }else if (radio_proj.isSelected() == true){
            Add_Projeto projeto = null;
            try {
                projeto = new Add_Projeto();
            } catch (ParseException ex) {
                Logger.getLogger(Choose.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Choose.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Choose.class.getName()).log(Level.SEVERE, null, ex);
            }
            projeto.setVisible(true);
        }else if (radio_inv.isSelected() == true){
             Add_Inventario inventario = null;
            try {
                inventario = new Add_Inventario();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Choose.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Choose.class.getName()).log(Level.SEVERE, null, ex);
            }
            inventario.setVisible(true);
        }else if (radio_folgas.isSelected() == true){
            Add_Folgas folgas = null;
            try {
                folgas = new Add_Folgas();
            } catch (ParseException ex) {
                Logger.getLogger(Choose.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Choose.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Choose.class.getName()).log(Level.SEVERE, null, ex);
            }
            folgas.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "Selecione pelo menos uma opção !", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botao_ConfirmaActionPerformed

    private void radio_invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_invActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_invActionPerformed

    private void botao_VoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_VoltaActionPerformed
        dispose();
    }//GEN-LAST:event_botao_VoltaActionPerformed

    /**
     * @param args the command line arguments
     * @param tabela
     */
    public static void main(String args[], final JTabbedPane tabela) {
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
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Choose().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botao_Confirma;
    private javax.swing.JToggleButton botao_Volta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton radio_folgas;
    private javax.swing.JRadioButton radio_inv;
    private javax.swing.JRadioButton radio_proj;
    private javax.swing.JRadioButton radio_uni;
    // End of variables declaration//GEN-END:variables
}
