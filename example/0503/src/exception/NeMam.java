package exception;

public class NeMam implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("NeMam 자원을 해제합니다.");

	}

}
