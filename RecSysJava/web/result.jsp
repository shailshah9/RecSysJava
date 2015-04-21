<!DOCTYPE HTML>
<!--
	
-->
<html>
	<head>
		<title>Results @ RecSysJava</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="js/jquery.min.js"></script>
		<script src="js/jquery.scrolly.min.js"></script>
		<script src="js/jquery.poptrox.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/init.js"></script>
                <link rel="shortcut icon" href="images/rsj.png" />
		<noscript>
			<link rel="stylesheet" href="css/skel.css" />
			<link rel="stylesheet" href="css/style.css" />
		</noscript>
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
	</head>
	<body>

		
               <% String name1=(String)request.getAttribute("name1");
                  String name2=(String)request.getAttribute("name2");
                  String name3=(String)request.getAttribute("name3");
                  String name4=(String)request.getAttribute("name4");
                  //String name5=(String)request.getAttribute("name5");
                  
                  String plot1=(String)request.getAttribute("plot1");
                  String plot2=(String)request.getAttribute("plot2");
                  String plot3=(String)request.getAttribute("plot3");
                  String plot4=(String)request.getAttribute("plot4");
                  //String plot5=(String)request.getAttribute("plot5");
                  
                  String year1=(String)request.getAttribute("year1");
                  String year2=(String)request.getAttribute("year2");
                  String year3=(String)request.getAttribute("year3");
                  String year4=(String)request.getAttribute("year4");
                  //String year5=(String)request.getAttribute("year5");
               %>
               
              
                <article class="container box style3">
				
				<section>
					<header>
                                            <h1>Here we go, </h1>
                                            <h3><b><u>RecSysJava</u></b> suggests below listed movies</h3>
					</header>
					<div class="table-wrapper">
						<table class="default">
							<thead>
								<tr>
									
									<th>Name</th>
									<th>Description</th>
									<th>Year</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									
									<td>${name1}</td>
									<td>${plot1}</td>
									<td>${year1}</td>
								</tr>
								<tr>
									
									<td>${name2}</td>
									<td>${plot2}</td>
									<td>${year2}</td>
								</tr>
								<tr>
									
									<td>${name3}</td>
									<td>${plot3}</td>
									<td>${year3}</td>
                                                                </tr>
								<tr>
									
									<td>${name4}</td>
									<td>${plot4}</td>
									<td>${year4}</td>
                                                                </tr>
                                                                
							</tbody>
							
						</table>
					</div>
				</section>
                        
				
			
		<div class="row">
						<div class="12u" style="padding-left: 0.7em;
                                                    padding-right: 50px;
                                                        margin-left: 11.5em;">
							<ul class="actions">
                                                            <li><a href="index.jsp"><input type="button" value="          Go back          " /></a></li>
                                                            <br>
                                                            <br>
                                                            <li><a href="history.jsp"><input type="button" value="Previous Searches" /></a></li>
							</ul>
						</div>
					</div>
                                                                </article>
                           
                <section id="footer">
                    <ul class="icons">
				<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
				<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
				<li><a href="#" class="icon fa-google-plus"><span class="label">Google+</span></a></li>
				<li><a href="#" class="icon fa-pinterest"><span class="label">Pinterest</span></a></li>
				<li><a href="#" class="icon fa-dribbble"><span class="label">Dribbble</span></a></li>
				<li><a href="#" class="icon fa-linkedin"><span class="label">LinkedIn</span></a></li>
			</ul>
                <div class="copyright">
				<ul class="menu">
					<li>&copy; No rights reserved.</li><li>Developers: <a href="#">Shail Shah</a></li><li><a href="#">Hitarthi Tewani</a></li>
				</ul>
			</div>
                </section>
		<!-- Feature 2 -->
			
		<!-- Contact -->
			
		
	</body>
</html>
