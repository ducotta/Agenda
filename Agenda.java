/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Vector;

/**
 *
 * @author Eduardo Cotta e Fábio Teixeira
 */
public class Agenda {
    private Vector listaContatos;
    
    public Agenda() {
        this.listaContatos = new Vector();
    }
    public String adicionarContato(Contato novoContato){
        this.listaContatos.add(novoContato);
        return "Contato Cadastrado com Sucesso!";
    }
}
