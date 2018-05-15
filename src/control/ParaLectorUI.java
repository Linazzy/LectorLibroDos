package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;

import modelo.Acceso;
import modelo.Libro;
import modelo.Pagina;
import vista.LectorUI;

public class ParaLectorUI extends LectorUI {

	Acceso acceso = new Acceso();
	Libro libro = new Libro();

	public ParaLectorUI() {

		actualizarLibro();
		
		getBtnAlante().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				libro.avanzarPagina();
				actualizarLibro();
			}
		});

		getBtnAtras().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				libro.retrocederPagina();
				actualizarLibro();

			}
		});

		getBtnMarcar().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				libro.marcarPagina();

			}
		});

		getBtnIrAMarca().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				libro.irAMarca();
				actualizarLibro();

			}
		});
		
		
	}

	public void actualizarLibro() {
		getTextArea().setText("");
		acceso.imprimirPagina(libro, getTextArea());
	}

}
