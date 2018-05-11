package simpleThreads;

import java.lang.Thread.State;

public class MainEntry {

	public static void main(String[] args) {
		Long id = Thread.currentThread().getId();
		String threadName = Thread.currentThread().getName();
		Integer priority = Thread.currentThread().getPriority();
		State state = Thread.currentThread().getState();
		String group = Thread.currentThread().getThreadGroup().getName();
		
		System.out.printf("id = %-2s", "Thread Name = %-2s", "Priority = %-2s\n" 
				+ "State = %-2s", "Group = %-2s", id, threadName, priority, state, group);
	}

}
