/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;



/**
 *
 * @author student
 */
public class Zadanie_3 {
    
    private int[] tablica;
    private int wskaznik_stosu;
   
    // dodawanie elemenut na wierzchołek stosu 
     void Push(int E) throws ArrayIndexOutOfBoundsException {
        if (wskaznik_stosu < tablica.length) {
            tablica[wskaznik_stosu] = E;
            wskaznik_stosu++;
            
        } else {
            throw new ArrayIndexOutOfBoundsException(
                    "Przepełnienie stosu, operacja nie powiodła się");
        }
    }
   
    
   
    
    
    
    
    
}
