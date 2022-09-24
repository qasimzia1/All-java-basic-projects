<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
</head>

<body>

<h1>Servelet to jsp</h1>
<p>Name: ${name} </p>
    <p>Assignment Number: ${AS} </p>
    
  
    
    
    
    
  
    
    
    
    
    
    
    
    
    
    
  
    
    
<h1>   Eclips page  </h1>


  
    <h3>   Registration Form  </h3>
  <form  action="Helloworld"  method="doGet" >
  <label for="fname">First name:</label><br>
  <input type="text" id="fname" name="fname"><br>
  <label for="lname">Last name:</label><br>
  <input type="text" id="lname" name="lname"><br>
  <label for="lname">Email address:</label><br>
  <input type="text" id="Email" name="Email"><br>
  <label for="lname">Addresse:</label><br>
  <input type="text" id="Addresse" name="Addresse"><br>
  <label for="lname">Department:</label><br>
  <input type="text" id="Department" name="Department"><br>
 <button>submit</button>
    </form>
    
    <% out.println("using scriptlets to print java code on jsp");
    out.println("</br>");%>
    
    <%  
    int i, j, row=5;   
  //outer loop for rows  
    for(i=0; i<row; i++)   
    {   
    //inner loop for columns  
    for(j=0; j<=i; j++)   
    {   
    //prints stars   
    out.println("* ");   
    }   
    //throws the cursor in a new line after printing each line  
    out.println("</br>");   
    }   
    out.println("</br>");
  
  %>
  
  

</body>
</html>