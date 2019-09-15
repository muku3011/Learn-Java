When a thread has been instantiated but not started (in other words, the
start() method has not been invoked on the Thread instance), the thread is said
to be in the new state. At this stage, the thread is not yet considered alive. Once the
start() method is called, the thread is considered alive (even though the run()
method may not have actually started executing yet). EagerInitialization thread is considered dead
(no longer alive) after the run() method completes. The isAlive() method is the
best way to determine if a thread has been started but has not yet completed its
run() method. (Note: The getState() method is very useful for debugging)

The volatile keyword in Java is used as an indicator to Java compiler and Thread that do not cache value of this variable and always read it from main memory. So if you want to share any variable in which read and write operation is atomic by implementation e.g. read and write in an int or a boolean variable then  you can declare them as volatile variable.