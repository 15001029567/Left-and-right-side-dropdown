package com.exmaple.tencentqq.swipe;

import com.exmaple.tencentqq.swipe.SwipeLayout.Status;

public interface SwipeLayoutInterface {

	Status getCurrentStatus();
	
	void close();
	
	void open();
}
