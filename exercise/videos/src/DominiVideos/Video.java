package DominiVideos;

import java.util.*;

public class Video {
	
	private String title;
	private String url;
	private List<String> tags = new ArrayList<String>();

	public Video(String title, String url,List<String> tags) {
		this.title=title;
		this.url=url;
		this.tags=tags;
	}

	public void setTitle(String title) {
		this.title=title;
	}
	
	public void setURL(String url) {
		this.url=url;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getURL() {
		return url;
	}
	
	
	public String toString() {
		return "Video [title=" + title + ", url=" + url + ", tags=" + tags + "]";
	}
	

}
