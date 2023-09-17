package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Paciente;

class Test2item10 {
	private SistemaUPA a;
	@BeforeEach
	void setUp() throws Exception {
		a = new SistemaUPA();
	}
	
	@Test
	void test() {//Verifica��o se a lista esta vazia;
		Paciente cansado = new Paciente();
		assertNull(cansado.getLista_exame());
	}

}
