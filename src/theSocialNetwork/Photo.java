package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Photo extends Post {
	
	private String pictureFileName;
	private String headline;
	private ArrayList<Photo> photos;
	
	public Photo(int likes, User author, ArrayList<Comment> comments, LocalDate timestamp) {
		super(likes, author, comments, timestamp);
	}

	public String getPictureFileName() {
		return pictureFileName;
	}

	public void setPictureFileName(String pictureFileName) {
		this.pictureFileName = pictureFileName;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String toString() {
		String tmp = "Photo(s): ";
		for(Photo ph : photos) {
			User author = ph.getAuthor();
			String headline = ph.getHeadline();
			String picture = ph.getPictureFileName();
			LocalDate timestamp = ph.getTimestamp();
			int likes = ph.getLikes();
			tmp = tmp + "\n\tVerfasst von: " + author +
					"\n\t" + headline +
					"\n\t" + picture +
					"\n\tDatum: " + timestamp +
					" | <3" + likes;
		}
		return tmp;
	}
	
	
	
	
	

}
