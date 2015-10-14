
package src;

import java.awt.*;
import javax.swing.*;

public class main extends javax.swing.JFrame {
    
    public main() {
        setResizable(false);
        initComponents();
        schema();
       
    }
    
    
    
    boolean d, t;
    boolean outputSigConj1;
    boolean outputSigConj2;
    boolean outputSigConj3;
    boolean outputSigConj4;
   
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupD = new javax.swing.ButtonGroup();
        buttonGroupT = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonD0 = new javax.swing.JRadioButton("0",true);
        buttonD1 = new javax.swing.JRadioButton();
        buttonT0 = new javax.swing.JRadioButton("0",true);
        buttonT1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D-Trigger");
        setName("DTrigger"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("D");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("T");

        buttonGroupD.add(buttonD0);
        buttonD0.setText("0");

        buttonGroupD.add(buttonD1);
        buttonD1.setText("1");

        buttonGroupT.add(buttonT0);
        buttonT0.setText("0");

        buttonGroupT.add(buttonT1);
        buttonT1.setText("1");

        jButton1.setText("Click");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "0", "1", "0", "1"},
                {"0", "1", "1", "0", "1"},
                {"1", "0", "1", "0", "1"},
                {"1", "1", "0", "1", "0"}
            },
            new String [] {
                "D", "T", "!(D&T)", "Q", "^Q"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMaxWidth(25);
            jTable3.getColumnModel().getColumn(1).setMaxWidth(25);
            jTable3.getColumnModel().getColumn(2).setMaxWidth(55);
            jTable3.getColumnModel().getColumn(3).setMaxWidth(25);
            jTable3.getColumnModel().getColumn(4).setMaxWidth(35);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonD0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonD1))
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonT0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonT1)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonD0)
                            .addComponent(buttonD1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonT0)
                            .addComponent(buttonT1))
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         Graphics g = jPanel1.getGraphics();
        
        
        if(buttonD0.isSelected()== true){ d=false;   }
        if(buttonD1.isSelected()== true){ d=true;    }
        if(buttonT0.isSelected()== true){ t=false;   }
        if(buttonT1.isSelected()== true){ t=true;    }
        
        dSigOnFirstInput();
        //-------------------------------------------
        tSigForSecondDInput();
        tSigForSecondInput();
        //-------------------------------------------
        outputSigConj1();
            inputFirstSigForConj2(outputSigConj1);
            inputFirstSigForConj3(outputSigConj1);
        //-------------------------------------------
        outputSigConj2(outputSigConj1);
            inputSecondSigForConj4(outputSigConj2);
        //-------------------------------------------
        outputSigConj3(d, t);
           
        outputSigConj4(d, t);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private boolean dSigOnFirstInput(){
    
    Graphics g = jPanel1.getGraphics();
    Color gree = new Color(48, 116, 51);
    
        if(d==false){

            g.setColor(Color.WHITE);
            g.clearRect(79, 18, 10, 10);
            
            g.setColor(Color.red);
            g.drawString("0", 80, 28); 
            
            d = false;
        }
        else{
         
              g.setColor(Color.WHITE);
              g.clearRect(79, 18, 10, 10);
             
              g.setColor(gree);
              g.drawString("1", 80, 28);
       
              d = true;
        }
    
    return d;
    }
    
    private boolean tSigForSecondDInput(){
    
    Graphics g = jPanel1.getGraphics();
    Color gree = new Color(48, 116, 51);
    
            if (t == false ){
    
                g.setColor(Color.WHITE);
                g.clearRect(79, 39, 10, 10);
            
                g.setColor(Color.red);
                g.drawString("0", 80, 49); 
    
                t = false;
    
            }
            else{
                
                g.setColor(Color.WHITE);
                g.clearRect(79, 39, 10, 10);
             
                g.setColor(gree);
                g.drawString("1", 80, 49);
    
                t = true;
                
                }
    
            return t;
    }
    
    private void tSigForSecondInput(){
    
         Graphics g = jPanel1.getGraphics();
         Color gree = new Color(48, 116, 51);
    
            if (t == false ){
    
                g.setColor(Color.WHITE);
                g.clearRect(79, 128, 10, 10);
            
                g.setColor(Color.red);
                g.drawString("0", 80, 138); 
    
            }
            else{
                
                g.setColor(Color.WHITE);
                g.clearRect(79, 128, 10, 10);
             
                g.setColor(gree);
                g.drawString("1", 80, 138);
    
                }
    
    
    
    
    
    }
    
    private boolean outputSigConj1(){
        
    Graphics g = jPanel1.getGraphics();
    Color gree = new Color(48, 116, 51);
    
        if ( (d&&t)==false ){
        
                g.setColor(Color.WHITE);
                g.clearRect(130, 28, 10, 10);
                g.setColor(gree);
                g.drawString("1", 131, 38);
                
                
                outputSigConj1 = true;
                
        }
        else{
        
                g.setColor(Color.WHITE);
                g.clearRect(130, 28, 10, 10);
                g.setColor(Color.red);
                g.drawString("0", 131, 38);
               
               
                outputSigConj1 = false;
        
        }
    
    
        return outputSigConj1;
    }
    
    
    
    private boolean inputFirstSigForConj2(boolean outputSingConj1){
        
            Graphics g = jPanel1.getGraphics();
            Color gree = new Color(48, 116, 51);
            
            if( outputSigConj1==false){
                
                g.setColor(Color.WHITE);
                g.clearRect(78, 110, 10, 10);
                g.setColor(Color.RED);
                g.drawString("0", 80, 120); 
            
            }
            else{
            
                g.setColor(Color.WHITE);
                g.clearRect(78, 110, 10, 10);
                g.setColor(gree);
                g.drawString("1", 80, 120); 
            
    
            }
            
        return true;
        }
    
    private boolean inputFirstSigForConj3(boolean outputSingConj1){
        
            Graphics g = jPanel1.getGraphics();
            Color gree = new Color(48, 116, 51);
            
            if(outputSigConj1==true){
                
                g.setColor(Color.WHITE);
                g.clearRect(188, 19, 10, 10);
                g.setColor(gree);
                g.drawString("1", 189, 29); 
            
            }
            else{
            
                g.setColor(Color.WHITE);
                g.clearRect(188, 19, 10, 10);
                g.setColor(Color.RED);
                g.drawString("0", 189, 29); 
            
    
            }
        
        
        return true;
        }
        
    
    
    private boolean outputSigConj2(boolean outputSigConj1){
    
        Graphics g = jPanel1.getGraphics();
        Color gree = new Color(48, 116, 51);
    
        if ( (outputSigConj1&&t )== false ){
        
                g.setColor(Color.WHITE);
                g.clearRect(130, 119, 10, 10);
                g.setColor(gree);
                g.drawString("1", 131, 129);
                
                outputSigConj2 = false;
        }
        else{
        
                g.setColor(Color.WHITE);
                g.clearRect(130, 119, 10, 10);
                g.setColor(Color.RED);
                g.drawString("0", 131, 129);
        
                outputSigConj2 = true;
        
        }
    
        return outputSigConj2;
    }
    
    private void inputSecondSigForConj4(boolean outputSingConj2){
        
        Graphics g = jPanel1.getGraphics();
        Color gree = new Color(48, 116, 51);
    
        if ( outputSigConj2 == true ){
        
                g.setColor(Color.WHITE);
                g.clearRect(188, 129, 10, 10);
                g.setColor(Color.RED);
                g.drawString("0", 189, 139);
                
        }
        else{
        
                g.setColor(Color.WHITE);
                g.clearRect(188, 129, 10, 10);
                g.setColor(gree);
                g.drawString("1", 189, 139);
            
            }
        
        
        }
    
    
    
    private void outputSigConj3(boolean d, boolean t){
    
         Graphics g = jPanel1.getGraphics();
         Color gree = new Color(48, 116, 51);
         
         g.setColor(Color.WHITE);
                g.clearRect(250, 26, 10, 10);
                g.setColor(Color.red);
                g.drawString("0", 251, 36);
         g.setColor(Color.WHITE);
                g.clearRect(188, 108, 10, 10);
                g.setColor(Color.red);
                g.drawString("0", 189, 118);
                
        
                
        
        
        if( (d==false)&&(t==true)){
        
                g.setColor(Color.WHITE);
                g.clearRect(250, 26, 10, 10);
                g.setColor(Color.red);
                g.drawString("0", 251, 36);
                
                g.setColor(Color.WHITE);
                g.clearRect(188, 108, 10, 10);
                g.setColor(Color.red);
                g.drawString("0", 189, 118);
               
        
        }
        
        if( (d==true)&&(t==true) ) {
        
                g.setColor(Color.WHITE);
                g.clearRect(250, 26, 10, 10);
                g.setColor(gree);
                g.drawString("1", 251, 36);
                
                g.setColor(Color.WHITE);
                g.clearRect(188, 108, 10, 10);
                g.setColor(gree);
                g.drawString("1", 189, 118);
                
               
        
        }
    
    
 
    }
   
    private void outputSigConj4(boolean d, boolean t){
    
    
         Graphics g = jPanel1.getGraphics();
         Color gree = new Color(48, 116, 51);
        
         g.setColor(Color.WHITE);
                g.clearRect(250, 131, 10, 10);
                g.setColor(gree);
                g.drawString("1", 251, 141);
         g.setColor(Color.WHITE);
                g.clearRect(188, 53, 10, 10);
                g.setColor(gree);
                g.drawString("1", 189, 63);
         
        if( (d==false)&&(t==true)){
        
                g.setColor(Color.WHITE);
                g.clearRect(250, 131, 10, 10);
                g.setColor(gree);
                g.drawString("1", 251, 141);
                
                 
                g.setColor(Color.WHITE);
                g.clearRect(188, 53, 10, 10);
                g.setColor(gree);
                g.drawString("1", 189, 63);
        
        }
        
        if( (d==true)&&(t==true) ) {
        
                g.setColor(Color.WHITE);
                g.clearRect(250, 131, 10, 10);
                g.setColor(Color.RED);
                g.drawString("0", 251, 141);
                
                g.setColor(Color.WHITE);
                g.clearRect(188, 53, 10, 10);
                g.setColor(Color.red);
                g.drawString("0", 189, 63);
        
        }
    
    
    }
    
    
    private void jPanel1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorMoved
        schema();       
    }//GEN-LAST:event_jPanel1AncestorMoved

    
    
    
    private void schema(){
        
        Graphics g = jPanel1.getGraphics();
        

        g.drawRect(90, 20, 30, 40);     //2and-not№1
        g.drawRect(90, 110, 30, 40 );   //2and-not№2
        g.drawRect(200, 20, 30, 40);    //2and-not№3
        g.drawRect(200, 110, 30, 40);   //2and-нnot№4
        
         g.drawString("&", 105, 35);
         g.drawString("&", 105, 125);
         g.drawString("&", 215, 35);
         g.drawString("&", 215, 125);
         g.drawString("D", 32, 28);
         g.drawString("T", 32, 138);
         g.drawString("Q", 300, 32);
         g.drawString("^Q",300, 130);
         
        
        
        
        g.drawLine(30, 30, 90, 30);     //line_1
        g.drawLine(55, 50, 90, 50);     //line_2
        g.drawLine(30, 140, 90, 140);   //line_3
        g.drawLine(55, 50, 55, 140);    //line_4
        
        g.drawLine(126, 40, 150, 40);   //line_5
        g.drawLine(150, 40, 150, 30);   //line_5.1
        g.drawLine(150, 30, 200, 30);   //line_5.2
        
        g.drawLine(75, 120, 90, 120);   //line_6
        g.drawLine(75, 120, 75, 85);   //line_6.1
        g.drawLine(75, 85, 135, 85);   //line_6.2
        g.drawLine(135, 85, 135, 40);   //line_6.3
        
        g.drawLine(126, 130, 150, 130);    //line_7
        g.drawLine(150, 130, 150, 140);    //line_7.1
        g.drawLine(150, 140, 200, 140);    //line_7.2
        
        
        g.drawLine(180, 120, 200, 120);//line_8
        g.drawLine(180, 120, 180, 100);//line_8.1
        g.drawLine(265, 38, 265, 65); //line8.3
        g.drawLine(180, 100, 265, 65);//line_8.4
        
        g.drawLine(180, 50, 200, 50); //line 9
        g.drawLine(180, 50, 180, 70); //line 9.1
        g.drawLine(265, 128, 265, 105); // line 9.3
        g.drawLine(180, 70, 265, 105); // line 9.4
        
        
        g.drawLine(235, 38, 292, 38); //line up
        g.drawLine(235, 128, 292, 128);//line down
        
        g.drawOval(120, 36, 6, 6);//oval_1
        g.drawOval(120, 126, 6, 6);//oval_2
        g.drawOval(230,36, 6, 6);//oval_3
        g.drawOval(230, 126, 6, 6);//oval_4
        
        
         
        
        
        
        
        }
    
    
    
    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton buttonD0;
    private javax.swing.JRadioButton buttonD1;
    private javax.swing.ButtonGroup buttonGroupD;
    private javax.swing.ButtonGroup buttonGroupT;
    private javax.swing.JRadioButton buttonT0;
    private javax.swing.JRadioButton buttonT1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

    private void outputSigConj2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
