/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ryank.studybuddy;

import javax.swing.UIManager;

/**
 *
 * @author Ryan
 */
public class NoteCardSuite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
                if ("Substance".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {

        }
        // TODO code application logic here
        MainScreen mainScreen = new MainScreen();
        mainScreen.setVisible(true);
    }
}
