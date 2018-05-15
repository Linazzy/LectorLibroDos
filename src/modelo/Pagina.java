package modelo;

public class Pagina {

	private long primerCaracter;
	private long ultimoCaracter;
	
	public Pagina(long primerCaracter, long ultimoCaracter) {
		super();
		this.primerCaracter = primerCaracter;
		this.ultimoCaracter = ultimoCaracter;
	}
	public long getPrimerCaracter() {
		return primerCaracter;
	}
	public void setPrimerCaracter(long primerCaracter) {
		this.primerCaracter = primerCaracter;
	}
	public long getUltimoCaracter() {
		return ultimoCaracter;
	}
	public void setUltimoCaracter(long ultimoCaracter) {
		this.ultimoCaracter = ultimoCaracter;
	}
	@Override
	public String toString() {
		return "Pagina [primerCaracter=" + primerCaracter + ", ultimoCaracter=" + ultimoCaracter + "]";
	}
	
	
	
}
