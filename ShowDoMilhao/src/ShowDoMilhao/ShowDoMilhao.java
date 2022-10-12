package ShowDoMilhao;

import java.util.ArrayList;
import Classes.Perguntas;
import Views.ViewInicial;

public class ShowDoMilhao {
    public static void main(String[] args) {
        
        ArrayList<String> valor = new ArrayList<>();
        valor.add("ZERO");
        valor.add("500 REAIS");
        valor.add("MIL REAIS");
        valor.add("2,5 MIL REAIS");
        valor.add("5 MIL REAIS");
        valor.add("10 MIL REAIS");
        valor.add("25 MIL REAIS");
        valor.add("50 MIL REAIS");
        valor.add("100 MIL REAIS");
        valor.add("250 MIL REAIS");
        valor.add("500 MIL REAIS");
        valor.add("1 MILHÃO DE REAIS");

        /*
        ArrayList<Perguntas> pergunta = new ArrayList<>();        
        pergunta.add(new Perguntas("<html>Qual a forma correta de declarar uma variável 'nomes' do tipo Arraylist de String?</html>","Arraylist<String> nomes","ArrayList(string) nomes","ArrayList<String> nomes","Arraylist(String) nomes", 3, 1));
        pergunta.add(new Perguntas("<html>Como transformar um inteiro em uma string?</html>","String.valueOf(int)","String.parseInt(int)","String.setInt(int)","String.toInt(int)", 1, 1));
        pergunta.add(new Perguntas("<html>Qual o comando para atrelar uma classe à sua classe-pai?</html>","subClass","inserts","extends","implements", 3, 2));
        pergunta.add(new Perguntas("<html>Qual a forma correta de instanciar os atributos nas classes-pai de forma que a classe atrelada à ela consiga acessá-los?</html>","private","public","protected","Não precisa especificar", 3, 2));
        pergunta.add(new Perguntas("<html>Qual termo é usado para indicar que uma função não possui retorno?</html>","value","empty","null","void", 4, 1));
        pergunta.add(new Perguntas("<html>Qual o método usado na main para receber um valor de um atributo de uma classe?</html>","getNome()","setNome()","parseNome()","takeNome()", 1, 1));
        pergunta.add(new Perguntas("<html>Como atribuir um valor que foi passado para uma classe por parâmetro e com variável de mesmo nome?</html>","var = var;","that.var = var;","this.var = var;","super.var = var;", 3, 1));
        pergunta.add(new Perguntas("<html>Qual comando utilizar para imprimir no console de forma que, ao final da impressão, uma linha é saltada?</html>","system.out.println(\"frase\");","System.out.println(\"frase\");","system.println(\"frase\");","System.println(\"frase\");", 2, 1));
        pergunta.add(new Perguntas("<html>Qual linha de código não pode faltar na construção de um Form Jframe?</html>","insertComponents();","initComponents();","Components();","System.Components();", 2, 2));
        pergunta.add(new Perguntas("<html>Como fazer comentários que ocupam mais que 1 linha no código?</html>","\\\\* texto *\\\\","\\\\ texto \\\\","\\\\ texto","\\* texto *\\", 4, 1));
        pergunta.add(new Perguntas("<html>Como remover uma posição do Arraylist?</html>","nome.remove(posicao)","posicao.remove(nome)","remove.posicao(nome)","remove.nome(posicao)", 1, 2));
        pergunta.add(new Perguntas("<html>Como chamar uma interface gráfica da classe View?</html>","nome.setVisible()","nome.setVisible(true)","nome.getVisible()","nome.getVisible(true)", 2, 2));
        pergunta.add(new Perguntas("<html>Quanto ao método Scanner, qual a opção incorreta?</html>","scan.nextInt()","scan.nextDouble()","scan.nextBoolean()","scan.nextString()", 4, 2));
        pergunta.add(new Perguntas("<html>Na programação orientada a objetos, a instanciação de objetos tem o objetivo de:</html>","Criar um objeto","Definir atributos e métodos de uma classe","inicializar uma classe","Abstrair os atributos de um objeto", 1, 3));
        pergunta.add(new Perguntas("<html>A descrição de um conjunto de entidades (reais ou abstratas) de um mesmo tipo e com as mesmas características e comportamentos. Trata-se da definição de:</html>","Método","Conjunto","Classe","Objeto", 3, 3));
        pergunta.add(new Perguntas("<html>Complete:<br>\"______ é uma estrutura composta por ______ que descrevem suas propriedades e também por ______ que moldam seu comportamento.\"</html>","Classe - operações - atributos","Classe - atributos - operações","Objeto - classes - operações","Objeto - operações - atributos", 2, 3));
        pergunta.add(new Perguntas("<html>Um objeto é composto pelos seus dados e pelas funções que os manipulam. Esses componentes são conhecidos, respectivamente, por:</html>","Classes e atributos","Propriedades e classes","Métodos e propriedades","Atributos e métodos", 4, 3));
        pergunta.add(new Perguntas("<html>A alternativa que contém apenas operadores válidos na linguagem Java é:</html>","/, !=, >= e *","+, ==, <> e %","-, :=, != e /","*, <=, ** e >", 1, 3));
        pergunta.add(new Perguntas("<html>Assinale a alternativa correta sobre as características da linguagem de programação Java.</html>","A execução do código-objeto é feita diretamente pelo sistema operacional.","Possui 32 palavras reservadas.","A linguagem é totalmente interpretada.","Não suporta o uso de ponteiros.", 4, 3));
        pergunta.add(new Perguntas("<html>Em JAVA, os tipos são divididos em primitivos e por referência. Assinale a alternativa que contém todos os tipos primitivos de JAVA.</html>","boolean, short, int, long e real.","boolean, short, int, long, byte, timestamp e real.","boolean, short, int, long, char, float e complex.","boolean, short, int, long, char, byte, float e double.", 4, 3));
        pergunta.add(new Perguntas("<html>Em relação ao conceito de criação de identificadores em JAVA, marque V para verdadeiro e F para falso. Em seguida, assinale a alternativa com a sequência correta. ( ) 5nome ( ) nome completo ( ) $tempo ( ) nome5</html>","F-V-F-F","F-F-V-V","V-V-F-V","V-F-V-F", 3, 4));
        pergunta.add(new Perguntas("<html>No Java, a classe que implementa uma lista ordenada que permite a inclusão de elementos nulos ( null) é:</html>","List","Collection","HashSet","ArrayList", 4, 4));
        */
        
        ArrayList<Perguntas> pergunta = new ArrayList<>();
        pergunta.add(new Perguntas("<html>Qual bicho transmite Doença de Chagas?</html>", "Abelha", "Barata", "Pulga", "Barbeiro", 4, 1));
        pergunta.add(new Perguntas("<html>Em que país nasceu Carmem Miranda?</html>", "Brasil", "Espanha", "Portugal", "Argentina", 3, 1));
        pergunta.add(new Perguntas("<html>Seguindo a sequência do baralho, qual carta vem depois do dez?</html>", "Rei", "Valete", "Nove", "Ás", 2, 1));
        pergunta.add(new Perguntas("<html>O adjetivo \"venoso\" está relacionado a:</html>", "Vela", "Vento", "Vênia", "Veia", 4, 1));
        pergunta.add(new Perguntas("<html>A compensação por perda é chamada de...</html>", "Déficit", "Indenização", "Indexação", "Indébito", 2, 1));
        pergunta.add(new Perguntas("<html>Qual a profissão dos sete anões da Branca de Neve?</html>", "Mineiros", "Lenhadores", "Agricultores", "Pastores", 1, 1));
        pergunta.add(new Perguntas("<html>O que é a Via Láctea?</html>", "Marca de leite", "Civilização antiga", "Carro", "Galáxia", 4, 1));
        pergunta.add(new Perguntas("<html>Quantas folhas tem um trevo da sorte?</html>", "3", "4", "5", "6", 2, 1));
        pergunta.add(new Perguntas("<html>Quantos centavos tem 1 real?</html>", "1", "10", "100", "1000", 3, 1));
        
        pergunta.add(new Perguntas("<html>Qual fruto é conhecido no Norte e Nordeste como \"jerimum\"?</html>", "Caju", "Abóbora", "Chuchu", "Côco", 2, 2));
        pergunta.add(new Perguntas("<html>Qual é o coletivo de cães?</html>", "Matilha", "Rebanho", "Alcateia", "Manada", 1, 2));
        pergunta.add(new Perguntas("<html>Qual montanha se localiza entre a fronteira do Tibet com o Nepal?</html>", "Monte Everest", "Monte Carlo", "Monte Fuji", "Monte Branco", 1, 2));
        pergunta.add(new Perguntas("<html>Em que parte do corpo se encontra a epiglote?</html>", "Estômago", "Pâncreas", "Rim", "Boca", 4, 2));
        pergunta.add(new Perguntas("<html>Qual é a capital dos Estados Unidos?</html>", "Nova York", "Miami", "Chicago", "Washington", 4, 2));
        pergunta.add(new Perguntas("<html>Qual metal é utilizado na cunhagem de moedas?</html>", "Níquel", "Cobre", "Chumbo", "Mercúrio", 1, 2));
        pergunta.add(new Perguntas("<html>O que é Ornitorrinco?</html>", "Vulcão", "Rio", "Legume", "Animal", 4, 2));
        
        pergunta.add(new Perguntas("<html>Qual é o triângulo que tem todos os lados diferentes?</html>", "Equilátero", "Isóceles", "Escaleno", "Trapézio", 3, 3));
        pergunta.add(new Perguntas("<html>Qual é o antônimo de \"malograr\"?</html>", "Perder", "Fracassar", "Conseguir", "Desprezar", 3, 3));
        pergunta.add(new Perguntas("<html>Qual foi o último Presidente do período da ditadura militar no Brasil?</html>", "Costa e Silva", "João Figueiredo", "Ernesto Geisel", "Emílio Médici", 2, 3));
        pergunta.add(new Perguntas("<html>Que nome se dá à purificação por meio da água?</html>", "Abolição", "Abnegação", "Ablução", "Abrupção", 3, 3));
        pergunta.add(new Perguntas("<html>Quantos noves tem de 0 a 100?</html>", "10", "11", "20", "21", 3, 3));
        pergunta.add(new Perguntas("<html>Em que ano nasceu o apresentador Silvio Santos?</html>", "1927", "1928", "1929", "1930", 4, 3));
        pergunta.add(new Perguntas("<html>Quando o Brasil ganhou sua primeira Copa do Mundo?</html>", "1950", "1958", "1970", "1994", 2, 3));
        
        pergunta.add(new Perguntas("<html>Quem compôs o Hino da Independência?</html>", "Dom Pedro I.", "Manuel Bandeira", "Castro Alvez", "Carlos Gomes", 1, 4));        
        pergunta.add(new Perguntas("<html>A tecnologia de comunicação \"Bluetooth\" tirou seu nome de:</html>", "Um rio", "Um rei", "Um general", "Uma cor", 2, 4));
        pergunta.add(new Perguntas("<html>O fígado é responsável pela produção da:</html>", "Insulina", "Bílis", "Saliva", "Urina", 2, 4));
        
        
        new ViewInicial(valor, pergunta, "").setVisible(true);                       
    }
}