package homework7;

import javax.swing.JOptionPane;

public class _17213508_JiangXuefeng_7_BuyUI extends javax.swing.JFrame
{
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bCancel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tNum;
    private javax.swing.JTable tBooks;
    
    /* The controller "pointer" */
    private _17213508_JiangXuefeng_7_Controller controll = _17213508_JiangXuefeng_7_Controller.getInstance();
    private _17213508_JiangXuefeng_7_ShoppingCartUI shoppingCartUI = new _17213508_JiangXuefeng_7_ShoppingCartUI();
    private _17213508_JiangXuefeng_7_Sale sale = controll.getSale();

    /**
     * Creates new form StrategiesUI
     */
    public _17213508_JiangXuefeng_7_BuyUI()
    {
        sale.registerObserver(shoppingCartUI);
        this.setTitle("Buy Book UI");
        initComponents();
    }

    private void updateRowData(javax.swing.JTable jBooks)
    {
        String[][] rowsData = controll.getAllBooksInfo();

        tBooks.setModel(new javax.swing.table.DefaultTableModel(
                rowsData,
                new String [] {
                        "ISBN", "书名", "类型", "单价", "优惠"
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tBooks = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(450, 520));
        setLocationRelativeTo(getParent());

        updateRowData(tBooks);

        jScrollPane1.setViewportView(tBooks);

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Buy Book");

        bAdd.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        bAdd.setText("AddToCart");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bCancel.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        bCancel.setText("Exit");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setText("Quantity:");

        tNum.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setText("Click the book that you want to buy");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setText("Books");

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
                                .addGap(66, 213, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)
                                .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addGap(54, 54, 54)
                                .addComponent(tNum, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(tNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        new _17213508_JiangXuefeng_7_MainUI().setVisible(true);
        shoppingCartUI.dispose();

        this.dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            int bookIdx = tBooks.getSelectedRow();
            if (bookIdx < 0) throw new Exception("请点击选中想要购买的书籍!");
            String ISBN = tBooks.getValueAt(bookIdx, 0).toString();
            int num = Integer.parseInt(tNum.getText());

            controll.buyBook(ISBN, num);
            
            JOptionPane.showMessageDialog(null, "添加成功！", "成功", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
        }

    }


}