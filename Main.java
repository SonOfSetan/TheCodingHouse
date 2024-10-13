package basicjava;

public class Main {

	// code execution starts here
	public static void main(String args[]) {
		//System.out.println("Hello World !");
		
		/*
		 * primitive data types
		 * 1. integer		= 1,2,3,4 etc
		 * 2. double / float	= 1.2F , 10.3 , 103983.554D (DECIMAL)
		 * 3. char		= c , b , z
		 * 4. boolean	= true , false
		 * 
		 * non primitive data type
		 * String		=	"INDIA" , "123" , "123INDIA"
		 * Array		=	["INDIA" , "123" , "123INDIA"] = SET OF STRING
		 * [1,6,10,5] SET OF INTEGER
		 * 
		 * */
		//Syntax
		// dataType variableName = variableValue;
		
		//		integer variableName = 12;
		//		String stringVariableName = "set of characters";
		//		double doubleVariableName = 9999999.9999999;
		//		char grade = 'A';
		//		boolean boolValue = false;
		
		//System.out.println(variableName);
		//System.out.println(stringVariableName);
		//System.out.println(doubleVariableName);
		//System.out.println(grade);
		//System.out.println(boolValue);
		
		// COMMENT
		
		//////////////////////////////////////////////////
		//Array Declaration
		
		//String[] intVal = {"1","2","3","4","5"};
					//index=0	1	2	3	4
		
		//control structures :
		//loop
		// for		=	print - value from intVal - value exists
		// while	=	value exist - print
		
		//for (int i = 0; i < intVal.length; i++) {
		//iteration
		//	System.out.println(intVal[i]);
		//}
		
//		int i = 0 ;
//		while(i<5) {
//			System.out.println(intVal[i]);
//			i++;
//		}
		
		
		//////////////////////////////////////////////////////////
		
		// Conditions - 
		
		//Fortran = 1950
		/*
		 * 
		 * X positive = then print value of x
		 * 
		 * IF (X .GT. 0) THEN
		 * 	PRINT *, 'X is POSITIVE'
		 * END IF
		 * 
		 * C
		 * if ( x > 0 ){
		 * 	print("X is positive")
		 * }else{
		 * 	print("X is negative")
		 * }
		 * 
		 * JavaScript
		 * 
		 * let x = 2; console.log(x>0 ? "X is positive" : "X is negative");
		 * 
		 * 
		 * */
		
		// JAVA
		//int x = -1;
		// NESTED IF CONDITION
//		if ( x > 0 ){
//			System.out.println("X is positive");
//		}else if(x == 0){
//			System.out.println("X is zero");
//		}else {
//			System.out.println("X is negative");
//		}
		
		// if x = 1 then print 
		// if x = 2
		// if x = 3
		// if x = 4
		
		// SWITCH
		// break (keyword) = this is used to break the execution of the loop or switch!
		// System.exit(0); = this is used to stop the execution of entire code.

		//		System.out.println("1");
		//		System.out.println("2");
		//		System.out.println("3");
		//		System.out.println("4");
		//		System.out.println("5");
		
		
//		int x = 5;
//		
//		switch(x) {
//			case 0:
//				System.out.println("X is zero");
//				break;
//			case 1: 
//				System.out.println("X is positive");
//				break;
//			case 2:
//				System.out.println("X is negative");
//				break;
//			default:
//				System.out.println("X is invalid");
//		}
		
		
		//dive deep loops.
		// Advanced loops.
		// 	for each
		// 	break and continue
		//	infinite loop
		//	nested loop
		
		// for each
//		String[] fruits = {"Apple" , "Banana" , "Cherry", "fruit2"} ;
//		
//		for(String fruit:fruits) {
//			System.out.println(fruit);
//		}
		
		
		//break - continue
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("iteration num brfore break: " + i);
//			if(i==5) {
//				break;
//			}
//			
//			System.out.println("iteration num if code did not break :" +i);
//		}
		/*
		 * 1+1 = 2
		 * 1-1 = 0
		 * 1*1 = 1
		 * 1/1 = 1
		 * 2%2 = 0
		 * 
		 * */
//		for (int i = 1; i <= 200; i++) {
//			if(i%2==1) {
//				continue;
//			}
	//		if(i%2==0) {
	//			break;
	//		}
//			System.out.println("iteration num if code did not break :" +i);
//		}
//		
		
		// infinite loop
		
//		int i =0;
//		while(true) {
//			System.out.println(i);
//			i++;
//			if(i>10) {
//				break;
//			}
//		}
		
		// nested for
//		for (int j = 0; j < 5; j++) {
//			System.out.println("outermost : " + j);
//			for (int j2 = 0; j2 < 3; j2++) {
//				System.out.println("inner : " + j2);
//				for (int k = 0; k < 2; k++) {
//					System.out.println("innermost : " + k);
//				}
//			}
//		}
	
		//Operators, Arrays, and Strings
		// Operators
		
		/* Arithmetic Operators
		 * a+b = addition
		 * a-b = sub
		 * a*b = multi
		 * a/b = divi
		 * a%b = modulus
		 * 
		 * */
		
		/*Relational Operators
		 * ==	: equals to
		 * !=	: not equals to
		 * >	: greter than
		 * <	: less than
		 * <=	: greater than or equals
		 * >=	: less than or equals
		 * */
		
		int a=10,b=10,c=10;
		
//		System.out.println("Add " + (a+b));
//		System.out.println("sub " + (a-b));
//		System.out.println("multi " + (a*b));
//		System.out.println("divi " + (a/b));
//		System.out.println("modul " + (a%b));
//		
//		System.out.println("---------");
//		
//		System.out.println("equals " + (a==b));
//		System.out.println("not equals " + (a!=b));
//		System.out.println("greter than " + (a>b));
//		System.out.println("less than " + (a<b));
//		System.out.println("greater than or equals " + (a>=b));
//		System.out.println("less than or equals " + (a<=b));
//		
		/*	Logical
		 * 		AND	= &&
		 * 		OR	= || 
		 * 		NOT	= !
		 * 
		 * 	Assignment
		 * 		=	
		 * 		+=
		 * 		-=
		 * 		*=
		 * 		/=
		 * 		%=
		 * 
		 * 	Unary
		 * 		++
		 * 		--
		 * 		!
		 * 
		 * 	Ternary 
		 * 		?
		 * */
		
		//System.out.println("equals " + (a==b || b==c));
		
		//Arrays
		// Single
		// Multi-Dimentional
		
		// Single Dimentional Arrays
		
		int[] number = {1,2,3,4,5,6};
		
		// Multi Dimentional Arrays
		
		int[][] matrix = {
				{1,2,3,4,5}, // 0 index
			//	0  1 2 3 4	index
				{6,7,8,9,0}	// 1 index
//				 0 1 2 3 4	index
		};
		
		//System.out.println(matrix[1][3]);
		
		/* Strings (manipulation)
		*	=methods of string
		*	length
		*	charAt
		*	substring
		*	toUpperCase
		*	toLowerCase
		*/
		String greeting = "Hello, World!";
		
		//System.out.println(greeting.toLowerCase());
		
		StringBuilder sb = new StringBuilder();
		sb.append(greeting);
		sb.append(" -- welcome to TheCodingHouse. ");
		sb.append(" -- please Like and Subscribe !");
		
		System.out.println(sb);
	}
	 
}

