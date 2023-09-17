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
public class Paciente {
    private String nome;
    private int matricula;
    private ListaE lista_exame;
    private ListaE exames_concluidos;
    private boolean prioridade;
    
    
    /* construtor
    * @param nome String - Valor do nome.
    * @param matricula int - Valor da matricula.
    * @param lista_exames ListaE - Valor da lista..
    * @param prioridade boolean - Verdadeiro ou Falso.
    * @param exames_concluidos ListaE - Valor da lista.
    */
    public Paciente(String nome, int matricula, ListaE lista_exame, boolean prioridade,ListaE exames_concluidos) {
        this.nome = nome;
        this.matricula = matricula;
        this.lista_exame = lista_exame;
        this.prioridade = prioridade;
        this.exames_concluidos = exames_concluidos;
    }
    
    /* Metodo para retornar o valor da lista de exames
    * @return ListaE - Valor da lista de exames */
    public ListaE getExames_concluidos() {
        return exames_concluidos;
    }
    /* Metodo que seta a lista de exames concluidos do paciente
    * @param exames_concluidos ListaE - Valor da lista.
    */
    public void setExames_concluidos(ListaE exames_concluidos) {
        this.exames_concluidos = exames_concluidos;
    }

    public Paciente() {
        
    }
    
    /* Metodo para retornar o valor do nome
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
    
    /* Metodo para retornar o valor da matricula
    * @return int - Valor da matricula */
    public int getMatricula() {
        return matricula;
    }
    
    /* Metodo que seta a matricula
    * @param matricula int - numero da matricula.
    */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    /* Metodo para retornar o valor da lista de exames do paciente
    * @return ListaE - Valor da lista de exames */
    public ListaE getLista_exame() {
        return lista_exame;
    }
    
    /* Metodo que seta a lista de exames do paciente
    * @param lista_exame ListaE - Valor da lista.
    */
    public void setLista_exame(ListaE lista_exame) {
        this.lista_exame = lista_exame;
    }
    
    /* Metodo para retornar se o paciente é prioritario
    * @return boolean - Valor da prioridade */
    public boolean getPrioridade() {
        return prioridade;
    }
    
    /* Metodo que seta a prioridade
    * @param prioridade boolean - Verdadeirou ou Falso.
    */
    public void setPrioridade(boolean prioridade) {
        this.prioridade = prioridade;
    }
}
