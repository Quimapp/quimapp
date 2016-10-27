package quimapp.gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import quimapp.Lector;

public class Ventana extends javax.swing.JFrame {

    private Color colorAlEntrar, colorNormal;

    public Ventana() {
        Lector l = new Lector(this);
        setExtendedState(MAXIMIZED_BOTH);
        colorAlEntrar = Color.YELLOW;
        colorNormal = new Color(hexadecimal("D90007"));
        initComponents();
    }

    public int hexadecimal(String hexa) {

        return Integer.parseInt(hexa, 16);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_botones = new javax.swing.JPanel();
        btn_nuevaClase = new javax.swing.JButton();
        btn_explicaciones = new javax.swing.JButton();
        btn_opciones = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quim.app v0.0.1");
        setBackground(new java.awt.Color(255, 255, 255));

        panel_botones.setBackground(new java.awt.Color(51, 51, 51));
        panel_botones.setMaximumSize(new java.awt.Dimension(0, 0));
        panel_botones.setName(""); // NOI18N

        btn_nuevaClase.setBackground(new java.awt.Color(217, 0, 7));
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

        btn_explicaciones.setBackground(new java.awt.Color(217, 0, 7));
        btn_explicaciones.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_explicaciones.setForeground(new java.awt.Color(255, 255, 255));
        btn_explicaciones.setText("Conceptos");
        btn_explicaciones.setToolTipText("Explora en el mundo de la Química");
        btn_explicaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_explicaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_explicaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_explicaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_explicacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_explicacionesMouseExited(evt);
            }
        });

        btn_opciones.setBackground(new java.awt.Color(217, 0, 7));
        btn_opciones.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_opciones.setForeground(new java.awt.Color(255, 255, 255));
        btn_opciones.setText("Opciones");
        btn_opciones.setToolTipText("Ve las opciones disponibles de Quim.app");
        btn_opciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_opciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_opciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_opciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_opcionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_opcionesMouseExited(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(217, 0, 7));
        btn_salir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("Salir");
        btn_salir.setToolTipText("Nos vemos pronto :)");
        btn_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salirMouseExited(evt);
            }
        });
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_botonesLayout = new javax.swing.GroupLayout(panel_botones);
        panel_botones.setLayout(panel_botonesLayout);
        panel_botonesLayout.setHorizontalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_nuevaClase, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(btn_explicaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_botonesLayout.setVerticalGroup(
            panel_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_nuevaClase, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_explicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btn_explicacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_explicacionesMouseEntered
        btn_explicaciones.setBackground(colorAlEntrar);
        btn_explicaciones.setSize(btn_explicaciones.getWidth() + 10, btn_explicaciones.getHeight());

    }//btn_nuevaClase.setBackground(colorAlEntrar);    }//GEN-LAST:event_btn_explicacionesMouseEntered

    private void btn_explicacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_explicacionesMouseExited
        btn_explicaciones.setBackground(colorNormal);
        btn_explicaciones.setSize(btn_explicaciones.getWidth() - 10, btn_explicaciones.getHeight());
    }//GEN-LAST:event_btn_explicacionesMouseExited

    private void btn_opcionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_opcionesMouseEntered
        btn_opciones.setBackground(colorAlEntrar);

        btn_opciones.setSize(btn_opciones.getWidth() + 10, btn_opciones.getHeight());
    }//GEN-LAST:event_btn_opcionesMouseEntered

    private void btn_opcionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_opcionesMouseExited
        btn_opciones.setBackground(colorNormal);

        btn_opciones.setSize(btn_opciones.getWidth() - 10, btn_opciones.getHeight());
    }//GEN-LAST:event_btn_opcionesMouseExited

    private void btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseEntered
        btn_salir.setBackground(colorAlEntrar);
        btn_salir.setSize(btn_salir.getWidth() + 10, btn_salir.getHeight());
    }//GEN-LAST:event_btn_salirMouseEntered

    private void btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseExited
        btn_salir.setBackground(colorNormal);
        btn_salir.setSize(btn_salir.getWidth() - 10, btn_salir.getHeight());
    }//GEN-LAST:event_btn_salirMouseExited

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed

        int x = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres salir?", "Confirmación de salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (x == 0) {

            System.exit(0);

        }

    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_nuevaClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaClaseActionPerformed

    }//GEN-LAST:event_btn_nuevaClaseActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_explicaciones;
    public static javax.swing.JButton btn_nuevaClase;
    public static javax.swing.JButton btn_opciones;
    public static javax.swing.JButton btn_salir;
    private javax.swing.JPanel panel_botones;
    // End of variables declaration//GEN-END:variables

}
