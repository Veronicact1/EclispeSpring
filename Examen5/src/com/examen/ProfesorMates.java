package com.examen;

import org.springframework.stereotype.Component;

@Component("Profesor")
        public class ProfesorMates implements Profesor {
        public String getProfessor() {
        return "Resolver ejercicios de 3 a 10 de la pagina 102";
        }

        @Override
        public char[] getEntrenamiento() {
            // TODO Auto-generated method stub
            return null;
        }

}
