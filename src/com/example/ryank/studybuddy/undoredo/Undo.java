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
public class Undo {

    public UndoRedoType undoType;
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

    public void setClassCreateUndo(UndoRedoType undoType, int classListIndex) {
        this.undoType = undoType;
        this.classListIndex = classListIndex;
    }

    ;
   
   public void setCardCreateUndo(UndoRedoType undoType, int classListIndex, int chapterListIndex, int cardListIndex) {
        this.undoType = undoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.cardListIndex = cardListIndex;
    }

    public void setNoteCreateUndo(UndoRedoType undoType, int classListIndex, int chapterListIndex, int noteListIndex) {
        this.undoType = undoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.noteListIndex = noteListIndex;
    }

    public void setClassRenameUndo(UndoRedoType undoType, int classListIndex, String className) {
        this.undoType = undoType;
        this.classListIndex = classListIndex;
        this.name = className;
    }

    public void setCardEditUndo(UndoRedoType undoType, int classListIndex, int chapterListIndex, int cardListIndex, Card card) {
        this.undoType = undoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.cardListIndex = cardListIndex;
        this.card = card;
    }

    public void setNoteEditUndo(UndoRedoType undoType, int classListIndex, int chapterListIndex, int noteListIndex, Note note) {
        this.undoType = undoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.noteListIndex = noteListIndex;
        this.note = note;
    }

    public void setChapterRenameUndo(UndoRedoType undoType, int classListIndex, int chapterListIndex, String chapterName) {
        this.undoType = undoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.name = chapterName;
    }

    public void setClassDeleteUndo(UndoRedoType undoType, int classListIndex, Class classes) {
        this.undoType = undoType;
        this.classListIndex = classListIndex;
        this.classes = classes;
    }

    public void setChapterDeleteUndo(UndoRedoType undoType, int classListIndex, int chapterListIndex, Chapter chapter) {
        this.undoType = undoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.chapter = chapter;
    }

    public void setCardDeleteUndo(UndoRedoType undoType, int classListIndex, int chapterListIndex, int cardListIndex, Card card) {
        this.undoType = undoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.cardListIndex = cardListIndex;
        this.card = card;
    }

    public void setNoteDeleteUndo(UndoRedoType undoType, int classListIndex, int chapterListIndex, int noteListIndex, Note note) {
        this.undoType = undoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.noteListIndex = noteListIndex;
        this.note = note;
    }

    public void setCardInfoChangeUndo(UndoRedoType undoType, int classListIndex, int chapterListIndex, int cardListIndex, String cardQuestion, String cardAnswer) {
        this.undoType = undoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.cardListIndex = cardListIndex;
        this.question = cardQuestion;
        this.answer = cardAnswer;
    }

    public void setNoteInfoChangeUndo(UndoRedoType undoType, int classListIndex, int chapterListIndex, int noteListIndex, String noteTitle, String noteData) {
        this.undoType = undoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
        this.noteListIndex = noteListIndex;
        this.title = noteTitle;
        this.data = noteData;
    }

    public void setChapterCreateUndo(UndoRedoType undoType, int classListIndex, int chapterListIndex) {
        this.undoType = undoType;
        this.classListIndex = classListIndex;
        this.chapterListIndex = chapterListIndex;
    }

    public UndoRedoType getUndoType() {
        return undoType;
    }

    public int getClassListIndex() {
        return classListIndex;
    }

    public String getName() {
        return name;
    }

    public Class getClasss() {
        return classes;
    }
}
