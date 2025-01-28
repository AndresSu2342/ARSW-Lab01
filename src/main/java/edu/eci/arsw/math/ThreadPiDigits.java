package edu.eci.arsw.math;



public class ThreadPiDigits extends Thread {
    private int numA, numB;
    private byte[] resultPi;
    public ThreadPiDigits(int A, int B) {
        this.numA = A;
        this.numB = B;
    }

    public void run(){
        resultPi = PiDigits.getDigits(numA, numB);
    }
    public byte[] getResultPi(){
        return resultPi;
    }

}
