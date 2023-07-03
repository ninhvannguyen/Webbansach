package com.niit.java23.bt;

public class Square {
    private float Edgewidth;

    public float getEdgewidth() {
        return Edgewidth;
    }

    public void setEdgewidth(float edgewidth) {
        Edgewidth = edgewidth;
    }
    public float getArea(){
        return this.Edgewidth*this.Edgewidth;
    }
}