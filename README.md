# Algoritmos

### Selection Sort
O selection sort compara a cada interação um elemento com os outros, 
visando encontrar o menor. Dessa forma, podemos entender que não existe um melhor caso mesmo que o 
vetor esteja ordenado ou em ordem inversa serão executados os dois laços do algoritmo, o externo e o interno. 
A complexidade deste algoritmo será sempre  O(n^2).

### Insertion Sort
Insertion Sort, ou ordenação por inserção, é um algoritmo de ordenação que, dado uma estrutura (array, lista) 
constrói uma matriz final com um elemento de cada vez, uma inserção por vez. Assim como algoritmos de ordenação quadrática,
é bastante eficiente para problemas com pequenas entradas, 
sendo o mais eficiente entre os algoritmos desta ordem de classificação.

### Complexidade
| Algoritmo | Melhor	 |  Médio  |  Pior |
| --- | --- | --- |  --- |
Insertion sort     | O(n)    |  O(n2)  |  O(n2)
Bubble sort        | O(n)    |  O(n2)  |  O(n2)
Selection sort     | O(n2)   |  O(n2)  |  O(n2)

### Curl
`curl --location --request POST 'http://localhost:8080/insertion/sort'`

`curl --location --request POST 'http://localhost:8080/selection/sort'`

`--header 'Content-Type: application/json' 
--data-raw '{
"cars": [~~~~
{
"name": "Audi RS Q3",
"price": 89900.0
},
{
"name": "Audi A8",
"price": 194500.0
},
{
"name": "Audi A7",
"price": 70500.0
},
{
"name": "Audi A4 allroad",
"price": 45500.0
},
{
"name": "Audi TTS",
"price": 99300.0
},
{
"name": "Audi Q5",
"price": 66900.0
},
{
"name": "Audi A1",
"price": 32750.0
},
{
"name": "Audi A6",
"price": 60750.0
},
{
"name": "Audi Q2",
"price": 48800.0
},
{
"name": "Audi A3",
"price": 36600.0
}
]
}'`