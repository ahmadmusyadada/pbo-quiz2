/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahmadmusyadada;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author Ahmad Musyadad A
 */
public class TransaksiFrame extends javax.swing.JFrame {
    Item barang;
    Penjualan item = new Penjualan();
    int code;
    DateFormat dateFormat;
    Date date;
    int allTotal;
    /**
     * Creates new form TransaksiFrame
     */
    public TransaksiFrame() {
        initComponents();
        IsiComboBox();
        jTableTransaksi.setModel(item.getTabel());
        code = 0;
        dateFormat = new SimpleDateFormat("yyMMdd");
	date = new Date();
        jTextFieldCode.setEditable(false);
        jTextFieldCode.setEnabled(false);
        jButtonAdd.setEnabled(false);
        jButtonRemove.setEnabled(false);
        jComboBoxItems.setEnabled(false);
        jTextFieldJumlah.setEnabled(false);
        jButtonSave.setEnabled(false);
        jButtonCancel.setEnabled(false);
    }
    
//    public void setEditable(boolean b){
//        jTextFieldCode.setEditable(b);
//    }
    
    private void IsiComboBox(){
        Item barang1 = new Item("Kopi", 5000);
        Item barang2 = new Item("Susu", 8000);
        Item barang3 = new Item("Gula", 3000);
        
        jComboBoxItems.addItem(barang1);
        jComboBoxItems.addItem(barang2);
        jComboBoxItems.addItem(barang3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabelCode = new javax.swing.JLabel();
        jLabelItems = new javax.swing.JLabel();
        jTextFieldCode = new javax.swing.JTextField();
        jComboBoxItems = new javax.swing.JComboBox();
        jTextFieldJumlah = new javax.swing.JTextField();
        jButtonNew = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTransaksi = new javax.swing.JTable();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCode.setText("Code");

        jLabelItems.setText("Items");

        jTextFieldCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodeActionPerformed(evt);
            }
        });

        jComboBoxItems.setNextFocusableComponent(jTextFieldJumlah);
        jComboBoxItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxItemsActionPerformed(evt);
            }
        });

        jTextFieldJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJumlahActionPerformed(evt);
            }
        });
        jTextFieldJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldJumlahKeyTyped(evt);
            }
        });

        jButtonNew.setText("New");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jTableTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tittle 1", "Tittle 2", "Tittle 3"
            }
        ));
        jScrollPane1.setViewportView(jTableTransaksi);

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelCode)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCode)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelItems)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxItems, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSave)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonCancel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCode)
                    .addComponent(jTextFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNew))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelItems)
                    .addComponent(jComboBoxItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRemove)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldCodeActionPerformed

    private void jTextFieldJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJumlahActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        // TODO add your handling code here:
        code++;
        jTextFieldCode.setText(dateFormat.format(date)+String.format("%02d", code));
        jComboBoxItems.setEnabled(true);
        jTextFieldJumlah.setEnabled(true);
        jButtonCancel.setEnabled(true);
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jComboBoxItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxItemsActionPerformed
        // TODO add your handling code here:
        barang = (Item)jComboBoxItems.getSelectedItem();
    }//GEN-LAST:event_jComboBoxItemsActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        int jumlah = Integer.parseInt(jTextFieldJumlah.getText());
        String harga = String.valueOf(barang.getHarga());
     
        if (item.getTabel().getRowCount()==0) {
            item.getTabel().addRow(new Object[]{barang.getNamaBarang(), harga, jTextFieldJumlah.getText()});
        } else {
            for (int i = 0; i < item.getTabel().getRowCount(); i++) {
                if (item.getTabel().getValueAt(i, 0).toString().equals(barang.getNamaBarang())){
                    item.getTabel().setValueAt(Integer.parseInt(item.getTabel().getValueAt(i, 2).toString()) + Integer.parseInt(jTextFieldJumlah.getText()), i, 2);
                    break;
                } else {
                    if (!item.getTabel().getValueAt(item.getTabel().getRowCount()-1, 0).toString().equals(barang.getNamaBarang())
                            && (i == item.getTabel().getRowCount()-1)) {
                        item.getTabel().addRow(new Object[]{barang.getNamaBarang(), harga, jTextFieldJumlah.getText()});
                        break;
                    }
                }
            }
        }
        
        if (item.getTabel().getRowCount() != 0) {
            jButtonRemove.setEnabled(true);
            jButtonSave.setEnabled(true);
        }
        jComboBoxItems.requestFocus();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        sb.append("Kode: ").append(dateFormat.format(date)+String.format("%02d", code)).append("\n");
        sb.append("Daftar belanja:\n").append(item.listTransaction());
        sb.append("Total: ").append(item.countTotal()).append("\n");
        JOptionPane.showMessageDialog(this, sb, "Detail Transaksi", JOptionPane.INFORMATION_MESSAGE);
        item.getTabel().setRowCount(0);
        jButtonRemove.setEnabled(false);
        jButtonSave.setEnabled(false);
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // TODO add your handling code here:
        try {
            item.getTabel().removeRow((int)jTableTransaksi.getSelectedRow());
            if (item.getTabel().getRowCount() == 0) {
                jButtonRemove.setEnabled(false);
                jButtonSave.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select one of the lines to be deleted", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        jTextFieldJumlah.setText("");
        item.getTabel().setRowCount(0);
        jButtonRemove.setEnabled(false);
        jButtonSave.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextFieldJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldJumlahKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        jTextFieldJumlah.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) { //watch for key strokes
            if(jTextFieldJumlah.getText().length() == 0)
                jButtonAdd.setEnabled(false);
            else
            {
                jButtonAdd.setEnabled(true);
            }
        }
        });
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldJumlahKeyTyped

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
            java.util.logging.Logger.getLogger(TransaksiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransaksiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransaksiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransaksiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransaksiFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox jComboBoxItems;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelItems;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTransaksi;
    private javax.swing.JTextField jTextFieldCode;
    private javax.swing.JTextField jTextFieldJumlah;
    // End of variables declaration//GEN-END:variables
}