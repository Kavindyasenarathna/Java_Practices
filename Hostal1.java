public class Hostal1 {
    float length;
    float width;

    public static void main(String[] args) {
           Hostal corel_beauty = new Hostal();
           Hostal silver_tips = new Hostal();
           Hostal blue_sapphire = new Hostal();
           Hostal cattleya = new Hostal();

           corel_beauty.length = 12.66f;
           corel_beauty.width = 10.42f;

           silver_tips.length = 8.54f;
           silver_tips.width = 6.88f;

           blue_sapphire.length = 4.32f;
           blue_sapphire.width = 3.46f;

           cattleya.length = 5.68f;
           cattleya.width = 7.54f;

           System.out.println("the area of the cattleya is:"+ cattleya.length* cattleya.width);

    }
    
}
