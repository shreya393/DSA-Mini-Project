import java.util.*;

class cityNode{
	int cityNo;
	String cityName;
	cityNode next;
	
	public cityNode(cityNode v) {
		this.cityNo=v.cityNo;
		this.cityName=v.cityName;
		this.next=null;
	}
	
	public cityNode(int cityNo,String cityName) {
		this.cityNo=cityNo;
		this.cityName=cityName;
		this.next=null;
	}
}

class creation{
	
	
	Scanner sc = new Scanner(System.in);
    cityNode head[] = new cityNode[5]; // number of heads for creating adjacency list
    int c=5;// number of vertices total in graph
    int e=7;// number of edges
    int i;
    
	public void edgeCreate(cityNode u,cityNode v, int weight) {
		
			cityNode curr;
			//cityNode new_node=new cityNode(v);
        	for(i=0;i<c;i++) {
        		if(head[i].cityNo==u.cityNo) {
        			curr=head[i];
        			while(curr.next!=null) {
        				curr=curr.next;
        			}
        			curr.next=v;
        		}
        	}
        	
        	edgeCreate(v,u,weight);
        	
        	
//            if (head[1]==null) {//ie.for the first iteration we will create u node and since the
//            	//array will be empty so we will add in the head node
//            	head[1]=u;
//            	System.out.println(head[1].cityName+"**");
//            }
//
//            else {
//                cityNode curr = head[u.cityNo]; // node created for traversal
//                while (curr!= null) {
//                    curr = curr.next;
//                }
//                curr.next = v; // added the new node at the last of linked list
//            }
        }
    
//	
	
	 public void displayList() {
	    	System.out.println("Adjacency list: ");
	        for (int i = 0; i <c; i++) {
	            cityNode curr = head[i];
	            System.out.print(head[i].cityName + " ");
	            while (curr.next != null) {
	                curr = curr.next;
	                System.out.print("--> " + curr.cityName);
	            }
	            System.out.println();
	        }
	    }
	 
	 public void allCreate() {

		 cityNode c1=new cityNode(1,"pune");
		 head[0]=c1;
		 cityNode c2=new cityNode(2,"bangalore");
		 head[1]=c2;
		 cityNode c3=new cityNode(3,"delhi");
		 head[2]=c3;
		 cityNode c4=new cityNode(4,"indore");
		 head[3]=c4;
		 cityNode c5=new cityNode(5,"kashmir");
		 head[4]=c5;
		 
		 edgeCreate(c1,c2,30);
		 edgeCreate(c1,c3,20);
		 edgeCreate(c2,c3,50);
		 edgeCreate(c2,c4,30);
		 edgeCreate(c3,c4,30);
		 edgeCreate(c3,c5,10);
		 edgeCreate(c4,c5,20);
	 }
	 
	 void test() {
			for(int i=0;i<head.length;i++) {
				System.out.println(head[i].cityName);
				System.out.println(head[i].cityNo);
			}
	 }
}

public class graphCreated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		creation cr=new creation();
		cr.allCreate();
		cr.displayList();
		cr.test();
	}

}
