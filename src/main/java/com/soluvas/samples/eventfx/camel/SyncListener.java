package com.soluvas.samples.eventfx.camel;

import java.util.EventListener;

import org.apache.camel.InOut;

public interface SyncListener<E, R> extends EventListener {

	@InOut
	R update(E event);
}
