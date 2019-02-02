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
			
			/*
			 * No solo es innecesario, sino que es problematico 
			 * decir lo siguiente por mi implementacion de asignarSiguiente y asignarAnterior en Node.java
			 *  
			 * primero.asignarSiguiente(null);
			 * primero.asignarAnterior(null);*/ 
			tamano++;
			return;
		}
		
		Node<T> ultimoPrev = ultimo;
		ultimo = new Node(elemento);
		ultimoPrev.asignarSiguiente(ultimo);
		ultimo.asignarAnterior(ultimoPrev);
		tamano++;
	}


	@Override
	public void anadirEn(int i, T elemento) { //Hacer que el i-esimo elemento, empezando en 0, sea el nuevo elemento
		if (i > tamano || i < 0) throw new IllegalArgumentException("No es posible anadir en esta posicion");
		
		if (i == tamano) {anadir(elemento); tamano++; return;}
		
		Node<T> viejoActual = primero;
		for (int k = 0; k < i; k++) 
			viejoActual = viejoActual.siguiente();
		
		Node<T> nuevoActual = new Node<T>(elemento);
		nuevoActual.asignarSiguiente(viejoActual);
		nuevoActual.asignarAnterior(viejoActual.anterior());
		
		viejoActual.anterior().asignarSiguiente(nuevoActual);
		viejoActual.siguiente().asignarAnterior(nuevoActual);
		tamano++;
	}


	@Override
	public void eliminar(T dato) {
		if (tamano == 0) return;
		
		Node<T> conDato;
		Node<T> nodo = primero;
		for (int i = 0; i < tamano; i++) { // El dato puede que este mas de una vez
			if (nodo.darDato().equals(dato)) {
				tamano--; //TODO Check if this works
				conDato = nodo;
				if (tamano == 1) {
					primero = null;
					ultimo = null;
					break;
				}
				else if (nodo == primero) {
					
				}
				else if(nodo == ultimo) {
					
				} else {
					
				}
			}
			
			nodo = nodo.siguiente();
		}
		
	}


	@Override
	public void eliminarEn(int i) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public T recuperarEnPos(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void reiniciarRecorrido() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public T darActual() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void retroceder() {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	

}
