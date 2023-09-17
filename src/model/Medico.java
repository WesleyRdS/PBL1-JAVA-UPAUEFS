/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import util.ListaE;

/**
 *
 * @author Wesley Ramos
 */
public class Medico {
    private String nome;
    private String crm;
    private ListaE espera;
    private ListaE atendidos;
    private int contadorPrioridade;
    
    
    /* construtor
    * @param nome String - Valor do nome.
    * @param crm String - Valor do crm.
    * @param espera ListaE - Valor da lista.
    * @param atendidos ListaE - Valor da lista.
    * @param contadorPrioridade int - valor da prioridade.
    */
    public Medico(String nome, String crm, ListaE espera, ListaE atendidos,int contadorPrioridade) {
        this.nome = nome;
        this.crm = crm;
        this.espera = espera;
        this.atendidos = atendidos;
        this.contadorPrioridade = contadorPrioridade;
    }
    
    public Medico(){}
    
    /* Metodo para retornar o nome
    * @return String - Valor do nome */
    public String getNome() {
        return nome;
    }
    
    /*Metodo para setar nome
    * @param nome String - valor do nome.
    */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /*Metodo para setar crm
    * @param crm String - valor do crm.
    */
    public void setCrm(String crm){
        this.crm = crm;
    }
    
    /* Metodo para retornar o valor do crm
    * @return String - Valor do crm */
    public String getCrm() {
        return crm;
    }
    
    /* Metodo para retornar o valor da lista encadeada
    * @return ListaE - Valor da lista */
    public ListaE getEspera() {
        return espera;
    }

    public void setEspera(ListaE espera) {
        this.espera = espera;
    }
    
    /* Metodo para retornar o valor da lista encadeada
    * @return ListaE - Valor da lista */
    public ListaE getAtendidos() {
        return atendidos;
    }

    public void setAtendidos(ListaE atendidos) {
        this.atendidos = atendidos;
    }
    
    
    /* Metodo para retornar o valor do contador de prioridade
    * @return int - Valor do contador de prioridade */
    public int getContadorPrioridade() {
        return contadorPrioridade;
    }
    /*Metodo para setar o numero de pacientes prioritarios na fila
    * @param contadorPrioridade int - valor do contador.
    */
    public void setContadorPrioridade(int contadorPrioridade) {
        this.contadorPrioridade = contadorPrioridade;
    }
    
}
