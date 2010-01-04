package com.soluvas.samples.eventfx.camel;

public class SensorEvent {

	private String text;

	public SensorEvent(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
