Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[6];
        int[] vetor2 = new int[6];

        System.out.println("Digite os 6 números para o vetor 1:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("\nDigite os 6 números para o vetor 2:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Encontrar elementos comuns
        List<Integer> comuns = new ArrayList<>();
        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    // Para evitar duplicatas na lista de comuns
                    if (!comuns.contains(vetor1[i])) {
                        comuns.add(vetor1[i]);
                    }
                }
            }
        }

        // Exibir o vetor de elementos comuns
        System.out.println("\nElementos comuns aos dois vetores:");
        for (int num : comuns) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}
