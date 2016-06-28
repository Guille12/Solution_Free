import java.util.Hashtable;

public class MatrizRelacion extends Matriz {
	
	private Hashtable<String, Hashtable<String, Integer> > matriz;
	
	public MatrizRelacion(){
		this.matriz = new Hashtable<>();
		this.setDimension(0);
	}
	
	
	
	@Override
	public void agregarItem(String item) {
		// TODO Auto-generated method stub
		Hashtable<String,Integer> colum = new Hashtable<>();
		colum.put(item,-1);
		this.matriz.put(item,colum);
		this.setDimension(this.getDimension() + 1);
	}

	@Override
	public void insertar(String fila, String colum, Object valor) {
		// TODO Auto-generated method stub
		this.matriz.get(fila).put(colum,(Integer)valor);
	}

	@Override
	public Object getElemento(String fila, String colum) {
		// TODO Auto-generated method stub
		return this.matriz.get(fila).get(fila);
	}


}
