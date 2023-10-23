/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import static config.Config.config;
import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YASSINE
 */
public class MachineForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form MachineForm
     */
    IDao<Machine> dao;
    IDao<Salle> dao2;
    DefaultTableModel model;
    int id;
    public MachineForm() {
       
        try {
            initComponents();
            dao=(IDao<Machine>) Naming.lookup("rmi://"+config.ip+":"+config.port+"/dao");
            dao2= (IDao<Salle>) Naming.lookup("rmi://"+config.ip+":"+config.port+"/dao2");
            model=(DefaultTableModel) machineList.getModel();
            load();
            loadBox();
            loadFiltreBox();
        } catch (NotBoundException ex) {
            Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void load() {
        try {
            model.setRowCount(0);
            for (Machine m : dao.findAll()) {
                model.addRow(new Object[]{
                    m.getId(),
                    m.getRef(),
                    m.getMarque(),
                    m.getPrix(),
                    m.getSalle()
                });
            }
        } catch (RemoteException ex) {
            Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    } 
    
public  void loadBox(){
        try {
             salleBox.removeAllItems();
             for (Salle s : dao2.findAll()) {
             salleBox.addItem(s);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public  void loadFiltreBox(){
        try {
             filtreBox.removeAllItems();
             for (Salle s : dao2.findAll()) {
             filtreBox.addItem(s);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        refTxt = new javax.swing.JTextField();
        marqueTxt = new javax.swing.JTextField();
        prixTxt = new javax.swing.JTextField();
        salleBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ajouterButton = new javax.swing.JButton();
        modifierButton = new javax.swing.JButton();
        supprimerButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        machineList = new javax.swing.JTable();
        filtreBox = new javax.swing.JComboBox();
        apllyCheckBox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("G Machines");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informations Machine"));

        prixTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prixTxtActionPerformed(evt);
            }
        });

        jLabel1.setText("Référence");

        jLabel2.setText("Marque");

        jLabel3.setText("Prix");

        jLabel4.setText("Salle");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refTxt)
                    .addComponent(marqueTxt)
                    .addComponent(prixTxt)
                    .addComponent(salleBox, 0, 364, Short.MAX_VALUE))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marqueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prixTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salleBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        ajouterButton.setText("Ajouter");
        ajouterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterButtonActionPerformed(evt);
            }
        });

        modifierButton.setText("Modifier");
        modifierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierButtonActionPerformed(evt);
            }
        });

        supprimerButton.setText("supprimer");
        supprimerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(supprimerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifierButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajouterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ajouterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(modifierButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(supprimerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des machines"));

        machineList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Référence", "Marque", "Prix", "Salle"
            }
        ));
        machineList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                machineListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(machineList);

        apllyCheckBox.setText("aplly");
        apllyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apllyCheckBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Filtrer par Salle");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(filtreBox, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161)
                .addComponent(apllyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtreBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apllyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prixTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prixTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prixTxtActionPerformed

    private void modifierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierButtonActionPerformed
try {
            String ref = refTxt.getText();
            String marque = marqueTxt.getText();
            double prix = Double.parseDouble(prixTxt.getText());
            Salle salle = (Salle) salleBox.getSelectedItem();
            Machine updatedMachine = new Machine(ref, marque, prix, salle);
            updatedMachine.setId(id);
            dao.update(updatedMachine);
            load();
            JOptionPane.showMessageDialog(this, "La machine a été modifiée");
        } catch (RemoteException ex) {
            Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modifierButtonActionPerformed

    private void supprimerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerButtonActionPerformed
try {
    int reponse = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment supprimer cette machine?");

    if (reponse == 0) {
        Machine machineToDelete = dao.findById(id);
        if (machineToDelete != null) {
            dao.delete(machineToDelete);
            load();
        } else {
            JOptionPane.showMessageDialog(this, "La machine à supprimer n'existe pas.");
        }
    }
} catch (RemoteException ex) {
    Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
} catch (IllegalArgumentException ex) {
    JOptionPane.showMessageDialog(this, "Impossible de supprimer une machine nulle.");

}

             }//GEN-LAST:event_supprimerButtonActionPerformed

    private void machineListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_machineListMouseClicked
       int selectedRow = machineList.getSelectedRow();
if (selectedRow != -1) {
    try {
        id = Integer.parseInt(machineList.getValueAt(selectedRow, 0).toString());
        Machine selectedMachine = dao.findById(id);
        refTxt.setText(selectedMachine.getRef());
        marqueTxt.setText(selectedMachine.getMarque());
        prixTxt.setText(Integer.toString((int) selectedMachine.getPrix()));

       
              Salle selectedSalle = dao.findById(id).getSalle();
                for (int i = 0; i < salleBox.getItemCount(); i++) {
                Salle item = (Salle) salleBox.getItemAt(i);
                if (item.getId() == selectedSalle.getId()) {
                    salleBox.setSelectedIndex(i);
                    break; 
                }     
                }
    } catch (RemoteException ex) {
        Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
    }
}

            }//GEN-LAST:event_machineListMouseClicked

    private void ajouterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterButtonActionPerformed
 try{
            Machine addedMachine =new Machine(refTxt.getText(), marqueTxt.getText(),Integer.parseInt( prixTxt.getText()), (Salle) salleBox.getSelectedItem());
    try {
        if(dao.create(addedMachine)){
            JOptionPane.showMessageDialog(this,"Bien ajouté");
            load();
            
            refTxt.setText(null);
            marqueTxt.setText(null);
            prixTxt.setText(null);
        }else{
            JOptionPane.showMessageDialog(this,"Machine Non ajouté,vérifiez votre connection!");
        }
    } catch (RemoteException ex) {
        Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
    }
        }
        catch(NullPointerException e){
        JOptionPane.showMessageDialog(this,"Veuillez remplir tous les champs");
        }
         }//GEN-LAST:event_ajouterButtonActionPerformed

    private void apllyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apllyCheckBoxActionPerformed
        //System.out.println("yassine");
      // Check if the checkbox is selected (checked)
    if (apllyCheckBox.isSelected()) {
        model.setRowCount(0); // Clear the existing rows in the table

        // Get the selected Salle from the combo box
        Salle s = (Salle) filtreBox.getSelectedItem();

        // Repopulate the list with machines from the selected Salle
        for (Machine m : s.getMachines()) {
            model.addRow(new Object[] {
                m.getId(),
                m.getRef(),
                m.getMarque(),
                m.getPrix(),
                m.getSalle()
            });
        }
       } else {
        // Handle the case when the checkbox is not checked (optional)
        // You can clear the table or take other actions as needed.
        // For example, you can call model.setRowCount(0) to clear the table.
         load();    
    }
    }//GEN-LAST:event_apllyCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterButton;
    private javax.swing.JCheckBox apllyCheckBox;
    private javax.swing.JComboBox filtreBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable machineList;
    private javax.swing.JTextField marqueTxt;
    private javax.swing.JButton modifierButton;
    private javax.swing.JTextField prixTxt;
    private javax.swing.JTextField refTxt;
    private javax.swing.JComboBox salleBox;
    private javax.swing.JButton supprimerButton;
    // End of variables declaration//GEN-END:variables
}
