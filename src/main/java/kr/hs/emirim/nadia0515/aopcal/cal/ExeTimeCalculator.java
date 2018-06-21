package kr.hs.emirim.nadia0515.aopcal.cal;

public class ExeTimeCalculator implements Calculator{ //얘는 호출
	private Calculator delegate; //실제로 팩토리얼 계산은 얘가 함

	public ExeTimeCalculator(Calculator delegate) {
		this.delegate = delegate;
	}

	@Override
	public long factorial(long num) {
		long start = System.nanoTime();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
		System.out.printf("%s.factorial(%d) 실행 시간 = %d\n",
				delegate.getClass().getSimpleName(),
				num, (end - start));
		return result;
		}
}
