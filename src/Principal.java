import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("O poderoso chefao");
        filme.setAnoDoLancamento(1979);
        filme.setDuracaoEmMinutos(180);

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        System.out.println(calculadora.getTempoTotal());
    }
}
