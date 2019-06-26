package homework7;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.HashSet;

import javax.swing.JOptionPane;

public class _17213508_JiangXuefeng_7_AddStrategyUI extends javax.swing.JFrame
{
    private javax.swing.JCheckBox cType0;
    private javax.swing.JCheckBox cType1;
    private javax.swing.JCheckBox cType2;
    private javax.swing.JCheckBox cType3;
    private javax.swing.JCheckBox cType4;
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tID;
    private javax.swing.JTextField tName;
    private javax.swing.JTextField tParas;
    private javax.swing.JComboBox<String> tType;
    
    _17213508_JiangXuefeng_7_Controller controller = _17213508_JiangXuefeng_7_Controller.getInstance();

    public _17213508_JiangXuefeng_7_AddStrategyUI() {
//        System.out.println("Add Strategy");
    	this.setTitle("Add Strategy UI");
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tName = new javax.swing.JTextField();
        tID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bCancel = new javax.swing.JButton();
        bSubmit = new javax.swing.JButton();
        tType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tParas = new javax.swing.JTextField();
        cType0 = new javax.swing.JCheckBox();
        cType1 = new javax.swing.JCheckBox();
        cType2 = new javax.swing.JCheckBox();
        cType3 = new javax.swing.JCheckBox();
        cType4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(450, 520));
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(0, size.height / 2 - 300);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 9)); // NOI18N
        jLabel1.setText("Strategy Number");
        jLabel1.setSize(new java.awt.Dimension(0, 80));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 9)); // NOI18N
        jLabel2.setText("Strategy Name");
        jLabel2.setSize(new java.awt.Dimension(0, 80));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 9)); // NOI18N
        jLabel3.setText("Strategy Type");
        jLabel3.setSize(new java.awt.Dimension(0, 80));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 9)); // NOI18N
        jLabel4.setText("Relative Books");
        jLabel4.setSize(new java.awt.Dimension(0, 80));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel5.setText("Add Strategy");

        bCancel.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        bSubmit.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        bSubmit.setText("Submit");
        bSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitActionPerformed(evt);
            }
        });

        tType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "绝对值优惠策略", "百分比优惠策略", "顾客最优策略", " " }));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jLabel6.setText("Parameters");
        jLabel6.setSize(new java.awt.Dimension(0, 80));

        cType0.setText("非教材计算机");
        cType1.setText("教材类");
        cType2.setText("连环画");
        cType3.setText("养生类");
        cType4.setText("其他");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tParas, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cType0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cType2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cType3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cType1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cType4))
                                                .addGap(6, 6, 6))
                                        .addComponent(tID, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(50, 50, 50))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(bSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(38, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(108, 108, 108))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cType0)
                                                                .addGap(5, 5, 5)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(cType2)
                                                                        .addComponent(cType3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cType4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cType1)
                                                                .addGap(63, 63, 63)
                                                                .addComponent(tParas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(36, 36, 36))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void bSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitActionPerformed
        try{
            String ID = tID.getText();
            String name = tName.getText();
            HashSet<Integer> books = new HashSet<Integer>();
            String paras = tParas.getText();
            int type = tType.getSelectedIndex();

            if (cType0.isSelected()) books.add(_17213508_JiangXuefeng_7_BookSpecification.NoComputerBook);
            if (cType1.isSelected()) books.add(_17213508_JiangXuefeng_7_BookSpecification.TextBook);
            if (cType2.isSelected()) books.add(_17213508_JiangXuefeng_7_BookSpecification.ComicBook);
            if (cType3.isSelected()) books.add(_17213508_JiangXuefeng_7_BookSpecification.DietBook);
            if (cType4.isSelected()) books.add(_17213508_JiangXuefeng_7_BookSpecification.Other);

            controller.addStrategy(type, paras, books, ID, name);

            System.out.println(_17213508_JiangXuefeng_7_PricingStrategyFactory.getInstance().getPricingStrategy(ID));
            this.dispose();

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);

        }
    }

}
