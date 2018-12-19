<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <asset:stylesheet src="usuario.css" />
    </head>
    <body>
        <div class="hero">
          <h1 class="hero-title">Cadastrar-se</h1>
        </div>
        <g:form controller="usuario" method="POST" action="save">
          <fieldset class="form">
            <div class="form-group">
              <label for="nome" class="form-label">Nome</label>
              <input type="text" name="nome" class="form-input-block" placeholder="Digite aqui seu nome" />
            </div>
            <div class="form-group">
              <label for="email" class="form-label">Email</label>
              <input type="email" name="email" class="form-input-block" placeholder="Digite aqui seu email">
            </div>
            <div class="form-group">
              <label for="senha" class="form-label">Senha</label>
              <input type="password" name="senha" class="form-input-block" placeholder="Insira sua senha">
            </div>
            <div class="form-group">
              <label for="sexo" class="form-label">Sexo</label>
              <div class="radio-button-group">
                <label for="masculino" class="form-label radio-button-label">Masculino</label>
                <input type="radio" name="sexo" value="masculino">
              </div>
              <div class="radio-button-group">
                <label for="feminino" class="form-label radio-button-label">Feminino</label>
                <input type="radio" name="sexo" value="feminino">
              </div>
              <div class="radio-button-group">
                <label for="nao-binario" class="form-label radio-button-label">Não-binário</label>
                <input type="radio" name="sexo" value="nao-binario" class="form-radio-button">
              </div>
            </div>
            <div class="form-group">
              <label for="ocupation" class="form-label">Qual a sua ocupação?</label>
              <select class="form-input-block" name="ocupacao">
                <option value="not-selected" selected>Selecione uma opção</option>
                <option value="dev">Desenvolvedor</option>
                <option value="student">Estudante</option>
                <option value="professor">Professor</option>
                <option value="hobby">Hobby</option>
              </select>
            </div>
            <div class="form-group">
              <g:submitButton name="create-user" class="submit-button" value="Cadastrar"/>
            </div>
          </fieldset>
        </g:form>
    </body>
</html>
