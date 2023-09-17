package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Paciente;

class Test3item9 {
	private SistemaUPA a;
	@BeforeEach
	void setUp() throws Exception {
		a = new SistemaUPA();
	}
	@Test
	void test() { //Teste de exame na lista de exames do paciente n�o � um exame valido
		Paciente p = new Paciente();
		p.getLista_exame().adicionaInicio("TAP");
		String e = (String)p.getLista_exame().obter(0);
		assertFalse(a.ExamesDisponiveis.contem(e));
	}

}
