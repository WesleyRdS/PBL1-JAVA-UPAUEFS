package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Exame;
import model.Paciente;

class Test2Item7 {
	private SistemaUPA s;
	@BeforeEach
	void setUp() throws Exception {
		s = new SistemaUPA();
	}


	@Test
	void test() { // caso do exame solicitado n ter na lista do paciente
		Paciente p = new Paciente();
		Exame exame = new Exame();
		exame.setTipo("Sangue");
		Exame exame2 = new Exame();
		exame2.setTipo("Urina");
		p.getLista_exame().adicionaInicio(exame);
		assertFalse(p.getLista_exame().contem(exame2.getTipo()));
	}

}
