package quimapp.gui;

import java.awt.Color;

public class Dialogo_Conceptos extends javax.swing.JDialog {

    public Color colorAlEntrar, colorNormal;

    public Dialogo_Conceptos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        colorAlEntrar = Color.YELLOW;
        colorNormal = new Color(51, 255, 51);
        initComponents();
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
        btn_nuevaClase = new javax.swing.JButton();
        btn_nuevaClase1 = new javax.swing.JButton();
        btn_nuevaClase2 = new javax.swing.JButton();
        btn_nuevaClase3 = new javax.swing.JButton();
        btn_nuevaClase4 = new javax.swing.JButton();
        btn_nuevaClase5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btn_nuevaClase.setBackground(new java.awt.Color(51, 255, 51));
        btn_nuevaClase.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_nuevaClase.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevaClase.setText("Nueva Clase");
        btn_nuevaClase.setToolTipText("Inicia una nueva clase de Química");
        btn_nuevaClase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_nuevaClase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevaClase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevaClase.setMaximumSize(new java.awt.Dimension(0, 0));
        btn_nuevaClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_nuevaClaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_nuevaClaseMouseExited(evt);
            }
        });
        btn_nuevaClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevaClaseActionPerformed(evt);
            }
        });

        btn_nuevaClase1.setBackground(new java.awt.Color(51, 255, 51));
        btn_nuevaClase1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_nuevaClase1.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevaClase1.setText("Nueva Clase");
        btn_nuevaClase1.setToolTipText("Inicia una nueva clase de Química");
        btn_nuevaClase1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_nuevaClase1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevaClase1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevaClase1.setMaximumSize(new java.awt.Dimension(0, 0));
        btn_nuevaClase1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_nuevaClase1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_nuevaClase1MouseExited(evt);
            }
        });
        btn_nuevaClase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevaClase1ActionPerformed(evt);
            }
        });

        btn_nuevaClase2.setBackground(new java.awt.Color(51, 255, 51));
        btn_nuevaClase2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_nuevaClase2.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevaClase2.setText("Nueva Clase");
        btn_nuevaClase2.setToolTipText("Inicia una nueva clase de Química");
        btn_nuevaClase2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_nuevaClase2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevaClase2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevaClase2.setMaximumSize(new java.awt.Dimension(0, 0));
        btn_nuevaClase2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_nuevaClase2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_nuevaClase2MouseExited(evt);
            }
        });
        btn_nuevaClase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevaClase2ActionPerformed(evt);
            }
        });

        btn_nuevaClase3.setBackground(new java.awt.Color(51, 255, 51));
        btn_nuevaClase3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_nuevaClase3.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevaClase3.setText("Nueva Clase");
        btn_nuevaClase3.setToolTipText("Inicia una nueva clase de Química");
        btn_nuevaClase3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_nuevaClase3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevaClase3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevaClase3.setMaximumSize(new java.awt.Dimension(0, 0));
        btn_nuevaClase3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_nuevaClase3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_nuevaClase3MouseExited(evt);
            }
        });
        btn_nuevaClase3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevaClase3ActionPerformed(evt);
            }
        });

        btn_nuevaClase4.setBackground(new java.awt.Color(51, 255, 51));
        btn_nuevaClase4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_nuevaClase4.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevaClase4.setText("Nueva Clase");
        btn_nuevaClase4.setToolTipText("Inicia una nueva clase de Química");
        btn_nuevaClase4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_nuevaClase4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevaClase4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevaClase4.setMaximumSize(new java.awt.Dimension(0, 0));
        btn_nuevaClase4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_nuevaClase4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_nuevaClase4MouseExited(evt);
            }
        });
        btn_nuevaClase4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevaClase4ActionPerformed(evt);
            }
        });

        btn_nuevaClase5.setBackground(new java.awt.Color(51, 255, 51));
        btn_nuevaClase5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_nuevaClase5.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevaClase5.setText("Nueva Clase");
        btn_nuevaClase5.setToolTipText("Inicia una nueva clase de Química");
        btn_nuevaClase5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_nuevaClase5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevaClase5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevaClase5.setMaximumSize(new java.awt.Dimension(0, 0));
        btn_nuevaClase5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_nuevaClase5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_nuevaClase5MouseExited(evt);
            }
        });
        btn_nuevaClase5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevaClase5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_nuevaClase, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nuevaClase4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_nuevaClase1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nuevaClase3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_nuevaClase2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nuevaClase5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nuevaClase1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nuevaClase3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nuevaClase, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nuevaClase4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nuevaClase2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nuevaClase5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
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

    private void btn_nuevaClaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaClaseMouseEntered

        btn_nuevaClase.setBackground(colorAlEntrar);
        btn_nuevaClase.setSize(btn_nuevaClase.getWidth() + 10, btn_nuevaClase.getHeight());

    }//GEN-LAST:event_btn_nuevaClaseMouseEntered

    private void btn_nuevaClaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaClaseMouseExited

        btn_nuevaClase.setBackground(colorNormal);
        btn_nuevaClase.setSize(btn_nuevaClase.getWidth() - 10, btn_nuevaClase.getHeight());

    }//GEN-LAST:event_btn_nuevaClaseMouseExited

    private void btn_nuevaClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaClaseActionPerformed

    }//GEN-LAST:event_btn_nuevaClaseActionPerformed

    private void btn_nuevaClase1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaClase1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase1MouseEntered

    private void btn_nuevaClase1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaClase1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase1MouseExited

    private void btn_nuevaClase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaClase1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase1ActionPerformed

    private void btn_nuevaClase2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaClase2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase2MouseEntered

    private void btn_nuevaClase2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaClase2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase2MouseExited

    private void btn_nuevaClase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaClase2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase2ActionPerformed

    private void btn_nuevaClase3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaClase3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase3MouseEntered

    private void btn_nuevaClase3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaClase3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase3MouseExited

    private void btn_nuevaClase3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaClase3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase3ActionPerformed

    private void btn_nuevaClase4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaClase4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase4MouseEntered

    private void btn_nuevaClase4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaClase4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase4MouseExited

    private void btn_nuevaClase4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaClase4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase4ActionPerformed

    private void btn_nuevaClase5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaClase5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase5MouseEntered

    private void btn_nuevaClase5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevaClase5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase5MouseExited

    private void btn_nuevaClase5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaClase5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevaClase5ActionPerformed

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
            java.util.logging.Logger.getLogger(Dialogo_Conceptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialogo_Conceptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialogo_Conceptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialogo_Conceptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dialogo_Conceptos dialog = new Dialogo_Conceptos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_nuevaClase;
    public static javax.swing.JButton btn_nuevaClase1;
    public static javax.swing.JButton btn_nuevaClase2;
    public static javax.swing.JButton btn_nuevaClase3;
    public static javax.swing.JButton btn_nuevaClase4;
    public static javax.swing.JButton btn_nuevaClase5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
