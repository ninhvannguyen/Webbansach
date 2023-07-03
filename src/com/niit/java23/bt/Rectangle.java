package com.niit.java23.bt;

public class Rectangle {
    private float EdgeOne,EdgeTwo;

    public float getEdgeOne() {
        return EdgeOne;
    }

    public void setEdgeOne(float edgeOne) {
        EdgeOne = edgeOne;
    }

    public float getEdgeTwo() {
        return EdgeTwo;
    }

    public void setEdgeTwo(float edgeTwo) {
        EdgeTwo = edgeTwo;
    }
    public float getArea(){
        return this.EdgeOne*this.EdgeTwo;
    }
}
