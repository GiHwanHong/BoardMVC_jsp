package mycontroller;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import my.action.CommandAction;

public class ControllerAction extends HttpServlet {
	
	private Map commandMap = new HashMap();
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		String path = config.getServletContext().getRealPath("/");
		String props = config.getInitParameter("propertyConfig");
		
		Properties pr = new Properties();
		
		FileInputStream f = null;
		try {
			f= new FileInputStream(path+props);
			pr.load(f);
		} catch (IOException e) {
			throw new ServletException(e);
		}finally {
			if(f!=null) try {f.close(); } catch(IOException ex) {}
		}
		
		Iterator keyIter = pr.keySet().iterator();
		
		while (keyIter.hasNext()) {
			
			String command = (String)keyIter.next();
			String className = pr.getProperty(command);
			try {
				Class commandClass = Class.forName(className);
				Object commandInstance = commandClass.newInstance();
				commandMap.put(command, commandInstance);
				
				
			} catch (ClassNotFoundException e) {
				throw new ServletException(e);
			}  catch (InstantiationException e) {
				throw new ServletException(e);
			}  catch (IllegalAccessException e) {
				throw new ServletException(e);
			}
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		execute(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	private void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
		String view = null;
		CommandAction com = null;
		
		try {
			String command = request.getRequestURI();
			
			System.out.println(command);
			com = (CommandAction)commandMap.get(command);
			view = com.requestPro(request, response);
			System.out.print(view);
		} catch (Throwable e) {
			throw new ServletException(e);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}
}
