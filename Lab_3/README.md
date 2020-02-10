# Types of Variables, Inheritance and Abstract Class

* Variable is a name given to memory location. In ```Java``` there are three types of variables. They are:-
	* Local variable
	* Instance variable
	* Static variable

	* Local variable:-
		A variable defined within a block or method or constructor is called local variable. These variables are created when the block starts the execution and are destroyed after the exection of block i.e after control is returned to main function. The scope of these varibles is within the block they are defined.
	* Instance variable:-
		Instance variables are non-static variables and are declared in a class outside any method, constructor or block. These variable are created when object of that class is created and are destroyed after execution of that class.
	* Static variable:-
		The variable declared using the keyword static is static varibles. Static variable is also called as Class variable and are declared same as ```Instance variable```. Unlike instance variables, we can only have one copy of a static variable per class irrespective of how many objects we create. If we access the static variable without the class name, Compiler will automatically append the class name.

___
# Inheritance

* Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. Inheritance is used to achive polymorphism in java. As ```Multiple Inheritance``` is not supported in Java there are three types of Inheritance in Java. They are:-
	* Single Inheritance
	* Multilevel Inheritance
	* Hierarchial Inheritance

	* Single Inheritance:-
		When a class inherits another class, it is known as a single inheritance.
		The output of [SingleInheritance.java](SingleInheritance.java) is
		```
		Hello
		There
		```
	* Multilevel Inheritance:-
		When there is a chain of inheritance, it is known as multilevel inheritance.
		When a class inherits another class, it is known as a single inheritance.
		The output of [MultilevelInheritance.java](MultilevelInheritance.java) is
		```
		Hello
		There
		General
		```
	*  Hierarchial Inheritance:-
		When two or more classes inherits a single class, it is known as hierarchical inheritance.
		When a class inherits another class, it is known as a single inheritance.
		The output of [HierarchialInheritance.java](HierarchialInheritance.java) is
		```
		Hello
		There
		Hello
		General
		```

