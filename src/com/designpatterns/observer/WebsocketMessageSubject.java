package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WebsocketMessageSubject implements Subject {

	private final List<Observer> observers;

	public WebsocketMessageSubject() {
		super();
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);

	}

	@Override
	public void notifyObservers() {
		observers.forEach(o -> o.handleEvent("New message from webscoket endpoint"));

	}

}
