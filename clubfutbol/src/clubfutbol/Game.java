
package clubfutbol;



public class Game extends javax.swing.JFrame {
FutbolC game =  new FutbolC();

Jugador game1;
DirectorT game2;
 
    public Game() {
        initComponents();
        setTitle("Game");
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdorsal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboposicion = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txttiempo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txar = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UDC Rutbol Club");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 20, 153, 25);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del jugador:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 60, 140, 17);
        getContentPane().add(txtnombre);
        txtnombre.setBounds(220, 60, 150, 20);

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apellido del jugador:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 99, 134, 17);
        getContentPane().add(txtapellido);
        txtapellido.setBounds(218, 98, 150, 20);

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad del jugador:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 137, 114, 17);
        getContentPane().add(txtedad);
        txtedad.setBounds(218, 136, 40, 20);

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero del dorsal:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 175, 123, 17);
        getContentPane().add(txtdorsal);
        txtdorsal.setBounds(218, 174, 40, 20);

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Posición del jugador:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 215, 136, 17);

        cboposicion.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        cboposicion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Posición", "Portero", "Defensa", "Mediocampo", "Delantero" }));
        getContentPane().add(cboposicion);
        cboposicion.setBounds(218, 212, 150, 23);

        jButton1.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(161, 312, 77, 25);

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Duracion de contrato:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 254, 138, 17);
        getContentPane().add(txttiempo);
        txttiempo.setBounds(218, 253, 40, 20);

        txar.setColumns(20);
        txar.setRows(5);
        jScrollPane2.setViewportView(txar);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 370, 600, 200);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\marce\\OneDrive\\Escritorio\\free-soccer-field-vector.jpg")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 130, 700, 490);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        game1 = new Jugador();
        game2 = new DirectorT();
        
        String Nombre, Apellido;
        int edad, nDorsal, TiempoContrato;
        
        Nombre = txtnombre.getText();
        Apellido = txtapellido.getText();
        edad = Integer.parseInt(txtedad.getText());
        nDorsal = Integer.parseInt(txtdorsal.getText());
        TiempoContrato = Integer.parseInt(txttiempo.getText());
        
        String posicion = cboposicion.getSelectedItem().toString();
        
        cboposicion.setSelectedIndex(0);
        txtnombre.setText("");
        txtapellido.setText("");
        txtedad.setText("");
        txtdorsal.setText("");
        txttiempo.setText("");

        txar.setText(game2.MOSTRAR());
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboposicion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txar;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtdorsal;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttiempo;
    // End of variables declaration//GEN-END:variables
}
