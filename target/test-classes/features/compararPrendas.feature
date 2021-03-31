#Author: Abel Cejas
#encoding: utf-8
Feature: Comparar Prendas
	como usuario 
	quiero comparar prendas
	para visualizar su información.

 Background:
   Given que el usuario se encuentra en la pagina de automationpractice
 
  Scenario: Comparar una prenda  
	When selecciono una prenda 
	Then se visualiza un cartel advirtiendo que falta otra prenda

  Scenario: Comparar dos prendas
  	When selecciono dos prendas
	Then se visualiza una columna por prenda con la informacion respectiva
	
  Scenario: Comparar cuatro prendas
  	When selecciono cuatro prendas
	Then despliega cartel bloqueante