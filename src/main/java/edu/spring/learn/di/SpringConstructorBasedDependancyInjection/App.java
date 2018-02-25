package edu.spring.learn.di.SpringConstructorBasedDependancyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.learn.di.beans.Course;

/**
 * @author pushkarladhe
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    		Course course = context.getBean(Course.class);
    		System.out.println(course.toString());
    }
}
