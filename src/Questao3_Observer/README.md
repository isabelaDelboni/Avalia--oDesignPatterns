Questão 3 - Observer

O padrão Observer foi escolhido porque ele permite que múltiplos leitores recebam notificações automáticas sempre que uma notícia é publicada, sem que o sistema principal precise controlar manualmente quem deve ser avisado. Cada tópico funciona como um Subject, enquanto cada leitor atua como um Observer, recebendo atualizações de forma independente.

Essa abordagem mantém o código organizado, facilita a manutenção e garante que o sistema seja flexível para novos tópicos ou leitores, além de ilustrar claramente a separação entre o que gera eventos e o que reage a eles. Com isso, o Observer torna o sistema escalável e pronto para crescer conforme o site de notícias adiciona mais funcionalidades.