package restaurantautomation;

import beans.Employee;
import beans.Order;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import beans.table;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import operations.EmployeeOperations;
import operations.OrderOperations;
import operations.TableOperations;
//Everybody gets the window, only floor manager reads it

public class Table_Gui extends JFrame {
    
    TableOperations to= new TableOperations();
    EmployeeOperations eo= new EmployeeOperations();
    java.util.List<table> tables = new ArrayList<>();
    int table_selected = 0;
    /**
     * Creates new form Table_Gui
     */
    public Table_Gui(Employee employee) {
        
        //static ArrayList <table> tables = new ArrayList <Table> ();
        try {
            if(employee.getPositionID()==2)
                tables=to.getTableByEmp(employee.getEmployeeID());
            else
                tables=to.getAlltable();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Table_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        setTableColor();
        setVisiblity(employee);
    }
    
    private void setTableColor(){
        for(int i=0; i<tables.size();i++){
            if(tables.get(i).getTableStatus().equalsIgnoreCase("Free")){
                        switch (tables.get(i).getTableID()) {
                            case 1:
                                table_1_button.setBackground(new java.awt.Color(153, 255, 153));
                                table_1_panel.setBackground(new java.awt.Color(153, 255, 153));
                                break;
                            case 2:
                                table_2_button.setBackground(new java.awt.Color(153, 255, 153));
                                table_2_panel.setBackground(new java.awt.Color(153, 255, 153));
                                break;
                            case 3:
                                table_3_button.setBackground(new java.awt.Color(153, 255, 153));
                                table_3_panel.setBackground(new java.awt.Color(153, 255, 153));
                                break;
                            case 4:
                                table_4_button.setBackground(new java.awt.Color(153, 255, 153));
                                table_4_panel.setBackground(new java.awt.Color(153, 255, 153));
                                break;
                            case 5:
                                table_5_button.setBackground(new java.awt.Color(153, 255, 153));
                                table_5_panel.setBackground(new java.awt.Color(153, 255, 153));
                                break;
                            case 6:
                                table_6_button.setBackground(new java.awt.Color(153, 255, 153));
                                table_6_panel.setBackground(new java.awt.Color(153, 255, 153));
                                break;
                            case 7:
                                table_7_button.setBackground(new java.awt.Color(153, 255, 153));
                                table_7_panel.setBackground(new java.awt.Color(153, 255, 153));
                                break;
                            case 8:
                                table_8_button.setBackground(new java.awt.Color(153, 255, 153));
                                table_8_panel.setBackground(new java.awt.Color(153, 255, 153));
                                break;
                        }
            }else if(tables.get(i).getTableStatus().equalsIgnoreCase("Used")){
                         switch (tables.get(i).getTableID()) {
                            case 1:
                                table_1_button.setBackground(new java.awt.Color(255, 204, 102));
                                table_1_panel.setBackground(new java.awt.Color(255, 204, 102));
                                break;
                            case 2:
                                table_2_button.setBackground(new java.awt.Color(255, 204, 102));
                                table_2_panel.setBackground(new java.awt.Color(255, 204, 102));
                                break;
                            case 3:
                                table_3_button.setBackground(new java.awt.Color(255, 204, 102));
                                table_3_panel.setBackground(new java.awt.Color(255, 204, 102));
                                break;
                            case 4:
                                table_4_button.setBackground(new java.awt.Color(255, 204, 102));
                                table_4_panel.setBackground(new java.awt.Color(255, 204, 102));
                                break;
                            case 5:
                                table_5_button.setBackground(new java.awt.Color(255, 204, 102));
                                table_5_panel.setBackground(new java.awt.Color(255, 204, 102));
                                break;
                            case 6:
                                table_6_button.setBackground(new java.awt.Color(255, 204, 102));
                                table_6_panel.setBackground(new java.awt.Color(255, 204, 102));
                                break;
                            case 7:
                                table_7_button.setBackground(new java.awt.Color(255, 204, 102));
                                table_7_panel.setBackground(new java.awt.Color(255, 204, 102));
                                break;
                            case 8:
                                table_8_button.setBackground(new java.awt.Color(255, 204, 102));
                                table_8_panel.setBackground(new java.awt.Color(255, 204, 102));
                                break;
                        }
            }else{
                        switch (tables.get(i).getTableID()) {
                            case 1:
                                table_1_button.setBackground(new java.awt.Color(255, 153, 153));
                                table_1_panel.setBackground(new java.awt.Color(255, 153, 153));
                                break;
                            case 2:
                                table_2_button.setBackground(new java.awt.Color(255, 153, 153));
                                table_2_panel.setBackground(new java.awt.Color(255, 153, 153));
                                break;
                            case 3:
                                table_3_button.setBackground(new java.awt.Color(255, 153, 153));
                                table_3_panel.setBackground(new java.awt.Color(255, 153, 153));
                                break;
                            case 4:
                                table_4_button.setBackground(new java.awt.Color(255, 153, 153));
                                table_4_panel.setBackground(new java.awt.Color(255, 153, 153));
                                break;
                            case 5:
                                table_5_button.setBackground(new java.awt.Color(255, 153, 153));
                                table_5_panel.setBackground(new java.awt.Color(255, 153, 153));
                                break;
                            case 6:
                                table_6_button.setBackground(new java.awt.Color(255, 153, 153));
                                table_6_panel.setBackground(new java.awt.Color(255, 153, 153));
                                break;
                            case 7:
                                table_7_button.setBackground(new java.awt.Color(255, 153, 153));
                                table_7_panel.setBackground(new java.awt.Color(255, 153, 153));
                                break;
                            case 8:
                                table_8_button.setBackground(new java.awt.Color(255, 153, 153));
                                table_8_panel.setBackground(new java.awt.Color(255, 153, 153));
                                break;
                        }
            
            } 
                
        }
            
    }
    private void setVisiblity(Employee employee){
       
        
        if(employee.getPositionID()==2){
        table_1_button.setVisible(false);
        table_2_button.setVisible(false);
        table_3_button.setVisible(false);
        table_4_button.setVisible(false);
        table_5_button.setVisible(false);
        table_6_button.setVisible(false);
        table_7_button.setVisible(false);
        table_8_button.setVisible(false);
        table_1_panel.setVisible(false);
        table_2_panel.setVisible(false);
        table_3_panel.setVisible(false);
        table_4_panel.setVisible(false);
        table_5_panel.setVisible(false);
        table_6_panel.setVisible(false);
        table_7_panel.setVisible(false);
        table_8_panel.setVisible(false);
            for(int i=0; i<tables.size();i++)
                switch (tables.get(i).getTableID()) {
            case 1:
                table_1_panel.setVisible(true);
                table_1_button.setVisible(true);
                break;
            case 2:
                table_2_panel.setVisible(true);
                table_2_button.setVisible(true);
                break;
            case 3:
                table_3_panel.setVisible(true);
                table_3_button.setVisible(true);
                break;
            case 4:
                table_4_panel.setVisible(true);
                table_4_button.setVisible(true);
                break;
            case 5:
                table_5_panel.setVisible(true);
                table_5_button.setVisible(true);
                break;
            case 6:
                table_6_panel.setVisible(true);
                table_6_button.setVisible(true);
                break;
            case 7:
                table_7_panel.setVisible(true);
                table_7_button.setVisible(true);
                break;
            case 8:
                table_8_panel.setVisible(true);
                table_8_button.setVisible(true);
                break;
        }
            setFreeButton.setVisible(false);
             setUsedButton.setVisible(false);
             jComboBox1.setVisible(false);
             set_waiter.setVisible(false);
        }
        else if(employee.getPositionID()==1)
        {
            tableStatusTabPanel.remove(orderPanel);
            setDirtyButton.setVisible(false);
            setFreeButton.setVisible(false);
            
            
        }
         else if(employee.getPositionID()==3)
        {
            tableStatusTabPanel.remove(orderPanel);
            setDirtyButton.setVisible(false);
            setUsedButton.setVisible(false);
            set_waiter.setVisible(false);
             jComboBox1.setVisible(false);
            
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablesPanel = new javax.swing.JPanel();
        table_1_panel = new javax.swing.JPanel();
        table_1_button = new javax.swing.JToggleButton();
        table_2_panel = new javax.swing.JPanel();
        table_2_button = new javax.swing.JToggleButton();
        table_3_panel = new javax.swing.JPanel();
        table_3_button = new javax.swing.JToggleButton();
        table_4_panel = new javax.swing.JPanel();
        table_4_button = new javax.swing.JToggleButton();
        table_5_panel = new javax.swing.JPanel();
        table_5_button = new javax.swing.JToggleButton();
        table_6_panel = new javax.swing.JPanel();
        table_6_button = new javax.swing.JToggleButton();
        table_7_panel = new javax.swing.JPanel();
        table_7_button = new javax.swing.JToggleButton();
        table_8_panel = new javax.swing.JPanel();
        table_8_button = new javax.swing.JToggleButton();
        ctrlTableLabel = new javax.swing.JLabel();
        detailPanel = new javax.swing.JPanel();
        tableStatusTabPanel = new javax.swing.JTabbedPane();
        orderPanel = new javax.swing.JPanel();
        ordersTableLabel = new javax.swing.JLabel();
        addOrderButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemListTextArea = new javax.swing.JTextArea();
        refreshOrdersButton = new javax.swing.JButton();
        statusPanel = new javax.swing.JPanel();
        setFreeButton = new javax.swing.JButton();
        setDirtyButton = new javax.swing.JButton();
        setUsedButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        statusTableLabel = new javax.swing.JLabel();
        logOffButton = new javax.swing.JButton();
        set_waiter = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        waitWebPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resturant_Layout");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1200, 1000));
        setMinimumSize(new java.awt.Dimension(1200, 1000));
        setResizable(false);

        tablesPanel.setBackground(new java.awt.Color(255, 255, 255));

        table_1_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_1_button.setBackground(new java.awt.Color(153, 255, 153));
        table_1_button.setText("Table 1");
        table_1_button.setToolTipText("Select Table 1");
        table_1_button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table_1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_1_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_1_panelLayout = new javax.swing.GroupLayout(table_1_panel);
        table_1_panel.setLayout(table_1_panelLayout);
        table_1_panelLayout.setHorizontalGroup(
            table_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_1_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        table_1_panelLayout.setVerticalGroup(
            table_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_1_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_2_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_2_button.setBackground(new java.awt.Color(153, 255, 153));
        table_2_button.setText("Table 2");
        table_2_button.setToolTipText("Select Table 2");
        table_2_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_2_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_2_panelLayout = new javax.swing.GroupLayout(table_2_panel);
        table_2_panel.setLayout(table_2_panelLayout);
        table_2_panelLayout.setHorizontalGroup(
            table_2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, table_2_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_2_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        table_2_panelLayout.setVerticalGroup(
            table_2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_2_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_2_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_3_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_3_button.setBackground(new java.awt.Color(153, 255, 153));
        table_3_button.setText("Table 3");
        table_3_button.setToolTipText("Select Table 3");
        table_3_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_3_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_3_panelLayout = new javax.swing.GroupLayout(table_3_panel);
        table_3_panel.setLayout(table_3_panelLayout);
        table_3_panelLayout.setHorizontalGroup(
            table_3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_3_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_3_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        table_3_panelLayout.setVerticalGroup(
            table_3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, table_3_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(table_3_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        table_4_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_4_button.setBackground(new java.awt.Color(153, 255, 153));
        table_4_button.setText("Table 4");
        table_4_button.setToolTipText("Select Table 4");
        table_4_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_4_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_4_panelLayout = new javax.swing.GroupLayout(table_4_panel);
        table_4_panel.setLayout(table_4_panelLayout);
        table_4_panelLayout.setHorizontalGroup(
            table_4_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, table_4_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_4_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        table_4_panelLayout.setVerticalGroup(
            table_4_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_4_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_4_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_5_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_5_button.setBackground(new java.awt.Color(153, 255, 153));
        table_5_button.setText("Table 5");
        table_5_button.setToolTipText("Select Table 5");
        table_5_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_5_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_5_panelLayout = new javax.swing.GroupLayout(table_5_panel);
        table_5_panel.setLayout(table_5_panelLayout);
        table_5_panelLayout.setHorizontalGroup(
            table_5_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_5_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_5_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        table_5_panelLayout.setVerticalGroup(
            table_5_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_5_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_5_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        table_6_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_6_button.setBackground(new java.awt.Color(153, 255, 153));
        table_6_button.setText("Table 6");
        table_6_button.setToolTipText("Select Table 6");
        table_6_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_6_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_6_panelLayout = new javax.swing.GroupLayout(table_6_panel);
        table_6_panel.setLayout(table_6_panelLayout);
        table_6_panelLayout.setHorizontalGroup(
            table_6_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_6_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_6_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        table_6_panelLayout.setVerticalGroup(
            table_6_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_6_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_6_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_7_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_7_button.setBackground(new java.awt.Color(153, 255, 153));
        table_7_button.setText("Table 7");
        table_7_button.setToolTipText("Select Table 7");
        table_7_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_7_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_7_panelLayout = new javax.swing.GroupLayout(table_7_panel);
        table_7_panel.setLayout(table_7_panelLayout);
        table_7_panelLayout.setHorizontalGroup(
            table_7_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, table_7_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(table_7_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        table_7_panelLayout.setVerticalGroup(
            table_7_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_7_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_7_button, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        table_8_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_8_button.setBackground(new java.awt.Color(153, 255, 153));
        table_8_button.setText("Table 8");
        table_8_button.setToolTipText("Select Table 8");
        table_8_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_8_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_8_panelLayout = new javax.swing.GroupLayout(table_8_panel);
        table_8_panel.setLayout(table_8_panelLayout);
        table_8_panelLayout.setHorizontalGroup(
            table_8_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_8_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_8_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        table_8_panelLayout.setVerticalGroup(
            table_8_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_8_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_8_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ctrlTableLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        ctrlTableLabel.setText("No Table");

        javax.swing.GroupLayout tablesPanelLayout = new javax.swing.GroupLayout(tablesPanel);
        tablesPanel.setLayout(tablesPanelLayout);
        tablesPanelLayout.setHorizontalGroup(
            tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablesPanelLayout.createSequentialGroup()
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablesPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(table_1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table_5_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(table_2_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(table_6_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(table_3_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(table_7_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(table_4_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(table_8_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(tablesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ctrlTableLabel)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        tablesPanelLayout.setVerticalGroup(
            tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablesPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table_1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table_2_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table_3_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table_4_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(table_8_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table_6_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table_5_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table_7_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(ctrlTableLabel)
                .addGap(162, 162, 162))
        );

        detailPanel.setBackground(new java.awt.Color(255, 255, 255));

        tableStatusTabPanel.setBackground(new java.awt.Color(255, 255, 255));
        tableStatusTabPanel.setToolTipText("");
        tableStatusTabPanel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        ordersTableLabel.setFont(new java.awt.Font("Segoe WP Light", 0, 18)); // NOI18N
        ordersTableLabel.setText("No Table");

        addOrderButton.setFont(new java.awt.Font("Segoe WP Light", 0, 18)); // NOI18N
        addOrderButton.setText("Add Order");
        addOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderButtonActionPerformed(evt);
            }
        });

        itemListTextArea.setEditable(false);
        itemListTextArea.setColumns(20);
        itemListTextArea.setRows(5);
        jScrollPane2.setViewportView(itemListTextArea);

        refreshOrdersButton.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        refreshOrdersButton.setText("Refresh");
        refreshOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshOrdersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, orderPanelLayout.createSequentialGroup()
                        .addComponent(ordersTableLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addOrderButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ordersTableLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(refreshOrdersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tableStatusTabPanel.addTab("Orders", orderPanel);

        setFreeButton.setBackground(new java.awt.Color(153, 255, 153));
        setFreeButton.setFont(new java.awt.Font("Segoe WP Light", 0, 18)); // NOI18N
        setFreeButton.setText("Set Free");
        setFreeButton.setToolTipText("Set Table Condition");
        setFreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setFreeButtonActionPerformed(evt);
            }
        });

        setDirtyButton.setBackground(new java.awt.Color(255, 204, 102));
        setDirtyButton.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        setDirtyButton.setText("Set Dirty");
        setDirtyButton.setToolTipText("Set Table Condition");
        setDirtyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDirtyButtonActionPerformed(evt);
            }
        });

        setUsedButton.setBackground(new java.awt.Color(255, 153, 153));
        setUsedButton.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        setUsedButton.setText("Set Used");
        setUsedButton.setToolTipText("Set Table Condition");
        setUsedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setUsedButtonActionPerformed(evt);
            }
        });

        statusTableLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        statusTableLabel.setText("No Table");

        logOffButton.setText("Log Off");
        logOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOffButtonActionPerformed(evt);
            }
        });

        set_waiter.setText("Set Waiter");
        set_waiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_waiterActionPerformed(evt);
            }
        });

        try{
            jComboBox1.addItem("0000");
            for(int i=0; i<eo.getAllWaiters().size();i++)
            {
                jComboBox1.addItem(Integer.toString(eo.getAllWaiters().get(i).getEmployeeID()));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(set_waiter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logOffButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setFreeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(setDirtyButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setUsedButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, statusPanelLayout.createSequentialGroup()
                        .addComponent(statusTableLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setFreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setDirtyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setUsedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(set_waiter, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(statusTableLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(logOffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        tableStatusTabPanel.addTab("Status", statusPanel);

        javax.swing.GroupLayout detailPanelLayout = new javax.swing.GroupLayout(detailPanel);
        detailPanel.setLayout(detailPanelLayout);
        detailPanelLayout.setHorizontalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableStatusTabPanel)
                .addContainerGap())
        );
        detailPanelLayout.setVerticalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableStatusTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        waitWebPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout waitWebPanelLayout = new javax.swing.GroupLayout(waitWebPanel);
        waitWebPanel.setLayout(waitWebPanelLayout);
        waitWebPanelLayout.setHorizontalGroup(
            waitWebPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        waitWebPanelLayout.setVerticalGroup(
            waitWebPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tablesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(waitWebPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(detailPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tablesPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(waitWebPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void selectTable(int tableClicked) {
        table_1_button.setSelected(false);
        table_2_button.setSelected(false);
        table_3_button.setSelected(false);
        table_4_button.setSelected(false);
        table_5_button.setSelected(false);
        table_6_button.setSelected(false);
        table_7_button.setSelected(false);
        table_8_button.setSelected(false);

        switch (tableClicked) {
            case 1:
                table_1_button.setSelected(true);
                table_selected = 1;
                break;
            case 2:
                table_2_button.setSelected(true);
                table_selected = 2;
                break;
            case 3:
                table_3_button.setSelected(true);
                table_selected = 3;
                break;
            case 4:
                table_4_button.setSelected(true);
                table_selected = 4;
                break;
            case 5:
                table_5_button.setSelected(true);
                table_selected = 5;
                break;
            case 6:
                table_6_button.setSelected(true);
                table_selected = 6;
                break;
            case 7:
                table_7_button.setSelected(true);
                table_selected = 7;
                break;
            case 8:
                table_8_button.setSelected(true);
                table_selected = 8;
                break;
        }
    }

    private void table_1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_1_buttonActionPerformed
        
        
        // TODO add your handling code here:
        selectTable(1);
        ctrlTableLabel.setText("Table 1");
        statusTableLabel.setText("Table 1");
        ordersTableLabel.setText("Table 1");
        performAction(1);
      
        
    }//GEN-LAST:event_table_1_buttonActionPerformed

    private void performAction(int table_id){
         try {
            table tab = to.getTableByID(table_id);
            jComboBox1.setSelectedItem(Integer.toString(tab.getEmpID()));
            if(tab.getTableStatus().equalsIgnoreCase("Used"))
            {
                addOrderButton.setEnabled(true);
                setDirtyButton.setEnabled(true);
                setFreeButton.setEnabled(false);
                setUsedButton.setEnabled(false);
                        
            }
            else if(tab.getTableStatus().equalsIgnoreCase("Free"))
            {
                setFreeButton.setEnabled(false);
                addOrderButton.setEnabled(false);
                setDirtyButton.setEnabled(true);
                setUsedButton.setEnabled(true);
            }
            else if(tab.getTableStatus().equalsIgnoreCase("Dirty"))
            {
                setUsedButton.setEnabled(false);
                addOrderButton.setEnabled(false);
                setFreeButton.setEnabled(true);
                setDirtyButton.setEnabled(false);
            }
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void table_2_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_2_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(2);
        ctrlTableLabel.setText("Table 2");
        statusTableLabel.setText("Table 2");
        ordersTableLabel.setText("Table 2");
         performAction(2);
    }//GEN-LAST:event_table_2_buttonActionPerformed

    private void table_3_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_3_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(3);
        ctrlTableLabel.setText("Table 3");
        statusTableLabel.setText("Table 3");
        ordersTableLabel.setText("Table 3");
        performAction(3);
    }//GEN-LAST:event_table_3_buttonActionPerformed

    private void table_4_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_4_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(4);
        ctrlTableLabel.setText("Table 4");
        statusTableLabel.setText("Table 4");
        ordersTableLabel.setText("Table 4");
        performAction(4);
    }//GEN-LAST:event_table_4_buttonActionPerformed

    private void table_5_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_5_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(5);
        ctrlTableLabel.setText("Table 5");
        statusTableLabel.setText("Table 5");
        ordersTableLabel.setText("Table 5");
        performAction(5);
    }//GEN-LAST:event_table_5_buttonActionPerformed

    private void table_6_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_6_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(6);
        ctrlTableLabel.setText("Table 6");
        statusTableLabel.setText("Table 6");
        ordersTableLabel.setText("Table 6");
        performAction(6);

    }//GEN-LAST:event_table_6_buttonActionPerformed

    private void table_7_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_7_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(7);
        ctrlTableLabel.setText("Table 7");
        statusTableLabel.setText("Table 7");
        ordersTableLabel.setText("Table 7");
        performAction(7);
    }//GEN-LAST:event_table_7_buttonActionPerformed

    private void table_8_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_8_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(8);
        ctrlTableLabel.setText("Table 8");
        statusTableLabel.setText("Table 8");
        ordersTableLabel.setText("Table 8");
        performAction(8);
    }//GEN-LAST:event_table_8_buttonActionPerformed

    private void refreshOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshOrdersButtonActionPerformed
        // TODO add your handling code here:
        try {
          refreshMenu(table_selected);
//        if (table_1_button.isSelected()) {
//           
//            refreshMenu(1);
//            
//        } else if (table_2_button.isSelected()) {
//            
//            refreshMenu(2);
//            
//        } else if (table_3_button.isSelected()) {
//            
//            refreshMenu(3);
//            
//        } else if (table_4_button.isSelected()) {
//            
//            refreshMenu(4);
//            
//        } else if (table_5_button.isSelected()) {
//            
//            refreshMenu(5);
//            
//        } else if (table_6_button.isSelected()) {
//            refreshMenu(6);
//
//        } 
//        else if (table_7_button.isSelected()) {
//       
//            refreshMenu(7);
//            
//        } 
//        else if (table_8_button.isSelected()) {
//            refreshMenu(8);
//        }
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_refreshOrdersButtonActionPerformed

    /**
     * Add an order to the selected table.
     * @param evt 
     */
    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
       // TODO add your handling code here:
        Menu menu = new Menu(table_selected);
    }//GEN-LAST:event_addOrderButtonActionPerformed

    private void logOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOffButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_logOffButtonActionPerformed

    private void setUsedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setUsedButtonActionPerformed
        // TODO add your handling code here:
        try {
        if (table_1_button.isSelected()) {
            
                table_1_button.setBackground(new java.awt.Color(255, 204, 102));
                table_1_panel.setBackground(new java.awt.Color(255, 204, 102));
                to.UpdateTbaleStatus(1, "Used");
        } else if (table_2_button.isSelected()) {
            table_2_button.setBackground(new java.awt.Color(255, 204, 102));
            table_2_panel.setBackground(new java.awt.Color(255, 204, 102));
             to.UpdateTbaleStatus(2, "Used");
        } else if (table_3_button.isSelected()) {
            table_3_button.setBackground(new java.awt.Color(255, 204, 102));
            table_3_panel.setBackground(new java.awt.Color(255, 204, 102));
            to.UpdateTbaleStatus(3, "Used");
        } else if (table_4_button.isSelected()) {
            table_4_button.setBackground(new java.awt.Color(255, 204, 102));
            table_4_panel.setBackground(new java.awt.Color(255, 204, 102));
             to.UpdateTbaleStatus(4, "Used");
        } else if (table_5_button.isSelected()) {
            table_5_button.setBackground(new java.awt.Color(255, 204, 102));
            table_5_panel.setBackground(new java.awt.Color(255, 204, 102));
            to.UpdateTbaleStatus(5, "Used");
        } else if (table_6_button.isSelected()) {
            table_6_button.setBackground(new java.awt.Color(255, 204, 102));
            table_6_panel.setBackground(new java.awt.Color(255, 204, 102));
            to.UpdateTbaleStatus(6, "Used");
        } else if (table_7_button.isSelected()) {
            table_7_button.setBackground(new java.awt.Color(255, 204, 102));
            table_7_panel.setBackground(new java.awt.Color(255, 204, 102));
            to.UpdateTbaleStatus(7, "Used");
        } else if (table_8_button.isSelected()) {
            table_8_button.setBackground(new java.awt.Color(255, 204, 102));
            table_8_panel.setBackground(new java.awt.Color(255, 204, 102));
            to.UpdateTbaleStatus(8, "Used");
        }
        
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_setUsedButtonActionPerformed

    private void setDirtyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDirtyButtonActionPerformed
        // TODO add your handling code here:
        try {
        if (table_1_button.isSelected()) {
            
                table_1_button.setBackground(new java.awt.Color(255, 153, 153));
                table_1_panel.setBackground(new java.awt.Color(255, 153, 153));
                
                to.UpdateTbaleStatus(1, "Dirty");
        } else if (table_2_button.isSelected()) {
            table_2_button.setBackground(new java.awt.Color(255, 153, 153));
            table_2_panel.setBackground(new java.awt.Color(255, 153, 153));
            to.UpdateTbaleStatus(2, "Dirty");
        } else if (table_3_button.isSelected()) {
            table_3_button.setBackground(new java.awt.Color(255, 153, 153));
            table_3_panel.setBackground(new java.awt.Color(255, 153, 153));
            to.UpdateTbaleStatus(3, "Dirty");
        } else if (table_4_button.isSelected()) {
            table_4_button.setBackground(new java.awt.Color(255, 153, 153));
            table_4_panel.setBackground(new java.awt.Color(255, 153, 153));
            to.UpdateTbaleStatus(4, "Dirty");
        } else if (table_5_button.isSelected()) {
            table_5_button.setBackground(new java.awt.Color(255, 153, 153));
            table_5_panel.setBackground(new java.awt.Color(255, 153, 153));
            to.UpdateTbaleStatus(5, "Dirty");
        } else if (table_6_button.isSelected()) {
            table_6_button.setBackground(new java.awt.Color(255, 153, 153));
            table_6_panel.setBackground(new java.awt.Color(255, 153, 153));
            to.UpdateTbaleStatus(6, "Dirty");
        } else if (table_7_button.isSelected()) {
            table_7_button.setBackground(new java.awt.Color(255, 153, 153));
            table_7_panel.setBackground(new java.awt.Color(255, 153, 153));
            to.UpdateTbaleStatus(7, "Dirty");
        } else if (table_8_button.isSelected())  {
            table_8_button.setBackground(new java.awt.Color(255, 153, 153));
            table_8_panel.setBackground(new java.awt.Color(255, 153, 153));
            to.UpdateTbaleStatus(8, "Dirty");
        }
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_setDirtyButtonActionPerformed

    private void setFreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setFreeButtonActionPerformed
        // TODO add your handling code here:
        
        try
        {
        if (table_1_button.isSelected()) {
            table_1_button.setBackground(new java.awt.Color(153, 255, 153));
            table_1_panel.setBackground(new java.awt.Color(153, 255, 153));
            to.UpdateTbaleStatus(1, "Free");
        } else if (table_2_button.isSelected()) {
            table_2_button.setBackground(new java.awt.Color(153, 255, 153));
            table_2_panel.setBackground(new java.awt.Color(153, 255, 153));
            to.UpdateTbaleStatus(2, "Free");
        } else if (table_3_button.isSelected()) {
            table_3_button.setBackground(new java.awt.Color(153, 255, 153));
            table_3_panel.setBackground(new java.awt.Color(153, 255, 153));
            to.UpdateTbaleStatus(3, "Free");
        } else if (table_4_button.isSelected()) {
            table_4_button.setBackground(new java.awt.Color(153, 255, 153));
            table_4_panel.setBackground(new java.awt.Color(153, 255, 153));
            to.UpdateTbaleStatus(4, "Free");
        } else if (table_5_button.isSelected()) {
            table_5_button.setBackground(new java.awt.Color(153, 255, 153));
            table_5_panel.setBackground(new java.awt.Color(153, 255, 153));
            to.UpdateTbaleStatus(5, "Free");
        } else if (table_6_button.isSelected()) {
            table_6_button.setBackground(new java.awt.Color(153, 255, 153));
            table_6_panel.setBackground(new java.awt.Color(153, 255, 153));
            to.UpdateTbaleStatus(6, "Free");
        } else if (table_7_button.isSelected()) {
            table_7_button.setBackground(new java.awt.Color(153, 255, 153));
            table_7_panel.setBackground(new java.awt.Color(153, 255, 153));          
            to.UpdateTbaleStatus(7, "Free");
        } else if (table_8_button.isSelected()) {
            table_8_button.setBackground(new java.awt.Color(153, 255, 153));
            table_8_panel.setBackground(new java.awt.Color(153, 255, 153));
            to.UpdateTbaleStatus(8, "Free");
        }
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_setFreeButtonActionPerformed

    private void set_waiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_waiterActionPerformed
        // TODO add your handling code here:
        
        try {
            int emp_id = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            to.UpdateTableAssignation(table_selected, emp_id);
        Object[] options = {"OK"};
                JOptionPane.showOptionDialog(null,"Waiter Assignment changed.","Info",JOptionPane.PLAIN_MESSAGE,JOptionPane.QUESTION_MESSAGE,
                       null,
                       options,
                       options[0]);
        
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(Table_Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_set_waiterActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

     public void refreshMenu( int table) throws ClassNotFoundException, SQLException {
        String setOrderList = "OrderID   Status\n";
        OrderOperations orders = new OrderOperations(); 
       java.util.List<Order> orderList = new ArrayList<>();
       // java.util.List<Order> orders = new ArrayList<>();
        orderList = orders.getOrderByTable(table);
        for (int i = 0; i < orderList.size(); i++) {
        setOrderList   += (orderList.get(i).getOrderID()) +"    "+ (orderList.get(i).getOrderStatus())+"\n" ;
        }
        itemListTextArea.setText(setOrderList);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Table_Gui().setVisible(true);
            }
        });
               

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrderButton;
    private javax.swing.JLabel ctrlTableLabel;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JTextArea itemListTextArea;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logOffButton;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JLabel ordersTableLabel;
    private javax.swing.JButton refreshOrdersButton;
    private javax.swing.JButton setDirtyButton;
    private javax.swing.JButton setFreeButton;
    private javax.swing.JButton setUsedButton;
    private javax.swing.JToggleButton set_waiter;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JLabel statusTableLabel;
    private javax.swing.JTabbedPane tableStatusTabPanel;
    private javax.swing.JToggleButton table_1_button;
    private javax.swing.JPanel table_1_panel;
    private javax.swing.JToggleButton table_2_button;
    private javax.swing.JPanel table_2_panel;
    private javax.swing.JToggleButton table_3_button;
    private javax.swing.JPanel table_3_panel;
    private javax.swing.JToggleButton table_4_button;
    private javax.swing.JPanel table_4_panel;
    private javax.swing.JToggleButton table_5_button;
    private javax.swing.JPanel table_5_panel;
    private javax.swing.JToggleButton table_6_button;
    private javax.swing.JPanel table_6_panel;
    private javax.swing.JToggleButton table_7_button;
    private javax.swing.JPanel table_7_panel;
    private javax.swing.JToggleButton table_8_button;
    private javax.swing.JPanel table_8_panel;
    private javax.swing.JPanel tablesPanel;
    private javax.swing.JPanel waitWebPanel;
    // End of variables declaration//GEN-END:variables
}
