package Classes;

public class Pelicula {
	private String titulo;
	private long gananciaBruta;
	private long previsionGananciaBruta;
	private long cantidadEspectadores;
	private long previsionEspectadores;
	private long cantidadSalas;
	private long previsionSalas;
	private long gananciaNeta;
	private long previsionGananciaNeta;
	
	public Pelicula() {}
	
	public Pelicula(String titulo, long gananciaBruta, long cantidadEspectadores, long cantidadSalas) {
		this.titulo = titulo;
		this.gananciaBruta = gananciaBruta;
		this.cantidadEspectadores = cantidadEspectadores;
		this.cantidadSalas = cantidadSalas;
		this.gananciaNeta = (long) (this.gananciaBruta*0.8);
		this.previsionEspectadores = this.cantidadEspectadores/2;
		this.previsionSalas = this.cantidadSalas/2;
		this.previsionGananciaNeta = this.gananciaNeta/2;
		this.previsionGananciaBruta = this.gananciaBruta/2;
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public long getGananciaBruta() {
		return gananciaBruta;
	}
	public void setGananciaBruta(long gananciaBruta) {
		this.gananciaBruta = gananciaBruta;
	}
	public long getCantidadEspectadores() {
		return cantidadEspectadores;
	}
	public void setCantidadEspectadores(long cantidadEspectadores) {
		this.cantidadEspectadores = cantidadEspectadores;
	}
	public long getCantidadSalas() {
		return cantidadSalas;
	}
	public void setCantidadSalas(long cantidadSalas) {
		this.cantidadSalas = cantidadSalas;
	}
	public long getGananciaNeta() {
		return gananciaNeta;
	}
	public void setGananciaNeta(long gananciaNeta) {
		this.gananciaNeta = gananciaNeta;
	}

	public long getPrevisionEspectadores() {
		return previsionEspectadores;
	}

	public void setPrevisionEspectadores(long previsionEspectadores) {
		this.previsionEspectadores = previsionEspectadores;
	}

	public long getPrevisionSalas() {
		return previsionSalas;
	}

	public void setPrevisionSalas(long previsionSalas) {
		this.previsionSalas = previsionSalas;
	}

	public long getPrevisionGananciaNeta() {
		return previsionGananciaNeta;
	}

	public void setPrevisionGananciaNeta(long previsionGananciaNeta) {
		this.previsionGananciaNeta = previsionGananciaNeta;
	}

	public long getPrevisionGananciaBruta() {
		return previsionGananciaBruta;
	}

	public void setPrevisionGananciaBruta(long previsionGananciaBruta) {
		this.previsionGananciaBruta = previsionGananciaBruta;
	}
	
	
}
