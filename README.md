## Escuela Colombiana de Ingeniería

---

### Arquitecturas de Software
### Introducción al paralelismo - hilos

---

### Joan Acevedo - Cesar Borray

---

**Parte I Hilos Java**

1. Como nos pedía el ejercicio, procedemos a completar la clase CountThread para que esta defina el ciclo de vida 
de un hilo y así mismo imprima por pantalla los números entre A y B. Haciendo que la clase quede finalmente de 
la siguiente manera:

   <p align="center">
   <img src="https://github.com/user-attachments/assets/33770c14-1950-4a88-8013-a8232beb1beb">
   </p>

2. Finalmente, procedemos a crear tres hilos en la clase CountThreadMain donde se les asigna diferentes rangos de 
números. Procedemos a ejecutar el código de dos maneras distintas:

	1. **Iniciando los hilos con "start()".**

	   <p align="center">
	   <img src="https://github.com/user-attachments/assets/5a735b0f-53e6-41d8-b9a3-cdb4d145548b">
	   </p>

	   <p align="center">
	   <img src="https://github.com/user-attachments/assets/336d3b6c-81f2-4d04-8a92-b74ac0985fb4">
	   </p>

	2. **Iniciando los hilos con "run()".**

	   <p align="center">
	   <img src="https://github.com/user-attachments/assets/3afd2aaa-ded7-4631-a87b-06318507d379">
	   </p>

	   <p align="center">
	   <img src="https://github.com/user-attachments/assets/194a7966-d9ee-4c79-8edd-ef3bb161dc2c">
	   </p>

	3. **¿Cómo cambia la salida?, ¿por qué?**

	   Vemos que iniciando los hilos con "run()" los números aparecen secuencialmente y no intercalados.  
	   Esto se debe a que al momento de llamar a "run()" directamente, este se ejecuta como si fuera un método  
	   normal en el mismo hilo, es decir, no se crean varios hilos, sino que se ejecutan en uno solo.

---

**Parte II Hilos Java**

1. Como nos pide el ejercicio, procedemos a crear una clase tipo Thread la cual nos permite calcular una parte de los
dígitos requeridos.

<p align="center">
<img src ="https://github.com/user-attachments/assets/8a2766a4-800a-4334-b749-6da068f3bff0">
</p>

2. Para esta parte, inicialmente procedimos a cambiar el método original "getDigits()" para que recibiera el parámetro
adicional N, sin embargo, a medida que íbamos avanzando, decidimos hacer una sobrecarga de este método, ya que
consideramos que de esta manera es más fácil trabajar el código. Finalmente el método quedo asi:

<p align="center">
<img src="https://github.com/user-attachments/assets/743ee92e-bdf3-4375-a1e1-79ead905be20">
</p>

3. Ajustamos las pruebas JUnit para los casos en que se usa 1, 2 o 3 hilos, como se muestra a continuación:

<p align="center">
<img src="https://github.com/user-attachments/assets/561e32c7-d99e-43ff-8633-38afe730eaf5">
</p>


---

**Parte III Evaluación de Desempeño**  

Para esta parte, implementamos la secuencia de experimentos pedida para calcular el millon de dígitos (hex) de PI, para cada prueba documentaremos su consumo de memoria, uso promedio de CPU, hilos usados y tiempo de ejecucion

1. Un solo hilo.
![Image](https://github.com/user-attachments/assets/b9199cce-26eb-40ec-ad54-4d9151930460)

![Image](https://github.com/user-attachments/assets/707473bd-886b-4e98-a364-de3fd1a5be3b)



2. Tantos hilos como núcleos de procesamiento (haga que el programa determine esto haciendo uso del API Runtime).
![Image](https://github.com/user-attachments/assets/a21b9791-534b-4144-931d-4b65d0fe6a6b)

![Image](https://github.com/user-attachments/assets/8b4ac29d-3910-4aaa-b7a7-b6d2a55b31fd)

![Image](https://github.com/user-attachments/assets/69bb27de-9a9e-43aa-961b-8dd5afcf9f38)



3. Tantos hilos como el doble de núcleos de procesamiento.
![Image](https://github.com/user-attachments/assets/af72e463-d1ca-401d-b0c5-050be868f65d)

![Image](https://github.com/user-attachments/assets/f3d08652-4a03-43ae-80a5-8a2796bb409a)

4. 200 hilos.
![Image](https://github.com/user-attachments/assets/8bf14923-a575-4eb1-a03b-0b580007cc3e)

![Image](https://github.com/user-attachments/assets/416e9214-8ded-4759-aab8-6eff91d15bc4)

5. 500 hilos.
![Image](https://github.com/user-attachments/assets/78dc38b4-8c04-4203-8fc5-de84448a1ad5)

![Image](https://github.com/user-attachments/assets/a17f1bfd-b36d-45d7-989e-6a25149a2def)

Para recopilar la informacion dada de mejor forma, haremos una tabla de resultados

| Configuración | Tiempo de ejecución (ms) | Uso de CPU (%) | Memoria usada (MB) |
|--------------|--------------------|--------------|----------------|
| 1 Hilo       | XXXX               | XX%          | XXX MB         |
| N Núcleos    | XXXX               | XX%          | XXX MB         |
| 2N Núcleos   | XXXX               | XX%          | XXX MB         |
| 200 Hilos    | XXXX               | XX%          | XXX MB         |
| 500 Hilos    | XXXX               | XX%          | XXX MB         |
