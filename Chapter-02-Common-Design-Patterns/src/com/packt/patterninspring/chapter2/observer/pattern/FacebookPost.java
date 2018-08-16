package com.packt.patterninspring.chapter2.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dinesh.Rajput
 *
 */
public class FacebookPost implements Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String comment;

	@Override
	public void registerAsAFriend(Observer friendRequest) {
		observers.add(friendRequest);	
	}

	@Override
	public void unregisterFromFriend(Observer removeFriend) {
		observers.remove(removeFriend);	
	}

	@Override
	public void notifyFacebookFriends() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.comment;
	}
	
	//method to post message to the topic
	public void postComment(String comment){
		System.out.println("Comment Posted to Post: "+comment);
		this.comment=comment;
		notifyFacebookFriends();
	}

}
