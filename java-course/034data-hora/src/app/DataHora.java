package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {
        
		//(agora) -> Data-Hora
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
        
		//Texto ISO 8601 -> Data-Hora
		LocalDate d04 = LocalDate.parse("2023-08-09");
		LocalDateTime d05 = LocalDateTime.parse("2023-08-09T01:30:25");
		Instant d06 = Instant.parse("2023-08-09T01:30:25Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        
		//Texto formato customizado -> Data-Hora
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate d08 = LocalDate.parse("09/08/2023", fmt1); // Coloco uma sobrecarga no segundo elemento para o texto
																// ser interpretado
		LocalDateTime d09 = LocalDateTime.parse("09/08/2023 01:30", fmt2);

		LocalDate d10 = LocalDate.of(2023, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2023, 8, 9, 16, 59);

		System.out.println("d01 " + d01.toString());
		System.out.println("d02 " + d02.toString());
		System.out.println("d03 " + d03.toString());
		System.out.println("d04 " + d04.toString());
		System.out.println("d05 " + d05.toString());
		System.out.println("d06 " + d06.toString());
		System.out.println("d07 " + d07.toString());
		System.out.println("d08 " + d08.toString());
		System.out.println("d09 " + d09.toString());
		System.out.println("d10 " + d10.toString());
		System.out.println("d11 " + d11.toString());

	}

}
