package lesson170830.concurrency;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;

public class Worker implements Executor {
	
	static final Runnable POISON_PILL = () -> {};
	
	BlockingQueue<Runnable> tasks = new BlockingQueue<>();
	
	public Worker() {
		new Thread(this::processTasks).start();
	}

	@Override
	public void execute(Runnable command) {
		tasks.put(command);
	}
	
	private void processTasks() {
		while (true) {
			Runnable task = tasks.take();
			if (task == POISON_PILL) {
				return;
			}
			Optional.ofNullable(task).ifPresent(r -> r.run());
		}
		
	}
	
	public void shutdown() {
		tasks.put(POISON_PILL);
	}
	
	public List<Runnable>  shutdownNow() {
		// TODO
		return null;
	}
	
}
