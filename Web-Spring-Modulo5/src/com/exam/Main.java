package com.exam;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new
		AnnotationConfigApplicationContext(Configuracion.class);
		Profesor profesor = context.getBean("profesorInformatica", Profesor.class); 
		System.out.println(profesor.getEjercicios());
		context.close();
	}

}
