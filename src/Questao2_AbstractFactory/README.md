Questão 2 - Abstract Factory

O padrão Fábrica Abstrata foi escolhido porque ele permite criar famílias de objetos relacionados (no caso, os diferentes meios de pagamento) sem acoplar o código principal às implementações concretas. Cada fábrica concreta decide qual pagamento específico será criado (cartão, boleto ou PIX), deixando o sistema principal genérico e flexível.

Essa abordagem facilita a adição de novos meios de pagamento no futuro sem modificar classes existentes, seguindo o princípio aberto/fechado (Open/Closed Principle). Além disso, mantém o código organizado e demonstra claramente a separação entre criação de objetos e uso de objetos, tornando a arquitetura mais limpa e escalável.