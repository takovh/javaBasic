package cn.zhang.IO.pattern;

public class Amplifier {
	private Voice v;

	public Amplifier() {}

	public Amplifier(Voice v) {
		super();
		this.v = v;
	}
	public void say() {
		System.out.println(v.getVoice()*1000);
	}
}
