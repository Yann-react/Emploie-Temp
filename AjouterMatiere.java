
package emploidutemps;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class AjouterMatiere extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    
    public AjouterMatiere() {
        initComponents();
        selectmatiere();
    }

    public void selectmatiere(){
        try {
            String url = "jdbc:mysql://localhost:3306/mytab";
            con = DriverManager.getConnection(url, "root", "Yann2003");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM ajouter_matiere");
            T1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AM1 = new javax.swing.JTextField();
        AM2 = new javax.swing.JTextField();
        AM3 = new javax.swing.JTextField();
        AM5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        AM4 = new javax.swing.JTextField();
        AM6 = new javax.swing.JButton();
        AM0 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajouter Matiere");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(160, 219, 242));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ajouter Matiere");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nom Enseignant :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Libelle Matiere :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nom Matiere :");

        AM1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AM1ActionPerformed(evt);
            }
        });

        AM2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        AM3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        AM5.setBackground(new java.awt.Color(21, 143, 191));
        AM5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AM5.setForeground(new java.awt.Color(255, 255, 255));
        AM5.setText("Ajouter");
        AM5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AM5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero Enseignant :");

        AM4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        AM6.setBackground(new java.awt.Color(21, 143, 191));
        AM6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AM6.setForeground(new java.awt.Color(255, 255, 255));
        AM6.setText("Retour");
        AM6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AM6ActionPerformed(evt);
            }
        });

        AM0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Id Matiere");

        jButton1.setBackground(new java.awt.Color(21, 143, 191));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUPPRIMER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 88, Short.MAX_VALUE)
                .addComponent(AM5)
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(AM6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AM0, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(AM1)
                            .addComponent(AM2)
                            .addComponent(AM3)
                            .addComponent(AM4))))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AM0, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AM1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AM2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AM3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AM5)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(AM6)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 500));

        T1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID MATIERE", "NOM ENSEIGNANT", "LIBELLE MATIERE", "NOM MATIERE", "NUM ENSEIGNANT"
            }
        ));
        T1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(T1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 590, 490));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -50, 1187, 620));

        setSize(new java.awt.Dimension(1017, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AM1ActionPerformed

    private void AM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AM5ActionPerformed
     try{
            String url = "jdbc:mysql://localhost:3306/mytab";
            con = DriverManager.getConnection(url, "root", "Yann2003");
            pst = con.prepareStatement("insert into ajouter_matiere values(?,?,?,?,?)");
            pst.setInt(1, Integer.parseInt(AM0.getText()));
            pst.setString(2, AM1.getText());
            pst.setString(3, AM2.getText());
            pst.setString(4, AM3.getText());
            pst.setInt(5, Integer.parseInt(AM4.getText()));
            int row = pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Matiere ajouter avec succes");
            selectmatiere(); // permet de rendre les echanges dynamique (quand on renseigne les champs automatquement vont dans la base de donnees et automatiquement dans le tableau)
            
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_AM5ActionPerformed

    private void AM6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AM6ActionPerformed
        Accueil d = new Accueil();
        this.hide();
        d.setVisible(true);
    }//GEN-LAST:event_AM6ActionPerformed

    private void T1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T1MouseClicked
   
        DefaultTableModel model = (DefaultTableModel)T1.getModel();
        int mylndex = T1.getSelectedRow();// la ligne selectionne 
        AM0.setText(model.getValueAt(mylndex, 0).toString());// l'id etant on le converti en String pour recuperer avec la methode toString
        AM1.setText(model.getValueAt(mylndex, 1).toString());
        AM2.setText(model.getValueAt(mylndex, 2).toString());
        AM3.setText(model.getValueAt(mylndex, 3).toString());
        AM4.setText(model.getValueAt(mylndex, 4).toString());        
    }//GEN-LAST:event_T1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // SUPPPRIMER LES INFORMATIONS DE LA BASE DU TABLEAU EN MEME TEMPS DE LA BASE DONNEES 
        if(AM0.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Choisissez l'utilisateur a supprimer");
        }else{
          try{
              String url = "jdbc:mysql://localhost:3306/mytab";
              con = DriverManager.getConnection(url, "root", "Yann2003");
              st = con.createStatement();
              st.executeUpdate("DELETE FROM ajouter_matiere WHERE id = "+AM0.getText());
              JOptionPane.showMessageDialog(this, "Utilisateur supprimer avec succes");
              selectmatiere();
        }catch(Exception e){
           System.out.println(e);
        }}
         
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AjouterMatiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterMatiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterMatiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterMatiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterMatiere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AM0;
    private javax.swing.JTextField AM1;
    private javax.swing.JTextField AM2;
    private javax.swing.JTextField AM3;
    private javax.swing.JTextField AM4;
    private javax.swing.JButton AM5;
    private javax.swing.JButton AM6;
    private javax.swing.JTable T1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
