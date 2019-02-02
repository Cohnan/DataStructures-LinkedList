package model.data_structures;

//import com.opencsv.CSVReader;

public class Node<T> {
	
	private T dato;
	private Node<T> siguiente;
	private Node<T> anterior;
	
	public Node (T dato){
		dato = dato;
	}
	
	public T darDato() {
		return dato;
	}
	
	public Node<T> anterior(){
		return anterior;
	}
	
	public Node<T> siguiente(){
		return siguiente;
	}
	
	// Hace los dos links al tiempo, sin entrar en un loop. Implica que cada nodo solo puede pertenecer 
	// a una lista.
	public void asignarSiguiente(Node<T> siguiente) {
		if (this.siguiente == siguiente) return;
		this.siguiente = siguiente;
		siguiente.asignarAnterior(this);
	}
	
	// Hace los dos links al tiempo, sin entrar en un loop. Implica que cada nodo solo puede pertenecer 
	// a una lista.	
	public void asignarAnterior(Node<T> anterior) {
		if (this.anterior == anterior) return;
		this.anterior = anterior;
		anterior.asignarSiguiente(this);
	}
}
