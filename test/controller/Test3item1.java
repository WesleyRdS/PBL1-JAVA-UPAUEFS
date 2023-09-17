package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Medico;
import model.Paciente;

class Test3item1 {
	private SistemaUPA n;
	@BeforeEach
	void setUp() throws Exception {
		n = new SistemaUPA();
	}

	@Test
	void test() { // Teste para verificar se o paciente foi adicionado na lista de espera do medico
		Paciente p = new Paciente();
		p.setNome("Paciente1");
		p.setMatricula(1);
		Medico m = new Medico();
		m.getEspera().adicionaInicio(p);
		Paciente p1 =(Paciente)m.getEspera().obter(0);
		assertEquals(p.getMatricula(),p1.getMatricula());
	}

}
