package homework7;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class _17213508_JiangXuefeng_7_StrategiesUI extends javax.swing.JFrame
{
    /* The controller "pointer" */
    _17213508_JiangXuefeng_7_Controller controller = _17213508_JiangXuefeng_7_Controller.getInstance();

    public _17213508_JiangXuefeng_7_StrategiesUI() {
    	this.setTitle("Strategy UI");
        initComponents();
    }

    private void updateRowData(javax.swing.JTable tStrategies)
    {
        String[][] rowsData = controller.getAllStrategiesInfo();

        tStrategies.setModel(new javax.swing.table.DefaultTableModel(rowsData,
                new String [] {
                        "优惠编号", "优惠名字", "优惠类型", "适用书籍", "参数"
                }));
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tStrategies = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        bDelete = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bReload = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        bAdd1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(450, 520));
        setLocationRelativeTo(getParent());

        String[][] rowsData = controller.getAllStrategiesInfo();

        tStrategies.setModel(new javax.swing.table.DefaultTableModel(
                rowsData,
                new String [] {
                        "优惠编号", "优惠名字", "优惠类型", "适用书籍", "参数"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        jScrollPane1.setViewportView(tStrategies);

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Strategies:");

        bDelete.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bUpdate.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bReload.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        bReload.setText("Renew");
        bReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReloadActionPerformed(evt);
            }
        });

        bCancel.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        bCancel.setText("Exit");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        bAdd1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        bAdd1.setText("Add");
        bAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdd1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(bReload)
                                .addGap(66, 66, 66))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(bReload, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
        );

        pack();
    }

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int strategyIdx = tStrategies.getSelectedRow();
            if (strategyIdx < 0) throw new Exception("请点击选中想要删除的策略！");
            String ID = tStrategies.getValueAt(strategyIdx, 0).toString();
            controller.deleteStrategy(ID);

            /* Remove from the table */
            DefaultTableModel model = (DefaultTableModel) tStrategies.getModel();
            model.removeRow(strategyIdx);
            tStrategies.setModel(model);
            JOptionPane.showMessageDialog(null, "删除成功！", "成功", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            int strategyIdx = tStrategies.getSelectedRow();
            if (strategyIdx < 0) throw new Exception("请点击选中想要编辑的策略！");

            String ID = tStrategies.getValueAt(strategyIdx, 0).toString();

            new _17213508_JiangXuefeng_7_UpdateStrategyUI(ID).setVisible(true);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void bReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReloadActionPerformed
        updateRowData(tStrategies);
    }//GEN-LAST:event_bReloadActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        new _17213508_JiangXuefeng_7_MainUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void bAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdd1ActionPerformed
        new _17213508_JiangXuefeng_7_AddStrategyUI().setVisible(true);
    }//GEN-LAST:event_bAdd1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd1;
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bReload;
    private javax.swing.JButton bUpdate;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tStrategies;
}

