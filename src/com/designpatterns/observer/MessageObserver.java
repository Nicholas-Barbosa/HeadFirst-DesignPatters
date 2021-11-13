package com.designpatterns.observer;

public class MessageObserver implements Observer {

	public MessageObserver(Subject subject) {
		subject.registerObserver(this);
	}

	@Override
	public void handleEvent(String message) {
		System.out.println("Got new message from subject!");

	}

}
