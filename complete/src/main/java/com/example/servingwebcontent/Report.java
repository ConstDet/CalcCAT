package com.example.servingwebcontent;

import java.util.List;

public class Report {
    static private int id = 0;
    private final String nameCompany;
    private final String nameObject;
    private final String documentCode;
    private final String positionHead;
    private final String surnameHead;
    private final String developerPosition;
    private final String surnameDeveloper;
    private List<Room> rooms;

    public Report(String nameCompany, String nameObject, String documentCode,
                  String positionHead, String surnameHead, String developerPosition,
                  String surnameDeveloper) {
        this.nameCompany = nameCompany;
        this.nameObject = nameObject;
        this.documentCode = documentCode;
        this.positionHead = positionHead;
        this.surnameHead = surnameHead;
        this.developerPosition = developerPosition;
        this.surnameDeveloper = surnameDeveloper;
        id ++;
    }

    public int getId() {
        return id;
    }
    public String getNameCompany() {
        return nameCompany;
    }

    public String getNameObject() {
        return nameObject;
    }

    public String getDocumentCode() {
        return documentCode;
    }

    public String getPositionHead() {
        return positionHead;
    }

    public String getSurnameHead() {
        return surnameHead;
    }

    public String getDeveloperPosition() {
        return developerPosition;
    }

    public String getSurnameDeveloper() {
        return surnameDeveloper;
    }

    public void addRoom(String name, ) {
        rooms.add(new Room());
    }
}
