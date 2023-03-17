package com.examen;

public interface Profesor {
	public static void main(String[] args) {
	Profesor ProfesorInformatica = new ProfesorInformatica();
	Profesor ProfesorMates = new ProfesorMates();
	Profesor ProfesorOrientacion= new ProfesorOrientacion();
	System.out.println(ProfesorInformatica.getEntrenamiento());
	System.out.println(ProfesorMates.getEntrenamiento());
	System.out.println(ProfesorOrientacion.getEntrenamiento());
	}
	public char[] getEntrenamiento();

	public static char[] getProfessor() {
	    // TODO Auto-generated method stub
	    return null;
	}
}
