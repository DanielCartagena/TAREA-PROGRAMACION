
package tarea.progra;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class RegistroT extends javax.swing.JFrame {
    public ArrayList<Familia> familia=new ArrayList();
    DefaultListModel modelo=new DefaultListModel();
    DefaultListModel model=new DefaultListModel();
    
    
    public RegistroT() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        listaT = new javax.swing.JList<>();
        visualizar = new javax.swing.JButton();
        LABEL = new javax.swing.JLabel();
        LABEL1 = new javax.swing.JLabel();
        LABEL2 = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JLabel();
        PARENTESCO = new javax.swing.JLabel();
        EDAD = new javax.swing.JLabel();
        LABEL3 = new javax.swing.JLabel();
        ATRAS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaNombres = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jScrollPane2.setViewportView(listaT);

        visualizar.setText("VISUALIZAR NOMBRES ");
        visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarActionPerformed(evt);
            }
        });

        LABEL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LABEL.setText("NOMBRE:");

        LABEL1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LABEL1.setText("PARENTESCO:");

        LABEL2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LABEL2.setText("EDAD:");

        NOMBRE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NOMBRE.setText(" ");

        PARENTESCO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PARENTESCO.setText(" ");

        EDAD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EDAD.setText(" ");

        LABEL3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LABEL3.setText("TEMPERATURAS:");

        ATRAS.setText("ATRAS");
        ATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATRASActionPerformed(evt);
            }
        });

        listaNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaNombresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaNombres);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visualizar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LABEL1)
                            .addComponent(LABEL2))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(PARENTESCO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LABEL3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LABEL)
                        .addGap(53, 53, 53)
                        .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ATRAS)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL)
                            .addComponent(NOMBRE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL1)
                            .addComponent(PARENTESCO))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL2)
                            .addComponent(EDAD))
                        .addGap(18, 18, 18)
                        .addComponent(LABEL3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(visualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(ATRAS)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarActionPerformed
        
        for (int i = 0; i < familia.size(); i++) {
            modelo.addElement(familia.get(i).Nombre);
        }
        listaNombres.setModel(modelo);
                
    }//GEN-LAST:event_visualizarActionPerformed

    private void ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATRASActionPerformed
        model.clear();
        modelo.clear();
        listaT.setModel(model);
        listaNombres.setModel(modelo);
        NOMBRE.setText("");
        EDAD.setText("");
        PARENTESCO.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_ATRASActionPerformed

    private void listaNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaNombresMouseClicked
        model.clear();
        listaT.setModel(model);
        NOMBRE.setText(familia.get(listaNombres.getSelectedIndex()).Nombre);
        PARENTESCO.setText(familia.get(listaNombres.getSelectedIndex()).Parentesco);
        EDAD.setText(familia.get(listaNombres.getSelectedIndex()).Edad.toString());
        for (int i = 0; i < familia.get(listaNombres.getSelectedIndex()).temperatura.size(); i++) {
            model.addElement((i+1)+") "+familia.get(listaNombres.getSelectedIndex()).temperatura.get(i)+" "+familia.get(listaNombres.getSelectedIndex()).unidad.get(i));
        }
        listaT.setModel(model);
    }//GEN-LAST:event_listaNombresMouseClicked
    
    public void copiararray(ArrayList x){
        familia=(ArrayList) x.clone();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ATRAS;
    private javax.swing.JLabel EDAD;
    private javax.swing.JLabel LABEL;
    private javax.swing.JLabel LABEL1;
    private javax.swing.JLabel LABEL2;
    private javax.swing.JLabel LABEL3;
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JLabel PARENTESCO;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaNombres;
    private javax.swing.JList<String> listaT;
    private javax.swing.JButton visualizar;
    // End of variables declaration//GEN-END:variables

}
