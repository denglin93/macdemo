package com.bluedon.strategy;

public class GiveGreenLignt implements IStrategy {

	@Override
	public void operate() {
		
		System.out.println("开个绿灯放行");
	}

}
