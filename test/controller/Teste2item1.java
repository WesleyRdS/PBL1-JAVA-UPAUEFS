package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Medico;

class Teste2item1 {
	private SistemaUPA n;
	@BeforeEach
	void setUp() throws Exception {
		n = new SistemaUPA();
	}

	@Test
	void test() { // teste para verificar se o nome esta sendo cadastrado
		Medico m = new Medico();
		m.setCrm("Doutor");
		assertEquals("Doutor",m.getCrm());
		
	}

}
