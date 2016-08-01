package org.camunda.bpm.unittest;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class AsynchTestDelegate implements JavaDelegate {
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		//Very fast execution
//		Thread.sleep(200);s
	}
}
