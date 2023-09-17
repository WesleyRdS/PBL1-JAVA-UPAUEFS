package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Paciente;

class Test2item5 {
	private SistemaUPA s;
	@BeforeEach
	void setUp() throws Exception {
		s = new SistemaUPA();
	}


	@Test
	void test() { // verificando se a lista de exames esta vazia
		Paciente pa = new Paciente();
		assertNull(pa.getLista_exame());
	}

}
