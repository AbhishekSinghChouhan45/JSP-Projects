package com.nt.prime;

  

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class FindPrime extends TagSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer x = 10;
	public void setX(Integer x) {
		System.out.println("FindPrime.setB()");
		this.x = x;
	}
	
	@Override
	public int doStartTag() throws JspException {
		System.out.println("FindPrime.doStartTag()");
		try {
			JspWriter out = pageContext.getOut();
			out.println("Find Prime Numebers");
			for(int i=1;i<=x;++i) {
					if(findPrimes(i)) {
						System.out.println("FindPrime.doStartTag() True---"+i);
						out.println( i+" <br>");
					}
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return SKIP_PAGE;
	}
	@Override
	public int doEndTag() throws JspException {
		System.out.println("FindPrime.doEndTag()");
		return EVAL_PAGE;
	}
	public Boolean findPrimes(int x) throws Exception{
		System.out.println("FindPrime.findPrimes(): "+x);
		Boolean falg = true;	
		for(int i=2;i<x;++i) {
			System.out.println("FindPrime----------"+i);
				if(x%i==0) {
					falg =  false;
					break;
				}
			}
		return falg;
	}
}
