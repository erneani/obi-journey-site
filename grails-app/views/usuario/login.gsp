<!DOCTYPE html>
<html>
  <head>
    <title>SATOBI Login</title>
    <meta name="layout" content="main" />
    <asset:stylesheet src="usuario.css" />
  </head>
  <body>
    <div class="hero">
      <h1 class="hero-title">Conectar-se</h1>
    </div>
    <g:form resource="${this.usuario}" method="POST" action="index">
      <fieldset class="form">
        <div class="form-group">
          <label for="email" class="form-label">Email</label>
          <input type="text" name="email" value="" class="form-input-block" placeholder="Digite seu email">
        </div>
        <div class="form-group">
          <label for="senha" class="form-label">Senha</label>
          <input type="password" name="senha" value="" class="form-input-block" placeholder="Digite sua senha">
        </div>
        <div class="form-group">
          <g:submitButton name="login" class="submit-button" value="Entrar" />
        </div>
        <div class="form-group">
          <g:actionSubmit controller="usuario" action="create" class="submit-button" value="Não tem login? Cadastrar-se" />
        </div>
      </fieldset>
    </g:form>
  </body>
</html>
