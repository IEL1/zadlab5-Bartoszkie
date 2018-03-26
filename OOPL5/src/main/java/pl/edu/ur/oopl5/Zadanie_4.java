/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;
import java.util.Date;
/**
 *
 * @author student
 */
public class Zadanie_4 extends Date {

    private int dzien;
    private int miesiac;
    private int rok;

    public Zadanie_4(int dzien, int miesiac, int rok) throws Exception {

        super(dzien, miesiac, rok);

    }

    public Zadanie_4() {
    }
    
    
    
    public void dodajTydzien_przod(){
        
        int name = this.getDate()+7;
        
    }
    
    public void dodajTydzien_tyl(){
        
        int name = this.getDate()-7;
        
    }
    
}

