package generadorcsv;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Window extends javax.swing.JFrame {

    public Window() {
        initComponents();
        //setIconImage (new ImageIcon(getClass().getResource("icon.png")).getImage());
        this.setTitle("Consultor - CSV");
        //jButtonCsv.setEnabled(false);

    }

    public void rellenador(String a, String b, String c, String d, String e, String g, String h) {
        this.jSqlText.setText(a);
        this.jSimboloText.setText(b);
        this.jUserText.setText(c);
        this.jPassText.setText(d);
        this.jServerText.setText(e);
        //this.jPortText.setText(f);
        this.jDataBaseText.setText(g);
        this.jPathText.setText(h);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonCsv = new javax.swing.JButton();
        jSimboloText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jUserText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jDataBaseText = new javax.swing.JTextField();
        jServerText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jPathText = new javax.swing.JTextField();
        jPassText = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jSqlText = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta ");

        jButtonCsv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCsv.setText("Generar CSV");
        jButtonCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCsvActionPerformed(evt);
            }
        });

        jSimboloText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSimboloTextKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Valor de separación del archivo CSV");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(200, 200, 200));
        jLabel5.setText("Nota: Recuerda usar caracteres especiales de separación ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(200, 200, 200));
        jLabel6.setText("para evitar conflictos cuando genere el archivo CSV.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(200, 200, 200));
        jLabel7.setText("Algunos ejemplos: \" & \", \" $ \", \" # \"");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generadorcsv/a24.png"))); // NOI18N

        jDataBaseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDataBaseTextActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DataBase");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Server");

        saveButton.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generadorcsv/dir.png"))); // NOI18N
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jPathText.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jPathText.setEnabled(false);
        jPathText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPathTextActionPerformed(evt);
            }
        });

        jPassText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassTextActionPerformed(evt);
            }
        });

        jSqlText.setColumns(20);
        jSqlText.setRows(5);
        jScrollPane1.setViewportView(jSqlText);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("<html> <center>Generar <br> Auto-Query");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(8, 8, 8)))
                                        .addComponent(jSimboloText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonCsv, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPathText, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel3))
                                            .addComponent(jLabel4))
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jUserText, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                                    .addComponent(jDataBaseText)
                                    .addComponent(jPassText)
                                    .addComponent(jServerText))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addComponent(jSeparator1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel9)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jUserText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDataBaseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jServerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPathText)
                            .addComponent(jSimboloText)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(52, 52, 52)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCsv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCsvActionPerformed
        if (jUserText.getText().isEmpty() || jPassText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Usuario o Contraseña esta vacio");
        } else {
            String usuario = jUserText.getText();
            String pass = jPassText.getText();
            String server = jServerText.getText();
            String dataBase = jDataBaseText.getText();
            //String port = jPortText.getText();

            ConexionSql connex = new ConexionSql();
            connex.conectado(usuario, pass, server, dataBase);
            if (jSimboloText.getText().isEmpty()) {
                jSimboloText.setText(";");
            }

            //obtener campos
            String d1 = jSqlText.getText();
            String d2 = jSimboloText.getText();
            String d3 = jUserText.getText();
            String d4 = jPassText.getText();
            String d5 = jServerText.getText();
            //String d6 = jPortText.getText();
            String d6 = jDataBaseText.getText();
            String d7 = jPathText.getText();

            connex.writeTxtMemoria(d1, d2, d3, d4, d5, d6, d7);
        }

        if (jSqlText.getText().isEmpty()
                || jSimboloText.getText().isEmpty()
                || jUserText.getText().isEmpty()
                || jPassText.getText().isEmpty()
                || jServerText.getText().isEmpty()
                || jDataBaseText.getText().isEmpty()
                //|| jPortText.getText().isEmpty()
                || jPathText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, Rellena todos los campos");
        } else {

            String consulta = jSqlText.getText();
            String simbol = jSimboloText.getText();
            String usuario = jUserText.getText();
            String pass = jPassText.getText();
            String server = jServerText.getText();
            String dataBase = jDataBaseText.getText();
            //String port = jPortText.getText();
            String path = jPathText.getText();
            if (!consulta.substring(0, 1).equals("s") && !consulta.substring(0, 1).equals("S")) {
                System.out.println(consulta.substring(0, 1));
                JOptionPane.showMessageDialog(null, "Escriba una consulta de Select únicamente");
            } else {
                if (simbol.length() > 1) {
                    JOptionPane.showMessageDialog(null, "Introduce un solo caracter especial, por ejemplo: &, $ o ;");
                } else {

                    System.out.println(consulta);
                    char simbolChar = simbol.charAt(0);
                    ConexionSql connex = new ConexionSql();
                    connex.Conexion(consulta, simbolChar, usuario, pass, server, dataBase, path);
                    //JOptionPane.showMessageDialog(null, "Csv exportado con éxito");

                }
            }
        }

        //jSqlText.setText("");
    }//GEN-LAST:event_jButtonCsvActionPerformed

    private void jDataBaseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDataBaseTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDataBaseTextActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int response = fc.showOpenDialog(Window.this);
        if (response == JFileChooser.APPROVE_OPTION) {
            String path = fc.getSelectedFile().toString();
            System.out.println(path);
            jPathText.setText(path + "/fichero.csv");
            //System.out.println(path + "/fichero.csv");
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void jPathTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPathTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPathTextActionPerformed

    private void jSimboloTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSimboloTextKeyTyped
        if (jSimboloText.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jSimboloTextKeyTyped

    private void jPassTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jSimboloText.getText().isEmpty()) {
            jSimboloText.setText(";");
        }
        //obtener campos
        String d1 = jSqlText.getText();
        String d2 = jSimboloText.getText();
        String d3 = jUserText.getText();
        String d4 = jPassText.getText();
        String d5 = jServerText.getText();
        //String d6 = jPortText.getText();
        String d6 = jDataBaseText.getText();
        String d7 = jPathText.getText();
        ConexionSql connex = new ConexionSql();

        connex.writeTxtAutoQuery(d1, d2, d3, d4, d5, d6, d7);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCsv;
    private javax.swing.JTextField jDataBaseText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPassText;
    private javax.swing.JTextField jPathText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jServerText;
    private javax.swing.JTextField jSimboloText;
    private javax.swing.JTextArea jSqlText;
    private javax.swing.JTextField jUserText;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
