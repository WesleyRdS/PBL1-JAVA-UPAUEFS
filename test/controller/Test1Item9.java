package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test1Item9 {
	private SistemaUPA a;
	@BeforeEach
	void setUp() throws Exception {
		a = new SistemaUPA();
	}

	@Test
	void test() { // teste de matricula n�o cadastrada
		int matricula = 331515;
		assertFalse(a.matriculaPacientes.contem(matricula));
	}

}
