package Builder;

import Builder.export.AnimatedGif;

public class Client {

    public static void main(String[] args) {
        Presentation pres = new Presentation();
        Slide slide1 = new Slide("Hello");
        pres.addSlide(slide1);
        pres.addSlide(new Slide("World"));
        AnimatedGifBuilder builder = new AnimatedGifBuilder();
        pres.export(builder);
        AnimatedGif gif = builder.getGif();
    }
}
