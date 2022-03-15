package com.saak.maven.MavenTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context  = new ClassPathXmlApplicationContext("bean.xml");
        
        Object o = context.getBean("set");
        SampleBean sb = (SampleBean) o;
        sb.pritSet();
    }

}

