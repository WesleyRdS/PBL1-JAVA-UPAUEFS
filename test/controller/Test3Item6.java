package controller;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Paciente;

class Test3Item6 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {//Test da lista de exames vazia
		Paciente p = new Paciente();
		assertNull(p.getLista_exame());
	}

}
