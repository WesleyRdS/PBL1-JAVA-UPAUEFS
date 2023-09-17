/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upa.uefs;

import java.util.Scanner;

/**
 *
 * @author Wesley Ramos
 */
public class UpaUEFS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        controller.SistemaUPA sistema = new controller.SistemaUPA(); // instanciando o sistema
        Scanner dado = new Scanner(System.in);
        System.out.println("UPA-UEFS: Por favor informe a senha: ");
        String senha = dado.nextLine();
        int pswrd = sistema.iniciarSistema(senha); // chama o metodo para comparar a senhas informadas
        switch(pswrd){// passa o retorno da função de iniciar o sistema como parametro pro switch case
            case 1:
                // caso as senhas batam ele abre um menu de opções
                while(true){
                    System.out.println("------------------------------Bem vindo ao sistema de gerenciamento da UPA-UEFS----------------------------------");
                    System.out.println("Digite 1: Para cadastrar um novo medico");
                    System.out.println("Digite 2: Para editar os dados do medico");
                    System.out.println("Digite 3: Para encaminhar paciente");
                    System.out.println("Digite 4: Para listar fila de pacientes");
                    System.out.println("Digite 5: Para realizar atendimento");
                    System.out.println("Digite 6: Para listagem de exames");
                    System.out.println("Digite 7: Para listagem de atendimentos");
                    System.out.println("Digite 8: Para listar exames solicitados");
                    System.out.println("Digite 9: Para realizar exames");
                    System.out.println("Digite 10: Para sair");
                    int option = dado.nextInt();
                    switch(option){
                        case 1:
                            sistema.novoMedico();
                            break;
                        case 2:
                            sistema.editarNome();
                            break;
                        case 3:
                            sistema.encaminhamento();
                            break;
                        case 4:
                            sistema.listaPacientes();
                            break;
                        case 5:
                            sistema.solicitarExame();
                            break;
                        case 6:
                            sistema.listagemExames();
                            break;
                        case 7:
                            sistema.listarAtendidosMedico();
                            break;
                        case 8:
                            sistema.historicoExamesPacientes();
                            break;
                        case 9:
                            sistema.realizarExames();
                            break;
                        default:
                            System.out.println("Deslogando......");
                            break;
                    }
                    if(option == 10){break;}
                }
                
            case 2:
                System.out.println("Senha invalida!!!Encerrando programa......");
                break;
        }
        
        
        
        
    }
    
}
