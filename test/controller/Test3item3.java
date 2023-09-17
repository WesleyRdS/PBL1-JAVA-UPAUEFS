package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Paciente;

class Test3item3 {
	private SistemaUPA s;
	@BeforeEach
	void setUp() throws Exception {
		s = new SistemaUPA();
	}

	@Test
	void test() { // teste de prioridade
		Paciente encaminhado = new Paciente();
		encaminhado.setPrioridade(false);
		boolean x = encaminhado.getPrioridade();
		assertFalse(x);
	}

}
