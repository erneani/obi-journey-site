<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <link rel="stylesheet" type="text/css" href="http://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"/>
    <script type="text/javascript" src="http://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
    <title>OBI Journey</title>
</head>
<body>
	<div class="hero-background">
		<div class="hero-background-filter">
			<div class="hero-text">
				<div class="hero-title-wrapper">
					<h1 class="hero-title">
						Todos os caminhos precisam de uma jornada.
					</h1>
				</div>
				<div class="main-subtitle-wrapper">
					<h2 class="hero-subtitle">
						Learn, pratice and master mathematical and logical skills to improve your habilities!
					</h2>
				</div>
				<a class="call-button hero-call-button" href="#">DISCOVER US</a>
			</div>
		</div>
	</div>
	<div class="our-services">
	   <div class="service-card">
       <div class="service-card-image-wrapper">
         <asset:image src="pc.png" />
       </div>
       <h2 class="service-card-title">
         Praticidade
       </h2>
       <p class="service-card-description">
         Lorem ipsum dolor sit amet, consectetur adipisicing elit,
         sed do eiusmod tempor incididunt.
       </p>
       <a class="simple-button">
         Conheça mais
       </a>
     </div>
     <div class="service-card">
       <div class="service-card-image-wrapper">
         <asset:image src="pc.png" />
       </div>
       <h2 class="service-card-title">
         Praticidade
       </h2>
       <p class="service-card-description">
         Lorem ipsum dolor sit amet, consectetur adipisicing elit,
         sed do eiusmod tempor incididunt.
       </p>
       <a class="simple-button">
         Conheça mais
       </a>
     </div>
     <div class="service-card">
       <div class="service-card-image-wrapper">
         <asset:image src="pc.png" />
       </div>
       <h2 class="service-card-title">
         Praticidade
       </h2>
       <p class="service-card-description">
         Lorem ipsum dolor sit amet, consectetur adipisicing elit,
         sed do eiusmod tempor incididunt.
       </p>
       <a class="simple-button">
         Conheça mais
       </a>
     </div>
     <div class="service-card">
       <div class="service-card-image-wrapper">
         <asset:image src="pc.png" />
       </div>
       <h2 class="service-card-title">
         Praticidade
       </h2>
       <p class="service-card-description">
         Lorem ipsum dolor sit amet, consectetur adipisicing elit,
         sed do eiusmod tempor incididunt.
       </p>
       <a class="simple-button">
         Conheça mais
       </a>
     </div>
	</div>
  <div class="exams">
    <h2 class="exams-title">
      Nossas últimas provas
    </h2>
    <p class="exams-description">
      Lorem ipsum dolor sit amet, consectetur adipisicing elit,
      sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
    </p>
    <div class="exams-carousel">
      <div class="exams-carousel-item">
        <img src="https://via.placeholder.com/150"alt="" />
      </div>
      <div class="exams-carousel-item">
        <img src="https://via.placeholder.com/150"alt="" />
      </div>
      <div class="exams-carousel-item">
        <img src="https://via.placeholder.com/150"alt="" />
      </div>
    </div>
  </div>

  <script type="text/javascript">
    $(document).ready(function(){
      $('.exams-carousel').slick({
        infinite: true,
        slidesToShow: 3,
        slidesToScroll: 1,
      });
    });
  </script>
</body>
</html>
