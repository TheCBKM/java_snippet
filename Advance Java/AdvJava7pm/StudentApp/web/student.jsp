<%
String sname=(String)session.getAttribute("sname");
%>
<html>
    <body>
        <h1>Hello <%=sname%>!</h1><hr>
        <pre>
<a href="ShowResult">View Result</a>      
<a href="reval.jsp">Apply for rechecking</a>
<a href="AllDocs?fnm=ExamForm.docx">Download Exam Form</a>
<a href="AllDocs?fnm=TimeTable.xlsx">Download Time Table</a>
<a href="AllDocs?fnm=Java.pdf">Download Java Book</a>
<a href="Logout">Logout</a>
        </pre>        
    </body>
</html>
