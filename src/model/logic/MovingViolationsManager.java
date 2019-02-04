package model.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

import api.IMovingViolationsManager;
import model.vo.VOMovingViolations;
import model.data_structures.LinkedList;

public class MovingViolationsManager implements IMovingViolationsManager {

	private LinkedList<VOMovingViolations> listaInfracciones;
	
	public void loadMovingViolations(String movingViolationsFile){
		CSVReader reader = null;
		try {
			reader = new CSVReader(new FileReader("data/Moving_Violations_Issued_in_January_2018.csv"));
			listaInfracciones = new LinkedList<VOMovingViolations>(); // TODO handle header
			VOMovingViolations infraccion;
		    for (String[] row : reader) {
		    	infraccion = new VOMovingViolations(row);
		    	listaInfracciones.anadir(infraccion);
		    }
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

		
	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {
		
		LinkedList<VOMovingViolations> lista = new LinkedList<>();
		
		VOMovingViolations infraccion;
		listaInfracciones.reiniciarRecorrido();
		//for (VOMovingViolations infraccion : listaInfracciones) {
		while (listaInfracciones.tieneSiguiente()) {
			infraccion = listaInfracciones.avanzar();
			if (infraccion.getViolationCode().equals(violationCode))
				lista.anadir(infraccion);
		}
		
		return lista;
	}

	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {
		
		LinkedList<VOMovingViolations> lista = new LinkedList<>();
		
		for (VOMovingViolations infraccion : listaInfracciones) {
			if (infraccion.getAccidentIndicator().equals(accidentIndicator))
				lista.anadir(infraccion);
		}
		
		return lista;
	}	


}
