// incomplete

class growth_of_a_population {
    public static void main(String[] args) {
        int test = nbYear(1500, 5, 100, 5000);
        System.out.print(test);
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        float convertPercentage = (float) (percent / 100);
        float growth = convertPercentage * p0;
        int inhabitants = (int) growth + p0 + aug;
        int years = 1;

        while (inhabitants < p) {
            p0 = inhabitants;
            years += 1;
            inhabitants = (int) growth + p0 + aug;
        }

        return years;
    }

}