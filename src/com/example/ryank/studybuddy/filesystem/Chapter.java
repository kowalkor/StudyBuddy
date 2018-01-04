/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ryank.studybuddy.filesystem;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ryan
 */
public class Chapter implements Serializable {

    static final long serialVersionUID = 42L;
    private String chapterName;
    private ArrayList<Card> cards;
    private ArrayList<Note> notes;
    private boolean selected;

    public Chapter(String chapterName) {
        this.chapterName = chapterName;
        cards = new ArrayList<Card>();
        notes = new ArrayList<Note>();

        selected = false;
    }

    public void createNewCard(int index, Card card) {
        cards.add(index, card);
    }

    public void createNewChapter(int index, Note note) {
        notes.add(index, note);
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean getSelected() {
        return selected;
    }

    public void setCard(int index, Card card) {
        cards.set(index, card);
    }

    public void setNote(int index, Note note) {
        notes.set(index, note);
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void createNewCard(String cardName, String cardQuestion, String cardAnswer, int cardType) {
        cards.add(new Card(cardQuestion, cardAnswer, cardType));
    }

    public void createNewNote(String noteName, String noteData) {
        notes.add(new Note(noteName, noteData));
    }

    public void createNewNote(int index, Note note) {
        notes.add(index, note);
    }

    public void removeCard(int index) {
        cards.remove(index);
    }

    public void removeNote(int index) {
        notes.remove(index);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public Card getCard(int index) {
        return cards.get(index);
    }

    public Note getNote(int index) {
        return notes.get(index);
    }

    public void sortCardsAscending() {
        if (cards.size() - 1 > 0) {
            for (int j = 0; j < cards.size() - 1; j++) {
                for (int i = 0; i < cards.size() - 1; i++) {

                    int comparator = cards.get(i).getCardQuestion().compareTo(cards.get((i + 1)).getCardQuestion());
                    Card tempCard1 = cards.get(i);
                    Card tempCard2 = cards.get((i + 1));
                    if (comparator > 0) {
                        cards.remove(i);
                        cards.remove((i));
                        cards.add(i, tempCard2);
                        cards.add((i + 1), tempCard1);
                    }
                }
            }
        }
    }

    public void sortNotesAscending() {
        if (notes.size() - 1 > 0) {
            for (int j = 0; j < notes.size() - 1; j++) {
                for (int i = 0; i < notes.size() - 1; i++) {

                    int comparator = notes.get(i).getNoteName().compareTo(notes.get((i + 1)).getNoteName());
                    Note tempNote1 = notes.get(i);
                    Note tempNote2 = notes.get((i + 1));
                    if (comparator > 0) {
                        notes.remove(i);
                        notes.remove((i));
                        notes.add(i, tempNote2);
                        notes.add((i + 1), tempNote1);
                    }
                }
            }
        }
    }

    public void sortNotesDecending() {
        for (int j = 0; j < notes.size() - 1; j++) {
            for (int i = 0; i < notes.size() - 1; i++) {

                int comparator = notes.get(i).getNoteName().compareTo(notes.get((i + 1)).getNoteName());
                Note tempNote1 = notes.get(i);
                Note tempNote2 = notes.get((i + 1));
                if (comparator < 0) {
                    notes.remove(i);
                    notes.remove((i));
                    notes.add(i, tempNote2);
                    notes.add((i + 1), tempNote1);
                }
            }
        }
    }

    public void sortCardsDecending() {
        for (int j = 0; j < cards.size() - 1; j++) {
            for (int i = 0; i < cards.size() - 1; i++) {

                int comparator = cards.get(i).getCardQuestion().compareTo(cards.get((i + 1)).getCardQuestion());
                Card tempCard1 = cards.get(i);
                Card tempCard2 = cards.get((i + 1));
                if (comparator < 0) {
                    cards.remove(i);
                    cards.remove((i));
                    cards.add(i, tempCard2);
                    cards.add((i + 1), tempCard1);
                }
            }
        }
    }
}
