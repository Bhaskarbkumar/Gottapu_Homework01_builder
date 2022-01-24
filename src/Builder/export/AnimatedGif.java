package Builder.export;

import Builder.AllTexts;
public class AnimatedGif {


    public void addFrame(String text, int duration) {
        AllTexts.ls.add(text);
        if (AllTexts.count >= 3) {
            AllTexts.printr(duration);
        }
    }
}


