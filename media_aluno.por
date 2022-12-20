programa {
  funcao inicio() {
    real a,b, nota_a, nota_b
    escreva("Digite a notas p1 e p2 do aluno A")
    leia(a)
    leia(b)
    escreva("Digite a notas p1 e p2 do aluno B ")
    leia(nota_a)
    leia(nota_b)

    escreva("Média do aluno ", media_aluno(a,b))
        escreva("\nMédia do aluno ", media_aluno(nota_a,nota_b))

  }
  funcao real media_aluno(real nota_a, real nota_b){
    retorne (nota_a + nota_b + 1)/2
  }
}
