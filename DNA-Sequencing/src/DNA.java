// Identifies whether a DNA strand contains a protein
public class DNA {

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna3;

        int start = dna.indexOf("ATG");
        int stop = dna.indexOf("TGA");

        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            System.out.println("Condition 1 and 2 and 3 are satisfied.");

            String protein = dna.substring(start, stop+1);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No Protein.");
        }

    }

}
