# Level 1 – Lambdas i Streams

##  Enunciat de l'exercici
En aquest nivell et familiaritzaràs amb les expressions lambda i l’ús bàsic de l’API de Streams per treballar amb col·leccions. Aprendràs a filtrar, transformar i ordenar dades de forma molt més concisa que amb bucles tradicionals. També començaràs a entendre com les Functional Interfaces permeten encapsular comportaments. És el primer pas per pensar en codi més declaratiu.

Per a tots els exercicis s'ha d'utilitzar l'API de Java Lambdas and Streams de Java 8+.

### Exercici 1

A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes que contenen la lletra ‘o’. Imprimeix el resultat.

### Exercici 2

Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista amb els Strings que a més de contenir la lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat.

### Exercici 3

Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.

### Exercici 4

Fer la mateixa impressió del punt anterior, però mitjançant method reference.

### Exercici 5

Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double. Des del main() de la classe principal, instància la interfície i assigna-li el valor 3.1415. Invoca el mètode getPiValue() i imprimeix el resultat.

### Exercici 6

Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.

### Exercici 7

Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.

### Exercici 8

Crea una Functional Interface que contingui un mètode anomenat reverse(). Aquest mètode ha de rebre i ha de retornar un String. En el main() de la classe principal, injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que torni la mateixa cadena que rep com a paràmetre però al revés. Invoca la instància de la interfície passant-li una cadena i comprova si el resultat és correcte.
## 🛠 Tecnologies
- Backend: Java

##  Instal·lació i Execució
1. Clonar el repositori: `git clone ...`
2. Execució de l'aplicació.
3. Demostració: Executar el `Main()`.
4. Proves: Executar les piles de test a `src/test/java`

