//Program to define generic functional interface Palindrome

package com.tnsif.Day19.v1;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
