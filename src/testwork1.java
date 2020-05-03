public class testwork1 {
    public static void main(String[] args) {
        work1 link=new work1();
        link.addlast(10);
        link.addlast(20);
        link.addlast(30);
        link.addlast(40);
        Node HeadA=link.head;
        link.display();
        System.out.println();
        work1 link1=new work1();
        link1.addfrist(10);
        link1.addfrist(10);
        link1.addfrist(10);
        link1.addlast(20);
        link1.addlast(30);
        link1.addlast(40);
        link1.display();
        System.out.println();
        link1.display1(link1.deleteRepetitionNode());
        System.out.println();
        link1.display1(link1.devideTwo(20));
        System.out.println();
        link1.display();
        System.out.println();
        Node HeadB=link1.head;
        link1.display1(HeadB);
        System.out.println();
        link.display1(HeadA);
        System.out.println();
        link1.display1(link.newlink(HeadA,HeadB));
        System.out.println();

    }
}
