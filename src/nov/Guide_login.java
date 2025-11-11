
package nov;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;





  public class Guide_login extends javax.swing.JFrame implements ActionListener {
    public static String username;
  Connection connection = null ;
    PreparedStatement pstatement;
    ResultSet rs = null;
    int check = 0;
    int guideId=0;
    static Guide loggedGuide;
    final static String url="jdbc:mysql://localhost:3306/amusement";
   static Connection con=null;
    String guideID;
    Guide guide=new Guide();
  

        public void loginCheck(String username, String pass){
      
    if (pass.trim().equalsIgnoreCase("") || username.trim().equalsIgnoreCase(""))
    {
        JOptionPane.showMessageDialog(null,"all fields must be filled to login...","Error",JOptionPane.ERROR_MESSAGE); 
        check = 1;
    }
    
    else  check = 0;
    }
    
    public Guide_login() 
    {
        super("Guide Login");
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
        loginButton.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent evt) 
    {
       username = userText.getText();
       String pass = passText.getText();
       
     if (evt.getSource() == loginButton){
            loginCheck(username ,pass);
           
            if(check == 0){
            try{
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root",Nov.DBPassword);
               String query = "Select * from guide where username = ? and pass = ?";
               pstatement = connection.prepareStatement(query);
               pstatement.setString(1,username );
               pstatement.setString(2,pass);   
               rs = pstatement.executeQuery();
               guide.setUsername(username);
              
               if (rs.next()){
                JOptionPane.showMessageDialog(this, "username and password matched");
                 guideId=rs.getInt("guideID");
                 Nov.closeDB(con, rs, pstatement);
                this.setVisible(false);
                 guide_view guidePage= new guide_view();
                 guidePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 guidePage.setSize(550, 550);
                 guidePage.setLocationRelativeTo(null);
                 guidePage.setVisible(true);
                 guidePage.setResizable(false);
               }
                 else{
                JOptionPane.showMessageDialog(this,"Username and password not matched, please try again!","Warning Message ",JOptionPane.ERROR_MESSAGE);
                 }
            
            }
            catch (SQLException e){
              JOptionPane.showMessageDialog(this,"Error occured while accessing the database.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);
            }  
            }
        } 
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        userText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        guideBack = new javax.swing.JButton();
        passText = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 224, 214));

        jLabel1.setFont(new java.awt.Font("FZShuTi", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(115, 188, 188));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nov/logo copy.png"))); // NOI18N
        jLabel1.setText("Guide Login");

        loginButton.setBackground(new java.awt.Color(119, 73, 73));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(242, 242, 242));
        loginButton.setText("Login");
        loginButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        userText.setToolTipText("Enter username");
        userText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(119, 72, 72));
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(119, 72, 72));
        jLabel3.setText("Password:");

        guideBack.setBackground(new java.awt.Color(242, 242, 242));
        guideBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        guideBack.setForeground(new java.awt.Color(119, 72, 72));
        guideBack.setText("Back");
        guideBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guideBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideBackActionPerformed(evt);
            }
        });

        passText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTextActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(135, 199, 199));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passText, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(userText)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(guideBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(guideBack))
                .addGap(55, 55, 55)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextActionPerformed

    private void passTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTextActionPerformed

    private void guideBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideBackActionPerformed
        this.setVisible(false);
        NovemberLand back = new NovemberLand(); 
        back.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        back.setSize(600, 500);
        back.setLocationRelativeTo(null);
        back.setVisible(true);
        back.setResizable(false);
    }//GEN-LAST:event_guideBackActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Guide_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guide_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guide_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guide_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guide_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guideBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passText;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
