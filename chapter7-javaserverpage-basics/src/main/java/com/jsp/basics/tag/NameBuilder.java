package com.jsp.basics.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class NameBuilder extends SimpleTagSupport {

	private String name;

	@Override
	public void doTag() throws JspException, IOException {
		
		getJspContext().getOut().println("CUSTOMTAG " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
