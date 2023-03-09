package resolves.hw2.advance;

import resolves.hw2.advance.models.Comment;
import resolves.hw2.advance.models.Post;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(12,1,"post1", "sdfsfsdfsdfsdf"));
        posts.add(new Post(12,2,"post2", "sdfsfsdfsdfsdf"));
        posts.add(new Post(12,3,"post3", "sdfsfsdfsdfsdf"));
        posts.add(new Post(12,4,"post4", "sdfsfsdfsdfsdf"));
        posts.add(new Post(12,5,"post5", "sdfsfsdfsdfsdf"));

        ArrayList<Comment> comments = new ArrayList<>();

        comments.add(new Comment(1, 1, "comment1", "sdfsf", "sdfsfsf"));
        comments.add(new Comment(1, 2, "comment1", "sdfsf", "sdfsfsf"));
        comments.add(new Comment(2, 3, "comment1", "sdfsf", "sdfsfsf"));
        comments.add(new Comment(2, 4, "comment1", "sdfsf", "sdfsfsf"));
        comments.add(new Comment(1, 5, "comment1", "sdfsf", "sdfsfsf"));
        comments.add(new Comment(2, 6, "comment1", "sdfsf", "sdfsfsf"));
        comments.add(new Comment(3, 7, "comment1", "sdfsf", "sdfsfsf"));
        comments.add(new Comment(1, 8, "comment1", "sdfsf", "sdfsfsf"));
        comments.add(new Comment(1, 9, "comment1", "sdfsf", "sdfsfsf"));


        for (Post post : posts) {
            for (Comment comment : comments) {
                if (post.getId() == comment.getPostId()){
                    post.getComments().add(comment);
                }
            }
        }

        for (Post post : posts) {
            System.out.println(post);
        }

    }



}
