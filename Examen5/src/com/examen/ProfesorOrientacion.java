package com.examen;

import org.springframework.stereotype.Component;

@Component("Profesor")
        public class ProfesorOrientacion implements Profesor {
        public String getProfessor() {
        return "Ver el video explicativo";
        }

        @Override
        public char[] getEntrenamiento() {
            // TODO Auto-generated method stub
            return null;
        }
}
