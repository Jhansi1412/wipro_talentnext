package MiniProject;

public class Videovc {
	 private String videoName;
	    private boolean checkout;
	    private int rating;
	    public Videovc(String name) {
	        videoName = name;
	        checkout = false;
	        rating = -1; 
	    }
	    public String getName() {
	        return videoName;
	    }

	    public void doCheckout() {
	        checkout = true; 
	    }

	    public void doReturn() {
	        checkout = false; 
	    }

	    public void receiveRating(int rating) {
	        this.rating = rating; 
	    }

	    public int getRating() {
	        return rating;
	    }

	    public boolean getCheckout() {
	        return checkout;
	  }
}
