package model.vo;

/**
 * Representation of a Trip object
 */
public class VOMovingViolations {
	
	private int objectId;
	private String ROW_;
	private String location;
	private int ADDRESS_ID;
	private int STREETSEGID;
	private float XCOORD;
	private float YCOORD;
	private String TICKETTYPE;
	private int FINEAMT;
	private int totalPaid;
	private int PENALTY1;
	private int PENALTY2;
	private String accidentIndicator;
	private String ticketIssueDate;
	private String VIOLATIONCODE;
	private String violationDescription;	
	private String ROW_ID;
	
	public VOMovingViolations(String[] row) {
		objectId = Integer.parseInt(row[0]);
		ROW_ = row[1];
		location = row[2];
		ADDRESS_ID = Integer.parseInt(row[3]);
		STREETSEGID = Integer.parseInt(row[4]);
		XCOORD = Float.parseFloat(row[5]);
		XCOORD = Float.parseFloat(row[6]);
		TICKETTYPE = row[7];
		FINEAMT = Integer.parseInt(row[8]);
		totalPaid = Integer.parseInt(row[9]);
		PENALTY1 = Integer.parseInt(row[10]);
		PENALTY2 = Integer.parseInt(row[11]);
		accidentIndicator = row[12];
		ticketIssueDate = row[13];
		VIOLATIONCODE = row[14];
		violationDescription = row[15];
		ROW_ID = row[16];
	}
	
	/**
	 * @return id - Identificador único de la infracción
	 */
	public int objectId() {
		return objectId;
	}	
	
	
	/**
	 * @return location - Dirección en formato de texto.
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @return date - Fecha cuando se puso la infracción .
	 */
	public String getTicketIssueDate() {
		return ticketIssueDate;
	}
	
	/**
	 * @return totalPaid - Cuanto dinero efectivamente pagó el que recibió la infracción en USD.
	 */
	public int getTotalPaid() {
		return totalPaid;
	}
	
	/**
	 * @return accidentIndicator - Si hubo un accidente o no.
	 */
	public String  getAccidentIndicator() {
		return accidentIndicator;
	}
	
	/**
	 * @return description - Descripción textual de la infracción.
	 */
	public String getViolationCode() {
		return VIOLATIONCODE;
	}
	
	/**
	 * @return description - Descripción textual de la infracción.
	 */
	public String  getViolationDescription() {
		return violationDescription;
	}
}
