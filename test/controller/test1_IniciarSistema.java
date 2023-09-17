package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test1_IniciarSistema {
	private SistemaUPA n;
	@BeforeEach
	void setUp() throws Exception {
		n = new SistemaUPA();
	}

	@Test
	void test() {// teste verificando a condi��o inicial do sistema de sempre iniciar com dois medicos 
		n.listaMedico.adicionaFim(1);
		n.listaMedico.adicionaFim(2);
		int medicos = n.listaMedico.tamanho();
		assertEquals(2,medicos);
	}

}
