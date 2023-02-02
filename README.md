# javaFlyweightPattern

* É um padrão do tipo estrutural.

* PROPOSITO:
  * O padrão compartilha partes do estado do objeto entre vários objetos. Logo, ele abstrai as partes reutilizáveis e, ao inves de criar objetos sempre que necessário, podemos reutilizar objetos criados por outras instancias. Isso torna possível reduzir a capacidade de memoria exigida pela aplicativo.

* SOLUÇÃO:
  * Este padrao possui varios componentes: o cliente é o objeto que aciona a execução. A FlyweightFactory é a fabrica que usaremos para criar os objetos flyweight ou objetos leves. O flyweight corresponde aos objetos que queremos reutilizar para que sejam mais rapidos.

* VANTAGENS:
  * Reduz bastante o peso dos dados no servidor

* DESVANTAGEM:
  * Consome um pouco mais de tempo para realizar as buscas.
