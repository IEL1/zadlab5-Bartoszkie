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
public class Zadanie_2 {
    
    private String tytuł;
    private String autor;
    private int liczba_stron;
    private int rok_wydania;
    private double cena;

    public Zadanie_2(String tytuł, String autor, int liczba_stron, int rok_wydania, double cena) {
        this.tytuł = tytuł;
        this.autor = autor;
        this.liczba_stron = liczba_stron;
        this.rok_wydania = rok_wydania;
        this.cena = cena;
    }

    public void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLiczba_stron(int liczba_stron) {
        this.liczba_stron = liczba_stron;
    }

    public void setRok_wydania(int rok_wydania) {
        this.rok_wydania = rok_wydania;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    
    
    
    
    
    
}
