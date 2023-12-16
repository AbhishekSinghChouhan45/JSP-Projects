package com.nt.ctag;

import java.io.PrintWriter;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Message extends TagSupport {
	@Override
	public int doStartTag() throws JspException {
		System.out.println("Message.doStartTag()");
			try {
				JspWriter out = pageContext.getOut();
				out.println("Hello from my first custome tag");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		return SKIP_BODY;
	}
	@Override
	public int doEndTag() throws JspException {
			System.out.println("Message.doEndTag()");
		return EVAL_PAGE;
	}
}
