package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Medico;

class Test1item3 {
	private SistemaUPA n;
	@BeforeEach
	void setUp() throws Exception {
		n = new SistemaUPA();
	}

	@Test
	void test() {// Verificando se o medico esta com a lista vazia 
		Medico pediatra = new Medico();
		assertNull(pediatra.getEspera());
	}

}
