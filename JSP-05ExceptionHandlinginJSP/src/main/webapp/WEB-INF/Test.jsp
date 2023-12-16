<h2 style="color: red; text-align: center;">Exception Handling in JSPs</h2>
<%!
		public void getE(){
		try{
				System.out.println(10/0);	
		}catch(Exception e){ System.out.println(e.getMessage());}
		}
%>
<%= 
	//Exception is handled by jsp page we no need to handle it --> Wrong Statement	
   //Here the _service() method handles the Exception but rather than _service() method we have to explicitly handle exception --> Right Statement
	"Arthmetic Exception: "+10 / 2
%>
<% 
     		getE(); 
%>
<%! 
	static{
			try{
				System.out.println("dsf: "+10 / 0);
			}catch(Exception e){
				System.out.println("You get exception "+e.getMessage()+" But We handled It ");
			}
		}
%>