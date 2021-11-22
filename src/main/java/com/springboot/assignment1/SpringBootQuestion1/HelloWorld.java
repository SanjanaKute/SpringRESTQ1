package com.springboot.assignment1.SpringBootQuestion1;

public class HelloWorld 
{
	private String content;

	public HelloWorld(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "HelloWorld [content=" + content + "]";
	}
	


}
