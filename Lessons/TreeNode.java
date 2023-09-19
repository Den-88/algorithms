// Класс для представления узла дерева
public class TreeNode {
    int value; // Значение, которое хранит узел
    TreeNode left; // Ссылка на левый дочерний узел
    TreeNode right; // Ссылка на правый дочерний узел

    // Конструктор для создания нового узла с заданным значением
    public TreeNode(int value) {
        this.value = value; // Инициализируем значение узла
        this.left = null; // У нового узла еще нет левого дочернего узла
        this.right = null; // У нового узла еще нет правого дочернего узла
    }

    // Метод для обхода дерева в прямом порядке (Preorder)
    public static void preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " "); // Посещаем корень
            preorder(node.left); // Обходим левое поддерево
            preorder(node.right); // Обходим правое поддерево
        }
    }

    // Метод для обхода дерева в симметричном порядке (Inorder)
    public static void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left); // Обходим левое поддерево
            System.out.print(node.value + " "); // Посещаем корень
            inorder(node.right); // Обходим правое поддерево
        }
    }

    // Метод для обхода дерева в обратном порядке (Postorder)
    public static void postorder(TreeNode node) {
        if (node != null) {
            postorder(node.left); // Обходим левое поддерево
            postorder(node.right); // Обходим правое поддерево
            System.out.print(node.value + " "); // Посещаем корень
        }
    }

    // Главный класс для демонстрации работы с деревом
    public static void main(String[] args) {
        // // Создаем корневой узел дерева со значением 1
        // TreeNode root = new TreeNode(1);

        // // Добавляем дочерние узлы к корневому узлу
        // root.left = new TreeNode(2); // Левый дочерний узел со значением 2
        // root.right = new TreeNode(3); // Правый дочерний узел со значением 3

        // // Для узла со значением 2 (левого дочернего узла корневого узла) также
        // создаем
        // // дочерние узлы
        // root.left.left = new TreeNode(4); // Левый дочерний узел узла со значением 2
        // root.left.right = new TreeNode(5); // Правый дочерний узел узла со значением
        // 2

        // // Для узла со значением 3 (правого дочернего узла корневого узла) также
        // создаем
        // // дочерние узлы
        // root.right.left = new TreeNode(6); // Левый дочерний узел узла со значением 3
        // root.right.right = new TreeNode(7); // Правый дочерний узел узла со значением
        // 3

        // В этот момент у нас есть дерево следующей структуры:
        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7

        // Далее, можно продолжить добавление узлов для создания более полного и
        // богатого дерева.

        // Создаем корневой узел со значением 1
        TreeNode root = new TreeNode(1);

        // Дочерние узлы уровня 1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        // Дочерние узлы уровня 2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Дочерние узлы уровня 3
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);

        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);
        root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);

        // Дочерние узлы уровня 4
        root.left.left.left.left = new TreeNode(16);
        root.left.left.left.right = new TreeNode(17);

        root.right.right.right.left = new TreeNode(18);
        root.right.right.right.right = new TreeNode(19);

        root.left.left.right.right = new TreeNode(20);

        root.left.left.left.left.left = new TreeNode(21);
        root.left.left.left.left.right = new TreeNode(22);
        root.left.left.left.right.left = new TreeNode(23);
        root.left.left.left.right.right = new TreeNode(24);
        root.left.left.right.right.left = new TreeNode(25);
        root.left.left.right.right.right = new TreeNode(26);
        root.right.right.right.left.left = new TreeNode(27);
        root.right.right.right.left.right = new TreeNode(28);
        root.right.right.right.right.left = new TreeNode(29);
        root.right.right.right.right.right = new TreeNode(30);

        // Добавим дочерние узлы для уровня 6
        root.left.left.left.left.left.left = new TreeNode(31);
        root.left.left.left.left.left.right = new TreeNode(32);
        root.left.left.left.left.right.left = new TreeNode(33);
        root.left.left.left.left.right.right = new TreeNode(34);
        root.left.left.left.right.right.left = new TreeNode(35);
        root.left.left.left.right.right.right = new TreeNode(36);
        root.right.right.right.left.left.left = new TreeNode(37);
        root.right.right.right.left.left.right = new TreeNode(38);
        root.right.right.right.left.right.left = new TreeNode(39);
        root.right.right.right.left.right.right = new TreeNode(40);

        // Добавим дочерние узлы для уровня 7
        root.left.left.left.left.left.left.left = new TreeNode(41);
        root.left.left.left.left.left.left.right = new TreeNode(42);
        root.left.left.left.left.left.right.left = new TreeNode(43);
        root.left.left.left.left.left.right.right = new TreeNode(44);
        root.right.right.right.left.left.left.left = new TreeNode(45);
        root.right.right.right.left.left.left.right = new TreeNode(46);
        root.right.right.right.left.left.right.left = new TreeNode(47);
        root.right.right.right.left.left.right.right = new TreeNode(48);
        root.right.right.right.left.right.left.left = new TreeNode(49);
        root.right.right.right.left.right.left.right = new TreeNode(50);


        //               1
        //          /       \
        //         2          3
        //        / \        /  \
        //       4   5      6    7
        //      / \ / \    / \   / \
        //     8  9 10 11 12 13 14 15
        //    / \  \               / \
        //   16 17  20            18 19 
    

    System.out.println("Preorder обход:");

    preorder(root);

    System.out.println("\nInorder обход:");
    inorder(root);

    System.out.println("\nPostorder обход:");
    postorder(root);

    }
}