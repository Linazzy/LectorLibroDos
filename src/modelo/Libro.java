package modelo;

import java.util.ArrayList;

import utiles.Constantes;

public class Libro implements Legible{
	private String lectura;
	private int actual;
	private int marca;
	private ArrayList<Pagina> paginas=new ArrayList<>();
	
	public Libro(){
		super();
		this.actual=0;
		this.marca=0;
		this.lectura="ready.txt"; 
		paginas.add(new Pagina(0, 9));
	}
		
	/**
	 * vas a la siguiente p�gina
	 */
	@Override
	public void avanzarPagina() {
		if(!comprobarUltimaPagina()){
			paginas.add(new Pagina(paginas.get(actual).getUltimoCaracter()+1, paginas.get(actual).getUltimoCaracter()+10));
			actual++;
		}	
	}

	/**
	 * ves si es la �ltima p�gina
	 * @return
	 */
	private boolean comprobarUltimaPagina() {
		if(this.actual==Constantes.numeroPaginas)
		{
			return true;
		}
		return false;
	}

	/**
	 * vas a la p�gina anterior
	 */
	@Override
	public void retrocederPagina() {
		if(!comprobarPrimeraPagina()){
				actual--;
		}	
	}

	/**
	 * Mira si la p�gina donde estamos es la primera.
	 * @return
	 */
	private boolean comprobarPrimeraPagina() {
		return this.actual==0;
	}

	/**
	 * Pone una marca en la p�gina actual
	 */
	@Override
	public void marcarPagina() {
		this.marca=this.actual;
		
	}

	/**
	 * Te dirige a la p�gina de la marca.
	 */
	@Override
	public void irAMarca() {
		this.actual=this.marca;
		
	}
	

	public String getLectura() {
		return lectura;
	}

	public void setLectura(String lectura) {
		this.lectura = lectura;
	}

	public int getActual() {
		return actual;
	}

	public void setActual(int actual) {
		this.actual = actual;
	}

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	public ArrayList<Pagina> getPaginas() {
		return paginas;
	}

	public void setPaginas(ArrayList<Pagina> paginas) {
		this.paginas = paginas;
	}


	
	
}
