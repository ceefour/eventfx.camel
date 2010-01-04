package com.soluvas.samples.eventfx.camel;

import java.util.EventListener;

import org.apache.camel.InOnly;

public interface AsyncListener<E> extends EventListener {

	@InOnly
	void notify(E event);
}
