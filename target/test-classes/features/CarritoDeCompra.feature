@CompletarCompra
#Author: Jhorman Villalva
# encoding: utf-8
Feature: Completar compra
  
  como usuario 
  quiero comprar
  para crear un pedido de compra
  
   Background:
   Given que el usuario se encuentra en la pagina de automationpractice
  
  Scenario: Validacion De Compra exitosa
  When  confirma la orden
  Then  se muestran los datos de la orden de compra
  
  Scenario: Compras sin usuario
  When  se inicia el flujo de compra
  Then  se despliega en el flujo las opciones de registrarse e iniciar sesión
  