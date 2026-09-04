package edu.eci.arsw.math;
import java.lang.Thread;
import java.util.Timer;

public class LyfeCycle extends Thread{
    //Calcular el primer millón de digitos de PI en base 16
    private int start;
    private int count;
    private Thread hilo;

    public void timer(){
        System.out.println("Número de dígitos procesados: \n");
        PiDigits.getDigits(1,100, 3);
    }
    @Override
    public void run(){
        for(int i=0; i<count; i++){
            hilo.start();
        }
    }


    @Override
    public void start(){

    };
}


