package com.examen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
@SuppressWarnings("unused")
public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
            Profesor Profesor = context.getBean("miProfesor", Profesor.class);

            System.out.println(com.examen.Profesor.getProfesor()); 
            context.close();
	}
}