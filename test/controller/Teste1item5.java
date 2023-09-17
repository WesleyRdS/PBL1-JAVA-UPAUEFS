package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Medico;

class Teste1item5 {
	private SistemaUPA s;
	@BeforeEach
	void setUp() throws Exception {
		s = new SistemaUPA();
	}


	@Test
	void test() { // verificando se a lista de atendidos esta vazia
		Medico m = new Medico();
		assertNull(m.getAtendidos());
	}

}
