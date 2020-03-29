
package tarea.progra;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class NTemperatura extends javax.swing.JFrame {

    
    public ArrayList<Familia> cfamilia=new ArrayList();
    DefaultListModel m=new DefaultListModel();
    public NTemperatura() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ATRAS = new javax.swing.JButton();
        texttemperatura = new javax.swing.JTextField();
        INGRESAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listafamilia = new javax.swing.JList<>();
        MostrarN = new javax.swing.JButton();
        Enombre = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        unidades = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ATRAS.setText("ATRAS");
        ATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATRASActionPerformed(evt);
            }
        });

        texttemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texttemperaturaActionPerformed(evt);
            }
        });

        INGRESAR.setText("INGRESAR");
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });

        listafamilia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listafamiliaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listafamilia);

        MostrarN.setText("VISUALIZAR NOMBRES");
        MostrarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarNActionPerformed(evt);
            }
        });

        Enombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label.setText("NOMBRE FAMILIAR:");

        label1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label1.setText("TEMPERATURA:");

        unidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ºC", "ºF", "ºK" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ATRAS)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Enombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(texttemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(MostrarN)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(INGRESAR)))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MostrarN)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Enombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texttemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(INGRESAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(ATRAS))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    private void ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATRASActionPerformed
        m.clear();
        listafamilia.setModel(m);
        Enombre.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_ATRASActionPerformed

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
        cfamilia.get(listafamilia.getSelectedIndex()).temperatura.add(Double.parseDouble (texttemperatura.getText()));
        cfamilia.get(listafamilia.getSelectedIndex()).unidad.add(unidades.getSelectedItem().toString());
        texttemperatura.setText("");
    }//GEN-LAST:event_INGRESARActionPerformed

    private void MostrarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarNActionPerformed
    
    for (int i = 0; i < cfamilia.size(); i++) {
            m.addElement(cfamilia.get(i).Nombre);
        }
        listafamilia.setModel(m);        
    }//GEN-LAST:event_MostrarNActionPerformed

    private void listafamiliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listafamiliaMouseClicked
       
        Enombre.setText(listafamilia.getSelectedValue().toString());
    }//GEN-LAST:event_listafamiliaMouseClicked

    private void texttemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texttemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texttemperaturaActionPerformed

    public void copiararray(ArrayList x){
        cfamilia=(ArrayList) x.clone();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ATRAS;
    private javax.swing.JLabel Enombre;
    private javax.swing.JButton INGRESAR;
    private javax.swing.JButton MostrarN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JList<String> listafamilia;
    private javax.swing.JTextField texttemperatura;
    private javax.swing.JComboBox<String> unidades;
    // End of variables declaration//GEN-END:variables
}
