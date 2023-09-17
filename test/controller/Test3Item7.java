package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Paciente;

class Test3Item7 {
	private SistemaUPA s;
	@BeforeEach
	void setUp() throws Exception {
		s = new SistemaUPA();
	}

	@Test
	void test() {// Teste para o paciente obtido n existir na lista de pacientes cadastrados
		Paciente p = new Paciente();
		p.setMatricula(101);
		assertFalse(s.matriculaPacientes.contem(p.getMatricula()));
	}

}
