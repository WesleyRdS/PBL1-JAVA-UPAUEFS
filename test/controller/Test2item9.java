package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Paciente;

class Test2item9 {
	private SistemaUPA a;
	@BeforeEach
	void setUp() throws Exception {
		a = new SistemaUPA();
	}

	@Test
	void test() {// Verofocamdp se �osta de exames esta vazia
		Paciente p = new Paciente();
		assertNull(p.getLista_exame());
	}

}
