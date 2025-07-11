package Java.Instructor.ThreadExamples;

import java.util.Random;
import java.util.Scanner;

public class ThreadExample03 extends Thread{

    
    protected int thread_num;

    public ThreadExample03(int thread_num){

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

        int no_of_thread = 0;
        System.out.print("Enter the number of threads that you like to execute:");
        
        try(Scanner input_read = new Scanner(System.in) ){
            no_of_thread = input_read.nextInt();
            System.err.println(no_of_thread);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());

        }

        Thread [] thread_arr = new Thread [no_of_thread];
        
        for(int i = 0; i < no_of_thread; i++){

            thread_arr[i] = new ThreadExample03(i);
            thread_arr[i].setName("ThreadExample" + i);
            thread_arr[i].start();


        }


        for(int i = 0; i < no_of_thread; i++){
                    try{
                thread_arr[i].join();
            }
            catch(InterruptedException I)
            {
                System.out.println(I.getLocalizedMessage());
            }
        }

        
        System.out.println("Parent thread is executing with thread ID " 
        + Thread.currentThread().threadId() + ".");
    }


    
}
