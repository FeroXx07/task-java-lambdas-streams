# Level 2 – Manipulació funcional de dades

##  Enunciat de l'exercici
Ara que ja tens els fonaments, et centraràs en transformar col·leccions de forma més complexa i expressiva. Treballaràs amb condicions més específiques, operacions combinades i modificacions directes dels elements. A més, crearàs interfícies funcionals per representar operacions aritmètiques com a funcions reutilitzables, acostant-te al paradigma funcional.

### Exercici 1

Crea una llista de cadenes amb noms propis. Escriu un mètode que retorna una llista de totes les cadenes que comencen amb la lletra 'A' (majúscula) i tenen exactament 3 lletres. Imprimeix el resultat.

### Exercici 2

Programa un mètode que retorna una cadena separada per comes, basada en una llista d’Integers. Cada element ha d’anar precedit per lletra “e” si el nombre és parell, o per la lletra “o” si el nombre és imparell. Per exemple, si la llista d’entrada és (3, 55, 44), la sortida ha de ser “o3, o55, e44”. Imprimeix el resultat.

### Exercici 3

Crea una Functional Interface que contingui un mètode anomenat operacio(). Aquest mètode ha de retornar un float. Injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que es pugui transformar l’operació amb una suma, una resta, una multiplicació i una divisió.

### Exercici 4

Crea una llista que contingui algunes cadenes de text i nombres.

Ordena-les per:

    Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi numèric del primer caràcter)
    Les cadenes que contenen una "e" primer, la resta de cadenes després. Posa el codi directament a la lambda.
    Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.
    Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings).

## 🛠 Tecnologies
- Backend: Java

##  Instal·lació i Execució
1. Clonar el repositori: `git clone ...`
2. Execució de l'aplicació.
3. Demostració: Executar el `Main()`.
4. Proves: Executar les piles de test a `src/test/java`

