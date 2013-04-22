package gui;

import java.util.ArrayList;
import java.util.List;
import src.Animal;
import src.AnimalBuilder;

public final class EditareAnimal extends javax.swing.JFrame {

    private List<Animal> listaAnimale = new ArrayList<Animal>();
    private int n, k;

    public EditareAnimal(List<Animal> listaAnimale) {
        this.listaAnimale = listaAnimale;
        n = listaAnimale.size();
        k = 0;
        initComponents();

        if (n > 0) {
            afisareInregistrare();
        }
    }

    public void afisareInregistrare() {
        jTypeEdit.setText(listaAnimale.get(k).getType());
        jGenderEdit.setText(String.valueOf(listaAnimale.get(k).getGender()));
        jAgeEdit.setText(String.valueOf(listaAnimale.get(k).getAge()));
        jOriginEdit.setText(String.valueOf(listaAnimale.get(k).getOrigin()));
        jColorEdit.setText(String.valueOf(listaAnimale.get(k).getColor()));
        jPriceEdit.setText(String.valueOf(listaAnimale.get(k).getPrice()));

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
        jColorEdit = new javax.swing.JTextArea();
        jOriginEdit = new javax.swing.JTextField();
        jPriceEdit = new javax.swing.JTextField();
        forward = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jAgeEdit = new javax.swing.JTextField();
        jGenderEdit = new javax.swing.JTextField();
        jTypeEdit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Type:");

        jLabel2.setText("Gender:");

        jLabel3.setText("Age:");

        jLabel4.setText("Origin:");

        jLabel5.setText("Color:");

        jLabel6.setText("Price:");

        jColorEdit.setColumns(20);
        jColorEdit.setRows(5);
        jScrollPane1.setViewportView(jColorEdit);

        jOriginEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOriginEditActionPerformed(evt);
            }
        });

        jPriceEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPriceEditActionPerformed(evt);
            }
        });

        forward.setText("->");
        forward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardActionPerformed(evt);
            }
        });

        back.setText("<-");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButton1.setText("Save Change");
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
                    .addComponent(jPriceEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jOriginEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jAgeEdit)
                    .addComponent(jScrollPane1)
                    .addComponent(jGenderEdit)
                    .addComponent(jTypeEdit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(41, 41, 41)
                .addComponent(forward)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTypeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jGenderEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAgeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOriginEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jPriceEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forward)
                    .addComponent(back)
                    .addComponent(jButton1))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jOriginEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOriginEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOriginEditActionPerformed

    private void jPriceEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPriceEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPriceEditActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (k > 0) {
            k--;
            afisareInregistrare();
        } else {
            k = n - 1;
            afisareInregistrare();
        }
    }//GEN-LAST:event_backActionPerformed

    private void forwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardActionPerformed
        if (k < (n - 1)) {
            k++;
            afisareInregistrare();
        } else {
            k = 0;
            afisareInregistrare();
        }
    }//GEN-LAST:event_forwardActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Animal animal = null;
        AnimalBuilder animalBuilder = null;
        String type = (String) jTypeEdit.getText();
        String gender = (String) jGenderEdit.getText();
        int age = Integer.parseInt(jAgeEdit.getText().trim());
        String origin = jOriginEdit.getText();
        String[] color = jColorEdit.getText().trim().split(",");
        double price = Double.parseDouble(jPriceEdit.getText().trim());

        if (k == -1) {

            animalBuilder = animalBuilder.buildAnimal().withType(type).withGender(gender).withAge(age).withOrigin(origin).withColor(color).withPrice(price);
            animal = animalBuilder.getAnimal();
            listaAnimale.add(animal);

        } else {
            animal = listaAnimale.get(k);

            
           // animal = animalBuilder.getAnimal();
        }
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton forward;
    private javax.swing.JTextField jAgeEdit;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextArea jColorEdit;
    private javax.swing.JTextField jGenderEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jOriginEdit;
    private javax.swing.JTextField jPriceEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTypeEdit;
    // End of variables declaration//GEN-END:variables
}
