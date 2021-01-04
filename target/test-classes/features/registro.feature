Feature: Registro

	Como navegante
	Quiero registrarme en la pagina
	Para obtener un usuario


	Scenario: Validación Registro Exitoso
	
		Given que el navegante se encuentra en la pagina de automationpractice
		When el navegante se registra correctamente	
		Then se crea un usuario
	
	Scenario: Validacion Registro Fallido
	
		Given que el navegante se encuentra en la pagina de automationpractice
		When el navegante se registra incorrectamente
		Then el proceso de ingreso marca los campos de error


	