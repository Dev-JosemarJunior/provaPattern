# TODO

## QUEST�O UM
**PROGRESSO: 100%**
Obs: (De acordo com a questao 3, precisaremos ter um controle de carga horaria cursada para cada instancia de curso?)


## QUEST�O DOIS
**PROGRESSO: 90%**
Vamos precisar de um Builder pro curso:
- metodos que retornam `this` (FEITO)
- metodos build (FEITO)
- metodos `gerarEmenta()` que aplique a tecnica builder para gerar um objeto do tipo EMENTA (FEITO)

Implementar um objeto IMENTABUILDER que:
- devera ser chamado dentro do CURSO concreto (FEITO)
- receba as variaveis do CURSO (FEITO)
- passe esses valores para as variaveis deste objeto atraves do builder (FEITO)
- retorne um objeto tipo ementa para classe curso (FEITO)
- Definir se sera retornada uma EMENTA para o CLIENT ou para CURSO e este fara o `sysout` (FEITO)

**Verificar se os prerequisitos da quest�o foram atendidos.**

### Diagrama CURSO BUILDER:
```mermaid
sequenceDiagram
CLIENTE ->> CURSOBUILDER: Me dê uma instância de EMENTA
CURSOBUILDER ->> CURSO: gera um build do produto CURSO no final
CURSO-->>CLIENTE : Receba uma instância de CURSO
```

### Diagrama EMENTA BUILDER:
```mermaid
sequenceDiagram
CURSO->> EMENTABUILDER: Me dê uma instância de EMENTA
EMENTABUILDER->> EMENTA: gera um build do produto EMENTA no final
EMENTA-->>CURSO: Receba uma instância de EMENTA
```


## QUEST�O TR�S
**PROGRESSO: 70%**


Implementar um objeto IMENTABUILDER que:
- Seja montado num singleton (FEITO)
- Checar se � poss�vel criar outra inst�ncia de fora 
- Implementar m�todo de busca e retorno de determinado curso (FEITO)
- Retornar um pr�tipo do curso
- Verificar como � implementado a quest�o da carga hor�ria cursada

**Verificar se os prerequisitos da quest�o foram atendidos.**