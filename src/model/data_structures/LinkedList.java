package model.data_structures;

import java.util.Iterator;

public class LinkedList<T> implements ILinkedList<T> {

	private Node<T> primero;
	private Node<T> actual;
	private Integer tamano;
	
	public LinkedList (T dato) { //TODO puedo empezar sin informacion?
		primero = new Node<T>(dato, null);
		actual = primero;
		tamano = 1;
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
		Node<T> ultimoPrev = primero.anterior;
		Node<T> nuevoUltimo = new Node(elemento, null);
		ultimoPrev.siguiente = nuevoUltimo;
		primero.anterior = nuevoUltimo;
	}


	@Override
	public void anadirEn(int i, T elemento) {
		
	}


	@Override
	public void eliminar(T dato) {
		// TODO Auto-generated method stub
		
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
