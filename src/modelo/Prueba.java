package modelo;

import java.awt.EventQueue;
import java.util.ArrayList;

import control.ParaLectorUI;
import vista.LectorUI;


public class Prueba {

	public static void main(String[] args) {
		Libro libro= new Libro();
		Acceso acceso= new Acceso();
		
		//acceso.conseguirCadena(libro);
		//System.out.println(acceso.cadenaParcial);
		/*Libro libro= new Libro();
		libro.setActual(0);
		Pagina pagina= new Pagina(3,10 );
		ArrayList<Pagina> paginas= new ArrayList<>();
		paginas.add(pagina);
		libro.setPaginas(paginas);
		LectorUI lector= new LectorUI();
		
		ConvertidorLibro convertidorLibro= new ConvertidorLibro();
		convertidorLibro.conseguirCadena(libro);
		convertidorLibro.entrarCadenaEnStringBuilder(lector.getTextArea(),2,10);*/
		//convertidorLibro.conseguirLineas(libro);
		//String cadena= "patata";
		//StringBuilder cadenaParcial= new StringBuilder(cadena);
		//System.out.println(cadenaParcial.charAt(0));
		//String cadena="las patatas son la puta ostia porque no se las pueden comer los patos jejejejejejejejeje";
		
		//System.out.println(convertidorLibro.partirLinea(cadena));
		

		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaLectorUI frame = new ParaLectorUI();
				//	frame.getTextArea().setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");//42
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	
		
	}

}
