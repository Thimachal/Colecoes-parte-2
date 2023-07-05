import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Character question = 's';
        List<Gender> listMasculino = new ArrayList<Gender>();
        List<Gender> listFeminino = new ArrayList<Gender>();

        do {
            Gender person = new Gender();
            System.out.println("Digite o nome");
            person.setName(String.valueOf(scanner.next()));
            System.out.println("Digite o sexo M para Masculino ou F para Feminino");
            person.setGender(Character.valueOf(scanner.next().charAt(0)));

            if(person.getGender().equals('M') || person.getGender().equals('m') ){
                listMasculino.add(person);
            }else if (person.getGender().equals('F') || person.getGender().equals('f')) {
                listFeminino.add(person);
            }

            System.out.println("Deseja realizar novo cadastro? Digite s ou S para SIM ");
            question=scanner.next().charAt(0);
        } while (question.equals('s') || question.equals('S'));

        if(listMasculino.size() != 0) {
            System.out.print("Pessoas do sexo Masculino: ");
            for (Gender i : listMasculino) {
                System.out.print(i.getName() + ", ");
            }
        }

        System.out.println();

        if(listFeminino.size() != 0) {
            System.out.print("Pessoas do sexo Feminino: ");
            for (Gender i : listFeminino) {
                System.out.print(i.getName() + ", ");
            }
        }

    }
}