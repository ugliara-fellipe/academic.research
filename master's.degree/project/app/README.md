## Programas

Esses programas são compilados usando o compilador de Cyan, ele pode ser encontrado na pasta [projeto/jar](https://github.com/ugliara-fellipe/academic.research/tree/master/master's.degree/project/jar/) com o nome de [saci.jar](https://github.com/ugliara-fellipe/academic.research/tree/master/master's.degree/project/jar/saci.jar).

Para simplificar essa tarefa foram criados *scripts* para realizar cada etapa necessária a compilação. Lembrando que esses scripts foram usados em um computador com o sistema operacional Ubuntu, e devem ser executados a partir dessa pasta. Etapas da compilação:

- deps.sh: deve ser o primeiro *script* executado, ele irá instalar o Sdk Java;
- config.h: esse *script* cria as pastas necessárias para se executar os programas e copia os arquivos .class dos metaobjetos para a pasta com as bibliotecas padrões de Cyan.

Essas duas etapas não precisam ser repetidas entre a compilação de diferentes programas, a não ser que o compilador de Cyan seja recompilado.

- build.sh: esse script se encarrega de compilar o programa Cyan especificado, ele recebe o nome da pasta com o programa que será compilado;
- run.sh: esse *script* deve ser chamado após o programa estar compilado, ele recebe como argumento o nome do programa que será executado, o número da instância associada a essa execução, e se necessário um parâmetro que será passado ao programa.
