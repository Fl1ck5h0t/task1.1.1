package com.company;

public class Vector {
    private final double x;
    private final double y;
    private final double z;
    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector sum(Vector other){
        return new Vector(x+other.x, y+other.y, z+other.z);
    }
    public Vector subtract(Vector other){
        return new Vector(x-other.x, y-other.y, z-other.z);
    }
    public double multiply(Vector other){
        return x*other.x + y*other.y + z*other.z;
    }
    public double cos(Vector other){
        return multiply(other) / multiplyAbs(other);
    }
    public double length(){
        return Math.sqrt(x*x + y*y + z*z);
    }
    private double multiplyAbs(Vector other){
        return Math.abs(x*other.x) + Math.abs(y*other.y) + Math.abs(z*other.z);
    }

}
