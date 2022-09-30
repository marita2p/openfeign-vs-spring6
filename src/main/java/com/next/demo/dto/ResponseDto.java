package com.next.demo.dto;

public class ResponseDto {
	
	private String attributeC;
	
	public ResponseDto () {
	}
	
	public ResponseDto (RequestDto requestDto) {
		attributeC = requestDto.getAttributeA() + requestDto.getAttributeB();
	}
	
	public String getAttributeC () {
		return attributeC;
	}
	
	public void setAttributeC (String attributeC) {
		this.attributeC = attributeC;
	}
}
