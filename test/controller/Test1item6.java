package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test1item6 {
	private SistemaUPA s;
	@BeforeEach
	void setUp() throws Exception {
		s = new SistemaUPA();
	}


	@Test
	void test() { // verificando se a fun��o reconhece um exame n existente
		String tipo = " ";
		assertFalse(s.ExamesDisponiveis.contem(tipo));
	}

}
