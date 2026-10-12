/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null){
            return null;
        }

        flattenDFS(head);
        return head;
    }

    private Node flattenDFS(Node head){
        Node curr = head;
        Node tail = null;

        while(curr!= null){
            if(curr.child != null){
                Node nextNode = curr.next;
                Node childHead = curr.child;
                Node childTail = flattenDFS(childHead);

                curr.next = childHead;
                childHead.prev = curr;
                curr.child = null;

                childTail.next = nextNode;
                if(nextNode != null){
                    nextNode.prev = childTail;
                }

                curr = childTail;
            }
            tail = curr;
            curr = curr.next;

        }
        return tail;
        }
    }
