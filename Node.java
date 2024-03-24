/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Gina Meirina
 */
public class Node {
    private MataKuliah data;
    private Node next;
    public Node(MataKuliah data) {
        this.data = data;
    }
    public MataKuliah getData() {
        return data;
    }
    public void setData(MataKuliah data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
