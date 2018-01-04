/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ryank.studybuddy.filesystem;

import java.io.Serializable;

/**
 *
 * @author ryan
 */
public class Note implements Serializable {

    static final long serialVersionUID = 42L;
    private String noteName;
    private String noteData;
    private boolean selected;

    public Note(String noteName, String noteData) {
        this.noteName = noteName;
        this.noteData = noteData;
        this.selected = false;
    }

    public void setNoteSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean getNoteSelected() {
        return this.selected;
    }

    public void setNoteName(String cardName) {
        this.noteName = cardName;
    }

    public void setNoteData(String noteData) {
        this.noteData = noteData;
    }

    public String getNoteName() {
        return noteName;
    }

    public String getNoteData() {
        return noteData;
    }

}
