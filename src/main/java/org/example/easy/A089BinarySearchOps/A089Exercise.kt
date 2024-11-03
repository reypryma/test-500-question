package org.example.easy.A089BinarySearchOps

import kotlin.math.abs

class A089Exercise {
    inner class TreeNode internal constructor(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun closestValue(root: TreeNode?, target: Double): Int {
        var root = root
        var `val`: Int
        var closest = root!!.`val`
        while (root != null) {
            `val` = root.`val`
            closest = if (abs(`val` - target) < abs(closest - target)) `val` else closest
            root = if (target < `val`) root.left else root.right
        }
        return closest
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // Sample tree construction and test
            val ex = A089Exercise()
            val root = ex.TreeNode(4)
            root.left = ex.TreeNode(2)
            root.right = ex.TreeNode(5)
            root.left!!.left = ex.TreeNode(1)
            root.left!!.right = ex.TreeNode(3)

            println(ex.closestValue(root, 3.714286))
        }
    }
}