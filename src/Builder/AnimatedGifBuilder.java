package Builder;

import Builder.export.AnimatedGif;

public class AnimatedGifBuilder implements PresentationBuilder {

     AnimatedGif gif = new AnimatedGif();
    boolean text = true;



    public void addSlide(Slide slide) {
        ++AllTexts.count;
        this.gif.addFrame(slide.getText(), 5);
    }

    public AnimatedGif getGif() {
        return this.gif;
    }
}
