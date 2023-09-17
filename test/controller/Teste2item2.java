package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Teste2item2 {
	private SistemaUPA n;
	@BeforeEach
	void setUp() throws Exception {
		n = new SistemaUPA();
	}

	@Test
	void test() { // teste para ver se passa um crm que n existe
		assertFalse(n.crmsCadastrados.contem("03"));
	}

}
