package polymorphism;

public class AppleSpeaker implements Speaker{
	public AppleSpeaker() {
		System.out.println("AppleSpeaker ��ü ����");
	}
	public void volumeUp() {
		System.out.println("Applespeaker---�Ҹ� �ø���.");
	}

	public void volumeDown() {
		System.out.println("Applespeaker---�Ҹ� ������.");
	}
}
