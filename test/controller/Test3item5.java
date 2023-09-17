package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Exame;
import model.Paciente;

class Test3item5 {
	private SistemaUPA s;
	@BeforeEach
	void setUp() throws Exception {
		s = new SistemaUPA();
	}


	@Test
	void test() { // verificando se o exame esta sendo adicionado
		Paciente paciente = new Paciente();
		Exame exame = new Exame();
		s.listaExames.adicionaFim(exame);
		assertEquals(1,s.listaExames.tamanho());
	}

}
