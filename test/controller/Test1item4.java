package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import model.Medico;

class Test1item4 {
	private SistemaUPA s;
	@BeforeEach
	void setUp() throws Exception {
		s = new SistemaUPA();
	}

	@Test
	void test() {// verificando crm que n esta na lista de crms cadastrados 
		Medico plantao = new Medico();
		String crm = "000001";
		plantao.setCrm(crm);
		assertFalse(s.crmsCadastrados.contem(crm));
	}

}
