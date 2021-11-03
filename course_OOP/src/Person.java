public class Person implements Talkable{

    private String sentence;

    public Person(String sentence) {
        this.sentence = sentence;
    }

    //implement talk method here
    public String talk(){
        return sentence;
    }
}

