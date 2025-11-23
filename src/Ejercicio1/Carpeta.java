package Ejercicio1;

import java.util.List;

public class Carpeta {

	String nombre;
	private List<Archivo> archivos;
	private List<Carpeta> subcarpetas;

	public Carpeta (String nombre) {
		this.nombre = nombre;
	}

	public List<Archivo> getArchivos () {
		return this.archivos;
	}

	public List<Carpeta> getSubcarpetas () {
		return this.subcarpetas;
	}

	public static double calcularPesoTotal (Carpeta inicio) {
		double pesoTotal = 0.0;
		for(Archivo archivos : inicio.getArchivos()) {
			pesoTotal+=archivos.getPesoMB();
		}
		for(Carpeta subcarpeta : inicio.getSubcarpetas()) {
			pesoTotal+=calcularPesoTotal(subcarpeta);
		}
		return pesoTotal;
	}
	
	public void agregarArchivo(Archivo archivo) { this.archivos.add(archivo); }
    public void agregarSubcarpeta(Carpeta carpeta) { this.subcarpetas.add(carpeta); }
	
}