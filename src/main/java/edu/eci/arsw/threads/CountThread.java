/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread {
    int numA;
    int numB;
    public CountThread(int A, int B) {
        this.numA = A;
        this.numB = B;
    }

    public void run(){
        for(int i=numA; i<=numB; i++){
            System.out.print(i + " ");
        }
    }
}
