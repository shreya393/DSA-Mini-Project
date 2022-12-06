import java.util.*;



class cityNode{
	int cityNo;
	//String cityName;
	cityNode next;
	
	public cityNode(int v) {
		this.cityNo=v;
		//this.cityName=v.cityName;
		this.next=null;
	}
	
	/*public cityNode(int cityNo,String cityName) {
		this.cityNo=cityNo;
		this.cityName=cityName;
		this.next=null;
	}*/
}

class creation{
	
	
	Scanner sc = new Scanner(System.in);
    cityNode head[] = new cityNode[12]; // number of heads for creating adjacency list
    int c=11;// number of vertices total in graph
    int e=13;// number of edges
    
    //for matrix representation
    int adjMatrix[][];
	
	public void edgeCreate(int u,int v) {
        cityNode temp = new cityNode(v);
        if (head[u]==null) {//ie.for the first iteration we will create u node and since the
        	//array will be empty so we will add in the head node
        	head[u]=temp;
        }

        else {
            cityNode curr = head[u]; // node created for traversal
            while (curr.next != null &&  curr!=null) {
                curr = curr.next;
            }
            curr.next = temp; // added the new node at the last of linked list
        }
    }
	
	 public void displayList() {
	    	System.out.println("Adjacency List: ");
	        for (int i = 1; i <=c; i++) {
	            cityNode curr = head[i];
	            System.out.print(i + " ");
	            while (curr != null) {
	                System.out.print("-->" + curr.cityNo);
	                curr = curr.next;
	            }
	            System.out.println();
	        }
	    }
	
	
	
	

}


public class graphCreated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cityNode c1=new cityNode(1);
		cityNode c2=new cityNode(2);
		cityNode c3=new cityNode(3);
		cityNode c4=new cityNode(4);
		cityNode c5=new cityNode(5);
		cityNode c6=new cityNode(6);
		cityNode c7=new cityNode(7);
		cityNode c8=new cityNode(8);
		cityNode c9=new cityNode(9);
		cityNode c10=new cityNode(10);
		cityNode c11=new cityNode(11);
		creation cr=new creation();
		cr.edgeCreate(c1.cityNo,c7.cityNo);
		cr.edgeCreate(c1.cityNo,c8.cityNo);
		cr.edgeCreate(c2.cityNo,c3.cityNo);
		cr.edgeCreate(c2.cityNo,c5.cityNo);
		cr.edgeCreate(c3.cityNo,c2.cityNo);
		cr.edgeCreate(c3.cityNo,c8.cityNo);
		cr.edgeCreate(c3.cityNo,c6.cityNo);
		cr.edgeCreate(c4.cityNo,c11.cityNo);
		cr.edgeCreate(c4.cityNo,c9.cityNo);
		cr.edgeCreate(c5.cityNo,c10.cityNo);
		cr.edgeCreate(c5.cityNo,c2.cityNo);
		cr.edgeCreate(c6.cityNo,c3.cityNo);
		cr.edgeCreate(c6.cityNo,c9.cityNo);
		cr.edgeCreate(c7.cityNo,c10.cityNo);
		cr.edgeCreate(c7.cityNo,c1.cityNo);
		cr.edgeCreate(c8.cityNo,c3.cityNo);
		cr.edgeCreate(c8.cityNo,c1.cityNo);
		cr.edgeCreate(c9.cityNo,c6.cityNo);
		cr.edgeCreate(c9.cityNo,c4.cityNo);
		cr.edgeCreate(c10.cityNo,c5.cityNo);
		cr.edgeCreate(c10.cityNo,c7.cityNo);
		cr.edgeCreate(c10.cityNo,c11.cityNo);
		cr.edgeCreate(c11.cityNo,c6.cityNo);
		cr.edgeCreate(c11.cityNo,c4.cityNo);
		cr.edgeCreate(c11.cityNo,c10.cityNo);
		cr.displayList();
	}

}
