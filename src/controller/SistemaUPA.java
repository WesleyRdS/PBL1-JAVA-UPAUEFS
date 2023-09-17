/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Medico;
import util.ListaE;
import java.util.Scanner;
import model.Exame;
import model.Paciente;

/**
 *
 * @author Wesley Ramos
 */
public class SistemaUPA {
    int contadorPrioridade = 0;
    ListaE listaMedico = new ListaE(); // armazena todos os medicos cadastrados
    ListaE listaExames = new ListaE(); // armazena os exames solicitados na exata ordem quem que foram solicitados
    ListaE crmsCadastrados = new ListaE(); // armazena somente os crms para verificação de existencia
    ListaE ExamesDisponiveis = new ListaE();// armazena todos os exames disponiveis para serem realizados
    ListaE matriculaPacientes = new ListaE();// armazena somente as matriculas dos paciente cadastrados
    
    /* Metodo para iniciar todo o sistema
    * @param senha String - Senha do sistema
    * @return int - retorna 1 se a senha for compativel e 2 se não. Esses retornos serão usados na main.
    */
    public int iniciarSistema(String senha){
        if("UPAUEFS".equals(senha)){
            ExamesDisponiveis.adicionaFim("HEMOGRAMA");
            ExamesDisponiveis.adicionaFim("TTP");
            ExamesDisponiveis.adicionaFim("TAP");
            ExamesDisponiveis.adicionaFim("UREIA");
            ExamesDisponiveis.adicionaFim("CREATININA");
            ExamesDisponiveis.adicionaFim("GLICOSE");
            ExamesDisponiveis.adicionaFim("NIVEL DE ELETROLITOS");
            ExamesDisponiveis.adicionaFim("TSH");
            ExamesDisponiveis.adicionaFim("T4 LIVRE");
            ExamesDisponiveis.adicionaFim("ACIDO URICO");
            ExamesDisponiveis.adicionaFim("PCR");
            ExamesDisponiveis.adicionaFim("PSA");
            ExamesDisponiveis.adicionaFim("ALBUMINA");
            ExamesDisponiveis.adicionaFim("VHS");
            ExamesDisponiveis.adicionaFim("URINA TIPO I");
            ExamesDisponiveis.adicionaFim("UROCULTURA");
            ExamesDisponiveis.adicionaFim("EXAME PARASITOLÓGICO DE FEZES");
            
            ListaE lMaE = new ListaE();
            ListaE lMaA = new ListaE();
            ListaE lMbE = new ListaE();
            ListaE lMbA = new ListaE ();
            Medico medicoA = new Medico("Ted","01",lMaE,lMbA,0);
            listaMedico.adicionaFim(medicoA);
            crmsCadastrados.adicionaFim("01");
            Medico medicoB = new Medico("Barney","02",lMaE,lMbA,0);
            crmsCadastrados.adicionaFim("02");
            listaMedico.adicionaFim(medicoB);
            return 1;
        }
        else{
            return 2;
        }
    }
    // Metodo para cadastrar novo medico
    public void novoMedico(){
        Medico m = new Medico();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o CRM do medico:");
        String crm =ler.nextLine();
        // verifica se o crm ja esta cadastrado
        if(crmsCadastrados.contem(crm) == false){
            // caso não ele cadastra o crm na lista de crms
            crmsCadastrados.adicionaFim(crm);
            m.setCrm(crm);
            System.out.println("Digite o nome do medico:");
            m.setNome(ler.nextLine());
            m.setContadorPrioridade(contadorPrioridade);
            listaMedico.adicionaInicio(m);
            // e o medico é adicionado a lista de medicos do sistema.
        }
        else{
            System.out.println("Medico ja cadastrado no sistema!!!");
        }
    }
    
    /* Metodo para retornar o paciente cadastrado
    * @return Paciente - Valor do novo objeto Paciente criado */
    public Paciente novoP(){
       Scanner dados = new Scanner(System.in);
       System.out.println("Digite a matricula: ");
       int matricula = dados.nextInt();
       ListaE LE = new ListaE();
       ListaE EC = new ListaE();
       Paciente paciente = null;
       // verifica se a matricula ja existe
       if(matriculaPacientes.contem(matricula)==false){
           // caso não a matricula é adicionada a lista de matriculas e o novo paciente é criado
           matriculaPacientes.adicionaFim(matricula);
           System.out.println("O paciente em questão atende os requesitos de prioridade? Se sim, digite 1. Se não digite 2! ");
           System.out.println("Qualquer outra tecla sera considerada como não prioritaria!!");
           int prioridade = dados.nextInt();
           if(prioridade == 1){
               paciente = new Paciente("nome",matricula,LE,true,EC);
           }
           else{
               paciente = new Paciente("nome",matricula,LE,false,EC);
           }
            
       }
       return paciente;
    }
    
    //Metodo para editar nome do medico
    public void editarNome(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o crm: ");
        String crm = ler.nextLine();
        // verifica se o medico existe
        if(crmsCadastrados.contem(crm) == true){
            int i = 0;
            while(true){ // caso exista entra no loop
                System.out.println(i);
                // obtem o medico
                Medico medico = (Medico) listaMedico.obter(i);
                // verifica se os crm são iguais
                if(crm.equals(medico.getCrm())){
                    //troca o nome
                    System.out.println("Digite o novo nome:");
                    String nome = ler.nextLine();
                    medico.setNome(nome);
                    break;
                }
                i = i+1;
            }
        } else{
         System.out.println("Medico não cadastrado no sistema");
        }
    }
    // Metodo que lista os pacientes a espera de determinado medico
    public void listaPacientes(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o CRM do medico: ");
        String crm = ler.nextLine();
        ListaE lista = null;
        int i = 0;
        // verifica se o medico existe
        if(crmsCadastrados.contem(crm) == true){
            while(true) { // loop de busca
                Medico medico = (Medico) listaMedico.obter(i);
                if(crm.equals(medico.getCrm())){
                    // se os crms informados e o do medico obtido forem iguais a lista deste medico é obtida
                    lista = medico.getEspera();
                    break;
                }
                i=i+1;
            }System.out.println(lista);
        }else{
            System.out.println("Medico não cadastrado no sistema");
        }
    }
    // Metodo que ordena a lista de medicos de sistema dois a dois de acordo com o tamanho da lista de espera
    public void ordenarListasdoMedico( ListaE listaMedico){
        for(int i = 0; i < listaMedico.tamanho(); i++){
            // o loop percorre a lista de medicos e vai pegando de dois em dois medicos e comparando o tamanho das listas de espera
            Medico medico = (Medico) listaMedico.obter(i);
            Medico medicoB = (Medico) listaMedico.obter(i+1);
            Medico aux = null;
            ListaE listaM = medico.getEspera();
            ListaE listaMB = medicoB.getEspera();
            if(listaM.tamanho() > listaMB.tamanho()){
                // ao comparar se o tamanho de um for maior que o do outro eles trocam de posição
                aux = medico;
                listaMedico.adiciona(i+1, aux);
                listaMedico.adiciona(i, medicoB);
            }
        }
    }
    // Metodo para encaminhar o paciente
    public void encaminhamento(){
        // Um novo paciente é recebido
        Paciente x = novoP();
        // seu nome é cadastrado
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do paciente");
        String nome = ler.nextLine();
        x.setNome(nome);
        // e ele é adicionado ao primeiro medico da lista de medicos do sistema
        Medico atendenteFinal =(Medico) listaMedico.obter(0);
        ListaE espera =  atendenteFinal.getEspera();
        boolean prioridade = x.getPrioridade();
        if(prioridade == true){
            // Se o paciente for prioritario ele é adicionado a frente dos não prioritarios
            espera.adiciona(atendenteFinal.getContadorPrioridade(), x);
            // e o valor da quantidade de pessoas com o contador de prioridade na lista do medico é atualizado
            atendenteFinal.setContadorPrioridade(contadorPrioridade++);
            }
        else{
            // se não ele so é adicionado no fim
            espera.adicionaFim(x); 
        }
        // reordenação da lista geral de medicos de acordo com o tamanho das listas de espera
        ordenarListasdoMedico(listaMedico);
    }
    
    /* Metodo para retornar o medico que esta realizando o atendimento.
    * @return Medico - Valor do medico */
    public Medico atendimento(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o crm do medico: ");
        String crm = ler.nextLine();
        Medico atendendo = null;
        int i = 0;
        if(crmsCadastrados.contem(crm) == true){
            while(true){
                Medico medico = (Medico) listaMedico.obter(i);
                if(medico.getCrm().equals(crm)){
                    atendendo = (Medico) listaMedico.obter(i);
                    Paciente atendido = (Paciente) atendendo.getEspera().obter(0);
                    atendendo.getEspera().removeInicio();
                    atendendo.getAtendidos().adicionaFim(atendido);
                    break;
                }
                i = i+1;
            }
        }
        else{
            System.out.println("Medico não cadastrado no sistema");
        }
        return atendendo;
    }
    // Metodo para solicitar exame
    public void solicitarExame(){
        System.out.println("Digite quantos exames deseja solicitar: ");
        Scanner ler = new Scanner(System.in);
        int quantidade = ler.nextInt();
        Medico atendente = atendimento();
        Paciente recebido =(Paciente) atendente.getAtendidos().obter(0);
        ListaE examesP = new ListaE();
        for(int i = 0; i < quantidade; i++){
            Scanner dados = new Scanner(System.in);
            System.out.println("Digite o tipo do exame: ");
            String tipo = dados.nextLine();
            // o exame so sera criado se o tipo de exame informado estiver contido na lista de exames do sistema
            if(ExamesDisponiveis.contem(tipo) == true){
                Exame exame = new Exame(tipo,atendente);
                examesP.adicionaFim(exame);
            }
            else{
                System.out.println("O exame solicitado não é um dos exames disponiveis para realização no momento. Verifique a grafia.");
            }
        }
        recebido.setLista_exame(examesP);
        listaExames.adicionaFim(recebido);
    }
    //Metodo para listagem de exames
    public void listagemExames(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tipo de exame: ");
        String tipo = ler.nextLine();
        ListaE listaT = new ListaE();
        // verificação da existencia do exame
        if(ExamesDisponiveis.contem(tipo) == true){
            for(int cont = 0; cont < listaExames.tamanho(); cont++){
                Paciente paciente =(Paciente) listaExames.obter(cont);
                for(int i = 0; i < paciente.getLista_exame().tamanho(); i++){
                    Exame listaE = (Exame) paciente.getLista_exame().obter(i);
                    if(listaE.getTipo().equals(tipo)){
                        listaT.adicionaFim(paciente.getNome());
                    }
                }
            }
            System.out.println(listaT.toString());
        }
        else{
            System.out.println("O exame solicitado não é um dos exames disponiveis para realização no momento. Verifique a grafia.");
        }
    }
    // Listara pacientes atendidos
    public void listarAtendidosMedico(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o crm do medico");
        String crm = ler.nextLine();
        ListaE m = null;
        int w = 0;
        // verifica se existe o crm cadastrado em uma lista com todos os crms disponiveis
        if(crmsCadastrados.contem(crm) == true){
            while(true){
                // a busca consiste em um loop que teoricamente seria infinito mas como anteriormente foi validade que o medico existe então ele com certeza sera encontrado quebrando assim o loop.
                Medico medico =(Medico) listaMedico.obter(w);
                if(medico.getCrm().equals(crm)){
                     m = medico.getAtendidos();
                     break;
                }
                w = w+1;
            }
            // imprimindo pacientes atendidos por aquele medico 1 a 1.
            for(int i = 0; i <= m.tamanho(); i++){
                Paciente e =(Paciente) m.obter(i);
                System.out.println(e.getNome());
            }
        }else{
            System.out.println("Medico não cadastrado no sistema");
        }

    }
    // metodo que acha todo o historico de exames do paciente
    public void historicoExamesPacientes(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a matricula do paciente: ");
        int matricula = ler.nextInt();
        ListaE p = null;
        int l = 0;
        // verificação da existencia do paciente
        if(matriculaPacientes.contem(matricula)==true){
            while(true){
                // loop de busca
                Paciente paciente = (Paciente) listaExames.obter(l);
                if(paciente.getMatricula() == matricula){
                    p = paciente.getExames_concluidos();
                    break;
                }
                l = l+1;
            }
            // orubtabdi a lista enquanto converte para string
            System.out.println(p.toString());
        }
        else{
            System.out.println("Paciente não cadastrado!!");
        }
    }
    // Metodo para relizar os exames de acordo com o tipo 
    public void realizarExames(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tipo de exame: ");
        String tipo = ler.nextLine();
        ListaE listaTipos = new ListaE();
        // informado o tipo ele verifica se existe aquele exame na lista de exames predefinida
        if(ExamesDisponiveis.contem(tipo) == true){
            // caso o exame exista entra em um laço para obter o paciente 
            for(int cont = 0; cont <  listaExames.tamanho(); cont++){
                Paciente paciente =(Paciente) listaExames.obter(cont);
                ListaE lista = paciente.getLista_exame();
                for(int i = 0; i < lista.tamanho(); i++){
                    //obtido o paciente ele busca pela lista de exames do paciente
                    Exame listaE = (Exame) paciente.getLista_exame().obter(i);
                    if(listaE.getTipo().equals(tipo)){
                        /* se o exame do paciente for do mesmo tipo do solicitado para ser realizado:
                        ele adiciona na lista de exames ja realizado
                        e remove da lista de exames a serem realizados
                        */
                        paciente.getExames_concluidos().adicionaFim(listaE);
                        paciente.getLista_exame().remover(i);
                    }
                }
            }
        }else{
           System.out.println("O exame solicitado não é um dos exames disponiveis para realização no momento. Verifique a grafia."); 
        }
    }
}
