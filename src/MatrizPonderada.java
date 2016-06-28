import java.util.Hashtable;


public class MatrizPonderada extends Matriz {
	
	private Hashtable<String, Hashtable<String, Double> > matriz;
	
	@Override
	public void insertar(String fila, String colum, Object valor) {
		// TODO Auto-generated method stub
		this.matriz.get(fila).put(colum,(Double)valor);
	}
	@Override
	public Object getElemento(String fila, String colum) {
		// TODO Auto-generated method stub
		return this.matriz.get(fila).get(fila);
	}
	@Override
	public void agregarItem(String item) {
		// TODO Auto-generated method stub
		Hashtable<String,Double> colum = new Hashtable<>();
		colum.put(item,-1.0);
		this.matriz.put(item,colum);
		this.setDimension(this.getDimension() + 1);
	}
	
}
