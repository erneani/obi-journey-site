<!DOCTYPE HTML>
<html>
    <head>
        <meta name="layout" content="main" />
        <asset:stylesheet src="usuario.css" />
    </head>
    <body>
        <div class="hero">
            <h1 class="hero-title">
                Criar nova prova
            </h1>
        </div>
        <g:form controller="gerente" action="save">
            <fieldset class="form">
                <div class="form-group">
                    <label for="nome" class="form-label">Título:</label>
                    <input type="text" name="nome" class="form-input-block" placeholder="Qual é o título da prova?" required/>
                </div>
                <div class="form-group">
                    <label for="ano" class="form-label">Ano:</label>
                    <input type="text" name="ano" class="form-input-block" placeholder="Em qual ano foi aplicada essa prova?" required/>
                </div>
                <div class="form-group">
                    <label for="nivel" class="form-label">Nível:</label>
                    <input type="text" name="nivel" class="form-input-block" placeholder="Essa prova é feita para qual nível?" required/>
                </div>
                <div class="form-group">
                    <label for="valor" class="form-label">Valor:</label>
                    <input type="number" name="valor" class="form-input-block" placeholder="Quanto de experiência o usuário receberá?" min="1" required/>
                </div>
                <div class="form-group">
                    <g:submitButton name="criar-prova" class="submit-button" value="Cadastrar"/>
                </div>
            </fieldset>
        </g:form>
    </body>
</html>