package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraParaTexto {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2023-08-09");
		LocalDateTime d05 = LocalDateTime.parse("2023-08-09T01:30:25");
		Instant d06 = Instant.parse("2023-08-09T01:30:25Z");

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //Pego o padrão de formatação e considero o fuso horário local
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;

		System.out.println("d04 = " + d04.format(fmt1)); // Está respeito o formato que foi passado no DateTimeFormatter
		System.out.println("d04 = " + fmt1.format(d04)); //Posso chamar das duas formas
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05 = " + d05.format(fmt1)); 
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt05.format(d06));
		System.out.println("d06 = " + d06.toString());
		
		
	
	}

}
