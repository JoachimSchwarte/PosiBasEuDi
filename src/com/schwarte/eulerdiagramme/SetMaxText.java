package com.schwarte.eulerdiagramme;

import javax.swing.text.*; 

public class SetMaxText extends PlainDocument { 

	private static final long serialVersionUID = 1L;
	private int limit; 

	SetMaxText(int limit) { 
		super(); 
		this.limit = limit; 
		} 
	public void insertString 
	(int offset, String  str, AttributeSet attr) 
			throws BadLocationException { 
		if (str == null) return; 
		if ((getLength() + str.length()) <= limit) { 
			
			super.insertString(offset, str, attr); 
		}
	}
}
  