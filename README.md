## Escuela Colombiana de Ingeniería
### Arquitecturas de Software
### Introducción al paralelismo - hilos

### Joan Acevedo - Cesar Borray


**Parte I Hilos Java**

1. Como nos pedía el ejercicio, procedemos a completar la clase CountThread para que esta defina el ciclo de vida
de un hilo y asi mismo imprima por pantalla los números entre A y B. Haciendo que la clase quede finalmente de
la siguiente manera:

![Image](https://github.com/user-attachments/assets/33770c14-1950-4a88-8013-a8232beb1beb)

2. Finalmente, procedemos a crear tres hilos en la clase CountThreadMain donde se les asigna diferentes rangos de
números. Procedemos a ejecutar el código de dos maneras distintas:

	1. Iniciando los hilos con "start()". 

		<p align="center">
	   
		![Image](https://github.com/user-attachments/assets/5a735b0f-53e6-41d8-b9a3-cdb4d145548b)
	   	</p>

	   <p align="center">
	   
		![Image](https://github.com/user-attachments/assets/336d3b6c-81f2-4d04-8a92-b74ac0985fb4)
		</p>	
	
	2. Iniciando los hilos con "run()".

	   ![Image](https://github.com/user-attachments/assets/3afd2aaa-ded7-4631-a87b-06318507d379)

		![Image](https://github.com/user-attachments/assets/194a7966-d9ee-4c79-8edd-ef3bb161dc2c)   
   
    3. ¿Cómo cambia la salida?, ¿por qúe? 
   		
       <br>Vemos que iniciando los hilos con "run()" los números aparecen secuencialmente y no intercalados. Esto se 
       debe a que al momento de llamar a "run()" directamente, este se ejecuta como si fuera un método normal en el 
       mismo hilo, es decir, no se crean varios hilos, sino que se ejecutan en uno solo.

**Parte II Hilos Java**


**Parte III Evaluación de Desempeño**



start()



run()



