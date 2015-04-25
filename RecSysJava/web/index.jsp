<!DOCTYPE HTML>
<!--
	
-->
<html>
	<head>
		<title>RecSysJava</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="js/jquery.min.js"></script>
		<script src="js/jquery.scrolly.min.js"></script>
		<script src="js/jquery.poptrox.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/init.js"></script>
                <script src="//code.jquery.com/jquery-1.10.2.js"></script>
                <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
                <link rel="shortcut icon" href="images/rsj.png" />
		<noscript>
			<link rel="stylesheet" href="css/skel.css" />
			<link rel="stylesheet" href="css/style.css" />
		</noscript>
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
                <script>
  $(function() {
    var availableTags = [
        "",
      "ironman",
      "ironman2",
      "ironman3",
      "ironman4",
      "how",
      "hello",
      "shail.shah2"
    ];
    $( "#movie" ).autocomplete({
      source: availableTags
    });
  });
  </script>
	</head>
	<body>

		<!-- Header -->
			<section id="header">
				<header>
					<h1>RecSysJava</h1>
                                        <p>Shail Shah</p>
                                        <p>Hitarthi Tewani</p>
				</header>
				<footer>
					<a href="#banner" class="button style2 scrolly-middle">Proceed as anticipated :P</a>
				</footer>
			</section>

		<!-- Banner -->
			<section id="banner">
				<header>
                                        
                                    <h2>This is RecSysJava <br />A Movie Recommender System</h2>
				</header>
				<p>The motivation for this method was that the movies similar to both the movies will have common top topics. 
                                    For example, if the two movies are about [war, life struggle] and [life struggle, romance], (i.e. their 
                                    posterior has high values corresponding to these topics) then returning movies that are about life struggle
                                    might be a good idea. For both the movies, the top common topics were chosen. 
                                    The words were then given to an inverted index which returned the words corresponding to these movies. 
                                    The returned set of movies were then ranked based on their topic posteriors, the movies for which the top 
                                    common topics had high stakes were placed above those for which these numbers were lower.</p>
                                
				<footer>
                                    <a href="#first" class="button style2 scrolly">Go search it!!</a><br><br>
                                        <a href="Register/index.jsp" class="button style2 scrolly">Register</a>
				</footer>
			</section>

		<!-- Feature 1 -->
                <section id="first">
			<article id="first" class="container box style3">
				
				<header>
					<h2>Search here</h2>
					<p>Why don't try out our service?</p>
				</header>
				<form method="post" action="GetMovies">
					<div class="row 50%">
						<div class="6u"  style="padding-left: 0.7em;
                                                    padding-right: 50px;
                                                        margin-left: 11.5em;">
                                                    <input id="movie" type="text" class="text" name="movie" placeholder="Enter movie text here"  /></div>
						
					</div>
					
					<div class="row">
						<div class="12u">
							<ul class="actions">
								<li><input type="submit" value="Search it" /></li>
							</ul>
						</div>
					</div>
				</form>
			</article>
                </section>

                <section id="first1">
			<article id="first" class="container box style3">
				
				<header>
					<h2>Movie Manager</h2>
					<p>Why don't try out our movie manager!</p>
				</header>
				<form method="post" action="AddMovie/index.jsp">
					<div class="row 50%">
						<div class="6u"  style="padding-left: 0.7em;
                                                    padding-right: 50px;
                                                        margin-left: 11.5em;">
                                                    </div>
						
					</div>
					
					<div class="row">
						<div class="12u">
							<ul class="actions">
                                                            <li><input type="submit" value="Add Movie" /></li></form>
                                                                <form method="post" action="/RecSysJava/DelMovie/index.jsp">
                                                                    <li><input type="submit" value="Delete Movie" /></li></form>
                                                                <form method="post" action="UpdateMovie/index.jsp">
                                                                    <li><input type="submit" value="Update Movie" /></li></form>
                                                                
							</ul>
						</div>
					</div>
				</form
			</article>
                </section>

                	
		<!-- Contact -->
			<article class="container box style3">
				<header>
					<h2>Contact Us</h2>
					<p>Did you like our work? Why don't drop your details?</p>
				</header>
				<form method="post" action="#">
					<div class="row 50%">
						<div class="6u"><input type="text" class="text" name="name" placeholder="Name" /></div>
						<div class="6u"><input type="text" class="text" name="email" placeholder="Email" /></div>
					</div>
					<div class="row 50%">
						<div class="12u">
							<textarea name="message" placeholder="Message"></textarea>
						</div>
					</div>
					<div class="row">
						<div class="12u">
							<ul class="actions">
								<li><input type="submit" value="Send Message" /></li>
							</ul>
						</div>
					</div>
				</form>
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

	</body>
</html>
