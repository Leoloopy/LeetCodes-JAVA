public class LinkedList {
private class Node{
        private int value;
        private Node next;
    public Node(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
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

    @Override
    public String toString() {
        return "LinkedList{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }

    public static void main(String[] args) {
        LinkedList newList = new LinkedList();
        newList.addLast(10);
        newList.addLast(20);
        newList.addLast(30);
        System.out.println(newList);
    }
}

