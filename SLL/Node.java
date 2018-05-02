public class Node{
    private Integer val;
    private Node next;

    public Node(Integer valParam){
        this.val = valParam;
        this.next = null;
    }

    public Node(){
        this.val = null;
        this.next = null;
    }

    public Integer getVal(){
        return this.val;
    }

    public void setVal(Integer valParam){
        this.val = valParam;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node nodeParam){
        this.next = nodeParam;
    }

    public void setNext(){
        this.next = null;
    }
}