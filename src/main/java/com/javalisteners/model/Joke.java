/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javalisteners.model;

import java.util.EventObject;

/**
 *
 * @author Benni
 */
public class Joke extends EventObject
{

	private String content;

	public Joke(Object source, String joke)
	{
		super(source);
		this.content = joke;
	}

	public String getContent()
	{
		return this.content;
	}
}
