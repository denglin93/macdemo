package com.bluedon.strategy;
/**
 * 锦囊妙计中的锦囊
 * @author denglin
 *
 */
public class Context {
	private IStrategy strategy;
	public Context(IStrategy strategy){
		this.strategy = strategy;
	}
	public void operator(){
		this.strategy.operate();
	}
}
