package gwrowthAPopulation;

class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years=0;
        while(p0<p){
            System.out.println("Athe the end of the "+(years+1)+" year there will be: ");
            System.out.println(p0+" + "+p0+" * "+percent+" + "+aug+" => "+(p0+=p0*percent+aug));
            years++;
        }
        System.out.println("It will nedd "+years+" entire eyears.");
        return years;
    }

    public static void main(String[] args) {
        System.out.println(nbYear(1000,0.02,50,1200));
    }
}
