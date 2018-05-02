public class SLLTest{
    public static void main(String[] args){
        SLL a = new SLL();
        a.addNode(2);
        System.out.println(a.removeNode());
        a.addNode(3);
        a.addNode(4);
        a.printValues();
        // a.addNode(5);
        // a.printValues();
        // System.out.println(a.removeNode());
        // a.printValues();
        // a.addNode(8);
        // a.printValues();
        // System.out.println(a.findNode(3));
    }
}