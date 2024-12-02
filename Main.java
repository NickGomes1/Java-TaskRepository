public class Main{
    public static void main(String[] args){
        int data1 = 1980;
        int data2 = 2000;
        int anoAtual = 2023;
        String c1 = "Fulano";
        String c2 = "Beltrano";
        System.out.println(">>> Listagem dos Clientes");
        System.out.println(">>> Ano atual: " + anoAtual);
        System.out.println("------------------------------");
        System.out.println("Nome: " + c1);
        System.out.println("Data de Nascimento: " + data1);
        System.out.println("Idade: " + (anoAtual - data1));
        if(anoAtual - data1 <= 17)
            System.out.println("Característica Etária: ADOLESCENTE");
        else if(anoAtual - data1 <= 29)
            System.out.println("Característica Etária: JOVEM");
        else if(anoAtual - data1 <= 59)
            System.out.println("Característica Etária: ADULTO");
        else
            System.out.println("Característica Etária: IDOSO");
        System.out.println("------------------------------");
        System.out.println("Nome: " + c2);
        System.out.println("Data de Nascimento: " + data2);
        System.out.println("Idade: " + (anoAtual - data2));
        if(anoAtual - data2 <= 17)
            System.out.println("Característica Etária: ADOLESCENTE");
        else if(anoAtual - data2 <= 29)
            System.out.println("Característica Etária: JOVEM");
        else if(anoAtual - data2 <= 59)
            System.out.println("Característica Etária: ADULTO");
        else
            System.out.println("Característica Etária: IDOSO");
        System.out.println("------------------------------");
    }
}