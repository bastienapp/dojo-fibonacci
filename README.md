# Fibonacci

Ecrire une méthode récursive qui retourne la valeur du nième élément de la suite de Fibonacci.

	fibo(0) = 0
	fibo(1) = 1
	fibo(n) = fibo(n-1) + fibo(n-2)

Exemple :

* fibo(4) = fibo(3) + fibo(2)
* on remplace les appels à fibo(x) par leurs valeurs respectives, on obtient :
* fibo(4) = (fibo(2) + fibo(1)) + (fibo(1) + fibo(0))
* fibo(4) = ((fibo(1) + fibo(0)) + 1) + (1 + 0)
* fibo(4) = ((1 + 0) + 1) + (1 + 0)
* fibo(4) = 3


Rappel des commande junit :

    javac -cp .:junit-4.12.jar FibonacciTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore FibonacciTest
