package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Medico;

class Test1item1 {
	private SistemaUPA n;
	@BeforeEach
	void setUp() throws Exception {
		n = new SistemaUPA();
	}

	@Test
	// teste para verificar se a condi��o para inclus�o do novo medico funciona
	void test() {
		int contador = 0;
		for(int i = 0; i <3;i++) {
			String crm = "04";
			if(n.crmsCadastrados.contem(crm) == false){ //verifica��o se o crm esta na lista
				n.crmsCadastrados.adicionaFim(crm);
				contador=contador+1;
				}
		}
		assertEquals(1,contador);
	}

}
