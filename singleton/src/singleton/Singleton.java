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
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    FabricaDeNotebook fabrica = FabricaDeNotebook.getInstancia();
   
    fabrica.nomeNotebook="Samsung";
    fabrica.linhaNotbook="Linha: Expert x23";
    
        System.out.println("endereço na memoria:" + fabrica+  "\n Nome do Notebook:" +fabrica.nomeNotebook + "\n Linha do Notbook:"+fabrica.linhaNotbook);
    
    
    FabricaDeNotebook fabrica1 = FabricaDeNotebook.getInstancia();
    
    fabrica1.nomeNotebook = "Acer";
    fabrica1.linhaNotbook = "Aspire 5";  
    
    
    System.out.println("endereço na memoria:" + fabrica1+  "\n Nome do Notebook:" +fabrica1.nomeNotebook + "\n Linha do Notbook:"+fabrica1.linhaNotbook);
    }
    
}
