package Algoritmos;

import java.util.List;

public abstract class Algoritmo{
	protected List<String> alternativas;
	
	
	public abstract void relacionar(String item_1,String item_2);
	public abstract void cargarCriterio(String item);
	public abstract void cargarAlternativa(String item);
	public abstract void cargarInfluencia(String item_1,String item_2);
	
	public abstract void procesarDatos();
	
	public abstract List<String> obtenerPrioridadAlternativas();
	public abstract List<String> obtenerPrioridad(String criterio);
	
	
}
