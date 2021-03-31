#Author: Jhorman Villalva
# encoding: utf-8
	Feature: Visualizar Ofertas
	  
	  Como usuario 
	  Quiero acceder a la oferta seleccionada
	  Para ser redireccionado a la misma.
	  
  Background:
   Given que el usuario se encuentra en la pagina de automationpractice
   	
	  Scenario: Redirreción de oferta exitosa
	  When  el usuario selecciona una oferta
	  Then  redirecciona a la pagina de la oferta
  
