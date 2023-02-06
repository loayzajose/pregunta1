@DemoBlaze
Feature: DemoBlaze

  #abre la página antes de cada scenario
  Background: abrir página de prueba
    Given El usuario abre la página de DemoBlaze

  #CASO1: Alta de usuario
  @ESCENARIOWEB_DARALTAUSUARIO
  Scenario Outline: test case <testCase> alta de usuario
    Given El usuario ingresa datos Signup
    And El usuario se da de alta
      |username| password |
      |Oliver123456|Agrobanco_123|

   #CASO2: Ingresar y agregar producto al carrito
  @ESCENARIOWEB_AGREGARPRODUCTO
  Scenario Outline: test case <testCase> agregar producto al carrito
    Given El usuario ingresa datos Login
      |username| password |
      |Oliver123456|Agrobanco_123|
   And se agrega producto al carro de compras
     |name| country | city| creditcard |month| year |
     |LATPOP HP |PERU| LIMA| 4551 0232 1541 0021  |08| 2023 |
