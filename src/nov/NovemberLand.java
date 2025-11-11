
package nov;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class NovemberLand extends javax.swing.JFrame {
    
    public NovemberLand() {
        super("HOME PAGE");
        initComponents();
        
    }
    public static int choice;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adminLogin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        viewFamily = new javax.swing.JButton();
        viewAdults = new javax.swing.JButton();
        familyPur = new javax.swing.JButton();
        viewKids = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adultsPur = new javax.swing.JButton();
        kidsPur = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        aboutUs = new javax.swing.JButton();
        contantUs = new javax.swing.JButton();
        guideLogin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");

        jPanel1.setBackground(new java.awt.Color(235, 224, 214));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(226, 107, 28));
        jLabel2.setText("NOVEMBER LAND!");
        jLabel2.setToolTipText("");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nov/logo copy.png"))); // NOI18N

        adminLogin.setBackground(new java.awt.Color(242, 242, 242));
        adminLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        adminLogin.setForeground(new java.awt.Color(119, 73, 73));
        adminLogin.setText("Admin Login");
        adminLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(242, 242, 242), null, new java.awt.Color(242, 242, 242)));
        adminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 238, 226));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Packages:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18), new java.awt.Color(119, 73, 73))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(221, 208, 196));
        jPanel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        viewFamily.setBackground(new java.awt.Color(201, 128, 17));
        viewFamily.setForeground(new java.awt.Color(242, 242, 242));
        viewFamily.setText("view details");
        viewFamily.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFamilyActionPerformed(evt);
            }
        });

        viewAdults.setBackground(new java.awt.Color(201, 128, 17));
        viewAdults.setForeground(new java.awt.Color(242, 242, 242));
        viewAdults.setText("view details");
        viewAdults.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewAdults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdultsActionPerformed(evt);
            }
        });

        familyPur.setBackground(new java.awt.Color(214, 64, 11));
        familyPur.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        familyPur.setForeground(new java.awt.Color(255, 255, 255));
        familyPur.setText("purchase");
        familyPur.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        familyPur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyPurActionPerformed(evt);
            }
        });

        viewKids.setBackground(new java.awt.Color(201, 128, 17));
        viewKids.setForeground(new java.awt.Color(242, 242, 242));
        viewKids.setText("view details");
        viewKids.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewKids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewKidsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(119, 72, 72));
        jLabel1.setText("-Family package");
        jLabel1.setToolTipText("2 adult and 2 kids");

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(119, 72, 72));
        jLabel6.setText("-Adults package");
        jLabel6.setToolTipText("Age 16 and above");

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(119, 72, 72));
        jLabel5.setText("-Kids package");
        jLabel5.setToolTipText("Age 1-15");

        adultsPur.setBackground(new java.awt.Color(214, 64, 11));
        adultsPur.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adultsPur.setForeground(new java.awt.Color(255, 255, 255));
        adultsPur.setText("purchase");
        adultsPur.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adultsPur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultsPurActionPerformed(evt);
            }
        });

        kidsPur.setBackground(new java.awt.Color(214, 64, 11));
        kidsPur.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kidsPur.setForeground(new java.awt.Color(255, 255, 255));
        kidsPur.setText("purchase");
        kidsPur.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kidsPur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kidsPurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(familyPur, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(adultsPur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kidsPur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewKids, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(viewAdults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewFamily, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewFamily)
                    .addComponent(jLabel1)
                    .addComponent(familyPur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAdults)
                    .addComponent(jLabel6)
                    .addComponent(adultsPur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewKids)
                    .addComponent(jLabel5)
                    .addComponent(kidsPur))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Luminari", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(113, 177, 166));
        jLabel4.setText("Welcome to ");
        jLabel4.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(255, 238, 226));

        aboutUs.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        aboutUs.setForeground(new java.awt.Color(119, 73, 73));
        aboutUs.setText("About Us");
        aboutUs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsActionPerformed(evt);
            }
        });

        contantUs.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        contantUs.setForeground(new java.awt.Color(119, 73, 73));
        contantUs.setText("Contact Us");
        contantUs.setToolTipText("");
        contantUs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contantUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contantUsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(aboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contantUs, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contantUs)
                    .addComponent(aboutUs))
                .addContainerGap())
        );

        guideLogin.setBackground(new java.awt.Color(242, 242, 242));
        guideLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        guideLogin.setForeground(new java.awt.Color(119, 73, 73));
        guideLogin.setText("Guide Login");
        guideLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guideLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideLoginActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 102));
        jLabel7.setText("Experience Magic Every Day!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(111, 111, 111))
                                    .addComponent(guideLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel7))
                            .addComponent(jLabel2))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminLogin)
                            .addComponent(guideLogin))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewKidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewKidsActionPerformed
     Icon icon =new ImageIcon(getClass().getResource("logo copy.png"));
     KidsPackage.viewKidsPackage( icon);

    }//GEN-LAST:event_viewKidsActionPerformed

    private void familyPurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyPurActionPerformed
        this.setVisible(false);
        User_login pur = new User_login(); 
        pur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pur.setSize(500, 465);
        pur.setLocationRelativeTo(null);
        pur.setVisible(true);
        pur.setResizable(false);
        choice = 1;
    }//GEN-LAST:event_familyPurActionPerformed

    private void viewAdultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdultsActionPerformed
     Icon icon =new ImageIcon(getClass().getResource("logo copy.png"));
     AdultsPackage.viewAdultPackage( icon);
    }//GEN-LAST:event_viewAdultsActionPerformed

    private void adminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginActionPerformed
        this.setVisible(false);
        Admin_login login = new Admin_login(); 
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setSize(505, 505);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        login.setResizable(false);
    }//GEN-LAST:event_adminLoginActionPerformed

    private void aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsActionPerformed
       Icon icon =new ImageIcon(getClass().getResource("logo copy.png"));
        String aboutText = "November Land's team is here,\n" + 
        "We're happy to have you and your family\njoin us on an extensive trip"+ 
        " throughout our brand-new amusement park.\nWe're pleased to offer you several packages to choose from, \nwith the ability to be assisted by one of our excellent guides. \nWe can't wait to have you! :)";                                                                                                                                                                                          
        JOptionPane.showMessageDialog(null,aboutText, "About us", HEIGHT,icon);
    }//GEN-LAST:event_aboutUsActionPerformed

    private void contantUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contantUsActionPerformed
      Contact con = new Contact();
      con.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      con.setSize(585, 390);
      con.setLocationRelativeTo(null);
      con.setVisible(true);
      con.setResizable(false);
      
    }//GEN-LAST:event_contantUsActionPerformed

    private void guideLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideLoginActionPerformed
        this.setVisible(false);
        Guide_login pur = new Guide_login(); 
        pur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pur.setSize(550, 570);
        pur.setLocationRelativeTo(null);
        pur.setVisible(true);
        pur.setResizable(false);
    }//GEN-LAST:event_guideLoginActionPerformed

    private void viewFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFamilyActionPerformed
     Icon icon =new ImageIcon(getClass().getResource("logo copy.png"));
     FamilyPackage.viewFamilyPackage( icon);
    }//GEN-LAST:event_viewFamilyActionPerformed

    private void adultsPurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adultsPurActionPerformed
        this.setVisible(false);
        User_login pur = new User_login(); 
        pur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pur.setSize(500, 465);
        pur.setLocationRelativeTo(null);
        pur.setVisible(true);
        pur.setResizable(false);
        choice = 2;
    }//GEN-LAST:event_adultsPurActionPerformed

    private void kidsPurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kidsPurActionPerformed
        this.setVisible(false);
        User_login login = new User_login(); 
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setSize(500, 465);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        login.setResizable(false);
        choice = 3;
    }//GEN-LAST:event_kidsPurActionPerformed

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
            java.util.logging.Logger.getLogger(NovemberLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovemberLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovemberLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovemberLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovemberLand().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutUs;
    private javax.swing.JButton adminLogin;
    private javax.swing.JButton adultsPur;
    private javax.swing.JButton contantUs;
    private javax.swing.JButton familyPur;
    private javax.swing.JButton guideLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton kidsPur;
    private javax.swing.JButton viewAdults;
    private javax.swing.JButton viewFamily;
    private javax.swing.JButton viewKids;
    // End of variables declaration//GEN-END:variables
}
