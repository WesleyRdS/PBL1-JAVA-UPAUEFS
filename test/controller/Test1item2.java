package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Medico;

class Test1item2 {
	private SistemaUPA n;
	@BeforeEach
	void setUp() throws Exception {
		n = new SistemaUPA();
	}

	@Test
	void test() { // teste para verificar se o metodo editar medico funciona 
		Medico medico = new Medico();
		medico.setNome("Stranger");
		medico.setCrm("01");
		n.crmsCadastrados.adicionaInicio(medico.getCrm());
		n.listaMedico.adicionaInicio(medico);
		n.editarNome();
		assertEquals("01",n.crmsCadastrados.obter(0));
	}

}
