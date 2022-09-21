package algoritms.lesson_15092011_trees.hw;

public class Tree {

    protected TreeNode root;


    public void insert(int value) {
        TreeNode temp = new TreeNode();// создаем новый элемент, тк нужно куда-то добавлять новый элемент
        temp.value = value;
        if (root == null) {
            // Дерево пока пустое и значит новый элемент temp
            // есть теперь root
            root = temp;
        } else {
            // В дереве уже существуют элементы и нужно найти
            // подходящее место для вставки нашего temp
            TreeNode p = root;
            while (true) {
                if (value < p.value) {
                    // Идем влево от p
                    if (p.leftChild != null) {
                        // Влево от p занято
                        p = p.leftChild;
                    } else {
                        // Влево от p свободно
                        p.leftChild = temp;
                        return;
                    }
                } else {
                    // Идем вправо от p
                    if (p.rightChild != null) {
                        // Вправо от p занято
                        p = p.rightChild;
                    } else {
                        // Вправо от p свободно
                        p.rightChild = temp;
                        return;
                    }
                }
            }
        }
    }

    public boolean checkValue(int value) {
        TreeNode p = root;

        while (true) {
            if (value == p.value) {
                return true;
            } else if (p.leftChild != null && value <= p.value) {
                p = p.leftChild;
            }
            else if (p.rightChild != null && value > p.value){
                p = p.rightChild;

            } else return false;

        }
    }

    private class TreeNode {
        int value;
        TreeNode leftChild;
        TreeNode rightChild;
    }
}
