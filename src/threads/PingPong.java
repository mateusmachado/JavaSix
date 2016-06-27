package threads;

public class PingPong extends Thread {

	private String word;
	private int delay;

	public PingPong(String word, int delay) {
		super();
		this.word = word;
		this.delay = delay;
	}

	public void run() {
		try {
			for (;;) {
				System.out.println(word + " ");
				Thread.sleep(delay);
			}
		} catch (Exception e) {
			System.err.println("error");
			return;
		}
	}

	public static void main(String[] args) {
		PingPong ping = new PingPong("ping", 500);
		ping.start();
		PingPong pong = new PingPong("pong", 1000);
		pong.start();
	}
}
