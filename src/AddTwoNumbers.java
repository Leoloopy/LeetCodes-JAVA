


/*
public class AddTwoNumbers{
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
    }
}




class LinkedList{
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
    //head
    private Node first;
    //tail
    private Node last;


    public void addLast(int item){
        var node  = new Node(item);
        if (isEmpty()){
            first =last =node;
        }else{
            last.next = node;
            last = node;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void addFirst(int item){
        var node  = new Node(item);
        if (isEmpty()) {
            first  = last = node;
        } else  {
            node.next = first;
            first = node;
        }

    }



}

 */