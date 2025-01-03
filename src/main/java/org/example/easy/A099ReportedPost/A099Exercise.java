package org.example.easy.A099ReportedPost;

public class A099Exercise {
    public static class Post {
        // Define the attributes and methods for the Post class
        public int postId;
        public String content;
        public boolean isReported;

        public Post(int postId, String content) {
            this.postId = postId;
            this.content = content;
            this.isReported = false;
        }

        public void reportPost() {
            this.isReported = true;
        }
    }

    public static int getNumberOfReportedPosts(Post[] posts) {

        if (posts == null) throw new IllegalArgumentException();

        int count = 0;
        // Implement the function to count reported posts
        for (Post post : posts) {
            if (post.isReported) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        Post post1 = new Post(1, "This is post 1");
        Post post2 = new Post(2, "This is an inappropriate post");
        post2.reportPost();
        Post post3 = new Post(3, "This is post 3");

        Post[] posts = {post1, post2, post3};
        System.out.println(getNumberOfReportedPosts(posts));
    }
}
