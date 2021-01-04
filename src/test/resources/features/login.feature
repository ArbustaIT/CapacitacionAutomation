#Author: Abel Cejas
# encoding: utf-8

Feature: Comparar Prendas

	Como usuario
	quiero loguearme en la pagina
	Para acceder a mi usuario

  Scenario: Validación Login Exitoso
    
	Given que el usuario se encuentra en la pagina de automationpractice
	When el usuario ingresa las credenciales
	Then ingresa correctamente a la aplicación de automationpractice

  Scenario: Validación Login Fallido
    
	Given que el usuario se encuentra en la pagina de automationpractice
	When el usuario ingresa las credenciales incorrectas
	Then la aplicación despliega un cartel de error

  Scenario: Nueva Contraseña
    
	Given que el usuario se encuentra en la pagina de automationpractice
	When el usuario ingresa las credenciales incorrectas
	And pide contraseña nueva
	Then se despliega un mensaje de email de recupero enviado
