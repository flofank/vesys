/*
 * Copyright (c) 2000-2013 Fachhochschule Nordwestschweiz (FHNW)
 * All Rights Reserved. 
 */

package ch.fhnw.bank.server.servlet;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch.fhnw.bank.InactiveException;
import ch.fhnw.bank.OverdrawException;
import ch.fhnw.bank.communication.Task;

@WebServlet("/*")
public class BankServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println("[INFO] About to handle Get Request on: "
				+ request.getRequestURL());
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		try {
			ObjectInputStream ois = new ObjectInputStream(
					request.getInputStream());
			Task task;
			task = (Task) ois.readObject();
			task.execute();
			ObjectOutputStream oos = new ObjectOutputStream(
					response.getOutputStream());
			oos.writeObject(task);
			oos.flush();
			oos.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void executeTask(Task task) {
		System.out.println("Executing Task");
	}
}
