package Ex7;

public class OdernarPacientes {

    public static void main(String[] args) {

        Paciente[] pacientes = {
                new Paciente("João", 3, 5),
                new Paciente("Maria", 3, 10),
                new Paciente("Lucas", 5, 2)
        };

        System.out.println("Pacientes para serem ordenados: ");
        for (int j = 0; j < pacientes.length; j++) {
            pacientes[j].imprimir();
        }

        // Insertion Sort
        for (int i = 1; i < pacientes.length; i++) {

            int index = i;
            while (index > 0 && (pacientes[index].getGravidade() > pacientes[index - 1].getGravidade()
                    ||
                    pacientes[index].getTempo() > pacientes[index - 1].getTempo())) {

                Paciente temp = pacientes[index];
                pacientes[index] = pacientes[index - 1];
                pacientes[index - 1] = temp;

                index--;
            }
        }
        for (int j = 0; j < pacientes.length; j++) {
            if (j < pacientes.length - 1) { System.out.print(pacientes[j].getNome() + ", "); }
            else { System.out.println(pacientes[j].getNome()); }
        }
        System.out.println();
    }
}