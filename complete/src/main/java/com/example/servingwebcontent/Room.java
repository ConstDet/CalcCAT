package com.example.servingwebcontent;

public class Room {
    private int id;
    private String roomName;
    private double roomArea;
    private double roomHeight;
    private double smallestDistanceFromFireLoadToCeiling;
    private double flammableLoadArea;

    public Room(String roomName, double roomArea, double roomHeight, double smallestDistanceFromFireLoadToCeiling,
                double flammableLoadArea) {
        this.roomName = roomName;
        this.roomArea = roomArea;
        this.roomHeight = roomHeight;
        this.smallestDistanceFromFireLoadToCeiling = smallestDistanceFromFireLoadToCeiling;
        this.flammableLoadArea = flammableLoadArea;
    }

    public int getId() {
        return id;
    }

    public String getRoomName() {
        return roomName;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public double getRoomHeight() {
        return roomHeight;
    }

    public double getSmallestDistanceFromFireLoadToCeiling() {
        return smallestDistanceFromFireLoadToCeiling;
    }

    public double getFlammableLoadArea() {
        return flammableLoadArea;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    public void setRoomHeight(double roomHeight) {
        this.roomHeight = roomHeight;
    }

    public void setSmallestDistanceFromFireLoadToCeiling(double smallestDistanceFromFireLoadToCeiling) {
        this.smallestDistanceFromFireLoadToCeiling = smallestDistanceFromFireLoadToCeiling;
    }

    public void setFlammableLoadArea(double flammableLoadArea) {
        this.flammableLoadArea = flammableLoadArea;
    }
}
