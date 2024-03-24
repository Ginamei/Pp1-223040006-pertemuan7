/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Gina Meirina
 */
public class MataKuliahMain {
    public static void main(String[] args) {
        ListMataKuliah list = new ListMataKuliah();
//      Latihan 4
//      list.addHead(new MataKuliah("IF001", "Dasar Pemrograman", 4));
//      list.addHead(new MataKuliah("IF002", "Pemrograman Web", 3));
//      list.displayElement();
//      Tes-1
//      list.addHead(new MataKuliah("IF004", "Konstruksi PL Berorientasi", 3));
//      list.addHead(new MataKuliah("IF003", "Struktur Diskrit", 3));
//      list.addHead(new MataKuliah("IF002", "Pemrograman Web", 3));
//      list.addHead(new MataKuliah("IF001", "Dasar Pemrograman", 4));
//      list.displayElement();
    
    
    
//    Tes-4
      list.addTail(new MataKuliah("IF001", "Dasar Pemrograman", 4));
       list.addMiddle(new MataKuliah("IF002", "Pemrograman Web", 3), 2);
       list.addMiddle(new MataKuliah("IF003", "Struktur Diskrit", 3), 1);
       list.addHead(new MataKuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
       list.displayElement();
        
   
    } 
}
