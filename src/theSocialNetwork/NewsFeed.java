package theSocialNetwork;

import java.util.ArrayList;

public class NewsFeed {

	private ArrayList<Post> posts;
	
	public NewsFeed() {
		this.posts = new ArrayList<Post>();
	}
	
	public NewsFeed(ArrayList<Post> posts) {
		super();
		this.posts= posts;
	}
	
	public ArrayList<Post> getPosts() {
		return posts;
	}

	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}
	
	/*
	 * lets you add Posts
	 * @param p
	 */
	public void addPost(Post p) {
		posts.add(p);
	}
	
	/**
	 * lets you remove Posts
	 * @param p
	 */
	public void deletePost(Post p) {
		posts.remove(p);
	}
	
	/*
	 * Prints out the news feed
	 */
	public void printNewsFeed() {
		for(Post p : posts) {
			System.out.println(p.toString());
		}
		
	}
}
