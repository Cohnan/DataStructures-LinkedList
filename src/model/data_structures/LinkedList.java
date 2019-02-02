package model.data_structures;

import java.util.Iterator;

public class LinkedList<T> implements ILinkedList<T> {

	private Node<T> primero;
	private Node<T> ultimo;
	private Node<T> actual;
	private Integer tamano;
	
	public LinkedList () { //TODO puedo empezar sin informacion?
		primero = null;
		ultimo = null;
		actual = primero;
		tamano = 0;
	}
	
	@Override
	public Iterator<T> iterator() {
		
		return null;
	}

	@Override
	public Integer darTamano() {
		return tamano;
	}


	@Override
	public void anadir(T elemento) {
		if (tamano == 0) {
			primero = new Node<T>(elemento);
			tamano = 1;
			return;
		}
		
		Node<T> ultimoViejo = ultimo;
		ultimo = new Node(elemento);
		ultimoViejo.asignarSiguiente(ultimo);
		// ultimo.asignarAnterior(ultimoViejo);
		
		tamano++;
	}


	@Override
	public void anadirEn(int i, T elemento) { //Hacer que el i-esimo elemento, empezando en 0, sea el nuevo elemento
		if (i > tamano || i < 0) throw new IllegalArgumentException("No es posible anadir en esta posicion");
		
		if (i == tamano) {anadir(elemento); tamano++; return;}
		
		Node<T> actualViejo = primero;
		// Al terminar el for, viejoActual es el nodo que actualmente esta en la posicion i (empezando en 0)
		for (int k = 0; k < i; k++) 
			actualViejo = actualViejo.siguiente();
		
		Node<T> actualNuevo = new Node<T>(elemento);
		actualNuevo.asignarAnterior(actualViejo.anterior());
		actualNuevo.asignarSiguiente(actualViejo);
		
		/*viejoActual.anterior().asignarSiguiente(nuevoActual);
		viejoActual.siguiente().asignarAnterior(nuevoActual);*/
		tamano++;
	}


	@Override
	// Debe ser posible implementar este metodo con eliminarEn, pero este lo implemente primero
	public void eliminar(T dato) {
		if (tamano == 0) return;
		
		Node<T> nodo = primero;
		for (int i = 0; i < tamano; i++) { // El dato puede que este mas de una vez
			if (nodo.darDato().equals(dato)) { //TODO No se si solo queremos borrar cuando el dato sea el mismo objeto
				if (tamano == 1) {
					primero = null;
					ultimo = null;
					tamano = 0;
					return;
				} // Entonces el tamano es al menos 2
				else if (nodo == primero) {
					primero = primero.siguiente();
					primero.quitarAnterior();  // Forma 1
				}
				else if(nodo == ultimo) {
					ultimo = ultimo.anterior();
					ultimo.asignarSiguiente(null); // Forma 2
				} else { // Aqui se llega solo si el tamano es al menos 3
					Node<T> nodoAnt = nodo.anterior();
					nodo.anterior().asignarSiguiente(nodo.siguiente()); //TODO problematic?
					nodo = nodoAnt; //TODO problematic?
				}
				tamano--; //TODO Check if this works with the for loop
			}
			
			nodo = nodo.siguiente();
		}
	}


	@Override
	public void eliminarEn(int i) {
		// TODO Auto-generated method stub
		if (i >= tamano || i < 0) throw new IllegalArgumentException("No es posible encontrar esa posicion");
		
		Node<T> nodo = primero;
		for (int k = 0; k < i; k++) {
			nodo = nodo.siguiente();
		}
		
		if (tamano == 1) {
			primero = null;
			ultimo = null;
			tamano = 0;
			return;
		} // Entonces el tamano es al menos 2
		else if (nodo == primero) {
			primero = primero.siguiente();
			primero.quitarAnterior();  // Forma 1
		}
		else if(nodo == ultimo) {
			ultimo = ultimo.anterior();
			ultimo.asignarSiguiente(null); // Forma 2
		} else { // Aqui se llega solo si el tamano es al menos 3
			Node<T> nodoAnt = nodo.anterior();
			nodo.anterior().asignarSiguiente(nodo.siguiente()); //TODO problematic?
			nodo = nodoAnt; //TODO problematic?
		}
	}

	@Override
	public T recuperarEnPos(int i) {
		if (i >= tamano || i < 0) throw new IllegalArgumentException("No es posible encontrar esa posicion");
		
		Node<T> nodo = primero;
		for (int k = 0; k < i; k++) {
			nodo = nodo.siguiente();
		}
		
		return nodo.darDato();
	}


	@Override
	public void reiniciarRecorrido() {
		actual = primero;
	}


	@Override
	public T darActual() {
		return actual.darDato();
	}


	@Override
	public void avanzar() {
		actual = actual.siguiente();
	}


	@Override
	public void retroceder() {
		actual = actual.anterior();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	

}
