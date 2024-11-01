package org.example.easy.A089BinarySearchOps;

import org.jetbrains.annotations.Nullable;

public class A089ExerciseJ {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int closestValue(TreeNode root, double target) {
        int val, closest = root.val;

        while (root != null) {
            val = root.val;
            closest = (Math.abs(val - target) < Math.abs(closest - target)) ? val : closest;
            root = (root.val < target) ? root.right : root.left;
        }

        return closest;
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        A089ExerciseJ ex = new A089ExerciseJ();
        TreeNode root = ex.new TreeNode(4);
        root.left = ex.new TreeNode(2);
        root.right = ex.new TreeNode(5);
        root.left.left = ex.new TreeNode(1);
        root.left.right = ex.new TreeNode(3);

        System.out.println(ex.closestValue(root, 3.714286));
    }
}
