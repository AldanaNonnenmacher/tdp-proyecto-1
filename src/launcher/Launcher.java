package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
       
		Student alumno = new Student(126995, "Nonnenmacher Galparoli", "Maria Aldana", "aldananonnenmacher@gmail.com", "https://github.com/AldanaNonnenmacher/tdp-proyecto-1", "/images/imagen.jpeg");

		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	SimplePresentationScreen presentacion = new SimplePresentationScreen(alumno);
            	presentacion.setVisible(true);

            }
        });
    }
}