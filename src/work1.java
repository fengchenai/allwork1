class Node {
    public int data;
    public Node next;
    public Node(int data){
     this.data=data;
     this.next=null;
    }
}
public  class work1 {
    public Node head;

    public void addfrist(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if (cur == null) {
            cur = node;
            this.head = cur;
        } else {
            node.next = cur;
            this.head = node;
        }
    }

    public void addlast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if (cur == null) {
            cur = node;
            this.head = cur;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public int size(Node HeadX) {
        int l = 0;
        while (HeadX != null) {
            HeadX = HeadX.next;
            l++;
        }
        return l;
    }

    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    public void display1(Node HeadX) {
        while (HeadX != null) {
            System.out.print(HeadX.data + " ");
            HeadX = HeadX.next;
        }
    }


    public Node loopNode() {
        Node fast = this.head;
        Node slow = this.head;
        while (true) {
            if (fast == null) {
                throw new RuntimeException("没有环");
            } else {
                if (fast.next.next != slow.next) {
                    fast = fast.next.next;
                    slow = slow.next;
                } else {
                    slow = fast.next.next;
                    fast = this.head;
                    while (fast != slow) {
                        fast = fast.next;
                        slow = slow.next;
                    }
                    return fast;
                }
            }
        }
    }

    public boolean hasloop() {
        Node fast = this.head;
        Node slow = this.head;
        while (true) {
            if (fast == null) {
                return false;
            } else {
                if (fast.next.next != slow.next) {
                    fast = fast.next.next;
                    slow = slow.next;
                } else {
                    return true;
                }
            }
        }
    }

    public Node commontNode(Node HeadA, Node HeadB) {
        int c = 0;
        int a = size(HeadA);
        int b = size(HeadB);
        if (a >= b) {
            c = a - b;
            while (c != 0) {
                HeadA = HeadA.next;
                c--;
            }
        } else {
            c = b - a;
            while (c != 0) {
                HeadB = HeadB.next;
                c--;
            }
        }
        while (true) {
            if (HeadA == HeadB && HeadA.next != null) {
                return HeadA;
            } else {
                if (HeadA.next == null) {
                    throw new RuntimeException("两个单链表没有交点");
                } else {
                    HeadA = HeadA.next;
                    HeadB = HeadB.next;
                }
            }
        }
    }
    public Node deleteRepetitionNode() {
        Node newHead = null;
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.data == cur.next.data) {
                cur = cur.next;
            } else {
                if (newHead == null) {
                    newHead = cur;
                    this.head = newHead;
                    newHead = newHead.next;
                    cur = cur.next;
                } else {
                    newHead = cur;
                    newHead = newHead.next;
                    cur = cur.next;
                }
            }
        }
        if (newHead == null) {
            newHead = cur;
            this.head = newHead;
        }
        return this.head;
    }
    public Node devideTwo(int key){
        Node newHead=null;
        Node cur=this.head;
        Node cur1=null;
        while(cur!=null && cur.next!=null){
            if(cur.next.data<key){
                this.head=cur;
                cur=cur.next;
            }else {
                if (newHead == null) {
                    newHead = cur.next;
                    cur1=newHead;
                    newHead = newHead.next;
                } else {
                    newHead = cur.next;
                    newHead = newHead.next;
                }
                cur.next=cur.next.next;
            }
        }
        return cur1;
    }
    public Node newlink(Node HaedA, Node HeadB) {
        Node newHead = null;
        Node cur=null;
        while (HaedA != null && HeadB != null) {
            if (HaedA.data >= HeadB.data) {
                if (newHead == null) {
                    newHead = HeadB;
                    cur=newHead;
                    HeadB = HeadB.next;
                } else {
                    newHead.next = HeadB;
                    HeadB = HeadB.next;
                    newHead = newHead.next;
                }
            } else {
                if (newHead == null) {
                    newHead = HaedA;
                    cur=newHead;
                    HaedA = HaedA.next;
                } else {
                    newHead.next = HaedA;
                    HaedA = HaedA.next;
                    newHead = newHead.next;
                }
            }
        }
            if(HaedA==null ) {
                if (newHead == null) {
                    newHead = HeadB;
                    cur=newHead;
                    return cur;
                } else {
                    newHead.next = HaedA;
                    return cur;
                }
            }else {
                if(newHead==null){
                    newHead=HaedA;
                    cur=newHead;
                    return cur;
                }else {
                    newHead.next=HaedA;
                    return cur;
                }
            }
    }
    public Node indexkey(int k){
        Node cur=this.head;
        int a=this.size(this.head);
        int b=0;
        if (k<0 && k>a){
            throw new RuntimeException("k的值不合法");
        }else {
            b=a-k;
            while (b!=0){
               cur=cur.next;
               b--;
            }
        }
        return cur;
    }
    public Node midNode(){
        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
//    public Node reversrlink(){
//        Node cur=null;
//        Node curNext=null;
//        Node temp=this.head;
//        cur=this.head.next;
//        while(temp!=null){
//            curNext=cur.next;
//            cur.next=temp;
//            temp=cur;
//            cur=curNext;
//        }
//        return temp;
//    }

    public Node deleterepetitionkey(int data) {
       Node cur = this.head;
       while (cur != null && cur.next != null) {
          if (cur.next.data == data) {
              cur = cur.next.next;
          }else {
              cur = cur.next;
          }
      }
      if (this.head!=null && this.head.data==data ) {
        this.head = this.head.next;
        return this.head;
      }else {
          if (this.head==null){
              return null;
          }else {
              return this.head;
          }
      }

  }
}
//   public boolean huiwen(){
//        if (this.head==null){
//            return false;
//        }
//        if(this.head.next==null){
//            return true;
//        }
//        Node fast=this.head;
//        Node slow=this.head;
//        Node cur=null;
//        Node curNext=null;
//        while ( fast!=null && fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        cur=slow.next;
//        while (cur !=null){
//            curNext=cur.next;
//            cur.next=slow;
//            slow=cur;
//            cur=curNext;
//        }
//        while(slow!=this.head){
//            if (slow.data!=this.head.data){
//                return false;
//            }
//            if(this.head.next==slow){
//                return true;
//            }
//            slow=slow.next;
//            this.head=this.head.next;
//        }
//        return true;
//   }