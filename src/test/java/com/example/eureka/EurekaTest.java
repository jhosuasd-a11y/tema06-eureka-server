package com.example.eureka;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EurekaTest {
	
	@Test
	void pruebaQueFalla() {
		int resultado = 10;
		assertEquals(20, resultado);
		if(resultado == 10)
			System.out.println("ok");
		else
			System.out.println("Error");
	}

}
