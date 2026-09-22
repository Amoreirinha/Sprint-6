# Loja de Consoles — Revisão de POO (GCVA)

Atividade de revisão dos conceitos fundamentais de Orientação a Objetos,
evoluindo um sistema de vendas de consoles de uma loja a partir de um
código propositalmente "malfeito" até uma versão que aplica corretamente
**encapsulamento**, **construtores**, **interface**, **composição**,
**herança** e **polimorfismo**.

## Estrutura do projeto

```
loja-consoles-poo/
├── README.md
└── src/
    ├── Console.java              # Parte 1 e 2 — Encapsulamento e construtores
    ├── IConsole.java              # Parte 3 — Interface (contrato comum)
    ├── DadosConsole.java          # Parte 3 — Composição (dados comuns)
    ├── Nintendo.java               # Parte 3 — implementa IConsole
    ├── Playstation.java            # Parte 3 — implementa IConsole
    ├── PlaystationPortatil.java    # Parte 4 — herda de Playstation
    ├── Xbox.java                    # Parte 5 — extensão sem alterar Loja (OCP)
    ├── Loja.java                    # Parte 5 — polimorfismo sobre IConsole
    └── Atividade_POO_Problema.java  # Classe principal (main)
```

## Como compilar e executar

A partir da pasta `src/`:

```bash
javac *.java
java Atividade_POO_Problema
```

## Saída esperada

```
=== Venda inicial ===
Nintendo ligado.
Nintendo Switch -> Preço final: R$ 2200.0
Playstation ligado.
Playstation 5 -> Preço final: R$ 3600.0
Playstation Portátil ligado.
Playstation Portátil -> Preço final: R$ 2875.0
Faturamento total: R$ 8675.0

=== Venda com Xbox adicionado ===
Nintendo ligado.
Nintendo Switch -> Preço final: R$ 2200.0
Playstation ligado.
Playstation 5 -> Preço final: R$ 3600.0
Playstation Portátil ligado.
Playstation Portátil -> Preço final: R$ 2875.0
Xbox ligado.
Xbox Series X -> Preço final: R$ 3304.0
Faturamento total: R$ 11979.0
```

## O que cada parte demonstra

| Parte | Conceito | O que foi feito |
|---|---|---|
| 1 | Encapsulamento | Atributos de `Console` tornados privados, com getters para leitura |
| 2 | Construtores | `Console` só pode nascer com nome, tipo e preço definidos |
| 3 | Interface + Composição | `IConsole` define o contrato comum; `DadosConsole` é reaproveitado por composição em `Nintendo` e `Playstation`, em vez de repetir os mesmos campos |
| 4 | Herança apropriada | `PlaystationPortatil extends Playstation`, sobrescrevendo apenas o **cálculo** de `ligar()`/`calcularPreco()`, sem violar o Princípio de Substituição de Liskov (LSP) |
| 5 | Polimorfismo / OCP | `Loja` opera apenas sobre `IConsole`, sem `if/instanceof`; a classe `Xbox` é adicionada ao sistema sem alterar nenhuma linha de `Loja` |

## Respostas às perguntas de reflexão do roteiro

- **Por que `DadosConsole` separado, em vez de nome/precoBase direto em
  `Nintendo`/`Playstation`?** Porque é *composição* ("tem um"
  `DadosConsole`), evitando duplicar os mesmos dois campos em cada classe
  e isolando um conceito (dados básicos de um console) que pode ser
  reaproveitado por qualquer tipo futuro.

- **`PlaystationPortatil` sobrescreve dois métodos herdados — isso é um
  problema?** Não. Ela continua **cumprindo a promessa** de `ligar()` e
  `calcularPreco()`, só muda o cálculo interno. Isso é diferente do
  exemplo de `jogarDisco()` (material de SOLID), que lançava
  `UnsupportedOperationException` — ali a subclasse **recusa** fazer o
  que o método promete, violando o LSP.

- **O que precisou mudar em `Loja` para o `Xbox` funcionar? O que isso
  demonstra sobre o OCP?** Nada mudou em `Loja`. Isso demonstra o
  Princípio Aberto/Fechado: a classe está *aberta para extensão* (novos
  tipos de console) e *fechada para modificação* (seu código-fonte não
  precisa ser tocado).

## Conexão com SOLID

Esta atividade serve de base para os princípios SOLID trabalhados no
material "Solucao_P1" desta disciplina: a mesma loja de consoles aparece
lá com injeção de dependência (DIP) e separação de responsabilidades
(SRP), construídas sobre os conceitos de OO aplicados aqui.

## Disciplina

GCVA — Gestão do Ciclo de Vida da Aplicação
