package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test1item7 {
	private SistemaUPA s;
	@BeforeEach
	void setUp() throws Exception {
		s = new SistemaUPA();
	}


	@Test
	void test() {// teste se o tipo existe
		String tipo = "";
		assertFalse(s.ExamesDisponiveis.contem(tipo));
	}

}
