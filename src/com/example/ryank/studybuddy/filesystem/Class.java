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
public class Class implements Serializable {

    static final long serialVersionUID = 42L;
    private String className;
    private ArrayList<Chapter> chapters;

    public Class(String className) {
        setClassName(className);
        chapters = new ArrayList<Chapter>();

    }

    public void sortChaptersAscending() {
        if (chapters.size() - 1 > 0) {
            for (int j = 0; j < chapters.size() - 1; j++) {
                for (int i = 0; i < chapters.size() - 1; i++) {

                    int comparator = chapters.get(i).getChapterName().compareTo(chapters.get((i + 1)).getChapterName());
                    Chapter tempChapter1 = chapters.get(i);
                    Chapter tempChapter2 = chapters.get((i + 1));
                    if (comparator > 0) {
                        chapters.remove(i);
                        chapters.remove((i));
                        chapters.add(i, tempChapter2);
                        chapters.add((i + 1), tempChapter1);
                    }
                }
            }
        }
    }

    public void sortChaptersDecending() {
        if (chapters.size() - 1 > 0) {
            for (int j = 0; j < chapters.size() - 1; j++) {
                for (int i = 0; i < chapters.size() - 1; i++) {

                    int comparator = chapters.get(i).getChapterName().compareTo(chapters.get((i + 1)).getChapterName());
                    Chapter tempChapter1 = chapters.get(i);
                    Chapter tempChapter2 = chapters.get((i + 1));
                    if (comparator < 0) {
                        chapters.remove(i);
                        chapters.remove((i));
                        chapters.add(i, tempChapter2);
                        chapters.add((i + 1), tempChapter1);
                    }
                }
            }
        }
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void createNewChapter(String chapterName) {
        chapters.add(new Chapter(chapterName));
    }

    public void createNewChapter(int index, Chapter chapter) {
        chapters.add(index, chapter);
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }

    public void removeChapter(int index) {
        chapters.remove(index);
    }
}
