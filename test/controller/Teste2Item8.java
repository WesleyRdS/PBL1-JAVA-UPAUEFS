package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Medico;

class Teste2Item8 {
	private SistemaUPA s;
	@BeforeEach
	void setUp() throws Exception {
		s = new SistemaUPA();
	}
	
	@Test
	void test() { // Medico sem pacientes na lista de espera e na lista de atendidos
		Medico atrasado = new Medico();
		assertNull(atrasado.getEspera());
		assertNull(atrasado.getAtendidos());
	}

}
