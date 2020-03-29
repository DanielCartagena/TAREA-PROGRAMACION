
package tarea.progra;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    

                //OTRAS GUI
    NFamiliar nfamilia=new NFamiliar();
    NTemperatura ntemperatura=new NTemperatura();
    RegistroT registro=new RegistroT();
    boolean seguirfamiliar=false,seguirtemperatura=false;   //PARA COPIAR LA LISTA CORECTA 
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ifamiliar = new javax.swing.JButton();
        Itemperatura = new javax.swing.JButton();
        Gregistro = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        Creditos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Ifamiliar.setText("INGRESAR NUEVO FAMILIAR");
        Ifamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IfamiliarActionPerformed(evt);
            }
        });

        Itemperatura.setText("AGREGAR NUEVA TEMPERATURA");
        Itemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemperaturaActionPerformed(evt);
            }
        });

        Gregistro.setText("GENERAR REGISTRO");
        Gregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GregistroActionPerformed(evt);
            }
        });

        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });

        Creditos.setText("CREDITOS");
        Creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Creditos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SALIR)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gregistro)
                            .addComponent(Itemperatura)
                            .addComponent(Ifamiliar))
                        .addContainerGap(107, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Ifamiliar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Itemperatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Gregistro)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SALIR)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Creditos)
                        .addContainerGap(33, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
                //BOTONES
    private void IfamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IfamiliarActionPerformed
        if (seguirtemperatura) {
            nfamilia.copiararray(ntemperatura.cfamilia);
        }
       nfamilia.setVisible(true);
       seguirfamiliar=true;
       seguirtemperatura=false;
    }//GEN-LAST:event_IfamiliarActionPerformed

    private void ItemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemperaturaActionPerformed
        if (nfamilia.familia.size()!=0) {
        if (seguirfamiliar) {
            ntemperatura.copiararray(nfamilia.familia);
        }
        ntemperatura.setVisible(true);
        seguirtemperatura=true;
        seguirfamiliar=false;
        }
        else{
            JOptionPane.showMessageDialog(null, "INGRESE UN FAMILIAR.");
        }
    }//GEN-LAST:event_ItemperaturaActionPerformed
    

        //BOTON SALIR DEL PROGRAMA
    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Salir de la aplicación?",
                "Familia", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION)
        {System.exit(0);
        }
        else{
                setDefaultCloseOperation(0);
        } 
         
    }//GEN-LAST:event_SALIRActionPerformed

    private void GregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GregistroActionPerformed
        if (nfamilia.familia.size()!=0) {
        if (seguirtemperatura) {
            registro.copiararray(ntemperatura.cfamilia);
        }
        if (seguirfamiliar) {
            registro.copiararray(nfamilia.familia);
        }
        registro.setVisible(true);
                                    /////////////////////////////////GENERAR REGISTRO EN CONSOLA.
        if (seguirtemperatura) {
            System.out.println("\t\tTEMPERATURA DE LA FAMILIA.");
            for (int i = 0; i < ntemperatura.cfamilia.size(); i++) {
                System.out.println("\tFAMILIAR: "+(i+1));
                System.out.println("NOMBRE: "+ntemperatura.cfamilia.get(i).Nombre);
                System.out.println("PARENTESCO: "+ntemperatura.cfamilia.get(i).Parentesco);
                System.out.println("EDAD: "+ntemperatura.cfamilia.get(i).Edad);
                System.out.println("\tTEMPERATURAS.");
                for (int j = 0; j < ntemperatura.cfamilia.get(i).temperatura.size(); j++) {
                System.out.println("TEMPERATURA "+(j+1)+": "+ntemperatura.cfamilia.get(i).temperatura.get(j).toString()+" "+ntemperatura.cfamilia.get(i).unidad.get(j).toString());
                }
                System.out.println("");System.out.println("");
            }
        }
        if (seguirfamiliar) {
            System.out.println("\t\tTEMPERATURA DE LA FAMILIA.");
            for (int i = 0; i < nfamilia.familia.size(); i++) {
                System.out.println("\tFAMILIAR: "+(i+1));
                System.out.println("NOMBRE: "+nfamilia.familia.get(i).Nombre);
                System.out.println("PARENTESCO: "+nfamilia.familia.get(i).Parentesco);
                System.out.println("EDAD: "+nfamilia.familia.get(i).Edad);
                System.out.println("\tTEMPERATURAS.");
                for (int j = 0; j < nfamilia.familia.get(i).temperatura.size(); j++) {
                System.out.println("TEMPERATURA "+(j+1)+": "+nfamilia.familia.get(i).temperatura.get(j).toString()+" "+nfamilia.familia.get(i).unidad.get(j).toString());
                }
                System.out.println("");System.out.println("");
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "INGRESE UN FAMILIAR.");
        }
        
    }//GEN-LAST:event_GregistroActionPerformed

    private void CreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditosActionPerformed
        JOptionPane.showMessageDialog(null, "DANIEL ALEXANDER CARTAGENA FERNANDEZ -- 1803690"
                + "\nJUAN DAVID CUBIDES LEGUIZAMON -- 1803688");
    }//GEN-LAST:event_CreditosActionPerformed

        
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Creditos;
    private javax.swing.JButton Gregistro;
    private javax.swing.JButton Ifamiliar;
    private javax.swing.JButton Itemperatura;
    private javax.swing.JButton SALIR;
    // End of variables declaration//GEN-END:variables
}
