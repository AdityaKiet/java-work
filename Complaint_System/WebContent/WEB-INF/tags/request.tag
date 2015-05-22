
<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@attribute name="setRequest"%>
<%@attribute name="request"%>
<%
	if (setRequest != null)
		request.setAttribute("setRequest", setRequest);
%>