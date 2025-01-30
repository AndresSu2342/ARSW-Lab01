package edu.eci.arsw.math;

/**
 * ThreadPiDigits es un hilo que calcula un rango específico de dígitos de pi usando la clase PiDigits.
 */
public class ThreadPiDigits extends Thread {
    private int numA, numB;
    private byte[] resultPi;

    /**
     * Constructor de ThreadPiDigits.
     * @param A Posición inicial.
     * @param B Cantidad de dígitos a calcular.
     */
    public ThreadPiDigits(int A, int B) {
        this.numA = A;
        this.numB = B;
    }

    /**
     * Ejecuta el cálculo de los dígitos de pi en este hilo.
     */
    public void run(){
        resultPi = PiDigits.getDigits(numA, numB);
    }

    /**
     * Retorna los resultados calculados por el hilo.
     * @return Array de bytes con los dígitos calculados.
     */
    public byte[] getResultPi(){
        return resultPi;
    }
}
