package renu.gusain;

public class IntMap {
    private  Node[]table;
    int size=0;
    public void put(Integer key,Integer value)
    {
        int hash=getHast(key);

        Node head=table[hash];
        Node currentNode=head;

        while (currentNode!=null)
        {
            if(currentNode.key==key)
            {
                currentNode.value=value;
                return ;
            }
        }
        table[hash]=new Node(key,value,head);
        size++;


    }

    private int getHast(Integer key) {
            return key == null ? 0 : Math.abs(key.hashCode() % table.length);
    }


    static class Node
    {
        Integer key;
        Integer value;
        Node next;
        Node(int key,int value,Node next)
        {
            this.key=key;
            this.value=value;
            this.next=next;
        }

    }
}

