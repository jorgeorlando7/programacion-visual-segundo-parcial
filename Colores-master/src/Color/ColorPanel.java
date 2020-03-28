package Color;

import java.awt.Color;


public class ColorPanel extends javax.swing.JFrame {

    public ColorPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelColor = new javax.swing.JPanel();
        sliderRed = new javax.swing.JSlider();
        sliderGreen = new javax.swing.JSlider();
        sliderBlue = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spinRed = new javax.swing.JSpinner();
        spinGreen = new javax.swing.JSpinner();
        spinBlue = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelColor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelColorLayout = new javax.swing.GroupLayout(panelColor);
        panelColor.setLayout(panelColorLayout);
        panelColorLayout.setHorizontalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );
        panelColorLayout.setVerticalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        sliderRed.setMaximum(255);
        sliderRed.setValue(0);
        sliderRed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderRedStateChanged(evt);
            }
        });

        sliderGreen.setMaximum(255);
        sliderGreen.setValue(0);
        sliderGreen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderGreenStateChanged(evt);
            }
        });

        sliderBlue.setMaximum(255);
        sliderBlue.setValue(0);
        sliderBlue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBlueStateChanged(evt);
            }
        });

        jLabel4.setText("Red");

        jLabel5.setText("Green");

        jLabel6.setText("Blue");

        spinRed.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        spinRed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinRedStateChanged(evt);
            }
        });

        spinGreen.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        spinGreen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinGreenStateChanged(evt);
            }
        });

        spinBlue.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        spinBlue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinBlueStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderRed, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(spinRed)
                    .addComponent(spinGreen, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(spinBlue))
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sliderRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sliderGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sliderBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addComponent(panelColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderRedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderRedStateChanged
        spinRed.setValue(sliderRed.getValue());
        setColorPanel();
    }//GEN-LAST:event_sliderRedStateChanged

    private void spinRedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinRedStateChanged
        sliderRed.setValue((Integer)spinRed.getValue());
    }//GEN-LAST:event_spinRedStateChanged

    private void sliderGreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderGreenStateChanged
        spinGreen.setValue(sliderGreen.getValue());
        setColorPanel();
    }//GEN-LAST:event_sliderGreenStateChanged

    private void sliderBlueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBlueStateChanged
        spinBlue.setValue(sliderBlue.getValue());
        setColorPanel();
    }//GEN-LAST:event_sliderBlueStateChanged

    private void spinBlueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinBlueStateChanged
        sliderBlue.setValue((Integer)spinBlue.getValue());
    }//GEN-LAST:event_spinBlueStateChanged

    private void spinGreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinGreenStateChanged
        sliderGreen.setValue((Integer)spinGreen.getValue());
    }//GEN-LAST:event_spinGreenStateChanged

    private void setColorPanel() {
        panelColor.setBackground(
                new Color(sliderRed.getValue(), 
                        sliderGreen.getValue(), 
                        sliderBlue.getValue()
                )
        );
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
            java.util.logging.Logger.getLogger(ColorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panelColor;
    private javax.swing.JSlider sliderBlue;
    private javax.swing.JSlider sliderGreen;
    private javax.swing.JSlider sliderRed;
    private javax.swing.JSpinner spinBlue;
    private javax.swing.JSpinner spinGreen;
    private javax.swing.JSpinner spinRed;
    // End of variables declaration//GEN-END:variables
}
