//class Node {
//    public int data;
//    public Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//class worktest {
//    public Node head;
//
//    public void addfrist(int data) {
//        Node node = new Node(data);
//        if (this.head == null) {
//            this.head = node;
//            return;
//        }
//        node.next = this.head;
//        this.head = node;
//    }
//
//    public void addlast(int data) {
//        Node node = new Node(data);
//        if (this.head == null) {
//            node = this.head;
//        } else {
//            while (this.head.next != null) {
//                this.head = this.head.next;
//            }
//            this.head.next = node;
//        }
//    }
//
//    public int size(Node headx) {
//        int l = 0;
//        while (this.head != null) {
//            this.head = this.head.next;
//            l++;
//        }
//        return l;
//    }
//
//
//    public void display(Node x) {
//        while (x!= null) {
//            System.out.print(x.data + " ");
//            x = x.next;
//        }
//    }
//
//    public Node looplink() {
//        Node cur = this.head;
//        Node fast = this.head;
//        Node slow = this.head;
//        while (true) {
//            if (fast.next.next == null || slow.next == null) {
//                return null;
//            } else {
//                if (fast.next.next.data != slow.next.data) {
//                    fast = fast.next.next;
//                    slow = slow.next;
//                } else {
//                    slow = fast;
//                    fast = cur;
//                    while (fast.data != slow.data) {
//                        fast = fast.next;
//                        slow = slow.next;
//                    }
//                    return fast;
//                }
//            }
//        }
//    }
//
//    public boolean hasloop() {
//        Node fast = this.head;
//        Node slow = this.head;
//        Node cur=this.head;
//        while(fast!=null ) {
//            if (fast.next == null) {
//                return false;
//            }
//            if (fast.next.next.data != slow.next.data) {
//                slow = slow.next;
//                fast = fast.next.next;
//            }
//        }
//      return true;
//    }
//    public Node commontNode(Node HeadA, Node HeadB) {
//        int a = size(HeadA);
//        int b = size(HeadB);
//        int c = 0;
//        if (a < b) {
//            c = b - c;
//        } else {
//            c = a - b;
//        }
//        if (a > b) {
//            while (c != 0) {
//                HeadA = HeadA.next;
//                c--;
//            }
//        } else {
//            while (c != 0) {
//                HeadB = HeadB.next;
//                c--;
//            }
//        }
//        while (HeadA.data != HeadB.data) {
//            HeadA = HeadA.next;
//            HeadB = HeadB.next;
//        }
//        return HeadA;
//    }
//
//    public boolean theLangauageOfTheMoslems() {
//        Node fast = null;
//        Node slow = null;
//        Node cur = this.head;
//        Node tail = null;
//        while (cur.next != null) {
//            fast = this.head;
//            slow = cur;
//            while (fast.next != null) {
//                fast = fast.next.next;
//                slow = slow.next;
//            }
//            if (fast.data == cur.data) {
//                fast = null;
//                cur = cur.next;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public Node deleteRepetitionNode() {
//        Node cur = this.head;
//        Node c = null;
//        Node remeber = this.head;
//        while (this.head != null) {
//            cur = this.head;
//            c = this.head;
//            while (cur != null) {
//                if (c.data == cur.next.data) {
//                    cur.next = cur.next.next;
//                    cur = cur.next;
//                }
//            }
//            this.head = this.head.next;
//        }
//        return remeber;
//    }
//
//    public Node devideTwo(int key) {
//        Node newHead = null;
//        Node cur = this.head;
//        while (cur != null) {
//            if (cur.data < key) {
//                cur = cur.next;
//            } else {
//                newHead = cur;
//                cur = cur.next.next;
//            }
//        }
//        return newHead;
//    }
//
//    public Node newlink(Node HaedA, Node HeadB) {
//        Node newHead = null;
//        while (HaedA != null && HeadB != null) {
//            if (HaedA.data >= HeadB.data) {
//                if (newHead == null) {
//                    newHead = HeadB;
//                    HeadB = HeadB.next;
//                    newHead = newHead.next;
//                } else {
//                    newHead = HeadB;
//                    HeadB = HeadB.next;
//                    newHead = newHead.next;
//                }
//            } else {
//                if (newHead == null) {
//                    newHead = HaedA;
//                    HaedA = HaedA.next;
//                    newHead = newHead.next;
//                } else {
//                    newHead = HaedA;
//                    HaedA = HaedA.next;
//                    newHead = newHead.next;
//                }
//            }
//        }
//        while(HaedA!=null || HeadB!=null){
//            if(HaedA==null ){
//                newHead=HeadB;
//                HeadB=HeadB.next;
//                newHead=newHead.next;
//            }
//            if(HeadB==null){
//                newHead=HaedA;
//                HaedA=HaedA.next;
//                newHead=newHead.next;
//            }
//        }
//        return newHead;
//    }
//    public Node index(int k){
//       int a=size(this.head);
//       int b=a-k;
//       while(b!=0){
//           this.head=this.head.next;
//           b--;
//        }
//       return this.head;
//    }
//    public Node midNode(){
//     Node fast=this.head;
//     Node slow=this.head;
//     while(fast.next!=null){
//         fast=fast.next.next;
//         slow=slow.next;
//       }
//     return slow;
//    }
//    public Node reverselik(){
//        Node cur=this.head;
//        Node newhead=null;
//        Node remeber=newhead;
//        int a=size(this.head);
//        int i=0;
//        while(a!=0){
//            i=a;
//            while (a!=0){
//                cur=cur.next;
//                a--;
//            }
//            newhead=cur;
//            newhead=newhead.next;
//            a--;
//        }
//       return remeber;
//    }
//    public Node deletekey(int key){
//        Node cur=this.head;
//        Node rember=this.head;
//        if(cur.data==key){
//            cur=null;
//        }
//        while(cur!=null){
//            if(cur.next.data==key){
//                cur.next=cur.next.next;
//            }else {
//                cur=cur.next;
//            }
//        }
//        return rember;
//    }
//
//}
//
//
//
//public class work {
//    public static void main(String[] args) {
//        worktest link=new worktest();
//        link.addfrist(10);
//        link.addfrist(20);
//        link.addfrist(30);
//        link.addfrist(10);
//        link.display(link.deletekey(10));
//        worktest link2=new worktest();
//    }
//}
