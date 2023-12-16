<b style="color: red; text-align: center;">Accessing Implicite obj in declration tag</b>
<!-- Declaration Tag Method -->
	<%! 
			public void display(){
					/*	System.out.println(application.getClass());  --> Here we get error because application and config is local implicite ref var of _service() 
					System.out.println(config.getClass()); */
					/*
					Solution:
									For this we create our own implicite obj of ref type application and config 
					*/	
					ServletConfig cg = getServletConfig();
					ServletContext sc = getServletContext();
					System.out.println("Config Obj: "+cg.getClass());
					System.out.println("Context Obj: "+sc.getClass());
// 					System.out.println(cg.getInitParameter("age"));		
// 					System.out.println(sc.getInitParameter("name"));
// 					System.out.println("Name and age initializing using user - defined method");
// 					name = sc.getInitParameter("name");
// 					age = Integer.parseInt(cg.getInitParameter("age"));
			}
	%>
<!-- 	Declaring Static block and intializing name and age -->
	<%!
		public void jspInit(){
		ServletConfig cg = getServletConfig();
		ServletContext sc = getServletContext();
		//Name Intializing
// 		System.out.println("Name and age initializing using jspInit Life cycle Method");
// 		name = sc.getInitParameter("name");
// 		age = Integer.parseInt(cg.getInitParameter("age"));
	}
	%>
	

<!-- 	Declaring Global Variables -->
	<%!
				private String name = null;
				private int age = 0;
	%>

	<% 
			display();
	%>
	<br>
	<%=
			"Names: "+name
	%>
	<br>
	<%=
			"Age: "+age
	%>