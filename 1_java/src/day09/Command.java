package day09;

@FunctionalInterface //람다를 쓸 수 있는지 체크
public interface Command {
	void exec();
	default public void process() {
		System.out.println("process()");
	}
}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행 ");
	}

}

class CreateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("CreateCommand 수행 ");
	}

}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");
	}

}

class ListCommand implements Command {

	@Override
	public void exec() {
		System.out.println("ListCommand 수행");
	}

}