package dominio;

public class Curso extends Conteudo {

   private int cargahora;

    @Override
    public double calcularXP() {
    return XP_Padrao * cargahora;
    }

    public Curso(){
    }


    public int getCargahora() {
        return cargahora;
    }

    public void setCargahora(int cargahora){
        this.cargahora = cargahora;
    }



    @Override
    public String toString() {
        return "Curso { " +
               "titulo='" + getTitulo() +  '\'' +
               ", descricao='" + getDescricao() + '\'' +
               ", cargahora='" + cargahora +
               '}';
    }

}