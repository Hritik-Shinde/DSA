/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // brute force
        // HashMap<Node,Node> mpp = new HashMap<>();
        // Node curr = head;
        // while(curr != null){
        //     mpp.put(curr,new Node(curr.val));
        //     curr = curr.next;
        // }

        // curr = head;

        // while(curr != null){
        //     Node newNode = mpp.get(curr);
        //  //   newNode.val = mpp.get(curr.val);
        //     newNode.next = mpp.get(curr.next);
        //     newNode.random = mpp.get(curr.random);
        //     curr = curr.next;
        // }

        // return mpp.get(head);

        // optimise
        if(head == null){
            return null;
        }

        // create an copy
        Node original = head;
        while(original != null){
            Node temp = original.next;
            Node copy = new Node(original.val);
            original.next = copy;
            copy.next = temp;

            original = temp;
        }

        // assign random pointer copy  nodes

        original = head;
        while(original != null){
            Node copy = original.next;

            copy.random = original.random == null ? null : original.random.next;

            original = copy.next;
        }

        original = head;
        Node copyHead = head.next;
        Node copy = copyHead;

        while(original != null){
             original.next = original.next.next;

            copy.next = copy.next == null
                    ? null
                    : copy.next.next;

            original = original.next;
            copy = copy.next;
        }

          return copyHead;
    }
}