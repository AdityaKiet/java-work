
<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@attribute name="id"%>
<%@attribute name="session"%>
<%
	if (id != null)
		session.setAttribute("id", id);
%>