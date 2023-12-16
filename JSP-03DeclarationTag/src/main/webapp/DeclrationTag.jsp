/**
	Decalration Tag is used to declare class level variables,Methods,Constructor and Blocks 
	we genrally do not declare printing statements in Declaration Tag
*/
<%! 
	//Global Variables
		int a = 10;
		int b = 20;
%>
<%! 
		//User Defined Method
	public String getName(String name){
			System.out.println("Method Call");	
				return "This is Declration Tag "+name;
		}
%>
<%! 
		//Constructor
	public DeclrationTag_jsp(){
			System.out.println("JSP Instatiated");	
		}
%>
<%!
	//This destroy method is overriden method of HTTPJspBase class
	public void jspDestroy(){
			System.out.println("JSP Destroyed");	
		}
%>
<%!
	//This Init method is overriden method of HTTPJspBase class
		public void jspInit(){
			System.out.println("JSP Init ");	
		}
%>
<%!
	//Static Block
	static{
			System.out.println("Static block executed");	
		}
%>
<%
	//Local variables of _Service() Method
		int a = 30;
		int b = 40;
%>
<br>
<br>
<%= 
	//this keyword used to get class level variable data
		"Value of a: "+this.a
%><br>
<%= 
	// here we get local variable data because of variable hidding
		"Value of b: "+b
%><br>
<%= 
		//Calling UserDefined Method here
		"This is Methos call: "+getName("Rani")
%>