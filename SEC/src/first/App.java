package first;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class App {
public static void main(String args[]) {
	Queue<Person> queue=new  LinkedList<Person>();
	System.out.println( "pranx");
	Person p1=new Person("ram", "ram@gmail.com", "113",1);
	Person p2=new Person("sham", "sham@gmail.com", "123",2);
	Person p3=new Person("sita", "sita@gmail.com", "133",4);
	Person p4=new Person("gita", "gita@gmail.com", "143",3);
	
	
	queue.add(p1);
	queue.add(p2);
	queue.add(p3);
	queue.add(p4);
	System.out.println(queue.toString());
	queue.remove(1);
	
	System.out.println("\n"+queue.toString());
	 JFrame f= new JFrame("TextField Example");  
	  //  JTextField t1,t2;  
	    for  (Person person : queue) { System.out.println(person.toString());
	    	JTextField	t1= new JTextField(person.toString());
			t1.setBounds(50,100, 200,100);  
		    f.add(t1);
		    
	    }
	 //   t1=new JTextField("Welcome to Javatpoint.");  
	  //  t1.setBounds(50,100, 200,30);  
	    //t2=new JTextField("AWT Tutorial");  
	   // t2.setBounds(50,150, 200,30);  
	    //f.add(t1); f.add(t2);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	
}
}
