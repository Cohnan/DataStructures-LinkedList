package model.data_structures;

//import com.opencsv.CSVReader;

public class Node<T> {
	
	public T dato;
	public Node<T> siguiente;
	public Node<T> anterior;
	
	public Node (T dato, Node<T> nSiguiente){
		dato = dato;
		siguiente = nSiguiente;
	}
	
	/*public T darDato() {
		return dato;
	}
	
	public Node<T> anterior(){
		return anterior;
	}
	
	public Node<T> siguiente(){
		return siguiente;
	}*/
}
