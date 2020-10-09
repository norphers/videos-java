package DominiVideos;

import java.awt.HeadlessException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		boolean newVideoChoice=false;
		int answerNewVideo;
		List<Video> videos; 
		
		User user1 = new User(null, null, null, null, null,null);
		
		user1.setFirstName(JOptionPane.showInputDialog("Add your name: "));

		user1.setLastName(JOptionPane.showInputDialog("Add your lastname: "));
		
		user1.setUserName(JOptionPane.showInputDialog("Add your user name: "));
		
		user1.setPassword(JOptionPane.showInputDialog("Add your password: "));
		
		user1.setRegisterDate();
		
		videos = new ArrayList<Video>();
		
		do {
			answerNewVideo=JOptionPane.showConfirmDialog(null, "\"Do you want to create a new video?");
			
			if(answerNewVideo==0) { 
				videos.add(createVideo(sc));
			}
			else if(answerNewVideo==1) { 
				newVideoChoice=true;
			}
		
		} while(newVideoChoice==false);	
		
		user1.addVideos(videos);
		
		System.out.println(user1.getVideoLibrary());
		//System.out.println(user1);
		
	}
	
	public static Video createVideo(Scanner sc) {
		
		String tag;
		String newTag;
		boolean tagGenerate=false;
		boolean tagVerification=false;
		int answerNewTag;
		List<String> videoTags = new ArrayList<>();
		Video video = new Video (null, null, videoTags);
		
		video.setTitle(JOptionPane.showInputDialog("Add a title"));
		
		video.setURL(JOptionPane.showInputDialog("Add a url"));
		
		do {
			do {
				tag=JOptionPane.showInputDialog("Add a tagg");
				
				Matcher m = Pattern.compile("^#").matcher(tag);
			      if (!(m.find())) {
			         System.err.println("A hashtag needs to begin with #");
			      } else {
			    	  videoTags.add(tag);
			    	  tagVerification=true;
			      }
			}while(tagVerification==false);
			
			answerNewTag=JOptionPane.showConfirmDialog(null, "\"Do you want to add a new tag?");
			
			if(answerNewTag==0) { 
				tagGenerate=false;
			}
			else if(answerNewTag==1) { 
				tagGenerate=true;
			}

		}while(tagGenerate==false);
		
		return video;
		
	}
	
}
