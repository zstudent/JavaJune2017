package lesson170728;

public class X implements LongProtocol {
	
	LongProtocol y;
	
	public X(LongProtocol y) {
		this.y = y;
	}

	@Override
	public void a() {
		y.a();
	}

	@Override
	public void b() {
		y.b();
	}

	@Override
	public void c() {
		y.c();
	}

	@Override
	public void d() {
		y.d();
	}
	
	

}
