package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test3item10 {
	private SistemaUPA a;
	@BeforeEach
	void setUp() throws Exception {
		a = new SistemaUPA();
	}

	@Test
	void test() { // verificando se o tipo de exame solicitado � valido 
		String tipo = "";
		assertFalse(a.ExamesDisponiveis.contem(tipo));
	}

}
