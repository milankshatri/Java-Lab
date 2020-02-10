class Hello{
	void G1()
	{
		System.out.println("Hello");
	}
}
class There extends Hello{
	void G2()
	{
		System.out.println("There");
	}
}
class SingleInheritance{
	public static void main(String[] args) {
		There o=new There();
		o.G1();
		o.G2();
	}
}
