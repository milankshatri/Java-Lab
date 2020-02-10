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
class StarWars extends Hello{
	void G3()
	{
		System.out.println("General");
	}
}
class HierarchialInheritance{
	public static void main(String[] args) {
		StarWars o=new StarWars();
		There o1=new There();
		o1.G1();
		o1.G2();
		o.G1();
		o.G3();
	}
}
