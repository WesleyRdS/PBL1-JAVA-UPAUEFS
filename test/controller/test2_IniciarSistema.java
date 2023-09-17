package controller;

import controller.SistemaUPA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test2_IniciarSistema {
	private SistemaUPA x;
	@BeforeEach
	void setUp() throws Exception {
		x = new SistemaUPA();
	}

	@Test
	void test() { // teste para verificar se o retorno da condi��o de loguin esta correta. 
		int z = x.iniciarSistema("UPAUEFS");
		assertEquals(1,z);
	};

}
