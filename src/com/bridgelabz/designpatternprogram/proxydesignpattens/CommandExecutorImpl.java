package com.bridgelabz.designpatternprogram.proxydesignpattens;

/*******************************************************************************
 * 1. Structural Design Patterns :- 
 * 3. Proxy design pattern as the name suggests
 * creates a Proxy Object to a real Object so as to provide controlled access to
 * a functionality. Create a Command Executor Program that will execute certain
 * system commands based on the user type is admin or otherwise. The Proxy
 * design pattern link shows the same example.
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {
	/**
	 * Define function runCommand()
	 * 
	 * @param cmd
	 *            ->String
	 * @return void
	 */
	@Override
	public void runCommand(String cmd) throws IOException {
		Runtime.getRuntime().exec(cmd);
		System.out.println(" " + cmd + "Command Executed");
	}
}