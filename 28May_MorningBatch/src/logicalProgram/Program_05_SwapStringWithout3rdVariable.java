package logicalProgram;

public class Program_05_SwapStringWithout3rdVariable {
	public static void main(String[] args) {
		String a="Balkrushna";
		String b="Gawai";
		a=a.concat(b);
		b=a.replaceAll(b, "");
		a=a.replaceAll(b, "");
		System.out.println(a);
		System.out.println(b);
		
	}

}
