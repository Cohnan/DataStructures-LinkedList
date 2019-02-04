/**
 * 
 */
package model.logic;

import java.util.regex.Pattern;

/**
 * @author cohnan
 *
 */
public class Infraction {
	public int OBJECTID;
	public String ROW_;
	public String LOCATION;
	public int ADDRESS_ID;
	public int STREETSEGID;
	public float XCOORD;
	public float YCOORD;
	public String TICKETTYPE;
	public int FINEAMT;
	public int TOTALPAID;
	public int PENALTY1;
	public int PENALTY2;
	public String ACCIDENTINDICATOR;
	public String TICKETISSUEDATE;
	public String VIOLATIONCODE;
	public String VIOLATIONDESC;	
	public String ROW_ID;
	
	public void Infraction(String[] row) {
		
		OBJECTID = Integer.parseInt(row[0]);
		ROW_= row[1];
		LOCATION = row[2];
		ADDRESS_ID = Integer.parseInt(row[3]);
		STREETSEGID = Integer.parseInt(row[4]);
		XCOORD = Float.parseFloat(row[5]);
		YCOORD = Float.parseFloat(row[6]);
		TICKETTYPE = row[7];
		FINEAMT = Integer.parseInt(row[8]);
		TOTALPAID = Integer.parseInt(row[9]);
		PENALTY1 = Integer.parseInt(row[10]);
		PENALTY2 = Integer.parseInt(row[11]);
		ACCIDENTINDICATOR = row[12];
		TICKETISSUEDATE = row[13];
		VIOLATIONCODE = row[14];
		VIOLATIONDESC = row[15];
		ROW_ID = row[16];
	}

}
