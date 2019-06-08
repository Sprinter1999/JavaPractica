package Text5;


import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class EmployeeUI extends JFrame{
	private Vector<Employee> employees;
	
	private int FrameWidth=800;
	private int FrameHeight=600;
	private int InnerWidth=400;
	private int InnerHeight=360;
    private static final int WidgetWidth=200;
    private static final int WidgetHeight=100;
    
	public EmployeeUI()
	{
		employees=new Vector<Employee>();
		initMainUI();
	}
	private void initMainUI()
    {
        // Show the menu bar
        initMenu();
        // Show the content
        this.add(new JLabel ("Employee简易管理系统", JLabel.CENTER));
        // Main Plot Setting
        setTitle ("Employee简易管理系统GUI");
        setSize (FrameWidth, FrameHeight);
        setLocationRelativeTo (null);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
    }
	private void initMenu()
	{
		//TODO: 主菜单
		/*
		 * 【员工信息录入】      		【信息查询】
		 *         ||
		 *         1.BPCE型 
		 *         2.CE型
		 * */
		//Create menu 1-1
        JMenuItem MenuBPCEmp = new JMenuItem("BasePlusCommisionEmployee");
        MenuBPCEmp.addActionListener((e) ->
        {
            BasePlusCommissionDialog dialog = new BasePlusCommissionDialog(this);
            dialog.setVisible(true);
        });

        // Create menu 1-2
        JMenuItem MenuCEmp = new JMenuItem("CommisionEmployee");
        MenuCEmp.addActionListener((e) ->
        {
            CommissionEmpDialog dialog = new CommissionEmpDialog(this);
            dialog.setVisible(true);
        });

        // Create menu 2-1
        JMenuItem MenuAverSearch = new JMenuItem("AverageEarningSearch");
        MenuAverSearch.addActionListener((e) ->
        {
            AverEarningDialog dialog = new AverEarningDialog();
            dialog.setVisible(true);
        });

        // Create menu 1
        JMenu mEmpInfoInput = new JMenu("EmployeeInfoInput");
        mEmpInfoInput.add(MenuBPCEmp);
        mEmpInfoInput.add(MenuCEmp);

        // Create menu 2
        JMenu mSearch = new JMenu("Search");
        mSearch.add(MenuAverSearch);

        // Create and show menu bar
        JMenuBar mMain = new JMenuBar();
        mMain.add(mEmpInfoInput);
        mMain.add(mSearch);
        this.setJMenuBar(mMain);
	}
	private class CommissionEmpDialog extends JDialog
    {
        public CommissionEmpDialog(JFrame f)
        {
            super(f);
            initUI();
        }

        private void initUI()
        {
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(6, 2));

            panel.add(new JLabel("First name: "));
            JTextField firstNameField = new JTextField();
            panel.add(firstNameField);

            panel.add(new JLabel("Last name: "));
            JTextField lastNameField = new JTextField();
            panel.add(lastNameField);

            panel.add(new JLabel("Social security num: "));
            JTextField secNumField = new JTextField();
            panel.add(secNumField);

            panel.add(new JLabel("Gross sales: "));
            JTextField salesField = new JTextField();
            panel.add(salesField);

            panel.add(new JLabel("Commission rate: "));
            JTextField rateField = new JTextField();
            panel.add(rateField);

            // Add "submit" button
            JButton bSubmit= new JButton("submit");
            bSubmit.addActionListener((event) ->
            {
                try
                {
                    // Make sure security number is no empty
                    if (secNumField.getText().equals(""))
                        throw new IllegalArgumentException();
                    Employee tempEmployee=new CommissionEmployee
                    		(
                    		Double.parseDouble(rateField.getText()),
                            Double.parseDouble(salesField.getText()),
                            firstNameField.getText(),
                            lastNameField.getText(),
                            secNumField.getText()
                            );
                    employees.add(tempEmployee);

                    System.out.println("输入了一个CommissionEmployee"+" ,信息如下\n"+tempEmployee.toString());
                }
                catch (Exception e)
                {
                    ErrorLog log = new ErrorLog();
                    log.setVisible(true);
                }
                finally
                {
                    this.dispose();
                }
            });
            panel.add(bSubmit);

            // Add "cancel" button
            JButton bCancel = new JButton("Cancel");
            bCancel.addActionListener ((event) ->
            {
                this.dispose();
            });
            panel.add(bCancel);

            // Add panel and resize
            this.add(panel);
            this.pack();

            setTitle ("Create A Commision Employee");
            setDefaultCloseOperation (DISPOSE_ON_CLOSE);
            setLocationRelativeTo (getParent());
            setSize(InnerWidth, InnerHeight);
        }
    }
	class BasePlusCommissionDialog extends JDialog
    {
        public BasePlusCommissionDialog(JFrame f)
        {
            super(f);
            initUI();
        }

        private void initUI()
        {
            JPanel panel=new JPanel();
            panel.setLayout(new GridLayout(7,2));

            panel.add(new JLabel("First name:"));
            JTextField firstNameField=new JTextField();
            panel.add(firstNameField);

            panel.add(new JLabel("Last name: "));
            JTextField lastNameField = new JTextField();
            panel.add(lastNameField);

            panel.add(new JLabel("Social security num: "));
            JTextField secNumField = new JTextField();
            panel.add(secNumField);

            panel.add(new JLabel("Base salary: "));
            JTextField baseSalaryField = new JTextField();
            panel.add(baseSalaryField);

            panel.add(new JLabel("Gross sales: "));
            JTextField salesField = new JTextField();
            panel.add(salesField);

            panel.add(new JLabel("Commission rate: "));
            JTextField rateField = new JTextField();
            panel.add(rateField);

            // Add "submit" button
            JButton bSubmit= new JButton("submit");
            bSubmit.addActionListener((event) ->
            {
                try
                {
                    // Make sure security number is no empty
                    if (secNumField.getText().equals(""))
                        throw new IllegalArgumentException();

                    Employee tempEmployee=new BasePlusCommissionEmployee
                    		(
	                    		Double.parseDouble(baseSalaryField.getText()),
	                            Double.parseDouble(rateField.getText()),
	                            Double.parseDouble(salesField.getText()),
	                            firstNameField.getText(),
	                            lastNameField.getText(),
	                            secNumField.getText()
                            );
                    employees.add(tempEmployee);

                    System.out.println("输入了一个BasePlusCommissionEmployee"+" ,信息如下\n"+tempEmployee.toString());
                }
                catch (Exception e)
                {
                    ErrorLog log = new ErrorLog();
                    log.setVisible(true);
                }
                finally
                {
                    this.dispose();
                }
            });
            panel.add(bSubmit);

            // Add "cancel" button
            JButton bCancel = new JButton("Cancel");
            bCancel.addActionListener ((event) ->
            {
                this.dispose();
            });
            panel.add(bCancel);

            // Add panel and resize
            this.add(panel);
            this.pack();

            // Setting layout
            setTitle ("Create A Base Plus Commision Employee");
            setDefaultCloseOperation (DISPOSE_ON_CLOSE);
            setLocationRelativeTo (getParent ());
            setSize(InnerWidth, InnerHeight);
        }
    }
	
    class ErrorLog extends JDialog
    {
        public ErrorLog()
        {
            super();
            initUI();
        }

        private void initUI ()
        {
            // Show error info
            this.add(new JLabel("Invalid input! Please try again", JLabel.CENTER));
            this.pack();

            setTitle ("An Error Occurs!");
            setDefaultCloseOperation (DISPOSE_ON_CLOSE);
            setLocationRelativeTo (getParent());
            setSize(WidgetWidth, WidgetHeight);
            this.setModal(true);
        }
    }

    class AverEarningDialog extends JDialog
    {
        public AverEarningDialog()
        {
            super();
            initUI();
        }

        private void initUI()
        {
            // Show info
            this.add(new JLabel("Average Earning: " + getAverWage(), JLabel.CENTER));
            this.pack();
            System.out.println("进行了一次查询，平均工资为: "+getAverWage()+"$");
            setTitle ("Average Earning Window");
            setDefaultCloseOperation (DISPOSE_ON_CLOSE);
            setLocationRelativeTo (getParent());
            setSize(WidgetWidth, WidgetHeight);
        }
    }
    private double getAverWage()//计算平均工资
    {
        if(0==employees.size()) 
        	return 0;

        double sum=0.0;

        for(Employee te:employees)
            sum+=te.earning();

        return sum/employees.size();
    }


	public static void main(String[] args) 
	{
		System.out.println("用户事件日志");
		//线程不安全，单线程，事件触发
		EventQueue.invokeLater(() ->
	    {
	        EmployeeUI gui = new EmployeeUI();
	        gui.setVisible(true);
	    });
	}
}
