/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_objectdependencyinjection;

import java.util.List;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author Administrator
 */
public class Triangle /* implements ApplicationContextAware, BeanNameAware*/{
    private Point pointA, pointB, pointC;
    
//    ApplicationContext context=null;
//    
//    private List<Point> points;
//
//    public List<Point> getPoints() {
//        return points;
//    }
//
//    public void setPoints(List<Point> points) {
//        this.points = points;
//    }
    
    
    

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
    
    public void draw(){
        System.out.println("X : " + getPointA().getX() + " Y : " + getPointA().getY() );
        System.out.println("X : " + getPointB().getX() + " Y : " + getPointB().getY() );
        System.out.println("X : " + getPointC().getX() + " Y : " + getPointC().getY() );
    }
    
//     public void draw2(){
//         
//          
//        for (Point point:points){
//            System.out.println("X : " + point.getX() + " Y : " + point.getY() );
//        System.out.println("getApplicationContext: " +getApplicationContext());
//        } 
//    }

//    @Override
//    public void setApplicationContext(ApplicationContext ac) throws BeansException {
//        this.context = ac;
//        
//    }
//       
//    
//    public ApplicationContext getApplicationContext(){
//        return context;
//    }
//
//    @Override
//    public void setBeanName(String string) {
//        System.out.println(string);
//    }
    
}
