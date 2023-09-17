package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test1item10 {
	private SistemaUPA a;
	@BeforeEach
	void setUp() throws Exception {
		a = new SistemaUPA();
	}
	@Test
	void test() { // verificando se matricula esta cadastrada
		int m = 121251;
		assertFalse(a.matriculaPacientes.contem(m));
	}

}
