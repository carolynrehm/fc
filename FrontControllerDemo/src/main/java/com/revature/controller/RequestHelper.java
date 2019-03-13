package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.delegate.DepartmentDelegate;
import com.revature.delegate.EmployeeDelegate;
import com.revature.delegate.ViewDelegate;

public class RequestHelper {

	ViewDelegate vd = new ViewDelegate();
	DepartmentDelegate rd = new DepartmentDelegate();
	EmployeeDelegate ed = new EmployeeDelegate();

	public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String uri = request.getRequestURI().substring(request.getContextPath().length());
		//		System.out.println(uri);
		if(uri.startsWith("/api/")) {
			String record = uri.substring(5);
			System.out.println(record);
			switch(record) {
			case "employees":
				if("GET".equals(request.getMethod())){
					
				} else if ("POST".equals(request.getMethod())) {

				} else {
					response.sendError(404, "Record Not Supported");
				}
				break;
			case "departments":
				if("GET".equals(request.getMethod())){

				} else if ("POST".equals(request.getMethod())) {

				} else {
					response.sendError(404, "Record Not Supported");
				}
				break;
			default:
				response.sendError(404, "Record Not Supported");

			}
		} else {
			vd.returnView(request, response);
		}
	}

}
