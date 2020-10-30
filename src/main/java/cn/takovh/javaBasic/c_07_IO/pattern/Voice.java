package cn.takovh.javaBasic.c_07_IO.pattern;

public class Voice {
	private int voice = 10;
	public Voice() {}
	public int getVoice() {
		return voice;
	}
	public void setVoice(int voice) {
		this.voice = voice;
	}
	
	public void say() {
		System.out.println(voice);
	}
}
