/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layered.view;

import java.util.List;
import javax.swing.JOptionPane;
import layered.dto.CustomerDto;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import layered.controller.CustomerController;

/**
 *
 * @author Admin
 */
public class CustomerView extends javax.swing.JFrame {
    
    private CustomerController customerController;

    /**
     * Creates new form CustomerView
     */
    public CustomerView() {
        customerController = new CustomerController();
        initComponents();
        loadCustomers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCustID2 = new javax.swing.JTextField();
        btnsearch2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCustID = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        cmbgender = new javax.swing.JComboBox<>();
        txtlname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcustomer = new javax.swing.JTable();
        btnsearch = new javax.swing.JButton();
        btnsearch1 = new javax.swing.JButton();
        btnsearch3 = new javax.swing.JButton();
        btnsearch4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        btnsearch2.setBackground(new java.awt.Color(102, 255, 255));
        btnsearch2.setText("Save");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Manage Customers");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Customer ID :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("First Name :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Last Name :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Email :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Phone No :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Address :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Gender :");

        cmbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));

        tblcustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        tblcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcustomer);

        btnsearch.setBackground(new java.awt.Color(102, 255, 255));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btnsearch1.setBackground(new java.awt.Color(102, 255, 255));
        btnsearch1.setText("Save");
        btnsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch1ActionPerformed(evt);
            }
        });

        btnsearch3.setBackground(new java.awt.Color(102, 255, 255));
        btnsearch3.setText("Update");
        btnsearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch3ActionPerformed(evt);
            }
        });

        btnsearch4.setBackground(new java.awt.Color(102, 255, 255));
        btnsearch4.setText("Delete");
        btnsearch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch4ActionPerformed(evt);
            }
        });

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("Home");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Rooms");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Reservation");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Categories");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(174, 174, 174))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(151, 151, 151)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(184, 184, 184)
                                                        .addComponent(btnsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btnsearch4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btnsearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtphone)
                                            .addComponent(txtCustID)
                                            .addComponent(txtfname)
                                            .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch1)
                    .addComponent(btnsearch3)
                    .addComponent(btnsearch4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch1ActionPerformed
        // TODO add your handling code here:
        saveCustomer();
    }//GEN-LAST:event_btnsearch1ActionPerformed

    private void tblcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcustomerMouseClicked
        // TODO add your handling code here:
        searchCustomer();
    }//GEN-LAST:event_tblcustomerMouseClicked

    private void btnsearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch3ActionPerformed
        // TODO add your handling code here:
        updateCustomer();
    }//GEN-LAST:event_btnsearch3ActionPerformed

    private void btnsearch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch4ActionPerformed
        // TODO add your handling code here:
        deleteCustomer();
    }//GEN-LAST:event_btnsearch4ActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        searchCustomer2();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        HomePageView homeview = new HomePageView();
        this.setVisible(false);
        homeview.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        RoomView homeview = new RoomView();
        this.setVisible(false);
        homeview.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        ReservationView homeview = new ReservationView();
        this.setVisible(false);
        homeview.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        RoomCategoriesView homeview = new RoomCategoriesView();
        this.setVisible(false);
        homeview.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked
        /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsearch1;
    private javax.swing.JButton btnsearch2;
    private javax.swing.JButton btnsearch3;
    private javax.swing.JButton btnsearch4;
    private javax.swing.JComboBox<String> cmbgender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblcustomer;
    private javax.swing.JTextField txtCustID;
    private javax.swing.JTextField txtCustID2;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables

    private void saveCustomer() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        CustomerDto dto = new CustomerDto();
            dto.setCustId(txtCustID.getText());
            dto.setFname(txtfname.getText());
            dto.setLname(txtlname.getText());
            dto.setEmail(txtemail.getText());
            dto.setAddress(txtaddress.getText());
            dto.setPhone(Integer.parseInt(txtphone.getText()));
            String selectedGender = (String) cmbgender.getSelectedItem();
            String mappedGender = mapToGenderCode(selectedGender);
            dto.setGender(mappedGender);
            try {
            String result = customerController.saveCustomer(dto);
            JOptionPane.showMessageDialog(this, result);
            clear();
            loadCustomers();
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private String mapToGenderCode(String selectedGender) {
        if ("Male".equalsIgnoreCase(selectedGender)) {
            return "M";
        } else if ("Female".equalsIgnoreCase(selectedGender)) {
            return "F";
        } else {
            // You may want to handle other cases or return a default value
            return null; 
        }
    }


    private void clear() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        txtCustID.setText("");
        txtfname.setText("");
        txtlname.setText("");
        txtemail.setText("");
        txtaddress.setText("");
        txtphone.setText("");
        cmbgender.setSelectedIndex(-1); // Clears the selected item in the JComboBox
    }
    
    public void loadCustomers() {
        try {
            String columns[] = {"Customer ID", "First","Last", "Email", "Phone Number", "Address", "Gender"};
            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            tblcustomer.setModel(dtm);

            List<CustomerDto> customerDtos = customerController.getAllCustomer();

            for (CustomerDto customerDto : customerDtos) {
                Object[] rowData = {
                    customerDto.getCustId(),
                    customerDto.getFname(),
                    customerDto.getLname(),
                    customerDto.getEmail(),
                    customerDto.getPhone(),
                    customerDto.getAddress(),
                    customerDto.getGender()
                };
                dtm.addRow(rowData);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }


    private void searchCustomer(){
        String id = tblcustomer.getValueAt(tblcustomer.getSelectedRow(), 0).toString();
        try {
            CustomerDto dto = customerController.getCustomer(id);

            if (dto != null) {
                txtCustID.setText(dto.getCustId());
                txtfname.setText(dto.getFname());
                txtlname.setText(dto.getLname());
                txtemail.setText(dto.getEmail());
                txtaddress.setText(dto.getAddress());
                txtphone.setText(String.valueOf(dto.getPhone()));

                String gender = dto.getGender();
                if("M".equals(gender)) {
                    cmbgender.setSelectedIndex(0);
                } else if ("F".equals(gender)) {
                    cmbgender.setSelectedIndex(1); 
                } else {
                    cmbgender.setSelectedIndex(-1); 
                }

            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void searchCustomer2(){
        String id = txtCustID.getText();
        //String id = tblcustomer.getValueAt(tblcustomer.getSelectedRow(), 0).toString();
        try {
            CustomerDto dto = customerController.getCustomer(id);

            if (dto != null) {
                txtCustID.setText(dto.getCustId());
                txtfname.setText(dto.getFname());
                txtlname.setText(dto.getLname());
                txtemail.setText(dto.getEmail());
                txtaddress.setText(dto.getAddress());
                txtphone.setText(String.valueOf(dto.getPhone()));
                String gender = dto.getGender();
                if("M".equals(gender)) {
                    cmbgender.setSelectedIndex(0); 
                } else if ("F".equals(gender)) {
                    cmbgender.setSelectedIndex(1); 
                } else {
                    cmbgender.setSelectedIndex(-1);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void updateCustomer() {
        try {
            CustomerDto dto = new CustomerDto();
            dto.setCustId(txtCustID.getText());
            dto.setFname(txtfname.getText()); 
            dto.setLname(txtlname.getText()); // Update with the appropriate attribute name
            dto.setEmail(txtemail.getText()); // Update with the appropriate attribute name
            dto.setPhone(Integer.parseInt(txtphone.getText())); // Update with the appropriate attribute name
            String selectedGender = (String) cmbgender.getSelectedItem();
            dto.setGender(mapToGenderCode(selectedGender)); // Update with the appropriate attribute name
            dto.setAddress(txtaddress.getText()); // Update with the appropriate attribute name

            String resp = customerController.updateCustomer(dto);
            JOptionPane.showMessageDialog(this, resp);
            loadCustomers();
            clear();
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    
    private void deleteCustomer() {
    try {
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this customer?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            String custId = txtCustID.getText();
            String resp = customerController.deleteCustomer(custId);
            JOptionPane.showMessageDialog(this, resp);
            loadCustomers();
            clear();
        }
    } catch (Exception ex) {
        Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }
}

}
