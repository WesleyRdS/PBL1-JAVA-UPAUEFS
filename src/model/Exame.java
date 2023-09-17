/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Wesley Ramos
 */
public class Exame {
    private String tipo;
    private Medico medico;

    /* construtor
    * @param tipo String - Valor do tipo.
    * @param medico Medico - Valor do medico.
    */
    public Exame(String tipo, Medico medico) {
        this.tipo = tipo;
        this.medico = medico;

    }

    public Exame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /* Metodo para retornar o valor do tipo
    * @return String - Valor do tipo */
    public String getTipo() {
        return tipo;
    }
    
    /* Metodo que seta o tipo de exame
    * @param tipo String - Valor da string.
    */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /* Metodo para retornar o valor do tipo
    * @return Medico - Valor do medico */
    public Medico getMedico() {
        return medico;
    }
    
    /* Metodo que seta o medico
    * @param medico Medico - Valor do medico.
    */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
}
