package homework7;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class _17213508_JiangXuefeng_7_AddBookUI extends JFrame {
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tISBN;
    private javax.swing.JTextField tName;
    private javax.swing.JTextField tPrice;
    private javax.swing.JComboBox<String> tType;
	
	public _17213508_JiangXuefeng_7_AddBookUI(){
		this.setTitle("Add Book UI");
        initComponents();
    }
    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        tName = new JTextField();
        tISBN = new JTextField();
        tPrice = new JTextField();
        jLabel5 = new JLabel();
        bCancel = new JButton();
        bSubmit = new JButton();
        tType = new JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(450, 520));
        setLocationRelativeTo(getParent());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 13)); 
        jLabel1.setText("ISBN Num");
        jLabel1.setSize(new java.awt.Dimension(0, 80));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 13)); 
        jLabel2.setText("Book Name");
        jLabel2.setSize(new java.awt.Dimension(0, 80));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 13)); 
        jLabel3.setText("Book Type");
        jLabel3.setSize(new java.awt.Dimension(0, 80));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 13)); 
        jLabel4.setText("Net Price");
        jLabel4.setSize(new java.awt.Dimension(0, 80));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 48)); 
        jLabel5.setText("Add Book");

        bCancel.setFont(new java.awt.Font("Consolas", 0, 13)); 
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

        tType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "非教材类计算机图书", "教材类图书", "连环画类图书", "养生类图书", "其他" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tName)
                                        .addComponent(tPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(tISBN)
                                        .addComponent(tType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(43, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(82, 82, 82))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(72, 72, 72))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(bSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(273, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(445, Short.MAX_VALUE)
                                        .addComponent(bSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)))
        );

        pack();
    }

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        new _17213508_JiangXuefeng_7_MainUI().setVisible(true);
        this.dispose();
    }

    private void bSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitActionPerformed
        try{
            String isbn = tISBN.getText();
            double price = Double.parseDouble(tPrice.getText());
            String name = tName.getText();
            int type = tType.getSelectedIndex();
            if (isbn.equals("")) throw new Exception("ISBN号不能为空！");
            if (name.equals("")) throw new Exception("书名不能为空！");
            if (price <= 0 ) throw new Exception("价格不能为负数！");

            _17213508_JiangXuefeng_7_Controller.getInstance().addBook(isbn, price, name, type);

            JOptionPane.showMessageDialog(null, "添加成功！", "成功", JOptionPane.INFORMATION_MESSAGE);
            new _17213508_JiangXuefeng_7_MainUI().setVisible(true);
            this.dispose();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);

        }
    }

}
