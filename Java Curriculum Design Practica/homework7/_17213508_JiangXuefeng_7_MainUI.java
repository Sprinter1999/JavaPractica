package homework7;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import homework5._17213508_JiangXuefeng_5_EmployeeUI;

public class _17213508_JiangXuefeng_7_MainUI extends JFrame{
    private JButton bBook;
    private JButton bBuy;
    private JButton bExit;
    private JButton bStrategy;
    private JLabel jLabel1;
    private JLabel jLabel5;
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(_17213508_JiangXuefeng_7_MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_17213508_JiangXuefeng_7_MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_17213508_JiangXuefeng_7_MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_17213508_JiangXuefeng_7_MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _17213508_JiangXuefeng_7_MainUI();

            }
        });
    }
	
	public _17213508_JiangXuefeng_7_MainUI()
	{
		initComponents();
		this.setTitle("Online Book Shopping Cart System");
		this.setVisible(true);
	}
	
	public void initComponents()
	{
		jLabel5 = new JLabel();
        bStrategy = new JButton();
        jLabel1 = new JLabel();
        bBook = new JButton();
        bExit = new JButton();
        bBuy = new JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 520));
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(size.width / 2 - 300, size.height / 2 - 300);

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 40)); 
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Book Store");
        
        bStrategy.setFont(new java.awt.Font("Consolas", 1, 14)); 
        bStrategy.setText("Strategy Manage");
        bStrategy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStrategyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); 
        jLabel1.setText("An online Book Shopping Cart System");

        bBook.setFont(new java.awt.Font("Consolas", 1, 14)); 
        bBook.setText("Add Book");
        bBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBookActionPerformed(evt);
            }
        });
        bExit.setFont(new java.awt.Font("Consolas", 1, 14)); 
        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        bBuy.setFont(new java.awt.Font("Consolas", 1, 14)); 
        bBuy.setText("Buy Book");
        bBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(200, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel1)))
                                                .addGap(189, 189, 189))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(bBook, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bStrategy, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(244, 244, 244))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(46, 46, 46)
                                .addComponent(bBook, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bStrategy, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }

    private void bBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuyActionPerformed
        new _17213508_JiangXuefeng_7_AddBookUI().setVisible(true);
        dispose();
    }

    private void bStrategyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuyActionPerformed
        new _17213508_JiangXuefeng_7_StrategiesUI().setVisible(true);
        dispose();
    }

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        JOptionPane.showMessageDialog(null, "这个程序将运行结束", "退出", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_bExitActionPerformed

    private void bBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuyActionPerformed
        new _17213508_JiangXuefeng_7_BuyUI().setVisible(true);
        dispose();
    }
	
	
	
	
}
