Questão 4 - Decorator

O padrão Decorator foi escolhido porque permite adicionar funcionalidades extras a um relatório de forma flexível, sem modificar a implementação original do relatório básico. Cada decorador encapsula uma nova função (estatísticas, gráficos, exportação), mantendo o comportamento original e permitindo combinações diferentes.

Essa abordagem mantém o código organizado, extensível e fácil de manter. Além disso, ilustra claramente a separação entre comportamento principal e funcionalidades opcionais, garantindo que o sistema possa crescer e se adaptar às necessidades do gestor sem quebrar o que já funciona.