/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ryank.studybuddy.undoredo;

import com.example.ryank.studybuddy.filesystem.Chapter;
import com.example.ryank.studybuddy.filesystem.Note;
import com.example.ryank.studybuddy.filesystem.Card;
import com.example.ryank.studybuddy.filesystem.Class;

/**
 *
 * @author Ryan
 */
public class Redo {

    public UndoRedoType redoType;
    public int classListIndex;
    public int chapterListIndex;
    public int cardListIndex;
    public int noteListIndex;
    public String name;
    public String question;
    public String answer;
    public String title;
    public String data;
    public Class classes;
    public Chapter chapter;
    public Card card;
    public Note note;

    public void setClassCreateRedo(UndoRedoType redoType, int classListIndex, String className) {
        this.redoType = redoType;
        this.classListIndex = classListIndex;
        this.name = className;
    }

    ;
   
   public void setCardCreateRedo(UndoRedoType redoType, int classListIndex, int chapterListIndex, int cardListIndex, Card card) {
        this.redoType = redoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.cardListIndex = cardListIndex;
        this.card = card;
    }

    public void setNoteCreateRedo(UndoRedoType redoType, int classListIndex, int chapterListIndex, int noteListIndex, Note note) {
        this.redoType = redoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.noteListIndex = noteListIndex;
        this.note = note;
    }

    public void setClassRenameRedo(UndoRedoType redoType, int classListIndex, String className) {
        this.redoType = redoType;
        this.classListIndex = classListIndex;
        this.name = className;
    }

    public void setCardEditRedo(UndoRedoType redoType, int classListIndex, int chapterListIndex, int cardListIndex, Card card) {
        this.redoType = redoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.cardListIndex = cardListIndex;
        this.card = card;
    }

    public void setNoteEditRedo(UndoRedoType redoType, int classListIndex, int chapterListIndex, int noteListIndex, Note note) {
        this.redoType = redoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.noteListIndex = noteListIndex;
        this.note = note;
    }

    public void setChapterRenameRedo(UndoRedoType redoType, int classListIndex, int chapterListIndex, String chapterName) {
        this.redoType = redoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.name = chapterName;
    }

    public void setClassDeleteRedo(UndoRedoType redoType, int classListIndex) {
        this.redoType = redoType;
        this.classListIndex = classListIndex;
    }

    public void setChapterDeleteRedo(UndoRedoType redoType, int classListIndex, int chapterListIndex) {
        this.redoType = redoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
    }

    public void setCardDeleteRedo(UndoRedoType redoType, int classListIndex, int chapterListIndex, int cardListIndex) {
        this.redoType = redoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.cardListIndex = cardListIndex;
    }

    public void setNoteDeleteRedo(UndoRedoType redoType, int classListIndex, int chapterListIndex, int noteListIndex) {
        this.redoType = redoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.noteListIndex = noteListIndex;
    }

    public void setCardInfoChangeReddo(UndoRedoType redoType, int classListIndex, int chapterListIndex, int cardListIndex, String cardQuestion, String cardAnswer) {
        this.redoType = redoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.cardListIndex = cardListIndex;
        this.question = cardQuestion;
        this.answer = cardAnswer;
    }

    public void setNoteInfoChangeReddo(UndoRedoType redoType, int classListIndex, int chapterListIndex, int noteListIndex, String noteTitle, String noteData) {
        this.redoType = redoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.cardListIndex = cardListIndex;
        this.title = noteTitle;
        this.data = noteData;
    }

    public void setChapterCreateRedo(UndoRedoType redoType, int classListIndex, int chapterListIndex, String chapterName) {
        this.redoType = redoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.name = chapterName;
    }

    public UndoRedoType getRedoType() {
        return redoType;
    }

    public int getClassListIndex() {
        return classListIndex;
    }

    public String getClassName() {
        return name;
    }

}
