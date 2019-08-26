public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(41);
        root.right = new TreeNode(57);

        insert(root, new TreeNode(66));

        System.out.println(root.toString());
        System.out.println(search(root, 57));
    }

    private static void insert(TreeNode root, TreeNode n) {
        while (root != null) {
            if (n.value < root.value) {
                if (root.left != null) {
                    root = root.left;
                } else {
                    root.left = n;
                    break;
                }
            } else {
                if (root.right != null) {
                    root = root.right;
                } else {
                    root.right = n;
                    break;
                }
            }
        }
    }

    private static TreeNode search(TreeNode node, int value) {
        while (node != null) {
            if (node.value < value) {
                node = node.right;
            } else if (node.value > value) {
                node = node.left;
            } else {
                return node;
            }
        }

        return null;
    }

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
