import java.util.*;

class Node{
	int No;
	String Name;
	Node next;
	char type;
	
	public Node(Node v) {
		this.No=v.No;
		this.Name=v.Name;
		this.next=null;
	}
	
	public Node(int No,String Name, char type) {
		this.No=No;
		this.Name=Name;
		this.type=type;
		this.next=null;
	}
}

class creation{
	
	int adjmat[][];
	Scanner sc = new Scanner(System.in);
    Node head[] = new Node[13]; // number of heads for creating adjacency list
    int c=13;// number of vertices total in graph
    int e=13;// number of edges
    int i;
    int j;
    
	public void edgeCreate(Node u,Node v, int weight) {
		
			

			//adjmat[(u.No)-1][(v.No)-1]=1;
			Node curr;
			Node new_node=new Node(v);
        	for(i=0;i<c;i++) {
        		if(head[i].No==u.No && head[i].type==u.type) {
        			curr=head[i];
        			while(curr.next!=null) {
        				curr=curr.next;
        			}
        			curr.next=new_node;
        		}
        	}
        }
    
	 public void displayList() {
	    	System.out.println("Adjacency list: ");
	        for (int i = 0; i <c; i++) {
	            Node curr = head[i];
	            System.out.print(curr.Name + " ");
	            while (curr.next != null) {
	                curr = curr.next;
	                System.out.print("--> " + curr.Name);
	            }
	            System.out.println();
	        }
	    }
	 
	 public void allCreate() {

		 Node c1=new Node(1,"pune",'c');
		 head[0]=c1;
		 Node c2=new Node(2,"bangalore",'c');
		 head[1]=c2;
		 Node c3=new Node(3,"delhi",'c');
		 head[2]=c3;
		 Node c4=new Node(4,"indore",'c');
		 head[3]=c4;
		 Node c5=new Node(5,"kashmir",'c');
		 head[4]=c5;
		 Node p1=new Node(1,"p1",'p');
		 head[5]=p1;
		 Node p2=new Node(2,"p2",'p');
		 head[6]=p2;
		 Node p3=new Node(3,"p3",'p');
		 head[7]=p3;
		 Node p4=new Node(4,"p4",'p');
		 head[8]=p4;
		 Node r1=new Node(1,"r1",'r');
		 head[9]=r1;
		 Node r2=new Node(2,"r2",'r');
		 head[10]=r2;
		 Node r3=new Node(3,"r3",'r');
		 head[11]=r3;
		 Node r4=new Node(4,"r4",'r');
		 head[12]=r4;
		
		 
		 
		 edgeCreate(c1,p1,500);
		 edgeCreate(p1,c1,500);
		 
		 edgeCreate(p1,r1,700);
		 edgeCreate(r1,p1,700);
		 
		 edgeCreate(r1,c3,200);
		 edgeCreate(c3,r1,200);
		 
		 edgeCreate(r1,c5,400);
		 edgeCreate(c5,r1,400);
		 
		 edgeCreate(c3,p2,600);
		 edgeCreate(p2,c3,600);
		 
		 edgeCreate(p2,r2,150);
		 edgeCreate(r2,p2,150);
		 
		 edgeCreate(r2,r3,800);
		 edgeCreate(r3,r2,800);
		 
		 edgeCreate(c4,r3,475);
		 edgeCreate(r3,c4,475);
		 
		 edgeCreate(c4,p3,725);
		 edgeCreate(p3,c4,725);
		 
		 edgeCreate(c2,p3,650);
		 edgeCreate(p3,c2,650);
		 
		 edgeCreate(c2,p4,570);
		 edgeCreate(p4,c2,570);
		 
		 edgeCreate(p4,r4,315);
		 edgeCreate(r4,p4,315);
		 
		 edgeCreate(p4,c5,740);
		 edgeCreate(c5,p4,740);
		 
		 edgeCreate(r1,c5,100);
		 edgeCreate(c5,r1,100);
	 }
	 


//	 void shortest() {
//		 adjmat=new int[13][13];
//}
}	
public class graphCreated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		creation cr=new creation();
		cr.allCreate();
		cr.displayList();
		//cr.test();
	}

}
