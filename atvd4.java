import java.util.Scanner;

class atvd4{
    public static void questao01(){
          // Escreva um programa que leia um número inteiro e verifique se ele é positivo, negativo ou igual a zero.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N == 0){
            System.out.println("O número é " + N );
        }
        if(N > 0){
            System.out.println(N + " é positivo");
        }
        if(0 > N){
            System.out.println(N + " é negativo");
        }
    }
    public static void questao02(){
         // Crie um programa que receba a idade de uma pessoa e exiba se ela é maior de idade ou menor de idade.
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        if( idade >= 18){
            System.out.println("Você tem " + idade + " anos e é maior de idade.");
        }
        else{
            System.out.println("Você tem "+ idade + " anos e é menor de idade.");
        }
    }
    public static void questao03(){
        // Desenvolva um programa que leia dois números inteiros e mostre qual deles é o maior, ou se são iguais.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1 > n2){
            System.out.println(n1 + " é maior que " + n2);
        }
        else if(n2 > n1)
            System.out.println(n2 + " é maior que " + n1);
        else{
            System.out.println("São iguais");
        }
        sc.close();
    }
    public static void questao04(){
          // Faça um programa que verifique se um número é par ou ímpar.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==0) {
            System.out.println("O número digitado é zero.");
        }
        else if(N%2 == 0) {
            System.out.println(N + " é par.");
        }else
            System.out.println(N + " é impar.");
    }
    public static void questao05(){
          //Elabore um programa que leia três notas de um aluno e calcule a média. Em seguida, exiba se o aluno está aprovado (média maior ou igual a 7) ou reprovado.
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double media = (n1+n2+n3)/3;
        if (media >= 7){
            System.out.printf("O Aluno aprovado com %.1f.", media);
        }else
            System.out.printf("O Aluno ficou com média %.1f e está reprovado.",media);
        sc.close();
    }
    public static void questao06(){
        //Crie um programa que receba o nome de duas pessoas e exiba qual delas possui o maior número de caracteres em seu nome.
        Scanner sc = new Scanner(System.in);
        String nome1 = sc.next();
        String nome2 = sc.next();
        String[] qt1 = nome1.split("");
        String[] qt2 = nome2.split("");
        if(nome1.length() == nome2.length()){
            System.out.println("Os nomes têm a mesma quantidade de caracteres, " + nome1.length());
        }
        else if (nome1.length() > nome2.length()){
            System.out.println(nome1 + " é maior, pois possui " + nome1.length() + " caracteres, e " + nome2 + " possui " + nome2.length() + ".");
        }else
            System.out.println(nome2 + " é maior, porque possui " + nome2.length() + " caracteres, e " + nome1 + " possui " + nome1.length() + ".");
    }
    public static void questao07(){
          // Desenvolva um programa que leia um caractere e verifique se ele é uma vogal ou uma consoante.
        Scanner sc = new Scanner(System.in);
        String caractere = sc.next();
        char letra = caractere.charAt(0);
        if(caractere.charAt(0) == 'A' || caractere.charAt(0) == 'E' || caractere.charAt(0) == 'I' || caractere.charAt(0) == 'O' || caractere.charAt(0) == 'U'){
            System.out.println(caractere.charAt(0) + " é vogal");
        }else
            System.out.println(caractere.charAt(0) + " é consoante");
    }
    public static void questao08(){
  // Faça um programa que receba três números e os imprima em ordem crescente.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int menor = 0;
        int meio = 0;
        int maior = 0;
        if (n1 < n2 && n1 < n3) {
            menor = n1;
            if (n2 > n3) {
                maior = n2;
                meio = n3;
            } else
                maior = n3;
            meio = n2;
        }
        if (n2 < n1 && n2 < n3) {
            menor = n2;
            if (n1 > n3) {
                maior = n1;
                meio = n3;
            }
            if (n3 > n1) {
                maior = n3;
                meio = n1;
            }
        }
        if (n3 < n1 && n3 < n2) {
            menor = n3;
            if (n1 > n2) {
                maior = n1;
                meio = n2;
            }
            if (n2 > n1) {
                maior = n2;
                meio = n1;
            }
        }
        System.out.println(menor + " " + meio + " " + maior);
    }
    public static void questao09(){
         // Elabore um programa que calcule o IMC (Índice de Massa Corporal) de uma pessoa, dado o peso e a altura.
        // Em seguida, exiba se a pessoa está abaixo do peso, com peso normal, com sobrepeso, obesa ou muito obesa.
        Scanner sc = new Scanner(System.in);
        double pesoKG = sc.nextDouble();
        double alturaMetros = sc.nextDouble();
        double IMC = pesoKG/(alturaMetros*alturaMetros);
        if(IMC < 18.5){
            System.out.printf("IMC %.2f : Abaixo do Peso.", IMC);
        }
        if(IMC >= 18.5 && IMC <= 24.99){
            System.out.printf("IMC %.2f : Normal.", IMC);
        }
        if(IMC >= 25 && IMC <= 29.99){
            System.out.printf("IMC %.2f : Sobrepeso.", IMC);
        }
        if(IMC >= 30 && IMC <= 34.99){
            System.out.printf("IMC %.2f : Obesidade.", IMC);
        }
        if(IMC >= 35){
            System.out.printf("IMC %.2f : Obesidade Grave.", IMC);
        }
    }
    public static void questao10(){
         // Escreva um programa que receba um número de mês (1 a 12) e exiba o nome do mês correspondente.
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        if (mes == 1){
            System.out.println("Janeiro");
        }
        else if (mes == 2){
            System.out.println("Fevereiro");
        }
        else if (mes == 3){
            System.out.println("Março");
        }
        else if (mes == 4){
            System.out.println("Abril");
        }
        else if (mes == 5){
            System.out.println("Maio");
        }
        else if (mes == 6){
            System.out.println("Junho");
        }
        else if (mes == 7){
            System.out.println("Julho");
        }
        else if (mes == 8){
            System.out.println("Agosto");
        }
        else if (mes == 9){
            System.out.println("Setembro");
        }
        else if (mes == 10){
            System.out.println("Outubro");
        }
        else if (mes == 11){
            System.out.println("Novembro");
        }
        else if (mes == 12){
            System.out.println("Dezembro");
        }else
            System.out.println("Mês inválido.");
    }
    public static void questao11(){
         // Desenvolva um programa que leia o salário de um funcionário e calcule o valor do seu aumento.
        // Para salários superiores a R$ 1.500,00, o aumento deve ser de 10%. Caso contrário, o aumento é de 15%.
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        if (salario >= 1500){
            System.out.printf("%.2f",salario * 1.1);
        }else
            System.out.printf("%2.f",salario * 1.15);
    }
    public static void questao12(){
          // Receba um número inteiro do usuário e verifique se ele é divisível por 3 e por 5 ao mesmo tempo,
        // exibindo uma mensagem apropriada.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%3 == 0 && num%5==0){
            System.out.println(num + " é divisível por ambos 3 e 5.");
        }else
            System.out.println(num + " não é divisível nem por 3 e nem por 5.");
    }
    public static void questao13(){
        // Peça ao usuário que insira o dia da semana (por extenso) e, em seguida, exiba uma mensagem
        // informando se é um dia útil ou um fim de semana.
        Scanner sc = new Scanner(System.in);
        String dia = sc.next();
        if(dia.equals("Segunda-feira") || dia.equals("Terça-Feira") || dia.equals("Quarta-Feira") || dia.equals("Quinta-Feira") || dia.equals("Sexta-Feira")){
            System.out.println(dia + " é dia de semana");

        }else if (dia.equals("Segunda") || dia.equals("Terça") || dia.equals("Quarta") || dia.equals("Quinta") || dia.equals("Sexta")){
            System.out.println(dia + " é dia de semana.");

        }else if (dia.equals("Sábado") || dia.equals("Domingo")){
            System.out.println(dia + " é fim de semana.");

        }else
            System.out.println("Não é um dia da semana.");
    }
    public static void questao14(){
           //  Elabore um programa que leia um número inteiro de 1 a 5 e exiba a mensagem
        //  "Muito bom", "Bom", "Regular", "Insuficiente" ou "Muito insuficiente", de acordo com o valor lido, utilizando switch/case.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Muito Insuficiente.");
                break;
            case 2:
                System.out.println("Insuficiente.");
                break;
            case 3:
                System.out.println("Regular.");
                break;
            case 4:
                System.out.println("Bom.");
                break;
            case 5:
                System.out.println("Muito Bom.");
                break;
    }
    }
    public static void questao15(){
        // Peça ao usuário que digite um número entre 1 e 7 e exiba o dia da semana correspondente (1 - Domingo, 2 - Segunda-feira, etc.).
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Domingo.");
                break;
            case 2:
                System.out.println("Segunda-Feira.");
                break;
            case 3:
                System.out.println("Terça-Feira.");
                break;
            case 4:
                System.out.println("Quarta-Feira.");
                break;
            case 5:
                System.out.println("Quinta-Feira.");
                break;
            case 6:
                System.out.println("Sexta-Feira.");
                break;
            case 7:
                System.out.println("Sábado.");
                break;
            default:
                System.out.println("Número inválido.");
    }
}
    public static void questao16(){
          // Receba um número decimal do usuário e arredonde-o para o inteiro mais próximo usando a estrutura de controle try/catch para tratar exceções.
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        try{
            int inteiro = (int) n;
            int arredondado = Math.round(inteiro);
            System.out.println("O numero arredondado é " + arredondado);
        }catch (Exception e){
            System.out.println("Erro.");
        }
    }
    public static void questao17(){
          // Peça ao usuário que insira a sua idade e verifique se ele é um bebê (0 a 1 ano), criança (1 a 12 anos),
        // adolescente (13 a 18 anos) ou adulto (mais de 18 anos).
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        if (idade >= 0 && idade <= 1){
            System.out.println("É um bebê.");
        } else if(idade > 1 && idade <= 12){
            System.out.println("É uma criança.");
        } else if(idade >= 13 && idade <= 18){
            System.out.println("É um adolescente");
        } else if(idade >= 19 && idade < 130) {
            System.out.println("É um adulto.");
        }else
            System.out.println("Idade inválida");
    }
    public static void questao18(){
        // Peça ao usuário que insira o seu estado civil e, usando a estrutura switch/case, exiba uma mensagem informando se é solteiro, casado, divorciado ou viúvo.
        Scanner sc = new Scanner(System.in);
        String estadoC = sc.next().toLowerCase();
        switch (estadoC){
            case "solteiro":
                System.out.println("Solteiro.");
                break;
            case "casado":
                System.out.println("Casado.");
                break;
            case "divorciado":
                System.out.println("Divorciado.");
                break;
            case "viúvo":
                System.out.println("Viúvo.");
                break;
            default:
                System.out.println("Inválido.");
                break;
    }
}
    public static void questao19(){
          // Solicite ao usuário dois números inteiros e, usando a estrutura switch/case, exiba o resultado da
        // operação escolhida pelo usuário (1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão).
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão ");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("Soma: insira dois números");
                double num1 = sc.nextDouble();
                double num2 = sc.nextDouble();
                double soma = num1 + num2;
                System.out.println(soma);
                break;
            case 2:
                System.out.println("Subtração: insira dois números");
                double num3 = sc.nextDouble();
                double num4 = sc.nextDouble();
                double subtraçao = num3 - num4;
                System.out.println(subtraçao);
                break;
            case 3:
                System.out.println("Multiplicação: insira dois números");
                double num5 = sc.nextDouble();
                double num6 = sc.nextDouble();
                double multiplicaçao = num5 * num6;
                System.out.println(multiplicaçao);
                break;
            case 4:
                System.out.println("Divisão: insira dois números");
                double num7 = sc.nextDouble();
                double num8 = sc.nextDouble();
                double divisao = num7/num8;
                System.out.println(divisao);
                break;
        }
    }
    public static void questao20(){
         // Desenvolva um programa que leia o nome e a idade de uma pessoa. Utilize o bloco try/catch para
        // garantir que a idade digitada seja um valor inteiro válido.
        Scanner sc = new Scanner(System.in);
        try {
            String nome = sc.nextLine();
            int idade = sc.nextInt();
            System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");
        } catch (Exception e) {
            System.out.println("Erro.");
        }
    }
    public static void questao21(){
        // Crie um programa que leia um valor em metros e o converta para centímetros, milímetros e
        // quilômetros. Utilize o bloco try/catch para tratar possíveis exceções durante os cálculos.
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Centimetros, 2 - Milímetros, 3 - Quilômetros");
        int n = sc.nextInt();
        double metros = sc.nextDouble();
        switch (n){
            case 1:
                double centimetros = metros * 100;
                System.out.println(centimetros + " cm");
                break;
            case 2:
                double milimeteros = metros * 1000;
                System.out.println(milimeteros + " mm");
                break;
            case 3:
                double quilometros = metros / 1000;
                System.out.println(quilometros + " km");
                break;
            default:
                System.out.println("Erro.");
                break;
    }
}
public static void main(String[] args) {
    
}
}
    
    
    
    
    
