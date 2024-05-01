/*Question Statement - Implement 3 classes, storage counter and printer. The Storage class should store an integer. The Counter class should create a thread that starts counting from 0 (0 1 2 3..) and stores each value in the Storage class. The Printer class shiuld create a thread that keeps reading the value in Storage class and printing it. WAP that creates an instance of the Storage class and sets up a COunter and a Printer object to operate on it
*/
class Storage{
    int num=0;
    boolean counted = true; //first print 0
    public synchronized void put() throws InterruptedException{
        if(!counted){ //means we havent  counted and need to do that first
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Printer Output : "+num);
        counted=false;
        notify(); //number is ready to print
    }
    public synchronized void get() throws InterruptedException{
        if(counted){ //means we have alr counted and should print that number first
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        num++;
        counted=true;
        notify(); //number is ready to print
    }
}
class Counter extends Thread{
    Storage s;
    Counter(Storage s){
        this.s = s; //obj of storage passed in main now set as value of data member 
        //of counter of type storage
    }
    public void run(){
        int i=0;
        while(i<50){
            try{
                s.put();
            }
            catch(Exception e){
                System.out.println(e);
            }
            i++;
        }   
    }
}
class Printer extends Thread{
    Storage s;
    Printer(Storage s){
        this.s = s; //obj of storage passed in main now set as value of data member 
        //of counter of type storage
    }
    public void run(){
        int i=0;
        while(i<50){
            try{
                s.get();
            }
            catch(Exception e){
                System.out.println(e);
            }
            i++;
        }   
    }
}
class Main{
    public static void main(String[] args){
        Storage s = new Storage();
        Counter c = new Counter(s);
        Printer p = new Printer(s);
        c.start();
        p.start();
    }
}
