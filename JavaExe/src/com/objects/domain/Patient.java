package com.objects.domain;

public class Patient {
    /*
    id	hid	height
    4885	KNIHGR006101	161.8
     */
    private String id;
    private String hid;
    private float height;

    public Patient(String id, String hid, float height) {
        this.id = id;
        this.hid = hid;
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public String getHid() {
        return hid;
    }

    public float getHeight() {
        return height;
    }
}