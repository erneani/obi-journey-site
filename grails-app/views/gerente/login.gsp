<!DOCTYPE HTML>
<html>
    <head>
        <meta name="layout" content="main" />
        <asset:stylesheet src="usuario.css" />
    </head>
    <body>
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
        <div class="hero">
            <h1 class="hero-title">
                Entrar como gerente
            </h1>
        </div>
        <g:form controller="gerente" method="POST" action="authenticate">
          <fieldset class="form">
            <div class="form-group">
              <label for="email" class="form-label">Email</label>
              <input type="text" name="email" class="form-input-block" placeholder="Qual o seu email?">
            </div>
            <div class="form-group">
              <label for="senha" class="form-label">Senha</label>
              <input type="password" name="senha" class="form-input-block" placeholder="Qual a sua senha?">
            </div>
            <div class="form-group">
              <g:submitButton name="login" class="submit-button" value="Entrar" />
            </div>
          </fieldset>
        </g:form>
    </body>
</html>