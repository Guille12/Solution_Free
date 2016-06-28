

public abstract class Matriz {
	
	protected int dimension;
	
	public abstract void insertar(String fila,String colum,Object valor);
	public abstract Object getElemento(String fila,String colum);
	public abstract void agregarItem(String item);
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
}
