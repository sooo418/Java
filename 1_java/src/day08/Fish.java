package day08;

public class Fish extends Animal {
	String name;

	public Fish() {
		super("물고기");
	}

	public Fish(String name) {
		super("물고기");
		//super.kind = "물고기";
		this.name = name;
	}

	public void print() {
		System.out.printf("동물[%s, %s]\n", this.kind, name);
		//Fish클래스안에 kind가 없으면 this를 붙여도 부모클래스의 kind로 접근한다.
	}
	@Override	
	public void breath() {
		System.out.println("아가미로 숨쉬기");
	}
}
