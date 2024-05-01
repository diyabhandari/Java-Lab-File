class Queue{ //repr a buffer q
  int i;
  boolean flag=false; //false by default cuz q starts as //empty
  public synchronized void get()throws InterruptedException{
      while(!flag){ //true means theres smth in q we can print or consume
          wait();
      }
      flag=false; //we have consumed, there might not //be anything left in buffer, there is atleast one more //space
      System.out.println("Consumer  : "+i); //print val consumed
      notify(); //now the q is def not full, we can //add/produce another val
  }
  public synchronized void put(int i)throws InterruptedException{ //only one thread at a time enters
    while(flag){ //there might not be spaces left
      wait();
    }
    this.i=i; //value passed is produced
    flag=true; //now that weve produced, there //might not be spaces left
    System.out.println("Producer : "+ i); //num produced
    notify(); //there is atleast one val in  q and //can be consumed    
  } 
}
class Consumer implements Runnable{ //consumer is a thread
  Queue q;
  Consumer(Queue q){ //rmr how we created thread of runnable interface, we passed a bullet and loaded in the gun thread()
      this.q=q;
      Thread t=new Thread(this,"Consumer");//gun, loaded here, so we don’t need to type this again in main, like we had been doing
      t.start(); //don’t need to type this in main either again, mist start here if declaring thread() here
  }  
  public void run(){
      int i=0;
      while(i<=5){ //queue size is 6, and this tries to consume all 5 values as long as they are available
          try{
          q.get(); //in try because it uses throws
//get method of class que called using an obj of que that we passed earlier into our data member of type que
          i++;
        }catch(InterruptedException e){
          e.printStackTrace();
        }
      }
  }
}
class Producer implements Runnable{
  Queue q;
  Producer(Queue q){
      this.q=q;
      Thread t=new Thread(this,"Producer");
      t.start();
  } 
  public void run(){
      int i=0;
      while(i<=5){ //tries to put in all 6 values at once if space is available
          try{
            q.put(i++);  //I is incremented after function execution
          }catch(InterruptedException e){
            e.printStackTrace();
          }      
      }    
    }    
}
class PC {
  public static void main(String[] args) {
     Queue q=new Queue();
     Producer P=new Producer(q);
     Consumer C=new Consumer(q); 
  } 
}


