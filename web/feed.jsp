<%-- 
    Document   : feed
    Created on : 14 Feb, 2020, 11:01:38 PM
    Author     : ADITI GUPTA
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Feedback</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>

	<div class="contact1">
		<div class="container-contact1">
			<div class="contact1-pic js-tilt" data-tilt>
				<img src="images/img-01.png" alt="IMG">
			</div>

			<form class="contact1-form validate-form" action="feed.jsp">
				<span class="contact1-form-title">
					Provide Your Valuable Feedback
				</span>

				<div class="wrap-input1 validate-input" data-validate = "Name is required">
					<input class="input1" type="text" name="name" placeholder="Name">
					<span class="shadow-input1"></span>
				</div>

				<div class="wrap-input1 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
					<input class="input1" type="text" name="email" placeholder="Email">
					<span class="shadow-input1"></span>
				</div>

				<div> 	
					<label for="Course: "> Course:   </label>
					
					   <select id="Courses" name="Courses">
						   <br>
					<br>	   
		              <option value=" B-tech">B-Tech</option>
		               <option value=" B-Sc">B-Sc</option>
		               <option value=" B.A">B.A</option>
	            </select>
	          <br>
				</div>
				<br>
				<div class="rating">
					<label>How will you rate your Overall experience?</label> <br>
					<br>
					<p>
						<label class="radio-inline">
						<input type="radio" name="experience" id="radio_experience" value="bad" >
						Bad

						<label class="radio-inline">
							<input type="radio" name="experience" id="radio_experience" value="average" >
							Average
							</label>
		
							<label class="radio-inline">
							<input type="radio" name="experience" id="radio_experience" value="good" >
							Good
							</label>
						</label>
					</p>	
					<br>
				</div>	

				<div class="wrap-input1 validate-input" data-validate = "Message is required">
					<textarea class="input1" name="Feedback" placeholder="Type in Your Feedback"></textarea>
					<span class="shadow-input1"></span>
				</div>

				<div class="container-contact1-form-btn">
					<button class="contact1-form-btn">
						<span>
							Submit
							<i class="fa fa-long-arrow-right" name="btnsubmit" aria-hidden="true"></i>
						</span>
					</button>
				</div>
			</form>
		</div>
	</div>




<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/tilt/tilt.jquery.min.js"></script>
	<script >
		$('.js-tilt').tilt({
			scale: 1.1
		});
	</script>

<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-23581568-13');
</script>

<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>

<%
    
    try
    {
        String name,email,experience,course,feedback;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/feedbackfinal","feedbackfinal","feedbackfinal");
        Statement stmt=conn.createStatement();
        if(request.getParameter("name")!=null)
        {System.out.println("connected");
            name=request.getParameter("name");
            email=request.getParameter("email");
           course=request.getParameter("Courses");
            experience=request.getParameter("experience");
            feedback=request.getParameter("Feedback");
            int rs=stmt.executeUpdate("insert into feedback1 values('"+name+"','"+email+"','"+course+"','"+experience+"','"+feedback+"')");
            if(rs>0)
            {
                out.println("insert successful");
            }
            else
                out.println("insert error");
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
%>
    