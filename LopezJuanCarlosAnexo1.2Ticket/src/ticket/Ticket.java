package ticket;

import java.time.LocalDate;

public class Ticket {
	//atributos de clase
	private static int ID_MAXIMO = 99_999_999; //maximo numero de id de tickets

	private static short ultimoAnyo = (short) LocalDate.now().getYear();
	private static int ultimoID = 0; //inicio
	
	//atributos de objeto
	private final LocalDate fecha; //fecha para usar el ticket
	private final String id; //id del ticket
	
	private LocalTime usado; //cuando se usa el ticket

}
