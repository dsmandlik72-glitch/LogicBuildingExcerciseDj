package com.question1;

public class ChildClass extends ParentClass {

	private ChildClass(ParentClassBuilder obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}
	

	

	public static class ChildClassBuilder extends ParentClassBuilder{

		public ChildClassBuilder(int number1, int number2) {
			super(number1, number2);
			// TODO Auto-generated constructor stub
		}

		@Override
		protected ParentClass build() {
			ParentClass p1=new ChildClass(this);
			return p1;
		}
		
	}
}
