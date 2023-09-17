package controller;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Medico;
import model.Paciente;
import util.ListaE;

class Test2item3 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {// testando se os prioritarios est�o sendo adicionados a frente dos n�o prioritarios
		ListaE espera = new ListaE();
		Paciente normal = new Paciente();
		normal.setMatricula(1);
		normal.setPrioridade(false);
		Paciente prioritario = new Paciente();
		prioritario.setMatricula(2);
		prioritario.setPrioridade(true);
		Medico doutor = new Medico();
		espera.adicionaFim(normal);
		espera.adicionaFim(prioritario);
		int i=0;
		while(i<2) { // percorrendo a lista com loop
			Paciente atual = (Paciente)espera.obter(i); // obtendo paciente
			boolean x = atual.getPrioridade();
			if(x == true) { // verificando prioridade
				doutor.getEspera().adicionaInicio(atual);
				break;
			}
			else {
				doutor.getEspera().adicionaFim(atual);
			}
			i=i+1;
		}
		Paciente obtido = (Paciente) doutor.getEspera().obter(0);
		assertEquals(true,obtido.getPrioridade());
	}

}
