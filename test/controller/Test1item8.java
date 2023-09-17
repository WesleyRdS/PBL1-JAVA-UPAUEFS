package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test1item8 {
	private SistemaUPA s;
	@BeforeEach
	void setUp() throws Exception {
		s = new SistemaUPA();
	}
	
	@Test
	void test() {// crm n�o cadastrado
		String crm = "dadadad";
		assertFalse(s.crmsCadastrados.contem(crm));
	}

}
