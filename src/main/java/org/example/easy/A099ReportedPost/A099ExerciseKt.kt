package org.example.easy.A099ReportedPost

class A099ExerciseKt {

    private fun getNumberOfReportedPosts(posts: Array<Post>?): Int {
        requireNotNull(posts)

        var count = 0
        // Implement the function to count reported posts
        for (post in posts) {
            if (post.isReported) {
                count++
            }
        }
        return count
    }

    class Post constructor(var postId: Int, var content: String, var isReported: Boolean = false) {
        fun reportPost() {
            isReported = true
        }
    }

    fun main() {
        // Test your function with sample inputs
        val post1 = Post(1, "This is post 1")
        val post2 = Post(2, "This is an inappropriate post")
        post2.reportPost()
        val post3 = Post(3, "This is post 3")

        val posts = arrayOf(post1, post2, post3)
        println(getNumberOfReportedPosts(posts))
    }
}