package my.temperature.conversion;
import java.text.DecimalFormat;
/**
 *
 * @author: JANSEN C. CRUZ
 */
public class TemperatureConversionUI extends javax.swing.JFrame {
    DecimalFormat df = new DecimalFormat("##.####");
    DecimalFormat dff = new DecimalFormat("##.##");
    
    public TemperatureConversionUI() {
        initComponents();
        setLocationRelativeTo(null);
        txtFirst.setFocusable(false);
        txtSecond.setFocusable(false);
    };
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFirst = new javax.swing.JTextField();
        txtSecond = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblFormula = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Temperature");

        txtFirst.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFirst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFirst.setText("0");
        txtFirst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFirstMouseClicked(evt);
            }
        });
        txtFirst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFirstKeyReleased(evt);
            }
        });

        txtSecond.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSecond.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSecond.setText("32");
        txtSecond.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSecondMouseClicked(evt);
            }
        });
        txtSecond.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSecondKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("=");

        cb1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Degree Celcius", "Fahrenheit" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        cb2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Degree Celcius", "Fahrenheit" }));
        cb2.setSelectedIndex(1);
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 204, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Formula");
        jLabel3.setOpaque(true);

        lblFormula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFormula.setText("(0°C × 9/5) + 32 = 32°F");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Developed by: Jansen C. Cruz");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cb1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFirst, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSecond, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFormula)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblFormula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private double ctof(double c){
        double f;
        f = ((9*c)/5) + 32;
        return f;
    } 
    
    private double ftoc(double f){
        double c;
        c = ((f-32) * 5/9);
        return c;
    }
    
    private void displayFormula(){
        //error null string
        String txt1 = dff.format(Double.parseDouble(txtFirst.getText().trim()));
        String txt2 = dff.format(Double.parseDouble(txtSecond.getText().trim()));
        
        if(txt1.equals("") || txt1.equals("-") || txt2.equals("") || txt2.equals("-"))
        {
            String formulaText = (cb1.getSelectedIndex() == 0) ? "(°C × 9/5) + 32 = °F" : "(°F − 32) × 5/9 = °C";
            lblFormula.setText(formulaText);
        }
        else
        {
            if(cb1.getSelectedIndex() == 0)
                lblFormula.setText(String.format("(%s°C × 9/5) + 32 = %s°F", txt1 , txt2));
            else
                lblFormula.setText(String.format("(%s°F − 32) × 5/9 = %s°C", txt1, txt2));
        }
    }
    
    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        double f,c;
        
        if(cb1.getSelectedIndex() == 0)
        {
            cb2.setSelectedIndex(1);
            c = Double.parseDouble(txtFirst.getText());
            f = ctof(c);
            txtSecond.setText(df.format(f));
            displayFormula();
        }
        else
        {
            cb2.setSelectedIndex(0);
            f = Double.parseDouble(txtFirst.getText());
            c = ftoc(f);
            txtSecond.setText(df.format(c));
            displayFormula();
        }            
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        if(cb2.getSelectedIndex() == 0)
        {
            cb1.setSelectedIndex(1);
            displayFormula();
        }
        else
        {
            cb1.setSelectedIndex(0);       
            displayFormula();
        }
    }//GEN-LAST:event_cb2ActionPerformed

    private void txtFirstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFirstMouseClicked
        txtFirst.setFocusable(true);
        txtFirst.requestFocus();
    }//GEN-LAST:event_txtFirstMouseClicked

    private void txtFirstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstKeyReleased
        double c,f;
        String txt;
        txt = txtFirst.getText().trim();

        if(txt.equals("") || txt.equals("-"))
        {
            txtSecond.setText("");
            txtFirst.requestFocus();
            displayFormula();
        }
        else
        {
            if(cb1.getSelectedIndex() == 0)
            {
                c = Double.parseDouble(txt);
                f = ctof(c);
                txtSecond.setText(df.format(f));
                displayFormula();
            }
            else
            {
                f = Double.parseDouble(txt);
                c = ftoc(f);
                txtSecond.setText(df.format(c));
                displayFormula();
            }
        }
    }//GEN-LAST:event_txtFirstKeyReleased

    private void txtSecondMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSecondMouseClicked
        txtSecond.setFocusable(true);
        txtSecond.requestFocus();
    }//GEN-LAST:event_txtSecondMouseClicked

    private void txtSecondKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecondKeyReleased
        double f,c;
        String txt = txtSecond.getText();
        
        if(txt.equals("") || txt.equals("-"))
        {
            txtFirst.setText("");
            txtSecond.requestFocus();
            displayFormula();
        }
        else
        {
            if(cb1.getSelectedIndex() == 1)
            {
                c = Double.parseDouble(txt);
                f = ctof(c);
                txtFirst.setText(df.format(f));
                displayFormula();
            }
            else
            {
                f = Double.parseDouble(txt);
                c = ftoc(f);
                txtFirst.setText(df.format(c));
                displayFormula();
            }
        }
    }//GEN-LAST:event_txtSecondKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConversionUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFormula;
    private javax.swing.JTextField txtFirst;
    private javax.swing.JTextField txtSecond;
    // End of variables declaration//GEN-END:variables
}
