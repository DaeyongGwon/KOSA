package oop10;

public class AppleTV implements TV {
	private Speaker speaker = null;

	public void powerOn() {
		System.out.println("Apple : 전원을 켭니다.");
	}

	public void powerDown() {
		System.out.println("Apple : 전원을 끕니다.");
	}

	public void chanelUp() {
		System.out.println("Apple : 채널을 올립니다.");
	}

	public void chanelDown() {
		System.out.println("Apple : 채널을 내립니다.");
	}

	public void soundUp() {
		if(speaker == null)	System.out.println("Apple : 소리를 키웁니다.");
		
	}

	public void soundDown() {
		System.out.println("Apple : 소리를 줄입니다.");
	}
}
