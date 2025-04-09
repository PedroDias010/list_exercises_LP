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
        start(( inicio )) --> input1[\ Digite sua nota \]
        input1 --> input2[\ Digite sua Frequencia em % \]
        input2 --> test{ Nota >= 50 \n and \n Frequencia >= 75% }
        test --> |Não| responsed1[\ reprovado \] 
        test --> |Sim| responsed2[\ Aprovado \]
        
   ```` 
   
  
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
        start(( inicio )) --> input1[\ Digite o N1 \]
        input1 --> input2[\Digite o N2 \]
        input2 --> sum[Resultado = N1 + N2]
        sum --> finish([fim])
   ```
   
   4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
      ```mermaid
      flowchart TD
            start(( inicio )) --> input1[/ Digite sua idade /]
            input1 --> test{ Número >0 \n ou \n Número <0? }
            test --> |Sim| A[\ Positivo \]
            test --> |Não| B[\ Negativo \]
            A --> Finish([Fim])
            B --> Finish
      ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
    start(( inicio )) --> input1[/ Digite sua idade \]
    input1 --> test{ idade >16 \n ou \n Idade <16 }
   test ==> |Sim| A[\ Positivo \]
   test --> |Não| B[\ Negativo \]
   A --> Finish([FIm])
   B --> Finish
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Inicio )) --> A[/ Digite N1 /]
      start --> B[/ Digite N2 /]
      A --> test{ N> determinado }
      B --> test
      test --> finish([Fim])
   
      
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( inicio )) --> A[/ Digite N! /]
   start --> B[/ Digite N2 /]
   start --> C[/ Digite N3 /]
   A --> test{ N> determinado }
   B --> test
   C --> test
   test --> Finish([FIm])
   
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
   A(( Inicio )) --> B[/ Digite um numero /]
   B --> C[r=1]
   C --> D{n>1?}
   D--> |Sim| E{r=r*n}
   F --> D
   D --> |Não| G[/ Resposta = r/]
   G --> H([Fim])
      
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
      H["Sua resposta aqui!"]
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
    flowchart TD
       I["Sua resposta aqui!"]
       start(( Início )) --> A[/ Digite um número /]
       A --> B[O número é >2?]
       B --> C[Sim]
       B --> D[Não]
       C --> E[Fim]
       D --> F[O N é divisvel por 2 até -1?]
       F --> G[O N é divisível por 1 ou por ele mesmo?]
       G --> J[Fim]
    
   ```