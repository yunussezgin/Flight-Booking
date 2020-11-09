package com.yunus.flightbooking.util;

import org.apache.commons.lang3.StringUtils;

public class Utility {

	public static String maskText(String text, int start, int end, char maskChar) {
		if (text == null || text.equals(""))
			return "";

		if (start < 0)
			start = 0;

		if (end > text.length())
			end = text.length();

		int maskLength = end - start;

		if (maskLength == 0)
			return text;

		String strMaskString = StringUtils.repeat(maskChar, maskLength);

		return StringUtils.overlay(text, strMaskString, start, end);
	}
}
