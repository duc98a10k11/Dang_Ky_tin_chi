package view;

import Model.SinhVien;
import control.ThayDoiMatKhauController;
import javax.swing.JOptionPane;
import untils.RegexUntils;

public class ThayDoiMatKhauFrm extends javax.swing.JFrame {

    private boolean checkValidationOldPass = false;
    private boolean checkValidationNewPass = false;
    private boolean checkValidationConfirmPass = false;
    private SinhVien sinhVien;
    private ThayDoiMatKhauController changePassController;

    public ThayDoiMatKhauFrm() {
        initComponents();
        init();
    }

    ThayDoiMatKhauFrm(SinhVien sinhVien) {
        initComponents();
        init();
        this.sinhVien = sinhVien;
        changePassController = new ThayDoiMatKhauController(sinhVien);
        System.out.println(this.sinhVien.toString());
    }

    public void init() {
        this.setTitle("Thay đổi mật khẩu");
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        save = new javax.swing.JButton();
        oldPassword = new javax.swing.JPasswordField();
        newPassword = new javax.swing.JPasswordField();
        confirmPassword = new javax.swing.JPasswordField();
        showPassword1 = new javax.swing.JCheckBox();
        showPassword2 = new javax.swing.JCheckBox();
        showPassword3 = new javax.swing.JCheckBox();
        error1 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        error3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar4.add(jMenu9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Mật khẩu cũ: ");

        jLabel3.setText("Mật khẩu mới : ");

        jLabel4.setText("Xác nhận mật khẩu: ");

        cancel.setText("Hủy");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        save.setText("Lưu");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        oldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                oldPasswordFocusLost(evt);
            }
        });

        newPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                newPasswordFocusLost(evt);
            }
        });

        confirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmPasswordFocusLost(evt);
            }
        });

        showPassword1.setText("Hiển thị mật khẩu");
        showPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassword1ActionPerformed(evt);
            }
        });

        showPassword2.setText("Hiển thị mật khẩu");
        showPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassword2ActionPerformed(evt);
            }
        });

        showPassword3.setText("Hiển thị mật khẩu");
        showPassword3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassword3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oldPassword)
                    .addComponent(newPassword)
                    .addComponent(confirmPassword)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(error1)
                            .addComponent(error2)
                            .addComponent(error3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showPassword2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showPassword1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showPassword3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(oldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPassword1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error1)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPassword2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error2)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPassword3))
                .addGap(18, 18, 18)
                .addComponent(error3)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(cancel))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        jLabel1.setText("jLabel1");

        jMenu1.setText("Trang Chủ");

        jMenuItem1.setText("Đăng ký môn");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("Xem TKB");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator2);

        jMenuItem3.setText("Xem điểm thi");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator3);

        jMenuItem6.setText("Xem lịch thi");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator4);

        jMenuItem8.setText("Xem lịch thi lại");
        jMenu1.add(jMenuItem8);
        jMenu1.add(jSeparator5);

        jMenuItem7.setText("Xem học phí");
        jMenu1.add(jMenuItem7);

        menuBar.add(jMenu1);

        jMenu2.setText(" Tài khoản");

        jMenuItem4.setText("Thông tin tài khoản");
        jMenu2.add(jMenuItem4);
        jMenu2.add(jSeparator6);

        jMenuItem5.setText("Thay đổi mật khẩu");
        jMenu2.add(jMenuItem5);

        menuBar.add(jMenu2);

        jMenu12.setText("Góp ý kiến");
        menuBar.add(jMenu12);

        jMenu10.setText("Thoát");
        menuBar.add(jMenu10);

        jMenu11.setText("Hướng dẫn");
        menuBar.add(jMenu11);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        new DangkyhocFrm().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void oldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_oldPasswordFocusLost
        String oldPassword = this.oldPassword.getText().toString().trim();
        if (oldPassword.length() == 0) {
            error1.setText("Mật khẩu cũ không để trống");
            checkValidationOldPass = false;
        } else if (!RegexUntils.checkPassword(oldPassword)) {
            error1.setText("Mật khẩu tối thiểu 8 chữ số, 1 chữ số viết hoa, 1 ký tự đặc biệt và 1 chữ cái");
            checkValidationOldPass = false;
        } else {
            error1.setText("");
            checkValidationOldPass = true;
        }
    }//GEN-LAST:event_oldPasswordFocusLost

    private void newPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPasswordFocusLost
        String oldPassword = this.oldPassword.getText().toString().trim();
        String newPassword = this.newPassword.getText().toString().trim();
        if (newPassword.length() == 0) {
            error2.setText("Mật khẩu mới không để trống");
            checkValidationNewPass = false;
        } else if (!RegexUntils.checkPassword(newPassword)) {
            error2.setText("Mật khẩu tối thiểu 8 chữ số, 1 chữ số viết hoa, 1 ký tự đặc biệt và 1 chữ cái");
            checkValidationNewPass = false;
        } else if (oldPassword.equals(newPassword)) {
            error2.setText("Mật khẩu mới không trùng mật khẩu cũ");
            checkValidationNewPass = false;
        } else {
            error2.setText("");
            checkValidationNewPass = true;
        }
    }//GEN-LAST:event_newPasswordFocusLost

    private void confirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFocusLost
        String confirmPassword = this.confirmPassword.getText().toString().trim();
        String newPassword = this.newPassword.getText().toString().trim();
        if (confirmPassword.length() == 0) {
            error3.setText("Xác nhận mật khẩu không để trống");
            checkValidationConfirmPass = false;
        } else if (!RegexUntils.checkPassword(confirmPassword)) {
            error3.setText("Mật khẩu tối thiểu 8 chữ số, 1 chữ số viết hoa, 1 ký tự đặc biệt và 1 chữ cái");
            checkValidationConfirmPass = false;
        } else if (!confirmPassword.equals(newPassword)) {
            error3.setText("Xác nhận mật khẩu phải trùng mật khẩu mới");
            checkValidationConfirmPass = false;
        } else {
            error3.setText("");
            checkValidationConfirmPass = true;
        }
    }//GEN-LAST:event_confirmPasswordFocusLost

    private void showPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassword1ActionPerformed
        if (showPassword1.isSelected()) {
            oldPassword.setEchoChar((char) 0);
        } else {
            oldPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassword1ActionPerformed

    private void showPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassword2ActionPerformed
        if (showPassword2.isSelected()) {
            newPassword.setEchoChar((char) 0);
        } else {
            newPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassword2ActionPerformed

    private void showPassword3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassword3ActionPerformed
        if (showPassword3.isSelected()) {
            confirmPassword.setEchoChar((char) 0);
        } else {
            confirmPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassword3ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        int showDialog = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn hủy?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (showDialog == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new TrangChuFrm(sinhVien).setVisible(true);
        } else {
            System.out.println("Close option");
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String oldPassword = this.oldPassword.getText().toString().trim();
        String newPassword = this.newPassword.getText().toString().trim();
        int showDialog = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn thay đổi mật khẩu?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (showDialog == JOptionPane.YES_OPTION) {
            Boolean status = changePassController.updatePassword(oldPassword, newPassword, sinhVien);
            if (status) {
                String message = " Thay đổi mật khẩu thành công";
                this.setVisible(false);
                new DangNhapFrm(message).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mật khẩu cũ sai.");
            }
        } else {
            System.out.println("Close option");
        }
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(ThayDOiMatKhauFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThayDOiMatKhauFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThayDOiMatKhauFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThayDOiMatKhauFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThayDoiMatKhauFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel error3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JPasswordField oldPassword;
    private javax.swing.JButton save;
    private javax.swing.JCheckBox showPassword1;
    private javax.swing.JCheckBox showPassword2;
    private javax.swing.JCheckBox showPassword3;
    // End of variables declaration//GEN-END:variables
}
