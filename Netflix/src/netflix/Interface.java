/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netflix;

import java.awt.Color;
import javax.swing.border.Border;
//--nede buna çevirdik
import javax.swing.BorderFactory;
import javax.swing.JFrame;
/**
 *
 * @author Oğuz Can
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_min = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_ıd = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();
        jTextField_ıd1 = new javax.swing.JTextField();
        jTextField_ıd2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel_min.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_min.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_min.setText(" -");
        jLabel_min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minMouseExited(evt);
            }
        });

        jLabel_close.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_close.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_close.setText(" x ");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        jTextField_ıd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_ıd.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_ıd.setText("Username");
        jTextField_ıd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_ıdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_ıdFocusLost(evt);
            }
        });
        jTextField_ıd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ıdActionPerformed(evt);
            }
        });

        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField.setText("Password");
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jButton_Login.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Login.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jButton_Login.setForeground(new java.awt.Color(255, 0, 51));
        jButton_Login.setText("Login");
        jButton_Login.setBorder(null);
        jButton_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        jTextField_ıd1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_ıd1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_ıd1.setText("Username");
        jTextField_ıd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_ıd1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_ıd1FocusLost(evt);
            }
        });
        jTextField_ıd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ıd1ActionPerformed(evt);
            }
        });

        jTextField_ıd2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_ıd2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_ıd2.setText("Username");
        jTextField_ıd2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_ıd2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_ıd2FocusLost(evt);
            }
        });
        jTextField_ıd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ıd2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Already have an accout? Login!");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(867, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_min, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_close)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jTextField_ıd, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jTextField_ıd1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jTextField_ıd2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_close)
                    .addComponent(jLabel_min))
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jTextField_ıd2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_ıd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_ıd1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b.jpg")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minMouseClicked

    private void jLabel_minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.BLUE );
        jLabel_min.setBorder(label_border);
        jLabel_min.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabel_minMouseEntered

    private void jLabel_minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minMouseExited
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK );
        jLabel_min.setBorder(label_border);
        jLabel_min.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_minMouseExited

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.BLUE );
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK );
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jTextField_ıdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_ıdFocusGained

        if(jTextField_ıd.getText().trim().equals("Username"))
        {
            jTextField_ıd.setText("");
            jTextField_ıd.setForeground(Color.BLACK);
        }

        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK);
        jTextField_ıd.setBorder(label_border);
    }//GEN-LAST:event_jTextField_ıdFocusGained

    private void jTextField_ıdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_ıdFocusLost

        if(jTextField_ıd.getText().trim().equals("") || jTextField_ıd.getText().trim().equals("Username") )
        {
            jTextField_ıd.setText("Username");
            jTextField_ıd.setForeground(new Color(153,153,153));
        }
        jTextField_ıd.setBorder(null);
    }//GEN-LAST:event_jTextField_ıdFocusLost

    private void jTextField_ıdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ıdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ıdActionPerformed

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained

        String pass = String.valueOf(jPasswordField.getPassword());

        if(pass.equals("Password"))
        {
            jPasswordField.setText("");
            jPasswordField.setForeground(Color.BLACK);
        }

        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK);
        jPasswordField.setBorder(label_border);
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost

        String pass = String.valueOf(jPasswordField.getPassword());

        if(pass.equals("") || pass.trim().equals("Password") )
        {
            jPasswordField.setText("Password");
            jPasswordField.setForeground(new Color(153,153,153));
        }
        jPasswordField.setBorder(null);
    }//GEN-LAST:event_jPasswordFieldFocusLost

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        Interface iface = new Interface();
        iface.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jTextField_ıd1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_ıd1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ıd1FocusGained

    private void jTextField_ıd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_ıd1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ıd1FocusLost

    private void jTextField_ıd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ıd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ıd1ActionPerformed

    private void jTextField_ıd2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_ıd2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ıd2FocusGained

    private void jTextField_ıd2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_ıd2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ıd2FocusLost

    private void jTextField_ıd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ıd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ıd2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        Login login = new Login();
        login.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_min;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_ıd;
    private javax.swing.JTextField jTextField_ıd1;
    private javax.swing.JTextField jTextField_ıd2;
    // End of variables declaration//GEN-END:variables
}
