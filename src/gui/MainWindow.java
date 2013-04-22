package gui;

import exception.NoPetsException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import src.Accessories;
import src.Animal;
import src.Food;

public class MainWindow extends javax.swing.JFrame {

    private List<Animal> listaAnimale = new ArrayList<Animal>();
    private List<Food> listaFood = new ArrayList<Food>();
    private List<Accessories> listaAccessories = new ArrayList<Accessories>();

    public MainWindow() {
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

        addPet = new javax.swing.JButton();
        addAccessories = new javax.swing.JButton();
        addFood = new javax.swing.JButton();
        viewPets = new javax.swing.JButton();
        viewFood = new javax.swing.JButton();
        viewAccessories = new javax.swing.JButton();
        viewOrder = new javax.swing.JButton();
        createOrder = new javax.swing.JButton();
        saveAll = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jResult = new javax.swing.JTextArea();
        buttonEditAnimal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addPet.setText("Add pet");
        addPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPetActionPerformed(evt);
            }
        });

        addAccessories.setText("Add accessories");
        addAccessories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAccessoriesActionPerformed(evt);
            }
        });

        addFood.setText("Add food");
        addFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFoodActionPerformed(evt);
            }
        });

        viewPets.setText("View pets");
        viewPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPetsActionPerformed(evt);
            }
        });

        viewFood.setText("View food");
        viewFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFoodActionPerformed(evt);
            }
        });

        viewAccessories.setText("View accessories");
        viewAccessories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAccessoriesActionPerformed(evt);
            }
        });

        viewOrder.setText("View Orders");

        createOrder.setText("Create new Order");
        createOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrderActionPerformed(evt);
            }
        });

        saveAll.setText("Save all");
        saveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAllActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jResult.setColumns(20);
        jResult.setRows(5);
        jScrollPane1.setViewportView(jResult);

        buttonEditAnimal.setText("Eitare pet");
        buttonEditAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditAnimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewPets, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(addPet, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(buttonEditAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addFood, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(addAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(saveAll)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(logoutButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(viewFood, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(viewAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createOrder))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPet)
                    .addComponent(addFood)
                    .addComponent(addAccessories)
                    .addComponent(createOrder))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewPets)
                    .addComponent(viewAccessories)
                    .addComponent(viewOrder)
                    .addComponent(viewFood))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(saveAll)
                    .addComponent(buttonEditAnimal))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPetActionPerformed
        CreateAnimal createAnimal = new CreateAnimal(listaAnimale);
        createAnimal.setVisible(true);
    }//GEN-LAST:event_addPetActionPerformed

    private void saveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveAllActionPerformed

    private void addAccessoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAccessoriesActionPerformed
        CreateAccessories createAccessories = new CreateAccessories(listaAccessories);
        createAccessories.setVisible(true);
    }//GEN-LAST:event_addAccessoriesActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void viewPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPetsActionPerformed
        try {
            ObjectInputStream objectIn = null;
            objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("animale.txt")));
            while (objectIn.available() > 0) {
                listaAnimale.add((Animal) objectIn.readObject());
            }
            objectIn.close();
            if (listaAnimale.isEmpty()) {
                throw new NoPetsException();
            }

            jResult.setText("");
            for (Animal a : listaAnimale) {
                jResult.append(a.toString() + "\n");
            }
        } catch (Exception ex) {
            jResult.append(ex.toString());
        }
    }//GEN-LAST:event_viewPetsActionPerformed

    private void addFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFoodActionPerformed
        CreateFood createFood = new CreateFood(listaFood);
        createFood.setVisible(true);
    }//GEN-LAST:event_addFoodActionPerformed

    private void viewFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFoodActionPerformed
        try {
            ObjectInputStream objectIn = null;
            objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("food.txt")));
            while (objectIn.available() > 0) {
                listaFood.add((Food) objectIn.readObject());
            }
            objectIn.close();
            jResult.setText("");
            for (Food f : listaFood) {
                jResult.append(f.toString() + "\n");
            }
        } catch (Exception ex) {
            jResult.append(ex.toString());
        }
    }//GEN-LAST:event_viewFoodActionPerformed

    private void viewAccessoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAccessoriesActionPerformed
        try {
            ObjectInputStream objectIn = null;
            objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("accessories.txt")));
            while (objectIn.available() > 0) {
                listaAccessories.add((Accessories) objectIn.readObject());
            }
            objectIn.close();
            jResult.setText("");
            for (Accessories a : listaAccessories) {
                jResult.append(a.toString() + "\n");
            }
        } catch (Exception ex) {
            jResult.append(ex.toString());
        }
    }//GEN-LAST:event_viewAccessoriesActionPerformed

    private void buttonEditAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditAnimalActionPerformed
        EditareAnimal editare = new EditareAnimal(listaAnimale);
        editare.setVisible(true);
    }//GEN-LAST:event_buttonEditAnimalActionPerformed

    private void createOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOrderActionPerformed
      //  CreateOrder createOrder = new CreateOrder(listaAnimale, listaFood, listaAccessories);
       // createOrder.setVisible(true);
    }//GEN-LAST:event_createOrderActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAccessories;
    private javax.swing.JButton addFood;
    private javax.swing.JButton addPet;
    private javax.swing.JButton buttonEditAnimal;
    private javax.swing.JButton createOrder;
    private javax.swing.JTextArea jResult;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton saveAll;
    private javax.swing.JButton viewAccessories;
    private javax.swing.JButton viewFood;
    private javax.swing.JButton viewOrder;
    private javax.swing.JButton viewPets;
    // End of variables declaration//GEN-END:variables
}