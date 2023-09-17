package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import model.Medico;
import model.Paciente;

class Teste3item4 {
	private SistemaUPA s;
	@BeforeEach
	void setUp() throws Exception {
		s = new SistemaUPA();
	}

	@Test
	void test() {// testando um paciente que n esta na lista de espera
		Medico m = (Medico)s.listaMedico.obter(0);
		Paciente p = new Paciente();
		p.setMatricula(03);
		assertFalse(m.getEspera().contem(p));
	}

}
