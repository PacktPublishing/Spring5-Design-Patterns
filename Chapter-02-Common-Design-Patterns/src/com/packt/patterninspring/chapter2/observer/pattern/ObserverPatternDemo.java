/**
 * 
 */
package com.packt.patterninspring.chapter2.observer.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public class ObserverPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create a facebook post i.e. a subject
		FacebookPost facebookPost = new FacebookPost();
				
		//create facebook friends i.e. observers
		Observer dinesh = new FacebookFriend("Dinesh");
		Observer arnav  = new FacebookFriend("Arnav");
		Observer anamika = new FacebookFriend("Anamika");
				
		//register facebook friends i.e. observers to the facebook post or friend list i.e. subject
		facebookPost.registerAsAFriend(dinesh);
		facebookPost.registerAsAFriend(arnav);
		facebookPost.registerAsAFriend(anamika);
				
		//tag your friends to the facebook post i.e. observer to subject
		dinesh.setSubject(facebookPost);
		arnav.setSubject(facebookPost);
		anamika.setSubject(facebookPost);
				
		//check if any update is available
		arnav.update();
				
		//new comment added to the facebook post i.e. to subject
		facebookPost.postComment("Hello Observers!!! How are you!!!");
	}

}
