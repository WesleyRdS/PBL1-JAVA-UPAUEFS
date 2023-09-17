package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Paciente;

class Test2Item6 {
	private SistemaUPA s;
	@BeforeEach
	void setUp() throws Exception {
		s = new SistemaUPA();
	}


	@Test
	void test() {// test para inclus�o de um exame ja anteriormente solicitado
		Paciente p = new Paciente();
		p.getLista_exame().adicionaInicio("Sangue");
		assertTrue(p.getLista_exame().contem("Sangue"));
	}

}
