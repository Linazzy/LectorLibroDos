package modelo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.swing.JTextArea;

import org.omg.Messaging.SyncScopeHelper;

import utiles.Constantes;

public class Acceso {

	File file = null;
	FileInputStream flujo = null;
	InputStreamReader conversor = null;
	BufferedReader buffer = null;

	public void conseguirCadena(Libro libro, JTextArea area) {
		file = new File(libro.getLectura());
		if (file.exists()) {
			try {
				flujo = new FileInputStream(file);
				conversor = new InputStreamReader(flujo);
				buffer = new BufferedReader(conversor);

				int posicionUno = (int) libro.getPaginas().get(libro.getActual()).getPrimerCaracter();
				int posicionDos = (int) libro.getPaginas().get(libro.getActual()).getUltimoCaracter();
				if (buffer.ready()) {
					for (int i = 0; i < posicionDos; i++) {
						String line = buffer.readLine();
						if (i >= posicionUno && i <= posicionDos) {
							area.append(line);
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();

			}
			try {
				flujo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void imprimirPagina(Libro libro, JTextArea area) {
		conseguirCadena(libro, area);
	}
}
