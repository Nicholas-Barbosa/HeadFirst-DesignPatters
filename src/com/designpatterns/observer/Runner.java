package com.designpatterns.observer;

public class Runner {
	public static void main(String[] args) {
		Subject subject = new WebsocketMessageSubject();
		new MessageObserver(subject);
		subject.registerObserver(s -> System.out.println("Olá"));
		subject.notifyObservers();
	}
}
