/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesgenericas;

import java.util.*;

/**
 *
 * @author Teknol
 */
public class ColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList();
        miLista.add("Oliver");
        miLista.add("Sinue");
        //imprimir(miLista);
        
        Set<String> miSet = new HashSet();
        miSet.add("Oliver");
        miSet.add("Sinue");
        miSet.add("Sinue");
        imprimir(miSet);
        
        Map<String, String> miMap= new HashMap();
        
        miMap.put("1", "Oliver");
        miMap.put("2", "Sinue");
        miMap.put("3", "Sinue");
        imprimir(miMap.keySet());
        imprimir(miMap.values());
        
        
        
        
    }
    private static void imprimir(Collection<String> col) {
        for(String elemento: col) {
            
            System.out.println("elemento = " + elemento);
            
        }
    }
    
    
    
}
