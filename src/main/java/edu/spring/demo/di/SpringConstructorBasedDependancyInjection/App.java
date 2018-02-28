package edu.spring.demo.di.SpringConstructorBasedDependancyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.demo.di.beans.Course;

/**
 * @author pushkarladhe
 *
 */
public class App 
{
	private static ApplicationContext context;
    public static void main( String[] args )
    {
    		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    		Course course = context.getBean(Course.class);
    		System.out.println(course.toString());
    }
}
