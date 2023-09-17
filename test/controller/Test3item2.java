package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test3item2 {
	private SistemaUPA n;
	@BeforeEach
	void setUp() throws Exception {
		n = new SistemaUPA();
	}

	@Test
	void test() {// verificando se a lista n�o esta vazia
		assertNotNull(n.listaMedico);
	}

}
