<%-- 
    Document   : deleteQuestion
    Created on : Nov 27, 2015, 4:30:56 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
<<<<<<< HEAD
    <% String t = "";
            Cookie [] cookieArray = request.getCookies();
            if(cookieArray != null){
                    for (int j=0; j<cookieArray.length;j++){
                        if(cookieArray[j].getName().equals("token")){
                            t = cookieArray[j].getValue();
                        }
                    }
                   }%>
=======
    <% String t = request.getParameter("token");%>
>>>>>>> 4df0728f23fffc49d188659f63c70f6ff0d862ee
    <% String id = request.getParameter("id");%>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>deleteQuestion - TuBes WBD</title>
    </head>
    
    <body>
        
         <%-- start web service invocation --%><hr/>
    <%
    try {
	questionmodel.QuestionWS_Service service = new questionmodel.QuestionWS_Service();
	questionmodel.QuestionWS port = service.getQuestionWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String accessToken = t;
	int qid = Integer.valueOf(id);
	// TODO process result here
	int result = port.deleteQuestion(accessToken, qid);
        if (result==1)
        {
<<<<<<< HEAD
            response.sendRedirect("http://localhost:8080/StackExchangeFE/homepagelogin.jsp");
=======
            response.sendRedirect("http://localhost:8080/StackExchangeFE/homepagelogin.jsp?token="+t);
>>>>>>> 4df0728f23fffc49d188659f63c70f6ff0d862ee
        }
        else
        {
            response.sendRedirect("http://localhost:8082/WBD_IS/login.jsp?msg=sessiontimeout");
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
        out.println(ex);
    }
    %>
    <%-- end web service invocation --%><hr/>
   
        
    </body>
</html>
