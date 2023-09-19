enum Color {
    RED,
    BLACK
}

class SimpleNode {
    int value;
    Color color;
    SimpleNode left;
    SimpleNode right;

    SimpleNode(int value, Color color) {
        this.value = value;
        this.color = color;
        this.left = null;
        this.right = null;
    }
}

public class SimpleRedBlackTreeExample {
    public static void printTree(SimpleNode node, String prefix) {
        if (node != null) {
            System.out.println(prefix + node.value + "(" + node.color + ")");
            printTree(node.left, prefix + "-");
            printTree(node.right, prefix + "-");
        }
    }

    // • Каждая нода имеет цвет (красный или черный)
    // • Корень дерева всегда черный
    // • Новая нода всегда красная
    // • Красные ноды могут быть только левым ребенком
    // • У краной ноды все дети черного цвета
    
    public static void main(String[] args) {
        // Корень дерева всегда черный
        SimpleNode root = new SimpleNode(10, Color.BLACK);

        // Красные ноды могут быть только левым ребенком
        root.left = new SimpleNode(5, Color.RED);

        // У красной ноды все дети черного цвета
        root.left.left = new SimpleNode(3, Color.BLACK);
        root.left.right = new SimpleNode(7, Color.BLACK);

        // Добавляем черный узел с красным левым ребенком
        root.right = new SimpleNode(15, Color.BLACK);
        root.right.left = new SimpleNode(13, Color.RED);

        // Новая нода всегда красная (добавляем к черному узлу)
        root.right.right = new SimpleNode(17, Color.RED);

        // Вывести дерево
        printTree(root, "");
    }
}