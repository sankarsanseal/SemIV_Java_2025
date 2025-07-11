package Java.Instructor.ThreadExamples;

import java.util.Random;

public class ThreadExample02 extends Thread{

    
    protected int thread_num;

    public ThreadExample02(int thread_num){

        this.thread_num = thread_num;

    }
    
    
    public void run(){

        System.out.println("Child thread created with thread number " + thread_num + ".");
        System.out.println("Thread ID given by the JVM " 
        + this.threadId() + "."
        );

        int random_wait_time = new Random().nextInt(1000);

        try{
            Thread.sleep(random_wait_time);
        }
        catch(InterruptedException I)
        {
            System.out.println(I.getMessage());
        }


        System.out.println("Child thread ended with thread number " + thread_num + ".");
        System.out.println("The thread ID assigned by the OS is " + threadId());


    }


    public static void main(String[] args) {
        
        
        ThreadExample02 child_thread01 = new ThreadExample02(1);

        child_thread01.start();

        
        ThreadExample02 child_thread02 = new ThreadExample02(2);

        child_thread02.start();

        ThreadExample02 child_thread03 = new ThreadExample02(3);

        child_thread03.start();


        System.out.println("Parent thread is executing with thread ID " 
        + Thread.currentThread().threadId() + ".");
    }


    
}
