import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.data_structures.LinkedList;

/**
 * 
 */

/**
 * @author cohnan
 *
 */
class LinkedListTest {
	
	// Escenarios
	
	
	// Lista vacia
	private LinkedList<String> setUpEscenario0 () {
		return new LinkedList<String>();
	}
//	
	// Lista con 1 elemento
	private LinkedList<String> setUpEscenario1 () {
		LinkedList<String> lista = new LinkedList<> ();
		lista.anadir("Unico elemento");
		
		return lista;
	}
	
	// Lista con 2 elementos
	private LinkedList<String> setUpEscenario2 () {
		LinkedList<String> lista = new LinkedList<> ();
		lista.anadir("Elemento 1/2");
		lista.anadir("Elemento 2/2");
		
		return lista;
	}

	// Lista con 3 elementos
	private LinkedList<String> setUpEscenario3 () {
		LinkedList<String> lista = new LinkedList<> ();
		lista.anadir("Elemento 1/3");
		lista.anadir("Elemento 2/3");
		lista.anadir("Elemento 3/3");
		
		return lista;
	}

/*
	*//**
	 * @throws java.lang.Exception
	 *//*
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	*//**
	 * @throws java.lang.Exception
	 *//*
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	*//**
	 * @throws java.lang.Exception
	 *//*
	@BeforeEach
	void setUp() throws Exception {
	}

	*//**
	 * @throws java.lang.Exception
	 *//*
	@AfterEach
	void tearDown() throws Exception {
	}
*/	
	
	/**
	 * Test method for {@link model.data_structures.LinkedList#LinkedList()}.
	 */
	@Test
	void testLinkedList() {
		LinkedList lista = setUpEscenario0();
		
		assertTrue(0 == lista.darTamano(), "El tamano deberia ser 0");
		
	}

	/**
	 * Test method for {@link model.data_structures.LinkedList#iterator()}.
	 */
	@Test
	void testIterator() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.data_structures.LinkedList#anadir(java.lang.Object)}.
	 */
	@Test
	void testAnadir() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.data_structures.LinkedList#anadirEn(int, java.lang.Object)}.
	 */
	@Test
	void testAnadirEn() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.data_structures.LinkedList#eliminar(java.lang.Object)}.
	 */
	@Test
	void testEliminar() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.data_structures.LinkedList#eliminarEn(int)}.
	 */
	@Test
	void testEliminarEn() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.data_structures.LinkedList#recuperarEnPos(int)}.
	 */
	@Test
	void testRecuperarEnPos() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.data_structures.LinkedList#reiniciarRecorrido()}.
	 */
	@Test
	void testReiniciarRecorrido() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.data_structures.LinkedList#avanzar()}.
	 */
	@Test
	void testAvanzar() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.data_structures.LinkedList#retroceder()}.
	 */
	@Test
	void testRetroceder() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.data_structures.LinkedList#tieneSiguiente()}.
	 */
	@Test
	void testTieneSiguiente() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.data_structures.LinkedList#tieneAnterior()}.
	 */
	@Test
	void testTieneAnterior() {
		fail("Not yet implemented");
	}

}