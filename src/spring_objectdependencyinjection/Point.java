/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_objectdependencyinjection;

/**
 *
 * @author Administrator
 */
public class Point {
    private int x,y;

    public Point() {
    }

    public Point(int x) {
        this.x = x;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

  
    
    
    
}
