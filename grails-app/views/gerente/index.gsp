<!DOCTYPE HTML>
<html>
    <head>
        <meta name="layout" content="main" />
        <asset:stylesheet src="usuario.css" />
    </head>
    <body>
        <div class="hero">
            <h1 class="hero-title">
                Página de gerenciamento
            </h1>
        </div>
        <g:if test="${flash.error}">
          <div class="div-error-message">
            <h4 class="div-message-label">
              ${flash.error}
            </h4>
          </div>
        </g:if>
        <g:if test="${flash.message}">
          <div class="div-success-message">
            <h4 class="div-message-label">
              ${flash.message}
            </h4>
          </div>
        </g:if>
        <div class="section">
            <div class="section-header">
                <h2 class="section-title">Provas</h2>
                <g:link controller="prova" action="create" class="add">+</g:link>
            </div>
            <div class="card-wrapper">
                <div class="card-green">
                    <h2 class="card-title">O rei roeu</h2>
                    <img src="https://via.placeholder.com/150">
                    <p class="card-description">A roupa do rato foi roída pelo rei de roma que era um cara bem chato e, pelas caridades, que homem feio, ave maria.</p>
                </div>
                <div class="card-green">
                    <h2 class="card-title">O rei roeu</h2>
                    <img src="https://via.placeholder.com/150">
                    <p class="card-description">A roupa do rato foi roída pelo rei de roma que era um cara bem chato e, pelas caridades, que homem feio, ave maria.</p>
                </div>
                <div class="card-green">
                    <h2 class="card-title">O rei roeu</h2>
                    <img src="https://via.placeholder.com/150">
                    <p class="card-description">A roupa do rato foi roída pelo rei de roma que era um cara bem chato e, pelas caridades, que homem feio, ave maria.</p>
                </div>
            </div>
        </div>
        <div class="section">
            <div class="section-header">
                <h2 class="section-title">O Caminho</h2>
                <g:link controller="caminho" action="create" class="add">+</g:link>
            </div>
            <div class="card-wrapper">
                <div class="card-green">
                    <h2 class="card-title">A aventura começa</h2>
                    <h2 class="card-level">1</h2>
                    <p class="card-description">Em uma manhã de verão, você acorda da sua cama e percebe que pode ir mais longe do que sempre pensou.</p>
                </div>
            </div>
        </div>
        <div class="section">
            <div class="section-header">
                <h2 class="section-title">Gerentes</h2>
                <g:link controller="gerente" action="create" class="add">+</g:link>
            </div>
            <div class="card-wrapper">
                <g:each in="${gerenteList}">
                    <div class="card-green">
                        <h2 class="card-title">${it.nome}</h2>
                        <h2 class="card-level">${it.id}</h2>
                        <p class="card-description">${it.email}</p>
                    </div>
                </g:each>
            </div>
        </div>
    </body>
</html>