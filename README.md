# Selenium_Laura

Los cambios principales que he tenido que hacer al código exportado por Selemium IDE/Kantalon son los siguientes:

- Incluir el chrome driver y la siguiente linea de codigo en la linea @Before: System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
  Esto lo he tenido que inlcuir en todas las clases de test (en total 10 clases) 
  
- Otro de los añadidos es: package com.selenium; indicar el paquete al que pertenecen las clases.

- También he añadido una linea de codigo que fuerza una espera. Esto soluionaba algunos fallos que saltaban por que tardaba un poco en cargar la página. 
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
(También he tenido que añadir estea linea para que funcionara el timeout: @SuppressWarnings("deprecation") )
