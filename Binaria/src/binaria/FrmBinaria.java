/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaria;

/**
 *
 * @author david
 */
public class FrmBinaria extends javax.swing.JFrame {

    /**
     * Creates new form FrmBinaria
     */
    int it=0;
    int vec[] = {2,6,12,15,18,34,39,40,67,87};
    public FrmBinaria() {
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

        btnbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtiteraciones = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar);
        btnbuscar.setBounds(173, 205, 65, 23);

        jLabel1.setText("N.iteraciones:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(85, 122, 80, 14);

        txtiteraciones.setText("jTextField1");
        getContentPane().add(txtiteraciones);
        txtiteraciones.setBounds(173, 119, 59, 20);

        txtnumero.setText("jTextField2");
        getContentPane().add(txtnumero);
        txtnumero.setBounds(170, 80, 59, 20);

        jLabel2.setText("Numero:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 80, 60, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        int contador=0;
        
        int numero;
        int pos;
        int divisor=10;
        numero=Integer.valueOf(txtnumero.getText());
        for( int iteraciones=0;iteraciones<=10; iteraciones++)
        {
            
            divisor=divisor/2;
            pos=divisor-1;
            if(vec[pos]==numero)
            {
                it++;
                break;
            }
            else
            {
                it++;
            }
            if(vec[pos]>numero)
            {
             divisor=divisor/2;
             pos=divisor-1;
             if(vec[pos]==numero)
             {
                it++; 
                break; 
             }
             else
             {
                 it++;
             }
            }
            if(vec[pos]<numero)
            {
             divisor=divisor/2;
             divisor+=5;
             pos=divisor-1;
             if(vec[pos]==numero)
             {
                it++; 
                break; 
             }
             else
             {
                 it++;
             }
            }        
        }
        txtiteraciones.setText(String.valueOf(it));
            
   
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtnumero.setText("");
        txtiteraciones.setText("");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBinaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtiteraciones;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
