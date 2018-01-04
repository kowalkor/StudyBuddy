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
public class User implements Serializable {

    static final long serialVersionUID = 42L;
    private String userName;
    private ArrayList<Class> classes;

    public User() {
        classes = new ArrayList<Class>();
    }

    public User(String userName) {
        setUserName(userName);
        classes = new ArrayList<Class>();

    }

    public void removeClass(int classIndex) {
        classes.remove(classIndex);
    }

    public void sortClassesAscending() {
        if (classes.size() - 1 > 0) {
            for (int j = 0; j < classes.size() - 1; j++) {
                for (int i = 0; i < classes.size() - 1; i++) {

                    int comparator = classes.get(i).getClassName().compareTo(classes.get((i + 1)).getClassName());
                    Class tempClass1 = classes.get(i);
                    Class tempClass2 = classes.get((i + 1));
                    if (comparator > 0) {
                        classes.remove(i);
                        classes.remove((i));
                        classes.add(i, tempClass2);
                        classes.add((i + 1), tempClass1);
                    }
                }
            }
        }
    }

    public void sortClassesDecending() {
        if (classes.size() - 1 > 0) {
            for (int j = 0; j < classes.size() - 1; j++) {
                for (int i = 0; i < classes.size() - 1; i++) {

                    int comparator = classes.get(i).getClassName().compareTo(classes.get((i + 1)).getClassName());
                    Class tempClass1 = classes.get(i);
                    Class tempClass2 = classes.get((i + 1));
                    if (comparator < 0) {
                        classes.remove(i);
                        classes.remove((i));
                        classes.add(i, tempClass2);
                        classes.add((i + 1), tempClass1);
                    }
                }
            }
        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void createNewClass(String className) {
        classes.add(new Class(className));

    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public Class getClass(int index) {
        return classes.get(index);
    }

    public void addClass(int index, String className) {
        classes.add(index, new Class(className));
    }

    public void addClass(int index, Class classs) {
        classes.add(index, classs);
    }
}
