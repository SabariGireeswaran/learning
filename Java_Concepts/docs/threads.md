# Threads: concurrency basics

Key ideas

- `Thread` executes code concurrently when `start()` is called; `Runnable` is a simple way to provide work for a thread.  
- Use `join()` to wait for a thread to finish.  
- Threading can produce interleaved output — useful to observe while learning.

Example to run

- `ThreadsExample.java` — shows two `Counter` runnables running in parallel.

Tip

Keep threading examples simple; avoid shared mutable state until you're comfortable with synchronization.