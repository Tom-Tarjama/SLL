public class SLL{
    private Node head;

    public SLL(){
        this.head = null;
    }

    public SLL addNode(Integer valParam){
        if(this.head == null){
            this.head = new Node(valParam);
            return this;
        }
        Node runner = this.head;
        while(runner.getNext() !=null){
            runner = runner.getNext();
        }
        runner.setNext(new Node(valParam));
        return this;
    }

    public String removeNode(){
        if(this.head == null){
            return "SLL is empty; cannot remove Node";
        }
        else if(this.head.getNext() == null){
            this.head = null;
            System.out.print("HERE");
            return "Node removed";
        }
        else{
             Node runner = this.head;
             Node previous = this.head;
             while(runner.getNext()!= null){
                previous = runner;
                runner = runner.getNext();
            }
        previous.setNext();
        return "Node removed";
        }
    }

    public void printValues(){
        if(this.head == null){
            System.out.println("The SLL is empty");
        }
        Node runner = this.head;
        Integer counter = 1;
        while(runner !=null){
            System.out.println("Node "+counter+": "+runner.getVal());
            counter ++;
            runner = runner.getNext();
        }
    }

    public Node findNode(Integer valParam){
        if(this.head == null){
            System.out.println("SLL is empty");
            return null;
        }
        Node runner = this.head;
        while(runner !=null){
            if(runner.getVal() == valParam){
                System.out.println("Node located");
                return runner;
            }
            else{
                runner = runner.getNext();
            }
        }
        System.out.println("Node value not located");
        return null;
    }

    public void removeAt(Integer idxParam){

        if(this.head == null){
            System.out.println("SLL is empty; cannot remove node");
        }
        Node runner = this.head;
        Node runner2 = this.head;
        Integer idx =0;
        while(runner != null){
            if(idx == idxParam){
                runner.setNext(runner.getNext());
                System.out.println("Node located and removed");
            }
            else{
                runner2 = runner;
                runner =runner.getNext();
            }
        }
        System.out.println("No node at that index");
    }
}