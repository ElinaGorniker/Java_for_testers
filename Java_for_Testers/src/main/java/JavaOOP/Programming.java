package JavaOOP;

public class Programming {

    String language;
    boolean learningComplete = false;

    public Programming(String language) {
        this.language = language;
    }

    public void learningStatus() {
        learningComplete = true;

    }

    public boolean isLearningComplete() {
        if (learningComplete) {
            System.out.println("The learning of " + language + " is complete");
        } else {
            System.out.println("The learning of " + language + " is not complete");
        } return  false;

    }
}
