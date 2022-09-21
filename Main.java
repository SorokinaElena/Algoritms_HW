package algoritms.lesson_15092011_trees.hw;

public class Main {
    public static void main(String[] args) {

        Tree treeTest = new Tree();
        treeTest.insert(10);
        treeTest.insert(8);
        treeTest.insert(9);
        treeTest.insert(3);
        treeTest.insert(1);
        treeTest.insert(7);
        treeTest.insert(11);


        System.out.println(treeTest.checkValue(11));

    }

}
