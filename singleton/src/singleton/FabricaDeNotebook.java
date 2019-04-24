/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Rafael
 */
public class FabricaDeNotebook {
    
     public static FabricaDeNotebook instancia;
     
     protected String nomeNotebook;
     protected String linhaNotbook;
 
    protected FabricaDeNotebook() {
    }
 
    public static FabricaDeNotebook getInstancia() {
        if (instancia == null)
            instancia = new FabricaDeNotebook();
        return instancia;
    }
}
