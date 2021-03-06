package cz.pa165.mains;

import org.apache.camel.CamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cz.pa165.SomeSpringBean;

public class SpringMain 
{
    public static void main( String[] args ) throws Exception
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-standalone.xml");
    	CamelContext camelContext = (CamelContext) context.getBean("retailStoreCamelContext");
    	
    	SomeSpringBean ssb = (SomeSpringBean) context.getBean("someSpringBean");
    	ssb.sendSomethingThere();
    	
    	Thread.sleep(300000);
    }

	
}
