<!doctype html>
<html lang="pt_br" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="OBI - A Jornada"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <asset:javascript src="app.js" />
    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>
<body>

    <!-- Main navigation -->

    <nav class="main-nav">
        <div class="nav-logo">
            <div class="nav-logo-wrapper">
                <asset:image src="eu2.jpg" class="logo-image"/>
            </div>
            <span class="between-bar"></span>
            <div class="nav-logo-header">
                <h6 class="logo-header">
                    OBI Journey
                </h6>
            </div>
        </div>
        <div class="nav-list">
            <ul>
                <li class="nav-list-element">
                  <g:link controller="usuario" action="home" class="commom-button">Home</g:link>
                  <!--<a class="commom-button" href="#">Home</a>-->
                </li>
                <li class="nav-list-element">
                  <a class="commom-button" href="#">About</a>
                </li>
                <li class="nav-list-element">
                  <a class="commom-button" href="#">Journey</a>
                </li>
                <g:if test="${session.usuario}">
                    <li class="nav-list-element">
                        <g:link controller="usuario" action="index" class="user-info-box">
                            <label class="user-info-name">${session.usuario.nome}</label>
                        </g:link>
                    </li>
                    <li class="nav-list-element">
                        <g:link controller="usuario" action="logout" class="user-info-box">Sair</g:link>
                    </li>
                </g:if>
                <g:else>
                    <li class="nav-list-element">
                      <g:link controller="usuario" action="login" class="call-button">Entrar</g:link>
                    </li>
                    <li class="nav-list-element">
                      <g:link controller="usuario" action="create" class="call-button">Cadastrar</g:link>
                    </li>      
                </g:else>
            </ul>
        </div>

    </nav>

    <g:layoutBody/>

    <footer class="footer-base">
      <div class="footer-column">
        <h4 class="footer-list-header">Mapa do site</h4>
        <ul class="footer-list">
          <li><g:link class="footer-list-element">Página principal</g:link></li>
          <li><g:link controller="usuario" action="login" class="footer-list-element">Página do usuário</g:link></li>
          <li><g:link class="footer-list-element">Provas</g:link></li>
          <li><g:link class="footer-list-element">A jornada</g:link></li>
        </ul>
      </div>
    </footer>
    <asset:javascript src="application.js"/>
</body>
</html>
