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
public class CountThreadsMain {
    
    public static void main(String a[]){
        CountThread FirstThread = new CountThread(0, 99);
        CountThread SecondThread = new CountThread(100, 199);
        CountThread ThirdThread = new CountThread(200, 299);
        FirstThread.start();
        SecondThread.start();
        ThirdThread.start();
    }
    
}
