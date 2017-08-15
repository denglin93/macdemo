package com.bluedon.strategy;
/**
 * 策略的第一个
 * @author denglin
 *
 */
public class BackDoor implements IStrategy {

	@Override
	public void operate() {
		System.out.println("找乔国老帮忙");
	}


}
