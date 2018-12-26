<!DOCTYPE HTML>
<html>
    <head>
        <meta name="layout" content="main" />
        <asset:stylesheet src="usuario.css" />
    </head>
    <body>
        <div class="hero">
            <h1 class="hero-title">
                Criar um novo caminho
            </h1>
        </div>
        <g:form controller="caminho" action="save">
            <fieldset class="form">
                <div class="form-group">
                    <label for="nome" class="form-label">Nome:</label>
                    <input type="text" name="nome" class="form-input-block" placeholder="Qual será o nome do caminho?" required/>
                </div>
                <div class="form-group">
                    <label for="nivel" class="form-label">Nível:</label>
                    <input type="number" name="nivel" class="form-input-block" placeholder="Esse caminho pertence a qual nível?" min="1" required/>
                </div>
                <div class="form-group">
                    <label for="descricao" class="form-label">Descrição:</label>
                    <input type="text" name="descricao" class="form-input-block" placeholder="Qual a descrição desse caminho?" required/>
                </div>
                <div class="form-group">
                    <label for="estoria" class="form-label">Estória:</label>
                    <textarea name="estoria" class="form-input-block" placeholder="Qual a estória que o traz a esse caminho?" required></textarea>
                </div>
                <g:hiddenField name="estagios" value="0" />
                <div class="form-group">
                    <g:submitButton name="criar-caminho" class="submit-button" value="Criar caminho"/>
                </div>
            </fieldset>
        </g:form>
    </body>
</html>