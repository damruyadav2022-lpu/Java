class Task implements Runnable{
    String taskname;

    Task(String taskname){
        this.taskname = taskname;
    }


    public void run(){
        for(int i= 0; i<=5; i++){
            System.out.println(taskname +"isrunnind: "+ i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}






class thread_Runnable {
    public static void main(String[] args) {
        Task t1 = new Task("Task A");
        Task t2 = new Task("Task A");

        Thread thr1 = new Thread(t1);
        Thread thr2 = new Thread(t2);

        thr1.start();
        thr2.start();

    }
    
}
