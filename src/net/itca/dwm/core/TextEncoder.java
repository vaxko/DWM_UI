package net.itca.dwm.core;

public class TextEncoder {

	public TextEncoder()
	{
		
	}
	

	/**
	 * Encodes the string to make it suitable for the database by replacing newline and cariage return with ~
	 * @param toEncode
	 * @return
	 */
	public String encode(String toEncode)
	{
		String encoded = toEncode.replaceAll("[\n\r]", "~");
		return encoded;
	}
	
	
	/**
	 * Decodes a given string to make it suitable for the program by replacing ~ with newline and cariage return
	 * @param toDecode
	 * @return
	 */
	public String decode(String toDecode)
	{
		String decode = toDecode.replaceAll("[~]", "\n");
		return decode;
	}
}
