import database.DBConnection;
import java.sql.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Gota
 */
public class newProduct extends javax.swing.JFrame {
    Connection connection;

    /**
     * Creates new form newProduct
     */
    public newProduct() {
        initComponents();
        connection = DBConnection.getDBConnection().getConnection();
        try {
            generateID();
        } catch (SQLException ex) {
            Logger.getLogger(newProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPName = new javax.swing.JTextField();
        txtRate = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        cmbActive = new javax.swing.JComboBox<>();
        lblPID = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(380, 200));
        setUndecorated(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New Product ani.gif"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new product.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Product ID");
        jLabel3.setPreferredSize(new java.awt.Dimension(66, 16));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Rate");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Description");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Active");

        txtPName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPName.setForeground(java.awt.Color.gray);
        txtPName.setText("Enter Product Name");
        txtPName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPNameFocusLost(evt);
            }
        });
        txtPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNameActionPerformed(evt);
            }
        });

        txtRate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtRate.setForeground(java.awt.Color.gray);
        txtRate.setText("Enter Rate");
        txtRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRateFocusLost(evt);
            }
        });
        txtRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRateActionPerformed(evt);
            }
        });

        txtDescription.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDescription.setForeground(java.awt.Color.gray);
        txtDescription.setText("Enter Description");
        txtDescription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescriptionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescriptionFocusLost(evt);
            }
        });
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        cmbActive.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbActive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        cmbActive.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbActivePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        lblPID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPID.setForeground(java.awt.Color.red);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close Jframe.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPID, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnSave)
                        .addGap(45, 45, 45)
                        .addComponent(btnReset)
                        .addGap(47, 47, 47)
                        .addComponent(btnClose)))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbActive, lblPID, txtDescription, txtPName, txtRate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnReset)
                    .addComponent(btnClose))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String pid = lblPID.getText();
        String pname = txtPName.getText();
        String rate = txtRate.getText();
        String description = txtDescription.getText();
        String active = (String) cmbActive.getSelectedItem();
        int i = 0;

        try {
            Statement statement = connection.createStatement();
            i = statement.executeUpdate("insert into product values('"+ pid +"' , '"+ pname +"' , '"+ rate +"' , '"+ description +"' , '"+ active +"')");
        } catch (SQLException e) {
            setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!",JOptionPane.WARNING_MESSAGE);
            setAlwaysOnTop(true);
        }
        if(i == 1){
            setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(null, "Successfully registered!");
            setAlwaysOnTop(true);
            btnResetActionPerformed(evt);
        }else{
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        try {
            generateID();
        } catch (Exception ex) {
        }
        txtPName.setText("Enter Product Name");
        txtRate.setText("Enter Rate");
        txtDescription.setText("Enter Description");
        txtPName.setForeground(Color.GRAY);
        txtRate.setForeground(Color.GRAY);
        txtDescription.setForeground(Color.GRAY);
        cmbActive.setSelectedIndex(0);
        txtPName.requestFocus();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtPNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPNameFocusGained
          if(txtPName.getText().equals("Enter Product Name")){
            txtPName.setText("");
            txtPName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPNameFocusGained

    private void txtPNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPNameFocusLost
        if(txtPName.getText().equals("")){
            txtPName.setText("Enter Product Name");
            txtPName.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtPNameFocusLost

    private void txtRateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRateFocusGained
        if(txtRate.getText().equals("Enter Rate")){
            txtRate.setText("");
            txtRate.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtRateFocusGained

    private void txtRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRateFocusLost
        if(txtRate.getText().equals("")){
            txtRate.setText("Enter Rate");
            txtRate.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtRateFocusLost

    private void txtDescriptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusGained
        if(txtDescription.getText().equals("Enter Description")){
            txtDescription.setText("");
            txtDescription.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtDescriptionFocusGained

    private void txtDescriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusLost
        if(txtDescription.getText().equals("")){
            txtDescription.setText("Enter Description");
            txtDescription.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtDescriptionFocusLost

    private void txtPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNameActionPerformed
        txtRate.requestFocus();
    }//GEN-LAST:event_txtPNameActionPerformed

    private void txtRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRateActionPerformed
        txtDescription.requestFocus();
    }//GEN-LAST:event_txtRateActionPerformed

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        cmbActive.requestFocus();
        cmbActive.setPopupVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void cmbActivePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbActivePopupMenuWillBecomeInvisible
        btnSave.requestFocus();
    }//GEN-LAST:event_cmbActivePopupMenuWillBecomeInvisible

    private void generateID() throws SQLException{
        String newid;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select product_id from product order by product_id desc limit 1;");
        if(resultSet.next()){
            int id = Integer.parseInt(resultSet.getString(1).substring(1)) +1;
            if(id<10)
                newid = "P00" + id;
            else if (id<100)
                newid = "P0" + id;
            else
                newid = "P" + id;
        }else
            newid = "P001";
        lblPID.setText(newid);
    }
    
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
            java.util.logging.Logger.getLogger(newProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbActive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblPID;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtRate;
    // End of variables declaration//GEN-END:variables
}
