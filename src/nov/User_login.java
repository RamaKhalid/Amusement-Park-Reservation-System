
package nov;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Color;

public class User_login extends javax.swing.JFrame implements ActionListener{
    public static String username;
    Connection connection = null ;
    PreparedStatement pstatement;
    ResultSet rs = null;
    int check = 0;
    public static Customer loggedUser;
    public static Reservations test;
    public void loginCheck(String username, String password){
    if (password.trim().equalsIgnoreCase("") || username.trim().equalsIgnoreCase(""))
    {
        JOptionPane.showMessageDialog(null,"all fields must be filled to login...","Error",JOptionPane.ERROR_MESSAGE); 
        check = 1;
    }
  
    else if (!(username.length()==10 && username.matches("[0-9]+"))){
        check  = 2;
        JOptionPane.showMessageDialog(null,"invalid phone number...","Error",JOptionPane.ERROR_MESSAGE); 
        }
    
    else  check = 0;
 } // method to validate the input

    public static void uplodToRes(String type, int numTickets, String date, String guide , double cost){
        test = new  Reservations(type,numTickets,date,guide,cost);
        Reservations.uploadRes(test);
    }
    
    
    
    public User_login() {
        
        super("User login");
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
        
        loginButton.addActionListener(this);
    } // end of constructor
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        userText = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        signUp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        p2 = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 224, 214));

        jLabel1.setFont(new java.awt.Font("FZShuTi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(115, 188, 188));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nov/logo copy.png"))); // NOI18N

        loginButton.setBackground(new java.awt.Color(242, 242, 242));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(119, 72, 72));
        loginButton.setText("Login");
        loginButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        userText.setToolTipText("Enter Phone number");

        userLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(119, 72, 72));
        userLabel.setText("Phone number:");

        passLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(119, 72, 72));
        passLabel.setText("Password:");

        back.setBackground(new java.awt.Color(242, 242, 242));
        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(119, 72, 72));
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        signUp.setBackground(new java.awt.Color(119, 73, 73));
        signUp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signUp.setForeground(new java.awt.Color(242, 242, 242));
        signUp.setText("sign up");
        signUp.setToolTipText("Creat new account");
        signUp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(119, 72, 72));
        jLabel4.setText("Don't Have an account?");

        password.setToolTipText("Enter password");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(163, 201, 201));
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(163, 201, 201));
        jLabel3.setText("To your");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(163, 201, 201));
        jLabel5.setText("Account");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nov/amusement.png"))); // NOI18N

        p1.setBackground(new java.awt.Color(163, 201, 201));
        p1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                p1MouseMoved(evt);
            }
        });
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        p2.setBackground(new java.awt.Color(163, 201, 201));
        p2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                p2MouseMoved(evt);
            }
        });
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        p3.setBackground(new java.awt.Color(163, 201, 201));
        p3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                p3MouseMoved(evt);
            }
        });
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(userText)
                                        .addComponent(password))
                                    .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1))
                            .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(back)
                                    .addComponent(loginButton))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(signUp)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        NovemberLand back = new NovemberLand(); 
        back.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        back.setSize(600, 500);
        back.setLocationRelativeTo(null);
        back.setVisible(true);
        back.setResizable(false);
    }//GEN-LAST:event_backActionPerformed

    private void p1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseMoved
       p1.setBackground(Color.ORANGE);
    }//GEN-LAST:event_p1MouseMoved

    private void p1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseExited
        p1.setBackground(Color.LIGHT_GRAY);
       
    }//GEN-LAST:event_p1MouseExited

    private void p2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseMoved
        p2.setBackground(Color.ORANGE);
    }//GEN-LAST:event_p2MouseMoved

    private void p2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseExited
       p2.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_p2MouseExited

    private void p3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseExited
        p3.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_p3MouseExited

    private void p3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseMoved
        p3.setBackground(Color.ORANGE);
    }//GEN-LAST:event_p3MouseMoved

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed
    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {                                       
        this.setVisible(false);
        user_sign sign = new user_sign(); 
        sign.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sign.setSize(540, 320);
        sign.setLocationRelativeTo(null);
        sign.setVisible(true);
        sign.setResizable(false);
    }
    
    public static void main(String args[]) {
        
            
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_login().setVisible(true);
            }
        });
                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signUp;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent event) {
        
             username = userText.getText();
             String pass = password.getText();
            
        
        if (event.getSource() == loginButton){
            loginCheck(username , pass);
            if(check == 0){
            try{
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);
               String query = "Select * from customer where phoneNumber = ? and pass = ?";
               pstatement = connection.prepareStatement(query);
               pstatement.setString(1,username );
               pstatement.setString(2,pass);   
               rs = pstatement.executeQuery();
               
               if (rs.next()){
                loggedUser = new Customer(username);
                 if (NovemberLand.choice == 1) {
                 this.setVisible(false);
                 familyRes res = new familyRes();
                 res.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 res.setSize(566, 542);
                 res.setLocationRelativeTo(null);
                 res.setResizable(false);
                 res.setVisible(true);
                }
                if (NovemberLand.choice == 2){
                this.setVisible(false);
                adultRes res = new adultRes();
                res.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                res.setSize(550, 520);
                res.setLocationRelativeTo(null);
                 res.setResizable(false);
                res.setVisible(true);
                }
                if (NovemberLand.choice == 3){
                this.setVisible(false);
                kidsRes res = new kidsRes();
                res.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                res.setSize(530, 563);
                res.setLocationRelativeTo(null);
                 res.setResizable(false);
                res.setVisible(true);
                }
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
        } // end of login button handeling
        
    } // end of listener method
} // end of class
