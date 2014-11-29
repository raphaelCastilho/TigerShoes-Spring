<jsp:include page="/WEB-INF/template/header.jsp" />
<div class="container">
	<jsp:include page="/WEB-INF/template/menu.jsp" />
	<div class="row">
		<div class="col-md-5 col-md-offset-5" style="margin-left: 40px;">
			<form action="salvarCliente" class="form-horizontal" role="form" method="post">
				<fieldset>
					<!-- Form Name -->
					<legend>Dados Cadastrais</legend>
					<div class="form-group">
						<label class="col-sm-2 control-label" for="textinput">Nome</label>
						<div class="col-sm-10">
							<input type="text" placeholder="Nome"
								class="form-control">
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-sm-2 control-label" for="textinput">CPF</label>
						<div class="col-sm-10">
							<input type="text" placeholder="CPF"
								class="form-control">
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-sm-2 control-label" for="textinput">E-mail</label>
						<div class="col-sm-10">
							<input type="email" placeholder="exemplo@exemplo.com"
								class="form-control">
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-sm-2 control-label" for="textinput">Senha</label>
						<div class="col-sm-10">
							<input type="password" placeholder="Senha"
								class="form-control">
						</div>
					</div>
						
				</fieldset>
				<fieldset>
					<!-- Form Name -->
					<legend>Endereço</legend>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-sm-2 control-label" for="textinput">Rua</label>
						<div class="col-sm-10">
							<input type="text" placeholder="Endereço"
								class="form-control">
						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-sm-2 control-label" for="textinput">Cidade</label>
						<div class="col-sm-10">
							<input type="text" placeholder="Cidade" class="form-control">
						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-sm-2 control-label" for="textinput">Estado</label>
						<div class="col-sm-4">
							<input type="text" placeholder="Estado" class="form-control">
						</div>

						<label class="col-sm-2 control-label" for="textinput">CEP</label>
						<div class="col-sm-4">
							<input type="text" placeholder="CEP" class="form-control">
						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-sm-2 control-label" for="textinput">País</label>
						<div class="col-sm-10">
							<input type="text" placeholder="País" class="form-control">
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="pull-right">
								<button type="submit" class="btn btn-primary">Cadastrar</button>
							</div>
						</div>
					</div>

				</fieldset>
			</form>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
</div>
<jsp:include page="/WEB-INF/template/footer.jsp" />