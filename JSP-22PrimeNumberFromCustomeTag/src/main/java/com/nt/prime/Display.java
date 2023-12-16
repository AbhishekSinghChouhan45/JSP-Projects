package com.nt.prime;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Display extends TagSupport{
		private int size = 15;
		private String font = "Arial";
		private String color = "Red";
		public void setColor(String color) {
			this.color = color;
		}
		public void setSize(int size) {
			System.out.println("Display.setSize()");
			this.size = size;
		}
		public void setFont(String font) {
			System.out.println("Display.setFont()");
			this.font = font;
		}
		@Override
		public int doStartTag() throws JspException {
			System.out.println("Display.doStartTag()");
			try {
				System.out.println("-----------------"+font+"----------------"+size+"-------------"+color);
				JspWriter out = pageContext.getOut();
				out.println("<span style= 'font-family: "+font+"; font-size: "+size+";color:"+color+";'>");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return EVAL_BODY_AGAIN;
		}
		@Override
		public int doEndTag() throws JspException {
			System.out.println("Display.doEndTag()");
			try {
				JspWriter out = pageContext.getOut();
				out.println("</span>");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		return EVAL_BODY_INCLUDE;
		}
}
