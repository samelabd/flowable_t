package com.meflow;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class MyDelegateOne implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) {
		System.out.println("Java delegate One Hellooooo");
		
	}

}
