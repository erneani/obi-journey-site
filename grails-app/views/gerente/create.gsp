<!DOCTYPE HTML>
<html>
    <head>
        <meta name="layout" content="main" />
        <asset:stylesheet src="usuario.css" />
    </head>
    <body>
        <div class="hero">
            <h1 class="hero-title">
                Cadastrar novo gerente
            </h1>
        </div>
        <g:form controller="gerente" action="save">
            <fieldset class="form">
                <div class="form-group">
                    <label for="nome" class="form-label">Nome:</label>
                    <input type="text" name="nome" class="form-input-block" placeholder="Qual é o seu nome?" required/>
                </div>
                <div class="form-group">
                    <label for="email" class="form-label">Senha:</label>
                    <input type="email" name="email" class="form-input-block" placeholder="Qual o seu melhor email?" required/>
                </div>
                <div class="form-group">
                    <label for="senha" class="form-label">Senha:</label>
                    <input type="password" name="senha" class="form-input-block" placeholder="Qual senha vem em sua mente?" required/>
                </div>
                <div class="form-group">
                    <g:submitButton name="criar-gerente" class="submit-button" value="Cadastrar"/>
                </div>
            </fieldset>
        </g:form>
    </body>
</html>