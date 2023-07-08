<%@ page import="java.text.* , java.util.*"  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<% SimpleDateFormat sdf = new SimpleDateFormat("HH");
			String hrs = sdf.format(Calendar.getInstance().getTime());
			int hh = Integer.parseInt(hrs);
			
			if(hh<12)
			{ %>
			
			<%= "<h1> Good Morning </h1>" %>
				
			<% }
			else if (hh>=12 && hh<=16)
			{ %>
				<%= "<h1>Good AfterNoon </h1>"  %>
			<%  }
				
			else if (hh>16 && hh<=21)
			{ %>
				<%= "<h1>Good Evening</h1>" %>
			<% }	
			else
			{ %>
				<%= "<h1>Good Night </h1>" %>
			<% }
			
				
		%>
		
	
</body>
</html>