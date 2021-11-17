package collections;



	
	    public class ex implements Runnable  
	    {    
	    public void run()  
	    {    
	    System.out.println("Now the thread is running ...");    
	    }    
	        
	   
	    public static void main(String argvs[])  
	    {   
	    // creating an object of the class ex  
	    	Runnable r1 = new ex();   
	      
	    // creating an object of the class Thread using Thread(Runnable r, String name)  
//	    Thread th1 = new Thread(r1, "My new thread");    
	      
	    // the start() method moves the thread to the active state  
	   r1.run();  
	    	
	      
	    // getting the thread name by invoking the getName() method  
//	    String str = r1.getName();  
//	    System.out.println(str);  
	    }    
	    }    
	


