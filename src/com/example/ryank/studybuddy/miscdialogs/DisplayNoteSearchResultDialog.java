/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ryank.studybuddy.miscdialogs;

import com.example.ryank.studybuddy.filesystem.Note;

/**
 *
 * @author ryank
 */
public class DisplayNoteSearchResultDialog extends javax.swing.JDialog {

    Note note;

    /**
     * Creates new form DisplayNoteSearchResultDialog
     */
    public DisplayNoteSearchResultDialog(java.awt.Dialog parent, Note note) {
        super(parent, true);
        initComponents();
        this.note = note;
        this.noteTitleTextField.setText(note.getNoteName());
        this.dataTextArea.setText(note.getNoteData());
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }

    public DisplayNoteSearchResultDialog(java.awt.Dialog parent) {
        super(parent, true);
        initComponents();

        this.noteTitleTextField.setText(note.getNoteName());
        this.dataTextArea.setText(note.getNoteData());
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createPlusButton = new javax.swing.JButton();
        noteTitleTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        newDefinitionLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        createPlusButton.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        createPlusButton.setText("OK");
        createPlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlusButtonActionPerformed(evt);
            }
        });

        noteTitleTextField.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        noteTitleTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setText("Title: ");

        newDefinitionLabel.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        newDefinitionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newDefinitionLabel.setText("Search Result");

        dataTextArea.setColumns(20);
        dataTextArea.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        dataTextArea.setLineWrap(true);
        dataTextArea.setRows(5);
        dataTextArea.setWrapStyleWord(true);
        dataTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Note", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 12))); // NOI18N
        jScrollPane2.setViewportView(dataTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(noteTitleTextField))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addComponent(newDefinitionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createPlusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(349, 349, 349))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newDefinitionLabel)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noteTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(createPlusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createPlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlusButtonActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_createPlusButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayNoteSearchResultDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayNoteSearchResultDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayNoteSearchResultDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayNoteSearchResultDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DisplayNoteSearchResultDialog dialog = new DisplayNoteSearchResultDialog(new javax.swing.JDialog());
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createPlusButton;
    private javax.swing.JTextArea dataTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel newDefinitionLabel;
    private javax.swing.JTextField noteTitleTextField;
    // End of variables declaration//GEN-END:variables
}
