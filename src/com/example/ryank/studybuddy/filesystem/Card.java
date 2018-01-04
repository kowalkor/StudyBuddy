/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ryank.studybuddy.filesystem;

import java.io.Serializable;

/**
 *
 * @author Ryan
 */
public class Card implements Serializable {

    static final long serialVersionUID = 42L;

    private String cardQuestion;
    private String cardAnswer;
    private int cardDifficulty;
    private int cardType;
    private boolean selected;

    public Card(String cardQuestion, String cardAnswer, int cardType) {

        this.cardQuestion = cardQuestion;
        this.cardAnswer = cardAnswer;
        this.cardDifficulty = 1;
        this.cardType = cardType;
        this.selected = false;
    }

    public void setCardSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean getCardSelected() {
        return this.selected;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    public int getCardType() {
        return cardType;
    }

    public void setCardQuestion(String cardQuestion) {
        this.cardQuestion = cardQuestion;
    }

    public void setCardAnswer(String cardAnswer) {
        this.cardAnswer = cardAnswer;
    }

    public void setCardDifficulty(int difficulty) {
        this.cardDifficulty = difficulty;
    }

    public String getCardQuestion() {
        return cardQuestion;
    }

    public String getCardAnswer() {
        return cardAnswer;
    }

    public int getCardDifficulty() {
        return cardDifficulty;
    }
}
