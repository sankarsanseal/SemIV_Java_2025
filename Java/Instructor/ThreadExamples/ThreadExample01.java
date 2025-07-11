package Java.Instructor.ThreadExamples;

import java.util.Random;

public class ThreadExample01 implements Runnable{

    public void run(){
        System.out.println("Child thread created.");

        int random_wait_time = new Random().nextInt(1000);

        try{
            Thread.sleep(random_wait_time);
        }
        catch(InterruptedException I)
        {
            System.out.println(I.getMessage());
        }

        System.out.println("Thread ended after " + random_wait_time + " milliseconds");

    }


    public static void main(String [] args){


        

        ThreadExample01 child_thread01 = new ThreadExample01();

        child_thread01.run();

        
        ThreadExample01 child_thread02 = new ThreadExample01();

        child_thread02.run();

        ThreadExample01 child_thread03 = new ThreadExample01();

        child_thread03.run();


        System.out.println("Parent thread is executing.");


    }
}