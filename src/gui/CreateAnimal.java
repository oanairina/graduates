package gui;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import src.Animal;
import src.AnimalBuilder;
import src.CatBuilder;
import src.DogBuilder;

public class CreateAnimal extends javax.swing.JFrame {

    private List<Animal> listaAnimale;
    
   
    public CreateAnimal(List<Animal> listaAnimale) {
        initComponents();
        String[] petTypeString = {"Cat", "Dog"};
        String[] genderTypeString = {"Male", "Female"};

        for (int i = 0; i < petTypeString.length; i++) {
            typeChooser.addItem(petTypeString[i]);
        }

        for (int i = 0; i < genderTypeString.length; i++) {
            genderChooser.addItem(genderTypeString[i]);
        }
        
        this.listaAnimale = listaAnimale;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jColorText = new javax.swing.JTextArea();
        jOriginText = new javax.swing.JTextField();
        jPriceText = new javax.swing.JTextField();
        genderChooser = new javax.swing.JComboBox();
        saveAnimal = new javax.swing.JButton();
        cancelAnimal = new javax.swing.JButton();
        typeChooser = new javax.swing.JComboBox();
        jAgeText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Type:");

        jLabel2.setText("Gender:");

        jLabel3.setText("Age:");

        jLabel4.setText("Origin:");

        jLabel5.setText("Color:");

        jLabel6.setText("Price:");

        jColorText.setColumns(20);
        jColorText.setRows(5);
        jScrollPane1.setViewportView(jColorText);

        jOriginText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOriginTextActionPerformed(evt);
            }
        });

        jPriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPriceTextActionPerformed(evt);
            }
        });

        saveAnimal.setText("Save");
        saveAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAnimalActionPerformed(evt);
            }
        });

        cancelAnimal.setText("Cancel");
        cancelAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAnimalActionPerformed(evt);
            }
        });

        typeChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPriceText, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jOriginText, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jAgeText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(typeChooser, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE)
                        .addComponent(genderChooser, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(cancelAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(saveAnimal)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(typeChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOriginText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveAnimal)
                    .addComponent(cancelAnimal))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jOriginTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOriginTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOriginTextActionPerformed

    private void jPriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPriceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPriceTextActionPerformed

    private void cancelAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAnimalActionPerformed
        dispose();
    }//GEN-LAST:event_cancelAnimalActionPerformed

    private void typeChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeChooserActionPerformed
    }//GEN-LAST:event_typeChooserActionPerformed

    private void saveAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAnimalActionPerformed
        Animal animal = null;
        String type = (String) typeChooser.getSelectedItem();
        String gender = (String) genderChooser.getSelectedItem();
        int age = Integer.parseInt(jAgeText.getText().trim());
        String origin = jOriginText.getText();
        String[] color = jColorText.getText().trim().split(",");

        double price = Double.parseDouble(jPriceText.getText().trim());

        AnimalBuilder animalBuilder = null;
        
        if (type.equals("Dog")) {
            animalBuilder = new DogBuilder();
        } else if (type.equals("Cat")) {
            animalBuilder = new CatBuilder();
        }
        animalBuilder = animalBuilder.buildAnimal();
        animalBuilder = animalBuilder.withType(type);
        animalBuilder = animalBuilder.withGender(gender);
        animalBuilder = animalBuilder.withAge(age);
        animalBuilder = animalBuilder.withOrigin(origin);
        animalBuilder = animalBuilder.withColor(color);
        animalBuilder = animalBuilder.withPrice(price);
        animal = animalBuilder.getAnimal();
        listaAnimale.add(animal);
        
        try{
            ObjectOutputStream flux = null;
            File fis=new File("animale.txt");
            flux = new ObjectOutputStream(new FileOutputStream(fis));
            for(Animal a : listaAnimale)
                flux.writeObject(a);
            flux.close();
            }
            catch(Exception ex){
                System.out.println(ex.toString());    
            }
          this.dispose();
    }//GEN-LAST:event_saveAnimalActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelAnimal;
    private javax.swing.JComboBox genderChooser;
    private javax.swing.JTextField jAgeText;
    private javax.swing.JTextArea jColorText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jOriginText;
    private javax.swing.JTextField jPriceText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveAnimal;
    private javax.swing.JComboBox typeChooser;
    // End of variables declaration//GEN-END:variables
}
