/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_objectdependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class Spring_ObjectDependencyInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Triangle triangle = (Triangle) context.getBean("triangleId");
        //Triangle triangle = (Triangle) context.getBean("td");  //-> Use alias
        triangle.draw();
        //triangle.draw2();
    }
    
}
