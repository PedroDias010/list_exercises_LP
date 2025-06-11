![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      inicio(( Início )) --> entrada1[\Digite sua nota\]
      entrada1 --> entrada2[\Digite sua frequência em %\]
      entrada2 --> teste{Nota >= 50 \nE\n frequência >= 75% ?}
      teste --> |Não| resposta1[/Reprovado/]
      teste --> |Sim| resposta2[/Aprovado/]
      resposta1 --> final([Fim])
      resposta2 --> final
    ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      inicio((Início)) --> entrada1[\Digite o primeiro número\]
      entrada1 --> entrada2[\Digite o segundo número\]
      entrada2 --> soma[Resultado = N1 + N2]
      soma --> resultado[/Resultado/]
      resultado --> fim([Fim])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      inicio((Início)) --> entrada[\Digite um número\]
      entrada --> condicao{Número < 0?}
      condicao --> |Sim| saida1[/Seu número é negativo/]
      condicao --> |Não| saida2[/Seu número é positivo/]
      saida2 --> fim([Fim])
      saida1 --> fim
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      inicio((Início)) --> idade[\Digite sua idade\]
      idade --> titulo[\Possui título de eleitor?\]
      titulo --> condicao{Idade >= 16? \n E \n Possui titulo de eleitor?}
      condicao --> |Sim| saida1[/Você pode votar/]
      condicao --> |Não| saida2[/Você não pode votar/]
      saida2 --> fim([Fim])
      saida1 --> fim
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      inicio((Início)) --> numero1[\Digite o primeiro número\]
      numero1 --> numero2[\Digite o segundo número\]
      numero2 --> condicao1{N1 > N2?}
      condicao1 --> |Sim| resposta1[/O primeiro número é maior/]
      resposta1 --> fim([Fim])
      condicao1 --> |Não| condicao2{O segundo número é maior?}
      condicao2 --> |Não| resposta3[/Os números são iguais/]
      condicao2 --> |Sim| resposta2[/O segundo número é maior/]
      resposta2 --> fim
      resposta3 --> fim
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      inicio((Início)) --> numero1[\Digite o primeiro número\]
      numero1 --> numero2[\Digite o segundo número\]
      numero2 --> numero3[\Digite o terceiro número\]
      numero3 --> condicao1{N1 > N2?}
      condicao1 --> |Não| condicao3{N2 > N3?}
      condicao3 --> |Sim| resultado3[/O número 2 é o maior/]
      resultado3 --> final
      condicao3 --> |Não| resultado2
      condicao1 --> |Sim| condicao2{N1> N3?}
      condicao2 --> |Sim| resultado1[/O Número 1 é o maior/]
      condicao2 --> |Não| resultado2[/O número 3 é o maior/]
      resultado1 --> final([Fim])
      resultado2 --> final
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      A((Inicio)) --> B[/Digite um número/]
      B --> C[r=1]
      C --> D{n>1?}
      D --> |Sim| E[r=r*n]
      E --> F[n=n-1]
      F --> D
      D --> |Não| G[/Resposta = r/]
      G --> H([Final])
      
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   ```mermaid
   flowchart TD
      inicio((Início)) --> entrada[\Digite um número\]
      entrada --> condicao{Número % 2 = 0?}
      condicao --> |Sim| saida1[/Seu número é par/]
      condicao --> |Não| saida2[/Seu número é ímpar/]
      saida2 --> fim([Fim])
      saida1 --> fim
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      inicio((Início)) --> B[\Digite um número\]
      B --> C[i=n/2]
      C --> D{i>1?}
      D --> |Sim| E{O resto da divisao \n de n por i é \n igual a zero?}
      D --> |Não| F[/É primo/]
      E --> |Sim| H[/Não é primo/]
      E --> |Não| G[i=i-1]
      G --> D
      F --> I([Final])
      H --> I
   ```