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

		
               <% 
                  String name1=(String)request.getAttribute("name1");
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
                  
                  String name11=(String)request.getAttribute("name11");
                  String name21=(String)request.getAttribute("name21");
                  String name31=(String)request.getAttribute("name31");
                  String name41=(String)request.getAttribute("name41");
                  //String name5=(String)request.getAttribute("name5");
                  
                  String plot11=(String)request.getAttribute("plot11");
                  String plot21=(String)request.getAttribute("plot21");
                  String plot31=(String)request.getAttribute("plot31");
                  String plot41=(String)request.getAttribute("plot41");
                  //String plot5=(String)request.getAttribute("plot5");
                  
                  String year11=(String)request.getAttribute("year11");
                  String year21=(String)request.getAttribute("year21");
                  String year31=(String)request.getAttribute("year31");
                  String year41=(String)request.getAttribute("year41");
                  
                  String name12=(String)request.getAttribute("name12");
                  String name22=(String)request.getAttribute("name22");
                  String name32=(String)request.getAttribute("name32");
                  String name42=(String)request.getAttribute("name42");
                  //String name5=(String)request.getAttribute("name5");
                  
                  String plot12=(String)request.getAttribute("plot12");
                  String plot22=(String)request.getAttribute("plot22");
                  String plot32=(String)request.getAttribute("plot32");
                  String plot42=(String)request.getAttribute("plot42");
                  //String plot5=(String)request.getAttribute("plot5");
                  
                  String year12=(String)request.getAttribute("year12");
                  String year22=(String)request.getAttribute("year22");
                  String year32=(String)request.getAttribute("year32");
                  String year42=(String)request.getAttribute("year42");
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
               </article>
               
               
               
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
									
									<td>${name11}</td>
									<td>${plot11}</td>
									<td>${year11}</td>
								</tr>
								<tr>
									
									<td>${name21}</td>
									<td>${plot21}</td>
									<td>${year21}</td>
								</tr>
								<tr>
									
									<td>${name31}</td>
									<td>${plot31}</td>
									<td>${year31}</td>
                                                                </tr>
								<tr>
									
									<td>${name41}</td>
									<td>${plot41}</td>
									<td>${year41}</td>
                                                                </tr>
                                                                
							</tbody>
							
						</table>
					
                                        </div>
				</section>
               </article>
              
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
									
									<td>${name12}</td>
									<td>${plot12}</td>
									<td>${year12}</td>
								</tr>
								<tr>
									
									<td>${name22}</td>
									<td>${plot22}</td>
									<td>${year22}</td>
								</tr>
								<tr>
									
									<td>${name32}</td>
									<td>${plot32}</td>
									<td>${year32}</td>
                                                                </tr>
								<tr>
									
									<td>${name42}</td>
									<td>${plot42}</td>
									<td>${year42}</td>
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
