package polymorphism;

public class AppleSpeaker implements Speaker{
	public AppleSpeaker() {
		System.out.println("AppleSpeaker 按眉 积己");
	}
	
	public void volumeUp() {
		System.out.println("Applespeaker---家府 棵赴促.");
	}
	
	public void volumeDown() {
		System.out.println("Applespeaker---家府 郴赴促.");
	}
}
