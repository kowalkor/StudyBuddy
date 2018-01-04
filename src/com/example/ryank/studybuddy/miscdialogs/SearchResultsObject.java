/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ryank.studybuddy.miscdialogs;

import com.example.ryank.studybuddy.SearchResultType;

/**
 *
 * @author ryank
 */
public class SearchResultsObject {

    private Object result;
    private SearchResultType type;
    private int classIndex;
    private int chapterIndex;
    private int cardNoteIndex;

    SearchResultsObject(Object result, SearchResultType type, int classIndex) {
        this.result = result;
        this.type = type;
        this.classIndex = classIndex;
    }

    SearchResultsObject(Object result, SearchResultType type, int classIndex, int chapterIndex) {
        this.result = result;
        this.type = type;
        this.classIndex = classIndex;
        this.chapterIndex = chapterIndex;
    }

    SearchResultsObject(Object result, SearchResultType type, int classIndex, int chapterIndex, int cardNoteIndex) {
        this.result = result;
        this.type = type;
        this.classIndex = classIndex;
        this.chapterIndex = chapterIndex;
        this.cardNoteIndex = cardNoteIndex;
    }

    public Object getResult() {
        return result;
    }

    public SearchResultType getType() {
        return type;
    }

    public int getClassIndex() {
        return classIndex;
    }

    public int getChapterIndex() {
        return chapterIndex;
    }

    public int getCardNoteIndex() {
        return cardNoteIndex;
    }
}
