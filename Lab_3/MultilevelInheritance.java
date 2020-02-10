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
class StarWars extends There{
	void G3()
	{
		System.out.println("General");
	}
}
class MultilevelInheritance{
	public static void main(String[] args) {
		StarWars o=new StarWars();
		o.G1();
		o.G2();
		o.G3();
	}
}
