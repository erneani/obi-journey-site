<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <asset:stylesheet src="usuario.css" />
        <title>SATOBI Página do usuário</title>
    </head>
    <body>
        <div class="hero">
            <h1 class="hero-title">Página do usuário</h1>
        </div>
        <div class="dashboard">
            
        </div>
        <div class="section">
            <div class="section-header">
                <h2 class="section-title">Últimas provas</h2>
            </div>
            <div class="card-wrapper">
                <g:each in="${provaList}">
                    <div class="card-green">
                        <h2 class="card-title">
                            ${it.nome}
                        </h2>
                    </div>
                </g:each>
            </div>
        </div>
    </body>
</html>