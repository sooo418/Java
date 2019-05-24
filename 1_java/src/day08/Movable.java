package day08;

public interface Movable {
	public abstract void move();
}

interface Drawable{
	void draw();
}

interface MovableAndDrawable extends Movable, Drawable{
	//인터페이스에서만 예외적으로 다중상속가능, 인터페이스끼리 상속할 때는 extends
	
}

class Circle implements MovableAndDrawable{
	//클래스에서 인터페이스 상속 받을 시 implements 
	@Override
	public void move() {
		System.out.println("Circle Move ");
	}

	@Override
	public void draw() {
		System.out.println("Circle draw");
	}
	
}

class Rectangle implements MovableAndDrawable{

	@Override
	public void draw() {
		System.out.println("Rectangle draw");
	}

	@Override
	public void move() {
		System.out.println("Rectangle move");
	}
	
}